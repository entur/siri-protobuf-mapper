package org.entur.protobuf.mapper;

import com.google.protobuf.util.JsonFormat;
import org.junit.BeforeClass;
import org.junit.Test;
import org.rutebanken.siri20.util.SiriXml;
import uk.org.siri.siri20.DataReadyRequestStructure;
import uk.org.siri.siri20.Siri;
import uk.org.siri.www.siri.SiriType;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.time.ZonedDateTime;

import static org.entur.protobuf.mapper.Helper.formatXml;
import static org.entur.protobuf.mapper.Helper.readFile;
import static org.junit.Assert.assertEquals;
import static org.rutebanken.siri20.util.SiriXml.parseXml;

public class MapperTest {

    private static String et_xml;
    private static String vm_xml;


    SiriMapper mapper = new SiriMapper();

    @BeforeClass
    public static void init() throws IOException {
        et_xml = readFile("src/test/resources/et.xml");
        vm_xml = readFile("src/test/resources/vm.xml");
    }

    @Test
    public void testMapDataReadyNotificationRequest() throws Exception {
        Siri siri = new Siri();
        siri.setVersion("2.0");
        DataReadyRequestStructure dataReadyNotification = new DataReadyRequestStructure();
        dataReadyNotification.setRequestTimestamp(ZonedDateTime.now());
        siri.setDataReadyNotification(dataReadyNotification);

        final SiriType siriType = SiriMapper.map(siri);

        final Siri mapped = SiriMapper.map(siriType);

        assertEquals(SiriXml.toXml(siri), SiriXml.toXml(mapped));

    }

    @Test
    public void testMapETServiceDelivery() throws Exception {

        Siri parsedSiri = parseXml(et_xml);

        long t1 = System.currentTimeMillis();
        SiriType pbfSiri = mapper.map(parsedSiri);
        long t2 = System.currentTimeMillis();

        JsonFormat.Printer jsonPrinter = JsonFormat.printer();

        String json = jsonPrinter.print(pbfSiri);

        long t3 = System.currentTimeMillis();
        Siri mappedSiri = mapper.map(pbfSiri);
        long t4 = System.currentTimeMillis();

        final String mappedXmlContents = formatXml(mappedSiri, Boolean.TRUE);
        final String originalXmlContents = formatXml(parsedSiri, Boolean.TRUE);

        assertEquals(originalXmlContents, et_xml);
        assertEquals(originalXmlContents, mappedXmlContents);
    }

    @Test
    public void testMapVMServiceDelivery() throws Exception {

        Siri parsedSiri = parseXml(vm_xml);

        long t1 = System.currentTimeMillis();
        SiriType pbfSiri = mapper.map(parsedSiri);
        long t2 = System.currentTimeMillis();

        JsonFormat.Printer jsonPrinter = JsonFormat.printer();

        String json = jsonPrinter.print(pbfSiri);

        long t3 = System.currentTimeMillis();
        Siri mappedSiri = mapper.map(pbfSiri);
        long t4 = System.currentTimeMillis();

        final String mappedXmlContents = formatXml(mappedSiri, Boolean.TRUE);
        final String originalXmlContents = formatXml(parsedSiri, Boolean.TRUE);

        assertEquals(originalXmlContents, vm_xml);
        assertEquals(originalXmlContents, mappedXmlContents);
    }


}

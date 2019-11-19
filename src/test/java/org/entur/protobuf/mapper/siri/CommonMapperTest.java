package org.entur.protobuf.mapper.siri;

import com.google.protobuf.Duration;
import org.junit.Test;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import static junit.framework.TestCase.assertEquals;

public class CommonMapperTest {

    @Test
    public void testDurationMapping() throws DatatypeConfigurationException {

        javax.xml.datatype.Duration duration_1m = DatatypeFactory.newInstance().newDuration("PT60S");
        javax.xml.datatype.Duration duration_60s = DatatypeFactory.newInstance().newDuration("PT1M");

        assertEquals(duration_1m, duration_60s);

        assertEquals(60, CommonMapper.map(duration_1m).getSeconds());

        assertEquals(60, CommonMapper.map(duration_60s).getSeconds());
    }

    @Test
    public void testNegativeDurationMapping() throws DatatypeConfigurationException {

        javax.xml.datatype.Duration duration_neg_1m = DatatypeFactory.newInstance().newDuration("-PT60S");
        javax.xml.datatype.Duration duration_neg_60s = DatatypeFactory.newInstance().newDuration("-PT1M");

        assertEquals(duration_neg_1m, duration_neg_60s);

        assertEquals(-60, CommonMapper.map(duration_neg_1m).getSeconds());

        assertEquals(-60, CommonMapper.map(duration_neg_60s).getSeconds());
    }
}

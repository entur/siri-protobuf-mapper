package org.entur.protobuf.mapper;

import uk.org.siri.siri20.Siri;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.StringWriter;

public class Helper {

    private static JAXBContext jaxbContext;

    static {
        try {
            jaxbContext = JAXBContext.newInstance(Siri.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    static String formatXml(Siri siri, Boolean format) throws JAXBException {
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, format);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, format);
        StringWriter writer = new StringWriter();
        marshaller.marshal(siri, writer);

        return writer.toString();
    }


    static String readFile(String path) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(path, "rw");
        byte[] contents = new byte[(int)raf.length()];
        raf.readFully(contents);
        return new String(contents);
    }
    static void writeFile(String path, String contents) throws IOException {
        final File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        RandomAccessFile raf = new RandomAccessFile(path, "rw");
        raf.write(contents.getBytes());
        raf.close();
    }
}

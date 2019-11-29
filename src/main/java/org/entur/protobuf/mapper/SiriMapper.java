package org.entur.protobuf.mapper;

import com.google.protobuf.InvalidProtocolBufferException;
import uk.org.siri.siri20.Siri;
import uk.org.siri.www.siri.SiriType;

public class SiriMapper {

    public static Siri mapToJaxb(SiriType siri) {
        return Pbf2JaxbMapper.map(siri);
    }

    public static Siri mapToJaxb(byte[] siri) throws InvalidProtocolBufferException {
        final SiriType siriType = SiriType.parseFrom(siri);
        return mapToJaxb(siriType);
    }

    public static SiriType mapToPbf(Siri siri) {
        return Jaxb2PbfMapper.map(siri);
    }
}

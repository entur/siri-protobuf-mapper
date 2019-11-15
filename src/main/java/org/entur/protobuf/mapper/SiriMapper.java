package org.entur.protobuf.mapper;

import uk.org.siri.siri20.Siri;
import uk.org.siri.www.siri.SiriType;

public class SiriMapper {

    public static Siri map(SiriType siri) {
        return Pbf2JaxbMapper.map(siri);
    }

    public static SiriType map(Siri siri) {
        return Jaxb2PbfMapper.map(siri);
    }
}

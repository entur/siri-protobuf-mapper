package org.entur.protobuf.mapper;

import org.entur.protobuf.mapper.siri.CommonMapper;
import org.entur.protobuf.mapper.siri.EstimatedTimetableSiri2PbfMapper;
import uk.org.siri.siri20.DataReadyRequestStructure;
import uk.org.siri.siri20.RequestorRef;
import uk.org.siri.siri20.ServiceDelivery;
import uk.org.siri.siri20.Siri;
import uk.org.siri.www.siri.ParticipantRefStructure;
import uk.org.siri.www.siri.ServiceDeliveryType;
import uk.org.siri.www.siri.SiriType;

import java.util.List;

class Pbf2JaxbMapper extends CommonMapper {

    static Siri map(SiriType siri) {
        final Siri mapped = new Siri();
        mapped.setVersion(siri.getVersion());

        if (siri.hasServiceDelivery()) {
           mapped.setServiceDelivery(map(siri.getServiceDelivery()));
        }
        if (siri.hasDataReadyNotification()) {
            mapped.setDataReadyNotification(map(siri.getDataReadyNotification()));
        }
        return mapped;
    }

    private static DataReadyRequestStructure map(uk.org.siri.www.siri.DataReadyRequestStructure dataReadyNotification) {
        DataReadyRequestStructure mapped = new DataReadyRequestStructure();
        mapped.setRequestTimestamp(map(dataReadyNotification.getRequestTimestamp()));
        return mapped;
    }

    private static ServiceDelivery map(ServiceDeliveryType serviceDelivery) {
        final ServiceDelivery mapped = new ServiceDelivery();
        final List<uk.org.siri.www.siri.EstimatedTimetableDeliveryStructure> estimatedTimetableDeliveryList = serviceDelivery.getEstimatedTimetableDeliveryList();
        if (estimatedTimetableDeliveryList != null) {
            for (uk.org.siri.www.siri.EstimatedTimetableDeliveryStructure estimatedTimetableDeliveryStructure : estimatedTimetableDeliveryList) {
                mapped.getEstimatedTimetableDeliveries().add(EstimatedTimetableSiri2PbfMapper.map(estimatedTimetableDeliveryStructure));
            }
        }
        if (serviceDelivery.hasResponseTimestamp()) {
            mapped.setResponseTimestamp(map(serviceDelivery.getResponseTimestamp()));
        }

        mapped.setMoreData(serviceDelivery.getMoreData());

        if (serviceDelivery.hasProducerRef()) {
            mapped.setProducerRef(map(serviceDelivery.getProducerRef()));
        }

        return mapped;
    }

    private static RequestorRef map(ParticipantRefStructure producerRef) {
        final RequestorRef mapped = new RequestorRef();
        mapped.setValue(producerRef.getValue());
        return mapped;
    }
}
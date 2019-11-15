package org.entur.protobuf.mapper;

import org.entur.protobuf.mapper.siri.CommonMapper;
import org.entur.protobuf.mapper.siri.EstimatedTimetablePbf2SiriMapper;
import uk.org.siri.siri20.EstimatedTimetableDeliveryStructure;
import uk.org.siri.siri20.RequestorRef;
import uk.org.siri.siri20.ServiceDelivery;
import uk.org.siri.siri20.Siri;
import uk.org.siri.www.siri.DataReadyRequestStructure;
import uk.org.siri.www.siri.ParticipantRefStructure;
import uk.org.siri.www.siri.ServiceDeliveryType;
import uk.org.siri.www.siri.SiriType;

import java.util.List;

class Jaxb2PbfMapper extends CommonMapper {

    static SiriType map(Siri siri) {
        final SiriType.Builder builder = SiriType.newBuilder();
        builder.setVersion(siri.getVersion());

        if (siri.getServiceDelivery() != null) {
            builder.setServiceDelivery(map(siri.getServiceDelivery()));
        }
        if (siri.getDataReadyNotification() != null) {
            builder.setDataReadyNotification(map(siri.getDataReadyNotification()));
        }
        return builder.build();
    }

    private static DataReadyRequestStructure.Builder map(uk.org.siri.siri20.DataReadyRequestStructure dataReadyNotification) {
        DataReadyRequestStructure.Builder builder = DataReadyRequestStructure.newBuilder();
        builder.setRequestTimestamp(map(dataReadyNotification.getRequestTimestamp()));
        return builder;
    }

    private static ServiceDeliveryType map(ServiceDelivery serviceDelivery) {
        final ServiceDeliveryType.Builder builder = ServiceDeliveryType.newBuilder();
        final List<EstimatedTimetableDeliveryStructure> estimatedTimetableDeliveries = serviceDelivery.getEstimatedTimetableDeliveries();
        if (estimatedTimetableDeliveries != null) {
            for (EstimatedTimetableDeliveryStructure estimatedTimetableDelivery : estimatedTimetableDeliveries) {
                builder.addEstimatedTimetableDelivery(EstimatedTimetablePbf2SiriMapper.map(estimatedTimetableDelivery));
            }
        }
        builder.setResponseTimestamp(map(serviceDelivery.getResponseTimestamp()));
        if (serviceDelivery.getProducerRef() != null) {
            builder.setProducerRef(map(serviceDelivery.getProducerRef()));
        }

        if (serviceDelivery.isMoreData() != null) {
            builder.setMoreData(serviceDelivery.isMoreData());
        }
        return builder.build();
    }

    private static ParticipantRefStructure map(RequestorRef producerRef) {
        ParticipantRefStructure.Builder builder = ParticipantRefStructure.newBuilder();
        builder.setValue(producerRef.getValue());
        return builder.build();
    }


}
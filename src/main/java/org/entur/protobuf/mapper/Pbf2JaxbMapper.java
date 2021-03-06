package org.entur.protobuf.mapper;

import org.entur.protobuf.mapper.siri.CommonMapper;
import org.entur.protobuf.mapper.siri.EstimatedTimetablePbf2SiriMapper;
import org.entur.protobuf.mapper.siri.SituationExchangePbf2SiriMapper;
import org.entur.protobuf.mapper.siri.VehicleMonitoringPbf2SiriMapper;
import uk.org.siri.siri20.DataReadyRequestStructure;
import uk.org.siri.siri20.ServiceDelivery;
import uk.org.siri.siri20.Siri;
import uk.org.siri.www.siri.ServiceDeliveryType;
import uk.org.siri.www.siri.SiriType;
import uk.org.siri.www.siri.SituationExchangeDeliveryStructure;
import uk.org.siri.www.siri.VehicleMonitoringDeliveryStructure;

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
        
        if (serviceDelivery.getEstimatedTimetableDeliveryList() != null) {
            for (uk.org.siri.www.siri.EstimatedTimetableDeliveryStructure estimatedTimetableDeliveryStructure : serviceDelivery.getEstimatedTimetableDeliveryList()) {
                mapped.getEstimatedTimetableDeliveries().add(EstimatedTimetablePbf2SiriMapper.map(estimatedTimetableDeliveryStructure));
            }
        }
        if (serviceDelivery.getVehicleMonitoringDeliveryList() != null) {
            for (VehicleMonitoringDeliveryStructure vehicleMonitoringDeliveryStructure : serviceDelivery.getVehicleMonitoringDeliveryList()) {
                mapped.getVehicleMonitoringDeliveries().add(VehicleMonitoringPbf2SiriMapper.map(vehicleMonitoringDeliveryStructure));
            }
        }
        if (serviceDelivery.getSituationExchangeDeliveryList() != null) {
            for (SituationExchangeDeliveryStructure situationExchangeDeliveryStructure : serviceDelivery.getSituationExchangeDeliveryList()) {
                mapped.getSituationExchangeDeliveries().add(SituationExchangePbf2SiriMapper.map(situationExchangeDeliveryStructure));
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

}
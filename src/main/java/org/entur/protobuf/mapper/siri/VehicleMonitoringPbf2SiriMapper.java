package org.entur.protobuf.mapper.siri;


import uk.org.siri.siri20.LocationStructure;
import uk.org.siri.siri20.MonitoredCallStructure;
import uk.org.siri.siri20.ProgressBetweenStopsStructure;
import uk.org.siri.siri20.VehicleActivityStructure;
import uk.org.siri.siri20.VehicleMonitoringDeliveryStructure;
import uk.org.siri.www.siri.NaturalLanguagePlaceNameStructure;
import uk.org.siri.www.siri.NaturalLanguageStringStructure;
import uk.org.siri.www.siri.VehicleModesEnumeration;

import java.math.BigDecimal;

public class VehicleMonitoringPbf2SiriMapper extends CommonMapper{

    public static VehicleMonitoringDeliveryStructure map(uk.org.siri.www.siri.VehicleMonitoringDeliveryStructure vehicleMonitoringDeliveryStructure) {
        VehicleMonitoringDeliveryStructure mapped = new VehicleMonitoringDeliveryStructure();
        if (vehicleMonitoringDeliveryStructure.hasResponseTimestamp()) {
            mapped.setResponseTimestamp(map(vehicleMonitoringDeliveryStructure.getResponseTimestamp()));
        }
        if (vehicleMonitoringDeliveryStructure.getVersion() != null) {
            mapped.setVersion(vehicleMonitoringDeliveryStructure.getVersion());
        }
        if (vehicleMonitoringDeliveryStructure.getVehicleActivityList() != null) {
            for (uk.org.siri.www.siri.VehicleActivityStructure vehicleActivityStructure : vehicleMonitoringDeliveryStructure.getVehicleActivityList()) {
                mapped.getVehicleActivities().add(map(vehicleActivityStructure));
            }
        }
        return mapped;
    }

    private static VehicleActivityStructure map(uk.org.siri.www.siri.VehicleActivityStructure vehicleActivityStructure) {
        VehicleActivityStructure mapped = new VehicleActivityStructure();
        if (vehicleActivityStructure.hasRecordedAtTime()) {
            mapped.setRecordedAtTime(map(vehicleActivityStructure.getRecordedAtTime()));
        }
        if (vehicleActivityStructure.hasValidUntilTime()) {
            mapped.setValidUntilTime(map(vehicleActivityStructure.getValidUntilTime()));
        }
        if (vehicleActivityStructure.hasProgressBetweenStops()) {
            mapped.setProgressBetweenStops(map(vehicleActivityStructure.getProgressBetweenStops()));
        }

        mapped.setItemIdentifier(vehicleActivityStructure.getItemIdentifier());

        if (vehicleActivityStructure.hasMonitoredVehicleJourney()) {
            mapped.setMonitoredVehicleJourney(map(vehicleActivityStructure.getMonitoredVehicleJourney()));
        }
        return mapped;
    }

    private static VehicleActivityStructure.MonitoredVehicleJourney map(uk.org.siri.www.siri.VehicleActivityStructure.MonitoredVehicleJourneyType monitoredVehicleJourney) {
        VehicleActivityStructure.MonitoredVehicleJourney mapped = new VehicleActivityStructure.MonitoredVehicleJourney();
        if (monitoredVehicleJourney.hasLineRef()) {
            mapped.setLineRef(map(monitoredVehicleJourney.getLineRef()));
        }
        if (monitoredVehicleJourney.getPublishedLineNameList() != null) {
            for (NaturalLanguageStringStructure naturalLanguageStringStructure : monitoredVehicleJourney.getPublishedLineNameList()) {
                mapped.getPublishedLineNames().add(map(naturalLanguageStringStructure));
            }
        }
        if (monitoredVehicleJourney.hasFramedVehicleJourneyRef()) {
            mapped.setFramedVehicleJourneyRef(map(monitoredVehicleJourney.getFramedVehicleJourneyRef()));
        }
        if (monitoredVehicleJourney.getVehicleModeList() != null) {
            for (VehicleModesEnumeration vehicleModesEnumeration : monitoredVehicleJourney.getVehicleModeList()) {
                mapped.getVehicleModes().add(map(vehicleModesEnumeration));
            }
        }
        if (monitoredVehicleJourney.hasDirectionRef()) {
            mapped.setDirectionRef(map(monitoredVehicleJourney.getDirectionRef()));
        }
        if (monitoredVehicleJourney.hasOperatorRef()) {
            mapped.setOperatorRef(map(monitoredVehicleJourney.getOperatorRef()));
        }
        if (monitoredVehicleJourney.hasOriginRef()) {
            mapped.setOriginRef(map(monitoredVehicleJourney.getOriginRef()));
        }
        if (monitoredVehicleJourney.getOriginNameList() != null) {
            for (NaturalLanguagePlaceNameStructure naturalLanguagePlaceNameStructure : monitoredVehicleJourney.getOriginNameList()) {
                mapped.getOriginNames().add(map(naturalLanguagePlaceNameStructure));
            }
        }
        if (monitoredVehicleJourney.hasDestinationRef()) {
            mapped.setDestinationRef(map(monitoredVehicleJourney.getDestinationRef()));
        }
        if (monitoredVehicleJourney.getDestinationNameList() != null) {
            for (NaturalLanguageStringStructure naturalLanguageStringStructure : monitoredVehicleJourney.getDestinationNameList()) {
                mapped.getDestinationNames().add(map(naturalLanguageStringStructure));
            }
        }
        if (monitoredVehicleJourney.hasOriginAimedDepartureTime()) {
            mapped.setOriginAimedDepartureTime(map(monitoredVehicleJourney.getOriginAimedDepartureTime()));
        }
        if (monitoredVehicleJourney.hasDestinationAimedArrivalTime()) {
            mapped.setDestinationAimedArrivalTime(map(monitoredVehicleJourney.getDestinationAimedArrivalTime()));
        }

        mapped.setMonitored(monitoredVehicleJourney.getMonitored());
        mapped.setDataSource(monitoredVehicleJourney.getDataSource());

        if (monitoredVehicleJourney.hasVehicleLocation()) {
            mapped.setVehicleLocation(map(monitoredVehicleJourney.getVehicleLocation()));
        }
        if (monitoredVehicleJourney.getBearing() != 0) {
            mapped.setBearing(monitoredVehicleJourney.getBearing());
        }
        if (monitoredVehicleJourney.getOccupancy() != null ){
            mapped.setOccupancy(map(monitoredVehicleJourney.getOccupancy()));
        }
        if (monitoredVehicleJourney.hasDelay()) {
            mapped.setDelay(map(monitoredVehicleJourney.getDelay()));
        }
        mapped.setInCongestion(monitoredVehicleJourney.getInCongestion());

        if (monitoredVehicleJourney.getVehicleStatus() != null) {
            mapped.setVehicleStatus(map(monitoredVehicleJourney.getVehicleStatus()));
        }

        if (monitoredVehicleJourney.hasVehicleRef()) {
            mapped.setVehicleRef(map(monitoredVehicleJourney.getVehicleRef()));
        }

        if (monitoredVehicleJourney.hasBlockRef()) {
            mapped.setBlockRef(map(monitoredVehicleJourney.getBlockRef()));
        }

        if (monitoredVehicleJourney.hasMonitoredCall()) {
            mapped.setMonitoredCall(map(monitoredVehicleJourney.getMonitoredCall()));
        }

        mapped.setIsCompleteStopSequence(monitoredVehicleJourney.getIsCompleteStopSequence());

        return mapped;
    }

    private static MonitoredCallStructure map(uk.org.siri.www.siri.MonitoredCallStructure monitoredCall) {
        MonitoredCallStructure mapped = new MonitoredCallStructure();
        if (monitoredCall.hasStopPointRef()) {
            mapped.setStopPointRef(map(monitoredCall.getStopPointRef()));
        }
        if (monitoredCall.getStopPointNameList() != null) {
            for (NaturalLanguageStringStructure naturalLanguageStringStructure : monitoredCall.getStopPointNameList()) {
                mapped.getStopPointNames().add(map(naturalLanguageStringStructure));
            }
        }
        mapped.setVehicleAtStop(monitoredCall.getVehicleAtStop());

        if (monitoredCall.hasVehicleLocationAtStop()) {
            mapped.setVehicleLocationAtStop(map(monitoredCall.getVehicleLocationAtStop()));
        }
        if (monitoredCall.getDestinationDisplayList() != null) {
            for (NaturalLanguageStringStructure naturalLanguageStringStructure : monitoredCall.getDestinationDisplayList()) {
                mapped.getDestinationDisplaies().add(map(naturalLanguageStringStructure));
            }
        }

        return mapped;
    }

    private static ProgressBetweenStopsStructure map(uk.org.siri.www.siri.ProgressBetweenStopsStructure progressBetweenStops) {
        ProgressBetweenStopsStructure mapped = new ProgressBetweenStopsStructure();
        mapped.setPercentage(BigDecimal.valueOf(progressBetweenStops.getPercentage()));
        mapped.setLinkDistance((BigDecimal.valueOf(progressBetweenStops.getLinkDistance())));
        return mapped;
    }


}

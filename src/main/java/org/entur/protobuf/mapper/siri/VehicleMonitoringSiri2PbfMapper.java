package org.entur.protobuf.mapper.siri;

import uk.org.siri.siri20.NaturalLanguageStringStructure;
import uk.org.siri.siri20.VehicleModesEnumeration;
import uk.org.siri.www.siri.LocationStructure;
import uk.org.siri.www.siri.MonitoredCallStructure;
import uk.org.siri.www.siri.PreviousCallStructure;
import uk.org.siri.www.siri.PreviousCallsStructure;
import uk.org.siri.www.siri.ProgressBetweenStopsStructure;
import uk.org.siri.www.siri.VehicleActivityStructure;
import uk.org.siri.www.siri.VehicleMonitoringDeliveryStructure;

import java.util.List;

public class VehicleMonitoringSiri2PbfMapper extends CommonMapper{
    public static VehicleMonitoringDeliveryStructure.Builder map(uk.org.siri.siri20.VehicleMonitoringDeliveryStructure deliveryStructure) {
        VehicleMonitoringDeliveryStructure.Builder  builder = VehicleMonitoringDeliveryStructure.newBuilder();

        if (deliveryStructure.getVersion() != null) {
            builder.setVersion(deliveryStructure.getVersion());
        }
        if (deliveryStructure.getResponseTimestamp() != null) {
            builder.setResponseTimestamp(map(deliveryStructure.getResponseTimestamp()));
        }
        final List<uk.org.siri.siri20.VehicleActivityStructure> vehicleActivities = deliveryStructure.getVehicleActivities();
        if (vehicleActivities != null) {
            for (uk.org.siri.siri20.VehicleActivityStructure vehicleActivity : vehicleActivities) {
                builder.addVehicleActivity(map(vehicleActivity));
            }
        }
        return builder;
    }

    private static VehicleActivityStructure.Builder map(uk.org.siri.siri20.VehicleActivityStructure vehicleActivity) {
        VehicleActivityStructure.Builder builder = VehicleActivityStructure.newBuilder();
        if (vehicleActivity.getRecordedAtTime() != null) {
            builder.setRecordedAtTime(map(vehicleActivity.getRecordedAtTime()));
        }
        if (vehicleActivity.getValidUntilTime() != null) {
            builder.setValidUntilTime(map(vehicleActivity.getValidUntilTime()));
        }
        if (vehicleActivity.getItemIdentifier() != null) {
            builder.setItemIdentifier(vehicleActivity.getItemIdentifier());
        }
        if (vehicleActivity.getProgressBetweenStops() != null) {
            builder.setProgressBetweenStops(map(vehicleActivity.getProgressBetweenStops()));
        }
        if (vehicleActivity.getMonitoredVehicleJourney() != null) {
            builder.setMonitoredVehicleJourney(map(vehicleActivity.getMonitoredVehicleJourney()));
        }
        return builder;
    }

    private static ProgressBetweenStopsStructure.Builder map(uk.org.siri.siri20.ProgressBetweenStopsStructure progressBetweenStops) {
        ProgressBetweenStopsStructure.Builder builder = ProgressBetweenStopsStructure.newBuilder();
        if (progressBetweenStops.getLinkDistance() != null) {
            builder.setLinkDistance(progressBetweenStops.getLinkDistance().doubleValue());
        }
        if (progressBetweenStops.getPercentage() != null) {
            builder.setPercentage(progressBetweenStops.getPercentage().doubleValue());
        }
        return builder;
    }

    private static VehicleActivityStructure.MonitoredVehicleJourneyType.Builder map(uk.org.siri.siri20.VehicleActivityStructure.MonitoredVehicleJourney monitoredVehicleJourney) {
        VehicleActivityStructure.MonitoredVehicleJourneyType.Builder builder = VehicleActivityStructure.MonitoredVehicleJourneyType.newBuilder();
        if (monitoredVehicleJourney.getLineRef() != null) {
            builder.setLineRef(map(monitoredVehicleJourney.getLineRef()));
        }
        if (monitoredVehicleJourney.getFramedVehicleJourneyRef() != null) {
            builder.setFramedVehicleJourneyRef(map(monitoredVehicleJourney.getFramedVehicleJourneyRef()));
        }
        if (monitoredVehicleJourney.getVehicleModes() != null) {
            for (VehicleModesEnumeration vehicleMode : monitoredVehicleJourney.getVehicleModes()) {
                builder.addVehicleMode(map(vehicleMode));
            }
        }
        if (monitoredVehicleJourney.getOperatorRef() != null) {
            builder.setOperatorRef(map(monitoredVehicleJourney.getOperatorRef()));
        }
        if (monitoredVehicleJourney.getOriginRef() != null) {
            builder.setOriginRef(map(monitoredVehicleJourney.getOriginRef()));
        }
        if (monitoredVehicleJourney.getOriginNames() != null) {
            for (uk.org.siri.siri20.NaturalLanguagePlaceNameStructure name : monitoredVehicleJourney.getOriginNames()) {
                builder.addOriginName(map(name));
            }
        }
        if (monitoredVehicleJourney.getDestinationRef() != null) {
            builder.setDestinationRef(map(monitoredVehicleJourney.getDestinationRef()));
        }
        if (monitoredVehicleJourney.getDestinationNames() != null) {
            for (NaturalLanguageStringStructure name : monitoredVehicleJourney.getDestinationNames()) {
                builder.addDestinationName(map(name));
            }
        }
        if (monitoredVehicleJourney.getDirectionRef() != null) {
            builder.setDirectionRef(map(monitoredVehicleJourney.getDirectionRef()));
        }
        if (monitoredVehicleJourney.getPublishedLineNames() != null) {
            for (NaturalLanguageStringStructure publishedLineName : monitoredVehicleJourney.getPublishedLineNames()) {
                builder.addPublishedLineName(map(publishedLineName));
            }
        }
        if (monitoredVehicleJourney.getOriginAimedDepartureTime() != null) {
            builder.setOriginAimedDepartureTime(map(monitoredVehicleJourney.getOriginAimedDepartureTime()));
        }
        if (monitoredVehicleJourney.getDestinationAimedArrivalTime() != null) {
            builder.setDestinationAimedArrivalTime(map(monitoredVehicleJourney.getDestinationAimedArrivalTime()));
        }

        builder.setMonitored(monitoredVehicleJourney.isMonitored() == null || monitoredVehicleJourney.isMonitored()); // Defaults to 'true' when not set

        if (monitoredVehicleJourney.getDataSource() != null) {
            builder.setDataSource(monitoredVehicleJourney.getDataSource());
        }
        builder.setPredictionInaccurate(monitoredVehicleJourney.isPredictionInaccurate() != null && monitoredVehicleJourney.isPredictionInaccurate());

        if (monitoredVehicleJourney.getVehicleLocation() != null) {
            builder.setVehicleLocation(map(monitoredVehicleJourney.getVehicleLocation()));
        }

        if (monitoredVehicleJourney.getBearing() != null) {
            builder.setBearing(monitoredVehicleJourney.getBearing().floatValue());
        }
        if (monitoredVehicleJourney.getOccupancy() != null) {
            builder.setOccupancy(map(monitoredVehicleJourney.getOccupancy()));
        }
        if (monitoredVehicleJourney.getDelay() != null) {
            builder.setDelay(map(monitoredVehicleJourney.getDelay()));
        }

        builder.setInCongestion(monitoredVehicleJourney.isInCongestion() != null && monitoredVehicleJourney.isInCongestion());

        if (monitoredVehicleJourney.getVehicleStatus() != null) {
            builder.setVehicleStatus(map(monitoredVehicleJourney.getVehicleStatus()));
        }

        if (monitoredVehicleJourney.getBlockRef() != null) {
            builder.setBlockRef(map(monitoredVehicleJourney.getBlockRef()));
        }
        if (monitoredVehicleJourney.getVehicleRef() != null) {
            builder.setVehicleRef(map(monitoredVehicleJourney.getVehicleRef()));
        }

        if (monitoredVehicleJourney.getMonitoredCall() != null) {
            builder.setMonitoredCall(map(monitoredVehicleJourney.getMonitoredCall()));
        }

        return builder;
    }

    private static MonitoredCallStructure.Builder map(uk.org.siri.siri20.MonitoredCallStructure call) {
        MonitoredCallStructure.Builder builder = MonitoredCallStructure.newBuilder();
        if (call.getAimedArrivalTime() != null) {
            builder.setAimedArrivalTime(map(call.getAimedArrivalTime()));
        }
        if (call.getExpectedArrivalTime() != null) {
            builder.setExpectedArrivalTime(map(call.getExpectedArrivalTime()));
        }
        if (call.getActualArrivalTime() != null) {
            builder.setActualArrivalTime(map(call.getActualArrivalTime()));
        }
        if (call.getAimedDepartureTime() != null) {
            builder.setAimedDepartureTime(map(call.getAimedDepartureTime()));
        }
        if (call.getExpectedDepartureTime() != null) {
            builder.setExpectedDepartureTime(map(call.getExpectedDepartureTime()));
        }
        if (call.getActualDepartureTime() != null) {
            builder.setActualDepartureTime(map(call.getActualDepartureTime()));
        }
        if (call.getOrder() != null) {
            builder.setOrder(call.getOrder().intValue());
        }
        if (call.getStopPointRef() != null) {
            builder.setStopPointRef(map(call.getStopPointRef()));
        }
        if (call.getStopPointNames() != null) {
            for (NaturalLanguageStringStructure stopPointName : call.getStopPointNames()) {
                builder.addStopPointName(map(stopPointName));
            }
        }
        builder.setVehicleAtStop(call.isVehicleAtStop() != null && call.isVehicleAtStop());

        if (call.getVehicleLocationAtStop() != null) {
            builder.setVehicleLocationAtStop(map(call.getVehicleLocationAtStop()));
        }

        if (call.getDestinationDisplaies() != null) {
            for (NaturalLanguageStringStructure destinationDisplay : call.getDestinationDisplaies()) {
                builder.addDestinationDisplay(map(destinationDisplay));
            }
        }
        return builder;
    }


    private static PreviousCallsStructure.Builder map(uk.org.siri.siri20.PreviousCallsStructure previousCalls) {
        PreviousCallsStructure.Builder builder = PreviousCallsStructure.newBuilder();
        for (uk.org.siri.siri20.PreviousCallStructure call : previousCalls.getPreviousCalls()) {
            builder.addPreviousCall(map(call));
        }
        return builder;
    }

    private static PreviousCallStructure.Builder map(uk.org.siri.siri20.PreviousCallStructure call) {
        PreviousCallStructure.Builder builder = PreviousCallStructure.newBuilder();
        if (call.getAimedArrivalTime() != null) {
            builder.setAimedArrivalTime(map(call.getAimedArrivalTime()));
        }
        if (call.getExpectedArrivalTime() != null) {
            builder.setExpectedArrivalTime(map(call.getExpectedArrivalTime()));
        }
        if (call.getActualArrivalTime() != null) {
            builder.setActualArrivalTime(map(call.getActualArrivalTime()));
        }
        if (call.getAimedDepartureTime() != null) {
            builder.setAimedDepartureTime(map(call.getAimedDepartureTime()));
        }
        if (call.getExpectedDepartureTime() != null) {
            builder.setExpectedDepartureTime(map(call.getExpectedDepartureTime()));
        }
        if (call.getActualDepartureTime() != null) {
            builder.setActualDepartureTime(map(call.getActualDepartureTime()));
        }
        if (call.getOrder() != null) {
            builder.setOrder(call.getOrder().intValue());
        }
        if (call.getStopPointRef() != null) {
            builder.setStopPointRef(map(call.getStopPointRef()));
        }
        return builder;
    }


    private static LocationStructure.Builder map(uk.org.siri.siri20.LocationStructure vehicleLocation) {
        LocationStructure.Builder builder = LocationStructure.newBuilder();
        if (vehicleLocation.getSrsName() != null) {
            builder.setSrsName(vehicleLocation.getSrsName());
        }
        if (vehicleLocation.getLatitude() != null) {
            builder.setLatitude(vehicleLocation.getLatitude().doubleValue());
        }
        if (vehicleLocation.getLongitude() != null) {
            builder.setLongitude(vehicleLocation.getLongitude().doubleValue());
        }
        return builder;
    }
}

package org.entur.protobuf.mapper.siri;

import uk.org.siri.siri20.DatedVehicleJourneyRef;
import uk.org.siri.siri20.EstimatedCall;
import uk.org.siri.siri20.EstimatedTimetableDeliveryStructure;
import uk.org.siri.siri20.EstimatedVehicleJourney;
import uk.org.siri.siri20.EstimatedVersionFrameStructure;
import uk.org.siri.siri20.JourneyPatternRef;
import uk.org.siri.siri20.NaturalLanguagePlaceNameStructure;
import uk.org.siri.siri20.NaturalLanguageStringStructure;
import uk.org.siri.siri20.RecordedCall;
import uk.org.siri.siri20.ServiceFeatureRef;
import uk.org.siri.siri20.SituationRef;
import uk.org.siri.siri20.SituationSimpleRef;
import uk.org.siri.siri20.VehicleJourneyRef;
import uk.org.siri.siri20.VehicleModesEnumeration;
import uk.org.siri.www.siri.DatedVehicleJourneyRefStructure;
import uk.org.siri.www.siri.EstimatedCallStructure;
import uk.org.siri.www.siri.EstimatedVehicleJourneyStructure;
import uk.org.siri.www.siri.GroupOfLinesRefStructure;
import uk.org.siri.www.siri.JourneyPatternRefStructure;
import uk.org.siri.www.siri.QuayRefStructure;
import uk.org.siri.www.siri.RecordedCallStructure;
import uk.org.siri.www.siri.RouteRefStructure;
import uk.org.siri.www.siri.ServiceFeatureRefStructure;
import uk.org.siri.www.siri.SimpleContactStructure;
import uk.org.siri.www.siri.SituationRefStructure;
import uk.org.siri.www.siri.SituationSimpleRefStructure;
import uk.org.siri.www.siri.StopAssignmentStructure;
import uk.org.siri.www.siri.VehicleJourneyRefStructure;

public class EstimatedTimetableSiri2PbfMapper extends CommonMapper {

    public static uk.org.siri.www.siri.EstimatedTimetableDeliveryStructure.Builder map(EstimatedTimetableDeliveryStructure estimatedTimetableDelivery) {
        final uk.org.siri.www.siri.EstimatedTimetableDeliveryStructure.Builder builder = uk.org.siri.www.siri.EstimatedTimetableDeliveryStructure.newBuilder();

        if (estimatedTimetableDelivery.getEstimatedJourneyVersionFrames() != null) {

            for (EstimatedVersionFrameStructure estimatedJourneyVersionFrame : estimatedTimetableDelivery.getEstimatedJourneyVersionFrames()) {
                builder.addEstimatedJourneyVersionFrame(map(estimatedJourneyVersionFrame));

            }
        }
        if (estimatedTimetableDelivery.getResponseTimestamp() != null) {
            builder.setResponseTimestamp(map(estimatedTimetableDelivery.getResponseTimestamp()));
        }
        builder.setVersion(estimatedTimetableDelivery.getVersion());
        return builder;
    }

    private static uk.org.siri.www.siri.EstimatedVersionFrameStructure.Builder map(EstimatedVersionFrameStructure estimatedJourneyVersionFrame) {
        final uk.org.siri.www.siri.EstimatedVersionFrameStructure.Builder builder = uk.org.siri.www.siri.EstimatedVersionFrameStructure.newBuilder();
        if (estimatedJourneyVersionFrame.getEstimatedVehicleJourneies() != null) {

            for (EstimatedVehicleJourney journey : estimatedJourneyVersionFrame.getEstimatedVehicleJourneies()) {
                builder.addEstimatedVehicleJourney(map(journey));
            }
        }
        if (estimatedJourneyVersionFrame.getRecordedAtTime() != null) {
            builder.setRecordedAtTime(map(estimatedJourneyVersionFrame.getRecordedAtTime()));
        }
        return builder;
    }

    private static EstimatedVehicleJourneyStructure.Builder map(EstimatedVehicleJourney journey) {
        final EstimatedVehicleJourneyStructure.Builder builder = EstimatedVehicleJourneyStructure.newBuilder();
        if (journey.getRecordedAtTime() != null) {
            builder.setRecordedAtTime(CommonMapper.map(journey.getRecordedAtTime()));
        }
        if (journey.getLineRef() != null) {
            builder.setLineRef(map(journey.getLineRef()));
        }
        if (journey.getDirectionRef() != null) {
            builder.setDirectionRef(map(journey.getDirectionRef()));
        }
        if (journey.getFramedVehicleJourneyRef() != null) {
            builder.setFramedVehicleJourneyRef(map(journey.getFramedVehicleJourneyRef()));
        }
        if (journey.getDatedVehicleJourneyRef() != null) {
            builder.setDatedVehicleJourneyRef(map(journey.getDatedVehicleJourneyRef()));
        }
        if (journey.getEstimatedVehicleJourneyCode() != null) {
            builder.setEstimatedVehicleJourneyCode(journey.getEstimatedVehicleJourneyCode());
        }

        builder.setExtraJourney(journey.isExtraJourney() != null && journey.isExtraJourney());
        builder.setCancellation(journey.isCancellation() != null && journey.isCancellation());

        if (journey.getJourneyPatternRef() != null) {
            builder.setJourneyPatternRef(map(journey.getJourneyPatternRef()));
        }
        if (journey.getVehicleModes() != null) {
            for (VehicleModesEnumeration vehicleMode : journey.getVehicleModes()) {
                builder.addVehicleMode(map(vehicleMode));
            }
        }
        if (journey.getRouteRef() != null) {
            builder.setRouteRef(map(journey.getRouteRef()));
        }
        if (journey.getGroupOfLinesRef() != null) {
            builder.setGroupOfLinesRef(map(journey.getGroupOfLinesRef()));
        }
        if (journey.getExternalLineRef() != null) {
            builder.setExternalLineRef(map(journey.getExternalLineRef()));
        }

        if (journey.getPublishedLineNames() != null) {
            for (NaturalLanguageStringStructure publishedLineName : journey.getPublishedLineNames()) {
                builder.addPublishedLineName(map(publishedLineName));
            }
        }

        if (journey.getOriginRef() != null) {
            builder.setOriginRef(map(journey.getOriginRef()));
        }
        if (journey.getOriginNames() != null) {
            for (NaturalLanguagePlaceNameStructure originName : journey.getOriginNames()) {
                builder.addOriginName(map(originName));
            }
        }
        if (journey.getDestinationRef() != null) {
            builder.setDestinationRef(map(journey.getDestinationRef()));
        }
        if (journey.getDestinationNames() != null) {
            for (NaturalLanguageStringStructure destinationName : journey.getDestinationNames()) {
                builder.addDestinationName(map(destinationName));
            }
        }
        if (journey.getOperatorRef() != null) {
            builder.setOperatorRef(map(journey.getOperatorRef()));
        }

        if (journey.getPublicContact() != null) {
            builder.setPublicContact(map(journey.getPublicContact()));
        }
        if (journey.getOperationsContact() != null) {
            builder.setOperationsContact(map(journey.getOperationsContact()));
        }
        if (journey.getSituationReves() != null) {
            for (SituationRef situationRef : journey.getSituationReves()) {
                builder.addSituationRef(map(situationRef));
            }
        }
        builder.setPredictionInaccurate(journey.isPredictionInaccurate() != null && journey.isPredictionInaccurate());


        if (journey.getDataSource() != null) {
            builder.setDataSource(journey.getDataSource());
        }
        if (journey.getServiceFeatureReves() != null) {
            for (ServiceFeatureRef serviceFeatureRef : journey.getServiceFeatureReves()) {
                builder.addServiceFeatureRef(map(serviceFeatureRef));
            }
        }
        if (journey.getBlockRef() != null) {
            builder.setBlockRef(map(journey.getBlockRef()));
        }
        if (journey.getVehicleRef() != null) {
            builder.setVehicleRef(map(journey.getVehicleRef()));
        }
        if (journey.getVehicleJourneyRef() != null) {
            builder.setVehicleJourneyRef(map(journey.getVehicleJourneyRef()));
        }
        if (journey.getAdditionalVehicleJourneyReves() != null) {
            for (uk.org.siri.siri20.FramedVehicleJourneyRefStructure additionalVehicleJourneyRef : journey.getAdditionalVehicleJourneyReves()) {
                builder.addAdditionalVehicleJourneyRef(map(additionalVehicleJourneyRef));
            }
        }
        builder.setMonitored(journey.isMonitored() == null || journey.isMonitored()); // Defaults to 'true' when not set

        if (journey.getRecordedCalls() != null){
            builder.setRecordedCalls(map(journey.getRecordedCalls()));
        }

        if (journey.getEstimatedCalls() != null) {
            builder.setEstimatedCalls(map(journey.getEstimatedCalls()));
        }

        if (journey.isIsCompleteStopSequence() != null) {
            builder.setIsCompleteStopSequence(journey.isIsCompleteStopSequence());
        }

        if (journey.getOccupancy() != null) {
            builder.setOccupancy(map(journey.getOccupancy()));
        }

        if (journey.getExtensions() != null) {
            //TODO: Extensions are currently ignored
        }

        return builder;
    }

    private static VehicleJourneyRefStructure.Builder map(VehicleJourneyRef vehicleJourneyRef) {
        VehicleJourneyRefStructure.Builder builder = VehicleJourneyRefStructure.newBuilder();
        builder.setValue(vehicleJourneyRef.getValue());
        return builder;
    }

    private static SituationRefStructure.Builder map(SituationRef situationRef) {
        SituationRefStructure.Builder builder = SituationRefStructure.newBuilder();
        builder.setSituationSimpleRef(map(situationRef.getSituationSimpleRef()));
        return builder;
    }

    private static SituationSimpleRefStructure.Builder map(SituationSimpleRef situationSimpleRef) {
        SituationSimpleRefStructure.Builder builder = SituationSimpleRefStructure.newBuilder();
        builder.setValue(situationSimpleRef.getValue());
        return builder;
    }

    private static SimpleContactStructure.Builder map(uk.org.siri.siri20.SimpleContactStructure publicContact) {
        SimpleContactStructure.Builder builder = SimpleContactStructure.newBuilder();
        builder.setPhoneNumber(publicContact.getPhoneNumber());
        builder.setUrl(publicContact.getUrl());
        return builder;
    }

    private static GroupOfLinesRefStructure.Builder map(uk.org.siri.siri20.GroupOfLinesRefStructure groupOfLinesRef) {
        GroupOfLinesRefStructure.Builder builder = GroupOfLinesRefStructure.newBuilder();
        builder.setValue(groupOfLinesRef.getValue());
        return builder;
    }

    private static RouteRefStructure.Builder map(uk.org.siri.siri20.RouteRefStructure routeRef) {
        RouteRefStructure.Builder builder = RouteRefStructure.newBuilder();
        builder.setValue(routeRef.getValue());
        return builder;
    }

    private static JourneyPatternRefStructure.Builder map(JourneyPatternRef journeyPatternRef) {
        JourneyPatternRefStructure.Builder builder = JourneyPatternRefStructure.newBuilder();
        builder.setValue(journeyPatternRef.getValue());
        return builder;
    }

    private static ServiceFeatureRefStructure.Builder map(ServiceFeatureRef serviceFeatureRef) {
        ServiceFeatureRefStructure.Builder builder = ServiceFeatureRefStructure.newBuilder();
        builder.setValue(serviceFeatureRef.getValue());
        return builder;
    }

    private static DatedVehicleJourneyRefStructure.Builder map(DatedVehicleJourneyRef datedVehicleJourneyRef) {
        DatedVehicleJourneyRefStructure.Builder builder = DatedVehicleJourneyRefStructure.newBuilder();
        builder.setValue(datedVehicleJourneyRef.getValue());
        return builder;
    }

    private static EstimatedVehicleJourneyStructure.EstimatedCallsType.Builder map(EstimatedVehicleJourney.EstimatedCalls estimatedCalls) {
        if (estimatedCalls != null && estimatedCalls.getEstimatedCalls() != null) {
            final EstimatedVehicleJourneyStructure.EstimatedCallsType.Builder builder = EstimatedVehicleJourneyStructure.EstimatedCallsType.newBuilder();
            for (EstimatedCall call : estimatedCalls.getEstimatedCalls()) {
                builder.addEstimatedCall(map(call));
            }
            return builder;
        }
        return null;
    }

    private static EstimatedCallStructure.Builder map(EstimatedCall call) {
        final EstimatedCallStructure.Builder builder = EstimatedCallStructure.newBuilder();

        if (call.getStopPointRef() != null) {
            builder.setStopPointRef(map(call.getStopPointRef()));
        }
        if (call.getOrder() != null) {
            builder.setOrder(call.getOrder().intValue());
        }
        if (call.getStopPointNames() != null) {
            for (NaturalLanguageStringStructure stopPointName : call.getStopPointNames()) {
                builder.addStopPointName(map(stopPointName));
            }
        }
        if (call.getDestinationDisplaies() != null) {
            for (NaturalLanguageStringStructure destinationDisplay : call.getDestinationDisplaies()) {
                builder.addDestinationDisplay(map(destinationDisplay));
            }
        }
        if (call.isCancellation() != null) {
            builder.setCancellation(call.isCancellation());
        }
        if (call.isExtraCall() != null) {
            builder.setExtraCall(call.isExtraCall());
        }
        if (call.getArrivalPlatformName() != null) {
            builder.setArrivalPlatformName(map(call.getArrivalPlatformName()));
        }
        if (call.getDeparturePlatformName() != null) {
            builder.setDeparturePlatformName(map(call.getDeparturePlatformName()));
        }
        if (call.getAimedArrivalTime() != null) {
            builder.setAimedArrivalTime(CommonMapper.map(call.getAimedArrivalTime()));
        }
        if (call.getAimedDepartureTime() != null) {
            builder.setAimedDepartureTime(CommonMapper.map(call.getAimedDepartureTime()));
        }
        if (call.getExpectedArrivalTime() != null) {
            builder.setExpectedArrivalTime(CommonMapper.map(call.getExpectedArrivalTime()));
        }
        if (call.getExpectedDepartureTime() != null) {
            builder.setExpectedDepartureTime(CommonMapper.map(call.getExpectedDepartureTime()));
        }
        if (call.getArrivalBoardingActivity() != null) {
            builder.setArrivalBoardingActivity(map(call.getArrivalBoardingActivity()));
        }
        if (call.getDepartureBoardingActivity() != null) {
            builder.setDepartureBoardingActivity(map(call.getDepartureBoardingActivity()));
        }
        if (call.getArrivalStopAssignment() != null) {
            builder.setArrivalStopAssignment(map(call.getArrivalStopAssignment()));
        }
        if (call.getDepartureStopAssignment() != null) {
            builder.setDepartureStopAssignment(map(call.getDepartureStopAssignment()));
        }
        if (call.isPredictionInaccurate() != null) {
            builder.setPredictionInaccurate(call.isPredictionInaccurate());
        }
        if (call.isRequestStop() != null) {
            builder.setRequestStop(call.isRequestStop());
        }
        if (call.getArrivalStatus() != null) {
            builder.setArrivalStatus(map(call.getArrivalStatus()));
        }
        if (call.getDepartureStatus() != null) {
            builder.setDepartureStatus(map(call.getDepartureStatus()));
        }
        if (call.getOccupancy() != null) {
            builder.setOccupancy(map(call.getOccupancy()));
        }
        if (call.getExtensions() != null) {
            // TODO: Add support for Extensions
//            builder.setExtensions(mapToJaxb(call.getExtensions()));
        }
        return builder;
    }

    private static StopAssignmentStructure.Builder map(uk.org.siri.siri20.StopAssignmentStructure stopAssignment) {
        final StopAssignmentStructure.Builder builder = StopAssignmentStructure.newBuilder();
        if (stopAssignment.getAimedQuayRef() != null) {
            builder.setAimedQuayRef(QuayRefStructure.newBuilder().setValue(stopAssignment.getAimedQuayRef().getValue()));
        }
        if (stopAssignment.getExpectedQuayRef() != null) {
            builder.setExpectedQuayRef(QuayRefStructure.newBuilder().setValue(stopAssignment.getExpectedQuayRef().getValue()));
        }
        if (stopAssignment.getActualQuayRef() != null) {
            builder.setActualQuayRef(QuayRefStructure.newBuilder().setValue(stopAssignment.getActualQuayRef().getValue()));
        }
        return builder;
    }

    private static EstimatedVehicleJourneyStructure.RecordedCallsType.Builder map(EstimatedVehicleJourney.RecordedCalls recordedCalls) {
        if (recordedCalls != null && recordedCalls.getRecordedCalls() != null) {
            final EstimatedVehicleJourneyStructure.RecordedCallsType.Builder builder = EstimatedVehicleJourneyStructure.RecordedCallsType.newBuilder();
            for (RecordedCall call : recordedCalls.getRecordedCalls()) {
                builder.addRecordedCall(map(call));
            }
            return builder;
        }
        return null;
    }

    private static RecordedCallStructure.Builder map(RecordedCall call) {
        final RecordedCallStructure.Builder builder = RecordedCallStructure.newBuilder();

        if (call.getStopPointRef() != null) {
            builder.setStopPointRef(map(call.getStopPointRef()));
        }
        if (call.getOrder() != null) {
            builder.setOrder(call.getOrder().intValue());
        }
        if (call.getStopPointNames() != null) {
            for (NaturalLanguageStringStructure stopPointName : call.getStopPointNames()) {
                builder.addStopPointName(map(stopPointName));
            }
        }
        if (call.isCancellation() != null) {
            builder.setCancellation(call.isCancellation());
        }
        if (call.isExtraCall() != null) {
            builder.setExtraCall(call.isExtraCall());
        }
        if (call.getArrivalPlatformName() != null) {
            builder.setArrivalPlatformName(map(call.getArrivalPlatformName()));
        }
        if (call.getDeparturePlatformName() != null) {
            builder.setDeparturePlatformName(map(call.getDeparturePlatformName()));
        }
        if (call.getAimedArrivalTime() != null) {
            builder.setAimedArrivalTime(CommonMapper.map(call.getAimedArrivalTime()));
        }
        if (call.getAimedDepartureTime() != null) {
            builder.setAimedDepartureTime(CommonMapper.map(call.getAimedDepartureTime()));
        }
        if (call.getExpectedArrivalTime() != null) {
            builder.setExpectedArrivalTime(CommonMapper.map(call.getExpectedArrivalTime()));
        }
        if (call.getExpectedDepartureTime() != null) {
            builder.setExpectedDepartureTime(CommonMapper.map(call.getExpectedDepartureTime()));
        }
        if (call.getActualArrivalTime() != null) {
            builder.setActualArrivalTime(CommonMapper.map(call.getActualArrivalTime()));
        }
        if (call.getActualDepartureTime() != null) {
            builder.setActualDepartureTime(CommonMapper.map(call.getActualDepartureTime()));
        }
        if (call.isPredictionInaccurate() != null) {
            builder.setPredictionInaccurate(call.isPredictionInaccurate());
        }
        if (call.getOccupancy() != null) {
            builder.setOccupancy(map(call.getOccupancy()));
        }
        return builder;
    }

}
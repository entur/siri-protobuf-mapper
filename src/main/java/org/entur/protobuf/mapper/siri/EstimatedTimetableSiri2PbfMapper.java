package org.entur.protobuf.mapper.siri;

import uk.org.siri.siri20.EstimatedCall;
import uk.org.siri.siri20.EstimatedTimetableDeliveryStructure;
import uk.org.siri.siri20.EstimatedVehicleJourney;
import uk.org.siri.siri20.QuayRefStructure;
import uk.org.siri.siri20.RecordedCall;
import uk.org.siri.siri20.StopAssignmentStructure;
import uk.org.siri.www.siri.EstimatedCallStructure;
import uk.org.siri.www.siri.EstimatedVehicleJourneyStructure;
import uk.org.siri.www.siri.EstimatedVersionFrameStructure;
import uk.org.siri.www.siri.RecordedCallStructure;
import uk.org.siri.www.siri.ServiceFeatureRefStructure;
import uk.org.siri.www.siri.SituationRefStructure;
import uk.org.siri.www.siri.VehicleModesEnumeration;

import java.math.BigInteger;
import java.util.List;

public class EstimatedTimetableSiri2PbfMapper extends CommonMapper {

    public static EstimatedTimetableDeliveryStructure map(uk.org.siri.www.siri.EstimatedTimetableDeliveryStructure deliveryStructure) {
        final EstimatedTimetableDeliveryStructure mapped = new EstimatedTimetableDeliveryStructure();
        final List<EstimatedVersionFrameStructure> estimatedJourneyVersionFrameList = deliveryStructure.getEstimatedJourneyVersionFrameList();
        if (estimatedJourneyVersionFrameList != null) {
            for (EstimatedVersionFrameStructure estimatedVersionFrameStructure : estimatedJourneyVersionFrameList) {
                mapped.getEstimatedJourneyVersionFrames().add(map(estimatedVersionFrameStructure));
            }
        }
        if (deliveryStructure.hasResponseTimestamp()) {
            mapped.setResponseTimestamp(map(deliveryStructure.getResponseTimestamp()));
        }
        mapped.setVersion(deliveryStructure.getVersion());
        return mapped;
    }

    private static uk.org.siri.siri20.EstimatedVersionFrameStructure map(EstimatedVersionFrameStructure estimatedVersionFrameStructure) {
        final uk.org.siri.siri20.EstimatedVersionFrameStructure mapped = new uk.org.siri.siri20.EstimatedVersionFrameStructure();
        final List<EstimatedVehicleJourneyStructure> estimatedVehicleJourneyList = estimatedVersionFrameStructure.getEstimatedVehicleJourneyList();
        for (EstimatedVehicleJourneyStructure estimatedVehicleJourneyStructure : estimatedVehicleJourneyList) {
            mapped.getEstimatedVehicleJourneies().add(map(estimatedVehicleJourneyStructure));
        }
        if (estimatedVersionFrameStructure.hasRecordedAtTime()) {
            mapped.setRecordedAtTime(map(estimatedVersionFrameStructure.getRecordedAtTime()));
        }
        return mapped;
    }

    private static EstimatedVehicleJourney map(EstimatedVehicleJourneyStructure vehicleJourney) {
        final EstimatedVehicleJourney mapped = new EstimatedVehicleJourney();
        if (vehicleJourney.hasRecordedAtTime()) {
            mapped.setRecordedAtTime(map(vehicleJourney.getRecordedAtTime()));
        }
        if (vehicleJourney.hasLineRef()) {
            mapped.setLineRef(map(vehicleJourney.getLineRef()));
        }
        if (vehicleJourney.hasDirectionRef()) {
            mapped.setDirectionRef(map(vehicleJourney.getDirectionRef()));
        }
        if (vehicleJourney.hasFramedVehicleJourneyRef()) {
            mapped.setFramedVehicleJourneyRef(map(vehicleJourney.getFramedVehicleJourneyRef()));
        }
        if (vehicleJourney.hasDatedVehicleJourneyRef()) {
            mapped.setDatedVehicleJourneyRef(map(vehicleJourney.getDatedVehicleJourneyRef()));
        }
        if (vehicleJourney.getEstimatedVehicleJourneyCode() != null && !vehicleJourney.getEstimatedVehicleJourneyCode().isEmpty()) {
            mapped.setEstimatedVehicleJourneyCode(vehicleJourney.getEstimatedVehicleJourneyCode());
        }
        mapped.setExtraJourney(vehicleJourney.getExtraJourney());
        mapped.setCancellation(vehicleJourney.getCancellation());
        if (vehicleJourney.hasJourneyPatternRef()) {
            mapped.setJourneyPatternRef(map(vehicleJourney.getJourneyPatternRef()));
        }

        if (vehicleJourney.getVehicleModeList() != null) {
            for (VehicleModesEnumeration vehicleMode : vehicleJourney.getVehicleModeList()) {
                mapped.getVehicleModes().add(map(vehicleMode));
            }
        }
        if (vehicleJourney.hasRouteRef()) {
            mapped.setRouteRef(map(vehicleJourney.getRouteRef()));
        }
        if (vehicleJourney.hasGroupOfLinesRef()) {
            mapped.setGroupOfLinesRef(map(vehicleJourney.getGroupOfLinesRef()));
        }
        if (vehicleJourney.hasExternalLineRef()) {
            mapped.setExternalLineRef(map(vehicleJourney.getExternalLineRef()));
        }
        if (vehicleJourney.hasOriginRef()) {
            mapped.setOriginRef(map(vehicleJourney.getOriginRef()));
        }
        if (vehicleJourney.getOriginNameList() != null) {
            for (uk.org.siri.www.siri.NaturalLanguagePlaceNameStructure naturalLanguagePlaceNameStructure : vehicleJourney.getOriginNameList()) {
                mapped.getOriginNames().add(map(naturalLanguagePlaceNameStructure));
            }
        }
        if (vehicleJourney.hasDestinationRef()) {
            mapped.setDestinationRef(map(vehicleJourney.getDestinationRef()));
        }
        if (vehicleJourney.getDestinationNameList() != null) {
            for (uk.org.siri.www.siri.NaturalLanguageStringStructure naturalLanguageStringStructure : vehicleJourney.getDestinationNameList()) {
                mapped.getDestinationNames().add(map(naturalLanguageStringStructure));
            }
        }
        if (vehicleJourney.hasOperatorRef()) {
            mapped.setOperatorRef(map(vehicleJourney.getOperatorRef()));
        }

        if (vehicleJourney.hasPublicContact()) {
            mapped.setPublicContact(map(vehicleJourney.getPublicContact()));
        }

        if (vehicleJourney.hasOperationsContact()) {
            mapped.setOperationsContact(map(vehicleJourney.getOperationsContact()));
        }
        if (vehicleJourney.getSituationRefList() != null) {
            for (SituationRefStructure situationRefStructure : vehicleJourney.getSituationRefList()) {
                mapped.getSituationReves().add(map(situationRefStructure));
            }
        }
        mapped.setPredictionInaccurate((vehicleJourney.getPredictionInaccurate()));

        mapped.setDataSource(vehicleJourney.getDataSource());

        if (vehicleJourney.getOccupancy() != null) {
            mapped.setOccupancy(map(vehicleJourney.getOccupancy()));
        }

        if (vehicleJourney.hasBlockRef()) {
            mapped.setBlockRef(map(vehicleJourney.getBlockRef()));
        }

        if (vehicleJourney.hasVehicleRef()) {
            mapped.setVehicleRef(map(vehicleJourney.getVehicleRef()));
        }
        if (vehicleJourney.hasVehicleJourneyRef()) {
            mapped.setVehicleJourneyRef(map(vehicleJourney.getVehicleJourneyRef()));
        }

        if (vehicleJourney.getAdditionalVehicleJourneyRefList() != null) {
            for (uk.org.siri.www.siri.FramedVehicleJourneyRefStructure framedVehicleJourneyRefStructure : vehicleJourney.getAdditionalVehicleJourneyRefList()) {
                mapped.getAdditionalVehicleJourneyReves().add(map(framedVehicleJourneyRefStructure));
            }
        }

        if (vehicleJourney.getServiceFeatureRefList() != null) {
            for (ServiceFeatureRefStructure serviceFeatureRefStructure : vehicleJourney.getServiceFeatureRefList()) {
                mapped.getServiceFeatureReves().add(map(serviceFeatureRefStructure));
            }
        }

        mapped.setMonitored(vehicleJourney.getMonitored());

        if (vehicleJourney.hasRecordedCalls()) {
            mapped.setRecordedCalls(map(vehicleJourney.getRecordedCalls()));
        }

        if (vehicleJourney.hasEstimatedCalls()) {
            mapped.setEstimatedCalls(map(vehicleJourney.getEstimatedCalls()));
        }

        mapped.setIsCompleteStopSequence(vehicleJourney.getIsCompleteStopSequence());
        return mapped;
    }

    private static EstimatedVehicleJourney.EstimatedCalls map(EstimatedVehicleJourneyStructure.EstimatedCallsType calls) {
        final EstimatedVehicleJourney.EstimatedCalls mapped = new EstimatedVehicleJourney.EstimatedCalls();
        final List<EstimatedCallStructure> estimatedCallList = calls.getEstimatedCallList();
        if (estimatedCallList != null) {
            for (EstimatedCallStructure estimatedCall : estimatedCallList) {
                mapped.getEstimatedCalls().add(map(estimatedCall));
            }
        }
        return mapped;
    }

    private static EstimatedCall map(EstimatedCallStructure call) {
        final EstimatedCall mapped = new EstimatedCall();

        if (call.hasStopPointRef()) {
            mapped.setStopPointRef(map(call.getStopPointRef()));
        }
        if (call.getOrder() > 0) {
            mapped.setOrder(BigInteger.valueOf(call.getOrder()));
        }
        if (call.getStopPointNameList() != null) {
            for (uk.org.siri.www.siri.NaturalLanguageStringStructure naturalLanguageStringStructure : call.getStopPointNameList()) {
                mapped.getStopPointNames().add(map(naturalLanguageStringStructure));
            }
        }
        if (call.getExtraCall()) {
            mapped.setExtraCall(call.getExtraCall());
        }
        if (call.getCancellation()) {
            mapped.setCancellation(call.getCancellation());
        }
        if (call.getPredictionInaccurate()) {
            mapped.setPredictionInaccurate(call.getPredictionInaccurate());
        }
        if (call.getRequestStop()) {
            mapped.setRequestStop(call.getRequestStop());
        }

        if (call.getDestinationDisplayList() != null) {
            for (uk.org.siri.www.siri.NaturalLanguageStringStructure destinationDisplay : call.getDestinationDisplayList()) {
                mapped.getDestinationDisplaies().add(map(destinationDisplay));
            }
        }
        if (call.getSituationRefList() != null) {
            for (SituationRefStructure situationRefStructure : call.getSituationRefList()) {
                mapped.getSituationReves().add(map(situationRefStructure));
            }
        }
        // Arrival
        if (call.hasAimedArrivalTime()) {
            mapped.setAimedArrivalTime(CommonMapper.map(call.getAimedArrivalTime()));
        }
        if (call.hasExpectedArrivalTime()) {
            mapped.setExpectedArrivalTime(CommonMapper.map(call.getExpectedArrivalTime()));
        }
        if (call.getArrivalStatus() != null) {
            mapped.setArrivalStatus(map(call.getArrivalStatus()));
        }
        if (call.hasArrivalPlatformName()) {
            mapped.setArrivalPlatformName(map(call.getArrivalPlatformName()));
        }
        if (call.getArrivalBoardingActivity() != null) {
            mapped.setArrivalBoardingActivity(map(call.getArrivalBoardingActivity()));
        }
        if (call.hasArrivalStopAssignment()) {
            mapped.setArrivalStopAssignment(map(call.getArrivalStopAssignment()));
        }

        //Departure
        if (call.hasAimedDepartureTime()) {
            mapped.setAimedDepartureTime(CommonMapper.map(call.getAimedDepartureTime()));
        }
        if (call.hasExpectedDepartureTime()) {
            mapped.setExpectedDepartureTime(CommonMapper.map(call.getExpectedDepartureTime()));
        }
        if (call.getDepartureStatus() != null) {
            mapped.setDepartureStatus(map(call.getDepartureStatus()));
        }
        if (call.hasDeparturePlatformName()) {
            mapped.setDeparturePlatformName(map(call.getDeparturePlatformName()));
        }
        if (call.getDepartureBoardingActivity() != null) {
            mapped.setDepartureBoardingActivity(map(call.getDepartureBoardingActivity()));
        }
        if (call.hasDepartureStopAssignment()) {
            mapped.setDepartureStopAssignment(map(call.getDepartureStopAssignment()));
        }


        if (call.getOccupancy() != null) {
            mapped.setOccupancy(map(call.getOccupancy()));
        }

        if (call.hasExtensions()) {
            // TODO: Extensions are currently ignored
        }
        return mapped;
    }

    private static StopAssignmentStructure map(uk.org.siri.www.siri.StopAssignmentStructure stopAssignment) {
        final StopAssignmentStructure mapped = new StopAssignmentStructure();
        if (stopAssignment.hasAimedQuayRef()) {
            mapped.setAimedQuayRef(map(stopAssignment.getAimedQuayRef()));
        }
        if (stopAssignment.hasExpectedQuayRef()) {
            mapped.setExpectedQuayRef(map(stopAssignment.getExpectedQuayRef()));
        }
        if (stopAssignment.hasActualQuayRef()) {
            mapped.setActualQuayRef(map(stopAssignment.getActualQuayRef()));
        }
        return mapped;
    }

    private static QuayRefStructure map(uk.org.siri.www.siri.QuayRefStructure quayRef) {
        final QuayRefStructure mapped = new QuayRefStructure();
        mapped.setValue(quayRef.getValue());
        return mapped;
    }

    private static EstimatedVehicleJourney.RecordedCalls map(EstimatedVehicleJourneyStructure.RecordedCallsType calls) {
        final EstimatedVehicleJourney.RecordedCalls mapped = new EstimatedVehicleJourney.RecordedCalls();
        final List<RecordedCallStructure> recordedCallList = calls.getRecordedCallList();
        if (recordedCallList != null) {
            for (RecordedCallStructure recordedCallStructure : recordedCallList) {
                mapped.getRecordedCalls().add(map(recordedCallStructure));
            }
        }
        return mapped;
    }

    private static RecordedCall map(RecordedCallStructure call) {
        final RecordedCall mapped = new RecordedCall();

        if (call.hasStopPointRef()) {
            mapped.setStopPointRef(map(call.getStopPointRef()));
        }
        if (call.getOrder() > 0) {
            mapped.setOrder(BigInteger.valueOf(call.getOrder()));
        }
        if (call.getStopPointNameList() != null) {
            for (uk.org.siri.www.siri.NaturalLanguageStringStructure naturalLanguageStringStructure : call.getStopPointNameList()) {
                mapped.getStopPointNames().add(map(naturalLanguageStringStructure));
            }
        }

        if (call.getExtraCall()) {
            mapped.setExtraCall(call.getExtraCall());
        }

        if (call.getCancellation()) {
            mapped.setCancellation(call.getCancellation());
        }
        if (call.getOccupancy() != null) {
            mapped.setOccupancy(map(call.getOccupancy()));
        }

        if (call.hasArrivalPlatformName()) {
            mapped.setArrivalPlatformName(map(call.getArrivalPlatformName()));
        }
        if (call.hasDeparturePlatformName()) {
            mapped.setDeparturePlatformName(map(call.getDeparturePlatformName()));
        }
        if (call.hasAimedArrivalTime()) {
            mapped.setAimedArrivalTime(CommonMapper.map(call.getAimedArrivalTime()));
        }
        if (call.hasActualArrivalTime()) {
            mapped.setActualArrivalTime(CommonMapper.map(call.getActualArrivalTime()));
        }
        if (call.hasAimedDepartureTime()) {
            mapped.setAimedDepartureTime(CommonMapper.map(call.getAimedDepartureTime()));
        }
        if (call.hasActualDepartureTime()) {
            mapped.setActualDepartureTime(CommonMapper.map(call.getActualDepartureTime()));
        }

        if (call.getPredictionInaccurate()) {
            mapped.setPredictionInaccurate(call.getPredictionInaccurate());
        }

        return mapped;
    }
}

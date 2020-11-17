package org.entur.protobuf.mapper.siri;

import org.w3c.dom.Element;
import uk.org.acbs.siri20.AccessibilityLimitationStructure;
import uk.org.ifopt.www.acsb.AccessibilityAssessmentStructure;
import uk.org.ifopt.www.acsb.AccessibilityStructure;
import uk.org.ifopt.www.ifopt.StopPlaceComponentRefStructure;
import uk.org.siri.siri20.*;
import uk.org.siri.www.siri.AffectsScopeStructure;
import uk.org.siri.www.siri.DatedVehicleJourneyRefStructure;
import uk.org.siri.www.siri.EntryQualifierStructure;
import uk.org.siri.www.siri.NetworkRefStructure;
import uk.org.siri.www.siri.PtSituationElementStructure;
import uk.org.siri.www.siri.ReportTypeEnumeration;
import uk.org.siri.www.siri.RouteRefStructure;
import uk.org.siri.www.siri.SituationExchangeDeliveryStructure;
import uk.org.siri.www.siri.SituationSourceStructure;
import uk.org.siri.www.siri.SituationVersion;
import uk.org.siri.www.siri.VehicleJourneyRefStructure;
import uk.org.siri.www.siri.ExtensionsStructure;

import java.io.Serializable;
import java.util.List;

public class SituationExchangeSiri2PbfMapper extends CommonMapper {
    public static SituationExchangeDeliveryStructure.Builder map(uk.org.siri.siri20.SituationExchangeDeliveryStructure situationExchangeDeliveryStructure) {
        SituationExchangeDeliveryStructure.Builder builder = SituationExchangeDeliveryStructure.newBuilder();
        if (situationExchangeDeliveryStructure.getSituations() != null) {
            builder.setSituations(map(situationExchangeDeliveryStructure.getSituations()));
        }
        if (situationExchangeDeliveryStructure.getResponseTimestamp() != null) {
            builder.setResponseTimestamp(map(situationExchangeDeliveryStructure.getResponseTimestamp()));
        }
        return builder;
    }

    private static SituationExchangeDeliveryStructure.SituationsType.Builder map(uk.org.siri.siri20.SituationExchangeDeliveryStructure.Situations situations) {
        SituationExchangeDeliveryStructure.SituationsType.Builder builder = SituationExchangeDeliveryStructure.SituationsType.newBuilder();

        final List<PtSituationElement> ptSituationElements = situations.getPtSituationElements();
        for (PtSituationElement ptSituationElement : ptSituationElements) {
            builder.addPtSituationElement(map(ptSituationElement));
        }
        return builder;
    }

    private static PtSituationElementStructure.Builder map(PtSituationElement ptSituationElement) {
        PtSituationElementStructure.Builder builder = PtSituationElementStructure.newBuilder();
        if (ptSituationElement.getCreationTime() != null) {
            builder.setCreationTime(map(ptSituationElement.getCreationTime()));
        }
        if (ptSituationElement.getParticipantRef() != null) {
            builder.setParticipantRef(map(ptSituationElement.getParticipantRef()));
        }
        if (ptSituationElement.getSituationNumber() != null) {
            builder.setSituationNumber(map(ptSituationElement.getSituationNumber()));
        }
        if (ptSituationElement.getSource() != null) {
            builder.setSource(map(ptSituationElement.getSource()));
        }
        if (ptSituationElement.getProgress() != null) {
            builder.setProgress(map(ptSituationElement.getProgress()));
        }
        if(ptSituationElement.getVersion() != null) {
            builder.setVersion(map(ptSituationElement.getVersion()));
        }
        if (ptSituationElement.getVersionedAtTime() != null) {
            builder.setVersionedAtTime(map(ptSituationElement.getVersionedAtTime()));
        }
        if (ptSituationElement.getValidityPeriods() != null) {
            for (HalfOpenTimestampOutputRangeStructure validityPeriod : ptSituationElement.getValidityPeriods()) {
                builder.addValidityPeriod(map(validityPeriod));
            }
        }
        if (ptSituationElement.getScopeType() != null) {
            builder.setScopeType(map(ptSituationElement.getScopeType()));
        }
        if (ptSituationElement.getUndefinedReason() != null) {
            builder.setUndefinedReason(ptSituationElement.getUndefinedReason());
        }
        if (ptSituationElement.getSeverity() != null) {
            builder.setSeverity(map(ptSituationElement.getSeverity()));
        }
        if (ptSituationElement.getAudience() != null) {
            builder.setAudience(map(ptSituationElement.getAudience()));
        }
        if (ptSituationElement.getPriority() != null) {
            builder.setPriority(ptSituationElement.getPriority().intValue());
        }
        if (ptSituationElement.getReportType() != null) {
            builder.setReportType(map(ptSituationElement.getReportType()));
        }

        builder.setPlanned(ptSituationElement.isPlanned() != null && ptSituationElement.isPlanned());  //default false

        if (ptSituationElement.getSummaries() != null) {
            for (DefaultedTextStructure summary : ptSituationElement.getSummaries()) {
                builder.addSummary(map(summary));
            }
        }
        if (ptSituationElement.getDescriptions() != null) {
            for (DefaultedTextStructure description : ptSituationElement.getDescriptions()) {
                builder.addDescription(map(description));
            }
        }
        if (ptSituationElement.getAdvices() != null) {
            for (DefaultedTextStructure advice : ptSituationElement.getAdvices()) {
                builder.addAdvice(map(advice));
            }
        }
        if (ptSituationElement.getDetails() != null) {
            for (DefaultedTextStructure detail : ptSituationElement.getDetails()) {
                builder.addDetail(map(detail));
            }
        }
        if (ptSituationElement.getInfoLinks() != null) {
            builder.setInfoLinks(map(ptSituationElement.getInfoLinks()));
        }
        if (ptSituationElement.getAffects() != null) {
            builder.setAffects(map(ptSituationElement.getAffects()));
        }
        if (ptSituationElement.getConsequences() != null &&
                ptSituationElement.getConsequences().getConsequences() != null &&
                !ptSituationElement.getConsequences().getConsequences().isEmpty()) {
            builder.setConsequences(map(ptSituationElement.getConsequences()));
        }
        if (ptSituationElement.getReferences() != null) {
            builder.setReferences(map(ptSituationElement.getReferences()));
        }
        if (ptSituationElement.getExtensions() != null) {
            //TODO: Extensions are currently ignored
            //builder.setExtensions(map(ptSituationElement.getExtensions()));
        }

        return builder;
    }

    private static AffectsScopeStructure.Builder map(uk.org.siri.siri20.AffectsScopeStructure affects) {
        AffectsScopeStructure.Builder builder = AffectsScopeStructure.newBuilder();
        if (affects.getNetworks() != null) {
            builder.setNetworks(map(affects.getNetworks()));
        }
        if (affects.getStopPlaces() != null) {
            builder.setStopPlaces(map(affects.getStopPlaces()));
        }
        if (affects.getStopPoints() != null) {
            builder.setStopPoints(map(affects.getStopPoints()));
        }
        if (affects.getVehicleJourneys() != null) {
            builder.setVehicleJourneys(map(affects.getVehicleJourneys()));
        }
        return builder;
    }

    private static AffectsScopeStructure.VehicleJourneysType.Builder map(uk.org.siri.siri20.AffectsScopeStructure.VehicleJourneys vehicleJourneys) {
        AffectsScopeStructure.VehicleJourneysType.Builder builder = AffectsScopeStructure.VehicleJourneysType.newBuilder();
        if (vehicleJourneys.getAffectedVehicleJourneies() != null) {
            for (AffectedVehicleJourneyStructure affectedVehicleJourney : vehicleJourneys.getAffectedVehicleJourneies()) {
                builder.addAffectedVehicleJourney(map(affectedVehicleJourney));
            }
        }
        return builder;
    }

    private static uk.org.siri.www.siri.AffectedVehicleJourneyStructure.Builder map(AffectedVehicleJourneyStructure affectedVehicleJourney) {
        uk.org.siri.www.siri.AffectedVehicleJourneyStructure.Builder builder = uk.org.siri.www.siri.AffectedVehicleJourneyStructure.newBuilder();
        if (affectedVehicleJourney.getVehicleJourneyReves() != null) {
            for (VehicleJourneyRef vehicleJourneyRef : affectedVehicleJourney.getVehicleJourneyReves()) {
                builder.addVehicleJourneyRef(map(vehicleJourneyRef));
            }
        }
        if (affectedVehicleJourney.getFramedVehicleJourneyRef() != null) {
            builder.setFramedVehicleJourneyRef(map(affectedVehicleJourney.getFramedVehicleJourneyRef()));
        }
        if (affectedVehicleJourney.getDatedVehicleJourneyReves() != null) {
            for (DatedVehicleJourneyRef datedVehicleJourneyRef : affectedVehicleJourney.getDatedVehicleJourneyReves()) {
                builder.addDatedVehicleJourneyRef(map(datedVehicleJourneyRef));
            }
        }
        if (affectedVehicleJourney.getOperator() != null) {
            builder.setOperator(map(affectedVehicleJourney.getOperator()));
        }
        if (affectedVehicleJourney.getLineRef() != null) {
            builder.setLineRef(map(affectedVehicleJourney.getLineRef()));
        }
        if (affectedVehicleJourney.getRoutes() != null) {
            for (AffectedRouteStructure route : affectedVehicleJourney.getRoutes()) {
                builder.addRoute(map(route));
            }
        }
        if (affectedVehicleJourney.getOriginAimedDepartureTime() != null) {
            builder.setOriginAimedDepartureTime(map(affectedVehicleJourney.getOriginAimedDepartureTime()));
        }

        return builder;
    }

    private static DatedVehicleJourneyRefStructure.Builder map(DatedVehicleJourneyRef datedVehicleJourneyRef) {
        DatedVehicleJourneyRefStructure.Builder builder = DatedVehicleJourneyRefStructure.newBuilder();
        if (datedVehicleJourneyRef.getValue() != null && !datedVehicleJourneyRef.getValue().isEmpty()) {
            builder.setValue(datedVehicleJourneyRef.getValue());
        }
        return builder;
    }

    private static VehicleJourneyRefStructure.Builder map(VehicleJourneyRef vehicleJourneyRef) {
        return VehicleJourneyRefStructure.newBuilder().setValue(vehicleJourneyRef.getValue());
    }

    private static AffectsScopeStructure.StopPointsType.Builder map(uk.org.siri.siri20.AffectsScopeStructure.StopPoints stopPoints) {
        AffectsScopeStructure.StopPointsType.Builder builder = AffectsScopeStructure.StopPointsType.newBuilder();
        if (stopPoints.getAffectedStopPoints() != null) {
            for (AffectedStopPointStructure affectedStopPoint : stopPoints.getAffectedStopPoints()) {
                final uk.org.siri.www.siri.AffectedRouteStructure.StopPointsType.SequenceWrapper_StopPointsType.Builder stop = map(affectedStopPoint);
                builder.addAffectedStopPoint(stop.getAffectedStopPoint());
            }
        }
        return builder;
    }

    private static AffectsScopeStructure.StopPlacesType.Builder map(uk.org.siri.siri20.AffectsScopeStructure.StopPlaces stopPlaces) {
        AffectsScopeStructure.StopPlacesType.Builder builder = AffectsScopeStructure.StopPlacesType.newBuilder();
        if (stopPlaces.getAffectedStopPlaces() != null) {
            for (AffectedStopPlaceStructure affectedStopPlace : stopPlaces.getAffectedStopPlaces()) {
                builder.addAffectedStopPlace(map(affectedStopPlace));
            }
        }
        return builder;
    }

    private static uk.org.siri.www.siri.AffectedStopPlaceStructure.Builder map(AffectedStopPlaceStructure affectedStopPlace) {
        uk.org.siri.www.siri.AffectedStopPlaceStructure.Builder builder = uk.org.siri.www.siri.AffectedStopPlaceStructure.newBuilder();
        if (affectedStopPlace.getStopPlaceRef() != null) {
            builder.setStopPlaceRef(map(affectedStopPlace.getStopPlaceRef()));
        }
        if (affectedStopPlace.getPlaceNames() != null) {
            for (NaturalLanguageStringStructure placeName : affectedStopPlace.getPlaceNames()) {
                builder.addPlaceName(map(placeName));
            }
        }
        if (affectedStopPlace.getAffectedComponents() != null) {
            builder.setAffectedComponents(map(affectedStopPlace.getAffectedComponents()));
        }
        if (affectedStopPlace.getAccessibilityAssessment() != null) {
            builder.setAccessibilityAssessment(map(affectedStopPlace.getAccessibilityAssessment()));
        }
        return builder;
    }

    private static AccessibilityAssessmentStructure.Builder map(uk.org.acbs.siri20.AccessibilityAssessmentStructure accessibilityAssessment) {
        AccessibilityAssessmentStructure.Builder builder = AccessibilityAssessmentStructure.newBuilder();
        builder.setMobilityImpairedAccess(accessibilityAssessment.isMobilityImpairedAccess());
        if (accessibilityAssessment.getLimitations() != null) {
            builder.setLimitations(map(accessibilityAssessment.getLimitations()));
        }
        return builder;
    }

    private static AccessibilityAssessmentStructure.LimitationsType.Builder map(uk.org.acbs.siri20.AccessibilityAssessmentStructure.Limitations limitations) {
        AccessibilityAssessmentStructure.LimitationsType.Builder builder = AccessibilityAssessmentStructure.LimitationsType.newBuilder();
        if (limitations.getAccessibilityLimitations() != null) {
            for (AccessibilityLimitationStructure accessibilityLimitation : limitations.getAccessibilityLimitations()) {
                builder.addAccessibilityLimitation(map(accessibilityLimitation));
            }
        }
        return builder;
    }

    private static uk.org.ifopt.www.acsb.AccessibilityLimitationStructure.Builder map(AccessibilityLimitationStructure accessibilityLimitation) {
        uk.org.ifopt.www.acsb.AccessibilityLimitationStructure.Builder builder = uk.org.ifopt.www.acsb.AccessibilityLimitationStructure.newBuilder();
        if (accessibilityLimitation.getWheelchairAccess() != null) {
            builder.setWheelchairAccess(map(accessibilityLimitation.getWheelchairAccess()));
        }
        if (accessibilityLimitation.getStepFreeAccess() != null) {
            builder.setStepFreeAccess(map(accessibilityLimitation.getStepFreeAccess()));
        }
        if (accessibilityLimitation.getEscalatorFreeAccess() != null) {
            builder.setEscalatorFreeAccess(map(accessibilityLimitation.getEscalatorFreeAccess()));
        }
        if (accessibilityLimitation.getLiftFreeAccess() != null) {
            builder.setLiftFreeAccess(map(accessibilityLimitation.getLiftFreeAccess()));
        }
        return builder;
    }

    private static AccessibilityStructure.Builder map(uk.org.acbs.siri20.AccessibilityStructure accessibilityStructure) {
        return AccessibilityStructure.newBuilder().setValue(accessibilityStructure.getValue().value());
    }

    private static uk.org.siri.www.siri.AffectedStopPlaceStructure.AffectedComponentsType.Builder map(AffectedStopPlaceStructure.AffectedComponents affectedComponents) {
        uk.org.siri.www.siri.AffectedStopPlaceStructure.AffectedComponentsType.Builder builder = uk.org.siri.www.siri.AffectedStopPlaceStructure.AffectedComponentsType.newBuilder();
        if (affectedComponents.getAffectedComponents() != null) {
            for (AffectedStopPlaceComponentStructure affectedComponent : affectedComponents.getAffectedComponents()) {
                builder.addAffectedComponent(map(affectedComponent));
            }
        }
        return builder;
    }

    private static uk.org.siri.www.siri.AffectedStopPlaceComponentStructure.Builder map(AffectedStopPlaceComponentStructure affectedComponent) {
        uk.org.siri.www.siri.AffectedStopPlaceComponentStructure.Builder builder = uk.org.siri.www.siri.AffectedStopPlaceComponentStructure.newBuilder();
        if (affectedComponent.getComponentRef() != null) {
            builder.setComponentRef(map(affectedComponent.getComponentRef()));
        }
        if (affectedComponent.getComponentType() != null) {
            builder.setComponentType(map(affectedComponent.getComponentType()));
        }
        if (affectedComponent.getAccessFeatureType() != null) {
            builder.setAccessFeatureType(map(affectedComponent.getAccessFeatureType()));
        }
        return builder;
    }

    private static StopPlaceComponentRefStructure.Builder map(uk.org.ifopt.siri20.StopPlaceComponentRefStructure componentRef) {
        return StopPlaceComponentRefStructure.newBuilder().setValue(componentRef.getValue());
    }

    private static AffectsScopeStructure.NetworksType.Builder map(uk.org.siri.siri20.AffectsScopeStructure.Networks networks) {
        AffectsScopeStructure.NetworksType.Builder builder = AffectsScopeStructure.NetworksType.newBuilder();
        if (networks.getAffectedNetworks() != null) {
            for (uk.org.siri.siri20.AffectsScopeStructure.Networks.AffectedNetwork affectedNetwork : networks.getAffectedNetworks()) {
                builder.addAffectedNetwork(map(affectedNetwork));
            }
        }

        return builder;
    }

    private static AffectsScopeStructure.NetworksType.AffectedNetworkType.Builder map(uk.org.siri.siri20.AffectsScopeStructure.Networks.AffectedNetwork affectedNetwork) {
        AffectsScopeStructure.NetworksType.AffectedNetworkType.Builder builder = AffectsScopeStructure.NetworksType.AffectedNetworkType.newBuilder();
        if (affectedNetwork.getAffectedOperators() != null) {
            for (AffectedOperatorStructure affectedOperator : affectedNetwork.getAffectedOperators()) {
                builder.addAffectedOperator(map(affectedOperator));
            }
        }
        if (affectedNetwork.getNetworkRef() != null) {
            builder.setNetworkRef(map(affectedNetwork.getNetworkRef()));
        }
        if (affectedNetwork.getVehicleMode() != null) {
            builder.setVehicleMode(map(affectedNetwork.getVehicleMode()));
        }
        if (affectedNetwork.getAirSubmode() != null) {
            builder.setAirSubmode(map(affectedNetwork.getAirSubmode()));
        }
        if (affectedNetwork.getBusSubmode() != null) {
            builder.setBusSubmode(map(affectedNetwork.getBusSubmode()));
        }
        if (affectedNetwork.getCoachSubmode() != null) {
            builder.setCoachSubmode(map(affectedNetwork.getCoachSubmode()));
        }
        if (affectedNetwork.getMetroSubmode() != null) {
            builder.setMetroSubmode(map(affectedNetwork.getMetroSubmode()));
        }
        if (affectedNetwork.getRailSubmode() != null) {
            builder.setRailSubmode(map(affectedNetwork.getRailSubmode()));
        }
        if (affectedNetwork.getTramSubmode() != null) {
            builder.setTramSubmode(map(affectedNetwork.getTramSubmode()));
        }
        if (affectedNetwork.getWaterSubmode() != null) {
            builder.setWaterSubmode(map(affectedNetwork.getWaterSubmode()));
        }
        if (affectedNetwork.getAffectedLines() != null) {
            for (AffectedLineStructure affectedLine : affectedNetwork.getAffectedLines()) {
                builder.addAffectedLine(map(affectedLine));
            }
        }
        return builder;
    }

    private static uk.org.siri.www.siri.AffectedLineStructure.Builder map(AffectedLineStructure affectedLine) {
        uk.org.siri.www.siri.AffectedLineStructure.Builder builder = uk.org.siri.www.siri.AffectedLineStructure.newBuilder();
        if (affectedLine.getLineRef() != null) {
            builder.setLineRef(map(affectedLine.getLineRef()));
        }
        if (affectedLine.getRoutes() != null) {
            builder.setRoutes(map(affectedLine.getRoutes()));
        }
        if (affectedLine.getPublishedLineName() != null) {
            builder.setPublishedLineName(map(affectedLine.getPublishedLineName()));
        }
        return builder;
    }

    private static uk.org.siri.www.siri.AffectedLineStructure.RoutesType.Builder map(AffectedLineStructure.Routes routes) {
        uk.org.siri.www.siri.AffectedLineStructure.RoutesType.Builder builder = uk.org.siri.www.siri.AffectedLineStructure.RoutesType.newBuilder();
        if (routes.getAffectedRoutes() != null) {
            for (AffectedRouteStructure affectedRoute : routes.getAffectedRoutes()) {
                builder.addAffectedRoute(map(affectedRoute));
            }
        }

        return builder;
    }

    private static uk.org.siri.www.siri.AffectedRouteStructure.Builder map(AffectedRouteStructure affectedRoute) {
        uk.org.siri.www.siri.AffectedRouteStructure.Builder builder = uk.org.siri.www.siri.AffectedRouteStructure.newBuilder();
        if (affectedRoute.getRouteRef() != null) {
            builder.setRouteRef(map(affectedRoute.getRouteRef()));
        }
        if (affectedRoute.getStopPoints() != null) {
            builder.setStopPoints(map(affectedRoute.getStopPoints()));
        }
        return builder;
    }

    private static uk.org.siri.www.siri.AffectedRouteStructure.StopPointsType.Builder map(AffectedRouteStructure.StopPoints stopPoints) {
        uk.org.siri.www.siri.AffectedRouteStructure.StopPointsType.Builder builder = uk.org.siri.www.siri.AffectedRouteStructure.StopPointsType.newBuilder();
        if (stopPoints.getAffectedStopPointsAndLinkProjectionToNextStopPoints() != null) {
            for (Serializable stopPoint : stopPoints.getAffectedStopPointsAndLinkProjectionToNextStopPoints()) {
                if (stopPoint instanceof AffectedStopPointStructure) {
                    AffectedStopPointStructure affectedStopPoint = (AffectedStopPointStructure) stopPoint;
                    builder.addSequenceWrapper(map(affectedStopPoint));
                }
            }
        }
        builder.setAffectedOnly(stopPoints.isAffectedOnly() != null && stopPoints.isAffectedOnly());  //default false
        return builder;
    }

    private static uk.org.siri.www.siri.AffectedRouteStructure.StopPointsType.SequenceWrapper_StopPointsType.Builder map(AffectedStopPointStructure affectedStopPoint) {
        uk.org.siri.www.siri.AffectedRouteStructure.StopPointsType.SequenceWrapper_StopPointsType.Builder builder = uk.org.siri.www.siri.AffectedRouteStructure.StopPointsType.SequenceWrapper_StopPointsType.newBuilder();


        uk.org.siri.www.siri.AffectedStopPointStructure.Builder stopPoint = uk.org.siri.www.siri.AffectedStopPointStructure.newBuilder();

        if (affectedStopPoint.getStopPointRef() != null) {
            stopPoint.setStopPointRef(map(affectedStopPoint.getStopPointRef()));
        }
        if (affectedStopPoint.getStopPointNames() != null) {
            for (NaturalLanguageStringStructure stopPointName : affectedStopPoint.getStopPointNames()) {
                stopPoint.addStopPointName(map(stopPointName));
            }
        }
        if (affectedStopPoint.getStopConditions() != null) {
            for (RoutePointTypeEnumeration stopCondition : affectedStopPoint.getStopConditions()) {
                stopPoint.addStopCondition(map(stopCondition));
            }
        }
        if (affectedStopPoint.getStopPointType() != null) {
            stopPoint.setStopPointType(map(affectedStopPoint.getStopPointType()));
        }
        if (affectedStopPoint.getLocation() != null) {
            stopPoint.setLocation(map(affectedStopPoint.getLocation()));
        }

        builder.setAffectedStopPoint(stopPoint);

        return builder;
    }

    private static RouteRefStructure.Builder map(uk.org.siri.siri20.RouteRefStructure routeRef) {
        RouteRefStructure.Builder builder = RouteRefStructure.newBuilder();
        builder.setValue(routeRef.getValue());
        return builder;
    }

    private static NetworkRefStructure.Builder map(uk.org.siri.siri20.NetworkRefStructure networkRef) {
        NetworkRefStructure.Builder builder = NetworkRefStructure.newBuilder();
        builder.setValue(networkRef.getValue());
        return builder;
    }

    private static uk.org.siri.www.siri.AffectedOperatorStructure.Builder map(AffectedOperatorStructure affectedOperator) {
        uk.org.siri.www.siri.AffectedOperatorStructure.Builder builder = uk.org.siri.www.siri.AffectedOperatorStructure.newBuilder();
        if (affectedOperator.getOperatorRef() != null) {
            builder.setOperatorRef(map(affectedOperator.getOperatorRef()));
        }
        return builder;
    }

    private static PtSituationElementStructure.InfoLinksType.Builder map(PtSituationElement.InfoLinks infoLinks) {
        PtSituationElementStructure.InfoLinksType.Builder builder = PtSituationElementStructure.InfoLinksType.newBuilder();
        if (infoLinks.getInfoLinks() != null) {
            for (InfoLinkStructure infoLink : infoLinks.getInfoLinks()) {
                builder.addInfoLink(map(infoLink));
            }
        }
        return builder;
    }

    private static uk.org.siri.www.siri.InfoLinkStructure.Builder map(InfoLinkStructure infoLink) {
        uk.org.siri.www.siri.InfoLinkStructure.Builder builder = uk.org.siri.www.siri.InfoLinkStructure.newBuilder();
        if (infoLink.getLabels() != null) {
            for (NaturalLanguageStringStructure label : infoLink.getLabels()) {
                builder.addLabel(map(label));
            }
        }
        if (infoLink.getUri() != null) {
            builder.setUri(infoLink.getUri());
        }
        return builder;
    }

    private static ReportTypeEnumeration map(String reportType) {
        if (reportType.equals("general")) {
            return ReportTypeEnumeration.REPORT_TYPE_ENUMERATION_GENERAL;
        } else if (reportType.equals("incident")) {
            return ReportTypeEnumeration.REPORT_TYPE_ENUMERATION_INCIDENT;
        }
        return null;
    }


    private static uk.org.siri.www.siri.HalfOpenTimestampOutputRangeStructure.Builder map(HalfOpenTimestampOutputRangeStructure validityPeriod) {
        uk.org.siri.www.siri.HalfOpenTimestampOutputRangeStructure.Builder builder = uk.org.siri.www.siri.HalfOpenTimestampOutputRangeStructure.newBuilder();
        if (validityPeriod.getStartTime() != null) {
            builder.setStartTime(map(validityPeriod.getStartTime()));
        }
        if (validityPeriod.getEndTime() != null) {
            builder.setEndTime(map(validityPeriod.getEndTime()));
        }
        return builder;
    }

    private static SituationVersion.Builder map(uk.org.siri.siri20.SituationVersion version) {
        SituationVersion.Builder builder = SituationVersion.newBuilder();
        builder.setValue(version.getValue().intValue());
        return builder;
    }

    private static SituationSourceStructure.Builder map(uk.org.siri.siri20.SituationSourceStructure source) {
        SituationSourceStructure.Builder builder = SituationSourceStructure.newBuilder();
        if (source.getSourceType() != null) {
            builder.setSourceType(map(source.getSourceType()));
        }
        if (source.getPhone() != null && !source.getPhone().isEmpty()) {
            builder.setPhone(source.getPhone());
        }
        if (source.getAgentReference() != null && !source.getAgentReference().isEmpty()) {
            builder.setAgentReference(source.getAgentReference());
        }
        if (source.getTimeOfCommunication() != null) {
            builder.setTimeOfCommunication(map(source.getTimeOfCommunication()));
        }
        return builder;
    }


    private static EntryQualifierStructure.Builder map(SituationNumber situationNumber) {
        EntryQualifierStructure.Builder builder = EntryQualifierStructure.newBuilder();
        builder.setValue(situationNumber.getValue());
        return builder;
    }

    private static uk.org.siri.www.siri.PtConsequencesStructure.Builder map(PtConsequencesStructure consequences) {
        uk.org.siri.www.siri.PtConsequencesStructure.Builder builder = uk.org.siri.www.siri.PtConsequencesStructure.newBuilder();
        if (consequences != null && consequences.getConsequences() != null && !consequences.getConsequences().isEmpty()) {
            for (PtConsequenceStructure consequence : consequences.getConsequences()) {
                builder.addConsequence(map(consequence));
            }
        }
        return builder;
    }

    private static uk.org.siri.www.siri.PtConsequenceStructure.Builder map(PtConsequenceStructure consequence) {
        uk.org.siri.www.siri.PtConsequenceStructure.Builder builder = uk.org.siri.www.siri.PtConsequenceStructure.newBuilder();
        if (consequence.getAdvice() != null) {
            builder.setAdvice(map(consequence.getAdvice()));
        }
        if (consequence.getAffects() != null) {
            builder.setAffects(map(consequence.getAffects()));
        }
        if (consequence.getBlocking() != null) {
            builder.setBlocking(map(consequence.getBlocking()));
        }
        if (consequence.getBoarding() != null) {
            builder.setBoarding(map(consequence.getBoarding()));
        }
        if (consequence.getCasualties() != null) {
            builder.setCasualties(map(consequence.getCasualties()));
        }
        if (consequence.getConditions() != null && !consequence.getConditions().isEmpty()) {
            for (ServiceConditionEnumeration condition : consequence.getConditions()) {
                builder.addCondition(map(condition));
            }
        }
        if (consequence.getDelays() != null) {
            builder.setDelays(map(consequence.getDelays()));
        }
        if (consequence.getEasements() != null && !consequence.getEasements().isEmpty()) {
            for (EasementsStructure easement : consequence.getEasements()) {
                builder.addEasements(map(easement));
            }
        }
        if (consequence.getPeriod() != null) {
            builder.setPeriod(map(consequence.getPeriod()));
        }
        if (consequence.getSeverity() != null) {
            builder.setSeverity(map(consequence.getSeverity()));
        }
        return builder;
    }

    private static uk.org.siri.www.siri.PtAdviceStructure.Builder map(PtAdviceStructure advice) {
        uk.org.siri.www.siri.PtAdviceStructure.Builder builder = uk.org.siri.www.siri.PtAdviceStructure.newBuilder();
        if (advice.getAdviceRef() != null) {
            builder.setAdviceRef(map(advice.getAdviceRef()));
        }
        if (advice.getDetails() != null && !advice.getDetails().isEmpty()) {
            for (NaturalLanguageStringStructure detail : advice.getDetails()) {
                builder.addDetails(map(detail));
            }
        }
        return builder;
    }

    private static uk.org.siri.www.siri.AdviceRefStructure.Builder map(AdviceRefStructure adviceRef) {
        uk.org.siri.www.siri.AdviceRefStructure.Builder builder = uk.org.siri.www.siri.AdviceRefStructure.newBuilder();
        builder.setValue(adviceRef.getValue());
        return builder;
    }

    private static uk.org.siri.www.siri.BlockingStructure.Builder map(BlockingStructure blocking) {
        uk.org.siri.www.siri.BlockingStructure.Builder builder = uk.org.siri.www.siri.BlockingStructure.newBuilder();
        if (blocking.isJourneyPlanner() != null) {
            builder.setJourneyPlanner(blocking.isJourneyPlanner());
        }
        if (blocking.isRealTime() != null) {
            builder.setRealTime(blocking.isRealTime());
        }
        return builder;
    }

    private static uk.org.siri.www.siri.BoardingStructure.Builder map(BoardingStructure boarding) {
        uk.org.siri.www.siri.BoardingStructure.Builder builder = uk.org.siri.www.siri.BoardingStructure.newBuilder();
        if (boarding.getArrivalBoardingActivity() != null) {
            builder.setArrivalBoardingActivity(map(boarding.getArrivalBoardingActivity()));
        }
        if (boarding.getDepartureBoardingActivity() != null) {
            builder.setDepartureBoardingActivity(map(boarding.getDepartureBoardingActivity()));
        }
        return builder;
    }

    private static uk.org.siri.www.siri.CasualtiesStructure.Builder map(CasualtiesStructure boarding) {
        uk.org.siri.www.siri.CasualtiesStructure.Builder builder = uk.org.siri.www.siri.CasualtiesStructure.newBuilder();
        if (boarding.getNumberOfDeaths() != null) {
            builder.setNumberOfDeaths(boarding.getNumberOfDeaths().intValue());
        }
        if (boarding.getNumberOfInjured() != null) {
            builder.setNumberOfInjured(boarding.getNumberOfInjured().intValue());
        }
        return builder;
    }

    private static uk.org.siri.www.siri.DelaysStructure.Builder map(DelaysStructure delays) {
        uk.org.siri.www.siri.DelaysStructure.Builder builder = uk.org.siri.www.siri.DelaysStructure.newBuilder();
        if (delays.getDelay() != null) {
            builder.setDelay(map(delays.getDelay()));
        }
        if (delays.getDelayBand() != null) {
            builder.setDelayBand(map(delays.getDelayBand()));
        }
        if (delays.getDelayType() != null) {
            builder.setDelayType(map(delays.getDelayType()));
        }
        return builder;
    }

    private static uk.org.siri.www.siri.EasementsStructure.Builder map(EasementsStructure easement) {
        uk.org.siri.www.siri.EasementsStructure.Builder builder = uk.org.siri.www.siri.EasementsStructure.newBuilder();
        builder.setEasementRef(easement.getEasementRef());
        if (easement.getEasements() != null && !easement.getEasements().isEmpty()) {
            for (NaturalLanguageStringStructure easementLanguageStructure : easement.getEasements()) {
                builder.addEasement(map(easementLanguageStructure));
            }
        }
        if (easement.getTicketRestrictions() != null) {
            builder.setTicketRestrictions(map(easement.getTicketRestrictions()));
        }
        return builder;
    }

    private static uk.org.siri.www.siri.ReferencesStructure.Builder map(ReferencesStructure references) {
        uk.org.siri.www.siri.ReferencesStructure.Builder builder = uk.org.siri.www.siri.ReferencesStructure.newBuilder();
        if (references.getRelatedToReves() != null && !references.getRelatedToReves().isEmpty()) {
            for (RelatedSituationStructure reference : references.getRelatedToReves()) {
                builder.addRelatedToRef(map(reference));
            }
        }
        return builder;
    }

    private static uk.org.siri.www.siri.RelatedSituationStructure.Builder map(RelatedSituationStructure reference) {
        uk.org.siri.www.siri.RelatedSituationStructure.Builder builder = uk.org.siri.www.siri.RelatedSituationStructure.newBuilder();
        if (reference.getCountryRef() != null) {
            builder.setCountryRef(map(reference.getCountryRef()));
        }
        if (reference.getCreationTime() != null) {
            builder.setCreationTime(map(reference.getCreationTime()));
        }
        if (reference.getExternalReference() != null) {
            builder.setExternalReference(reference.getExternalReference());
        }
        if (reference.getParticipantRef() != null) {
            builder.setParticipantRef(map(reference.getParticipantRef()));
        }
        if (reference.getRelatedAs() != null) {
            builder.setRelatedAs(map(reference.getRelatedAs()));
        }
        if (reference.getSituationNumber() != null) {
            builder.setSituationNumber(map(reference.getSituationNumber()));
        }
        if (reference.getUpdateCountryRef() != null) {
            builder.setUpdateCountryRef(map(reference.getUpdateCountryRef()));
        }
        if (reference.getUpdateParticipantRef() != null) {
            builder.setUpdateParticipantRef(map(reference.getUpdateParticipantRef()));
        }
        if (reference.getVersion() != null) {
            builder.setVersion(map(reference.getVersion()));
        }
        return builder;
    }

    private static ExtensionsStructure.Builder map(Extensions extensions) {
        ExtensionsStructure.Builder builder = ExtensionsStructure.newBuilder();

        if (extensions.getAnies() != null && !extensions.getAnies().isEmpty()) {
            for (Element any : extensions.getAnies()) {
                builder.addAny(map(any));
            }
        }
        return builder;
    }
}

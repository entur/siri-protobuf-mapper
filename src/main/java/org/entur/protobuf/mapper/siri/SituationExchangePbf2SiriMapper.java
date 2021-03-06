package org.entur.protobuf.mapper.siri;

import com.google.protobuf.Any;
import uk.org.acbs.siri20.AccessibilityAssessmentStructure;
import uk.org.acbs.siri20.AccessibilityEnumeration;
import uk.org.acbs.siri20.AccessibilityStructure;
import uk.org.ifopt.siri20.StopPlaceComponentRefStructure;
import uk.org.ifopt.siri20.StopPlaceRef;
import uk.org.ifopt.www.acsb.AccessibilityLimitationStructure;
import uk.org.ifopt.www.ifopt.StopPlaceRefStructure;
import uk.org.siri.siri20.AdviceRefStructure;
import uk.org.siri.siri20.AffectedStopPointStructure;
import uk.org.siri.siri20.AffectsScopeStructure;
import uk.org.siri.siri20.BlockingStructure;
import uk.org.siri.siri20.BoardingStructure;
import uk.org.siri.siri20.CasualtiesStructure;
import uk.org.siri.siri20.DelaysStructure;
import uk.org.siri.siri20.EasementsStructure;
import uk.org.siri.siri20.Extensions;
import uk.org.siri.siri20.NetworkRefStructure;
import uk.org.siri.siri20.PtAdviceStructure;
import uk.org.siri.siri20.PtConsequenceStructure;
import uk.org.siri.siri20.PtConsequencesStructure;
import uk.org.siri.siri20.PtSituationElement;
import uk.org.siri.siri20.ReferencesStructure;
import uk.org.siri.siri20.RelatedSituationStructure;
import uk.org.siri.siri20.SituationExchangeDeliveryStructure;
import uk.org.siri.siri20.SituationNumber;
import uk.org.siri.siri20.SituationSourceStructure;
import uk.org.siri.www.siri.AffectedLineStructure;
import uk.org.siri.www.siri.AffectedOperatorStructure;
import uk.org.siri.www.siri.AffectedRouteStructure;
import uk.org.siri.www.siri.AffectedStopPlaceComponentStructure;
import uk.org.siri.www.siri.AffectedStopPlaceStructure;
import uk.org.siri.www.siri.AffectedVehicleJourneyStructure;
import uk.org.siri.www.siri.DatedVehicleJourneyRefStructure;
import uk.org.siri.www.siri.DefaultedTextStructure;
import uk.org.siri.www.siri.EmptyType;
import uk.org.siri.www.siri.EntryQualifierStructure;
import uk.org.siri.www.siri.ExtensionsStructure;
import uk.org.siri.www.siri.HalfOpenTimestampOutputRangeStructure;
import uk.org.siri.www.siri.InfoLinkStructure;
import uk.org.siri.www.siri.NaturalLanguageStringStructure;
import uk.org.siri.www.siri.PtSituationElementStructure;
import uk.org.siri.www.siri.ReportTypeEnumeration;
import uk.org.siri.www.siri.RoutePointTypeEnumeration;
import uk.org.siri.www.siri.SituationVersion;
import uk.org.siri.www.siri.VehicleJourneyRefStructure;

import java.io.Serializable;
import java.math.BigInteger;

public class SituationExchangePbf2SiriMapper extends CommonMapper {
    public static SituationExchangeDeliveryStructure map(uk.org.siri.www.siri.SituationExchangeDeliveryStructure situationExchangeDeliveryStructure) {
        SituationExchangeDeliveryStructure mapped = new SituationExchangeDeliveryStructure();
        if (situationExchangeDeliveryStructure.hasSituations()) {
            mapped.setSituations(map(situationExchangeDeliveryStructure.getSituations()));
        }
        if (situationExchangeDeliveryStructure.hasResponseTimestamp()) {
            mapped.setResponseTimestamp(map(situationExchangeDeliveryStructure.getResponseTimestamp()));
        }
        return mapped;
    }

    private static SituationExchangeDeliveryStructure.Situations map(uk.org.siri.www.siri.SituationExchangeDeliveryStructure.SituationsType situations) {
        SituationExchangeDeliveryStructure.Situations mapped = new SituationExchangeDeliveryStructure.Situations();
        if (situations.getPtSituationElementList() != null) {
            for (PtSituationElementStructure ptSituationElementStructure : situations.getPtSituationElementList()) {
                mapped.getPtSituationElements().add(map(ptSituationElementStructure));
            }
        }
        return mapped;
    }

    private static PtSituationElement map(PtSituationElementStructure sx) {
        PtSituationElement mapped = new PtSituationElement();
        if (sx.hasCreationTime()) {
            mapped.setCreationTime(map(sx.getCreationTime()));
        }
        if (sx.hasParticipantRef()) {
            mapped.setParticipantRef(map(sx.getParticipantRef()));
        }
        if (sx.hasSituationNumber()) {
            mapped.setSituationNumber(map(sx.getSituationNumber()));
        }
        if (sx.hasSource()) {
            mapped.setSource(map(sx.getSource()));
        }
        if (sx.getProgress() != null) {
            mapped.setProgress(map(sx.getProgress()));
        }
        if (sx.hasVersion()) {
            mapped.setVersion(map(sx.getVersion()));
        }
        if (sx.hasVersionedAtTime()) {
            mapped.setVersionedAtTime(map(sx.getVersionedAtTime()));
        }
        if (sx.getValidityPeriodList() != null) {
            for (HalfOpenTimestampOutputRangeStructure halfOpenTimestampOutputRangeStructure : sx.getValidityPeriodList()) {
                mapped.getValidityPeriods().add(map(halfOpenTimestampOutputRangeStructure));
            }
        }
        if (sx.getScopeType() != null) {
            mapped.setScopeType(map(sx.getScopeType()));
        }
        if (sx.getUndefinedReason() != null && !sx.getUndefinedReason().isEmpty()) {
            mapped.setUndefinedReason(sx.getUndefinedReason());
        }
        if (sx.getSeverity() != null) {
            mapped.setSeverity(map(sx.getSeverity()));
        }
        if (sx.getAudience() != null) {
            mapped.setAudience(map(sx.getAudience()));
        }
        if (sx.getPriority() > 0) {
            mapped.setPriority(BigInteger.valueOf(sx.getPriority()));
        }
        if (sx.getReportType() != null) {
            mapped.setReportType(map(sx.getReportType()));
        }
        mapped.setPlanned(sx.getPlanned());
        if (sx.getSummaryList() != null) {
            for (DefaultedTextStructure defaultedTextStructure : sx.getSummaryList()) {
                mapped.getSummaries().add(map(defaultedTextStructure));
            }
        }
        if (sx.getDescriptionList() != null) {
            for (DefaultedTextStructure defaultedTextStructure : sx.getDescriptionList()) {
                mapped.getDescriptions().add(map(defaultedTextStructure));
            }
        }
        if (sx.getAdviceList() != null) {
            for (DefaultedTextStructure defaultedTextStructure : sx.getAdviceList()) {
                mapped.getAdvices().add(map(defaultedTextStructure));
            }
        }
        if (sx.getDetailList() != null) {
            for (DefaultedTextStructure defaultedTextStructure : sx.getDetailList()) {
                mapped.getDetails().add(map(defaultedTextStructure));
            }
        }
        if (sx.hasInfoLinks()) {
            mapped.setInfoLinks(map(sx.getInfoLinks()));
        }
        if (sx.hasAffects()) {
            mapped.setAffects(map(sx.getAffects()));
        }
        if (sx.hasConsequences() && sx.getConsequences().getConsequenceCount() > 0) {
            mapped.setConsequences(map(sx.getConsequences()));
        }
        if (sx.hasReferences()) {
            mapped.setReferences(map(sx.getReferences()));
        }
        if (sx.hasExtensions()) {
            //TODO: Extensions are currently ignored
            //mapped.setExtensions(map(sx.getExtensions()));
        }
        return mapped;
    }

    private static AffectsScopeStructure map(uk.org.siri.www.siri.AffectsScopeStructure affects) {
        AffectsScopeStructure mapped = new AffectsScopeStructure();
        if (affects.hasNetworks()) {
            mapped.setNetworks(map(affects.getNetworks()));
        }
        if (affects.hasStopPlaces()) {
            mapped.setStopPlaces(map(affects.getStopPlaces()));
        }
        if (affects.hasStopPoints()) {
            mapped.setStopPoints(map(affects.getStopPoints()));
        }
        if (affects.hasVehicleJourneys()) {
            mapped.setVehicleJourneys(map(affects.getVehicleJourneys()));
        }
        return mapped;
    }

    private static AffectsScopeStructure.VehicleJourneys map(uk.org.siri.www.siri.AffectsScopeStructure.VehicleJourneysType vehicleJourneys) {
        AffectsScopeStructure.VehicleJourneys mapped = new AffectsScopeStructure.VehicleJourneys();
        if (vehicleJourneys.getAffectedVehicleJourneyList() != null) {
            for (AffectedVehicleJourneyStructure affectedVehicleJourneyStructure : vehicleJourneys.getAffectedVehicleJourneyList()) {
                mapped.getAffectedVehicleJourneies().add(map(affectedVehicleJourneyStructure));
            }
        }
        return mapped;
    }

    private static uk.org.siri.siri20.AffectedVehicleJourneyStructure map(AffectedVehicleJourneyStructure affectedVehicleJourneyStructure) {
        uk.org.siri.siri20.AffectedVehicleJourneyStructure mapped = new uk.org.siri.siri20.AffectedVehicleJourneyStructure();
        if (affectedVehicleJourneyStructure.getVehicleJourneyRefList() != null) {
            for (VehicleJourneyRefStructure vehicleJourneyRefStructure : affectedVehicleJourneyStructure.getVehicleJourneyRefList()) {
                mapped.getVehicleJourneyReves().add(map(vehicleJourneyRefStructure));
            }
        }
        if (affectedVehicleJourneyStructure.hasFramedVehicleJourneyRef()) {
            mapped.setFramedVehicleJourneyRef(map(affectedVehicleJourneyStructure.getFramedVehicleJourneyRef()));
        }
        if (affectedVehicleJourneyStructure.getDatedVehicleJourneyRefCount() > 0) {
            for (DatedVehicleJourneyRefStructure datedVehicleJourneyRefStructure : affectedVehicleJourneyStructure.getDatedVehicleJourneyRefList()) {
                mapped.getDatedVehicleJourneyReves().add(map(datedVehicleJourneyRefStructure));
            }
        }
        if (affectedVehicleJourneyStructure.hasOperator()) {
            mapped.setOperator(map(affectedVehicleJourneyStructure.getOperator()));
        }
        if (affectedVehicleJourneyStructure.hasLineRef()) {
            mapped.setLineRef(map(affectedVehicleJourneyStructure.getLineRef()));
        }
        if (affectedVehicleJourneyStructure.getRouteList() != null) {
            for (AffectedRouteStructure affectedRouteStructure : affectedVehicleJourneyStructure.getRouteList()) {
                mapped.getRoutes().add(map(affectedRouteStructure));
            }
        }
        if (affectedVehicleJourneyStructure.hasOriginAimedDepartureTime()) {
            mapped.setOriginAimedDepartureTime(map(affectedVehicleJourneyStructure.getOriginAimedDepartureTime()));
        }
        return mapped;
    }

    private static AffectsScopeStructure.StopPoints map(uk.org.siri.www.siri.AffectsScopeStructure.StopPointsType stopPoints) {
        AffectsScopeStructure.StopPoints mapped = new AffectsScopeStructure.StopPoints();
        if (stopPoints.getAffectedStopPointList() != null) {
            for (uk.org.siri.www.siri.AffectedStopPointStructure affectedStopPointStructure : stopPoints.getAffectedStopPointList()) {
                mapped.getAffectedStopPoints().add(map(affectedStopPointStructure));
            }
        }
        return mapped;
    }

    private static AffectedStopPointStructure map(uk.org.siri.www.siri.AffectedStopPointStructure affectedStopPointStructure) {
        AffectedStopPointStructure mapped = new AffectedStopPointStructure();
        if (affectedStopPointStructure.hasStopPointRef()) {
            mapped.setStopPointRef(map(affectedStopPointStructure.getStopPointRef()));
        }
        if (affectedStopPointStructure.getStopPointNameList() != null) {
            for (NaturalLanguageStringStructure naturalLanguageStringStructure : affectedStopPointStructure.getStopPointNameList()) {
                mapped.getStopPointNames().add(map(naturalLanguageStringStructure));
            }
        }
        if (affectedStopPointStructure.getStopConditionList() != null) {
            for (RoutePointTypeEnumeration routePointTypeEnumeration : affectedStopPointStructure.getStopConditionList()) {
                mapped.getStopConditions().add(map(routePointTypeEnumeration));
            }
        }
        if (affectedStopPointStructure.getStopPointType() != null) {
            mapped.setStopPointType(map(affectedStopPointStructure.getStopPointType()));
        }
        if (affectedStopPointStructure.hasLocation()) {
            mapped.setLocation(map(affectedStopPointStructure.getLocation()));
        }
        return mapped;
    }

    private static AffectsScopeStructure.StopPlaces map(uk.org.siri.www.siri.AffectsScopeStructure.StopPlacesType stopPlaces) {
        AffectsScopeStructure.StopPlaces mapped = new AffectsScopeStructure.StopPlaces();
        if (stopPlaces.getAffectedStopPlaceList() != null) {
            for (AffectedStopPlaceStructure affectedStopPlaceStructure : stopPlaces.getAffectedStopPlaceList()) {
                mapped.getAffectedStopPlaces().add(map(affectedStopPlaceStructure));
            }
        }
        return mapped;
    }

    private static uk.org.siri.siri20.AffectedStopPlaceStructure map(AffectedStopPlaceStructure affectedStopPlaceStructure) {
        uk.org.siri.siri20.AffectedStopPlaceStructure mapped = new uk.org.siri.siri20.AffectedStopPlaceStructure();
        if (affectedStopPlaceStructure.hasAccessibilityAssessment()) {
            mapped.setAccessibilityAssessment(map(affectedStopPlaceStructure.getAccessibilityAssessment()));
        }
        if (affectedStopPlaceStructure.hasStopPlaceRef()) {
            mapped.setStopPlaceRef(map(affectedStopPlaceStructure.getStopPlaceRef()));
        }
        if (affectedStopPlaceStructure.getPlaceNameList() != null) {
            for (NaturalLanguageStringStructure naturalLanguageStringStructure : affectedStopPlaceStructure.getPlaceNameList()) {
                mapped.getPlaceNames().add(map(naturalLanguageStringStructure));
            }
        }
        if (affectedStopPlaceStructure.hasAffectedComponents()) {
            mapped.setAffectedComponents(map(affectedStopPlaceStructure.getAffectedComponents()));
        }

        return mapped;
    }

    private static uk.org.siri.siri20.AffectedStopPlaceStructure.AffectedComponents map(AffectedStopPlaceStructure.AffectedComponentsType affectedComponents) {
        uk.org.siri.siri20.AffectedStopPlaceStructure.AffectedComponents mapped = new uk.org.siri.siri20.AffectedStopPlaceStructure.AffectedComponents();
        if (affectedComponents.getAffectedComponentList() != null) {
            for (AffectedStopPlaceComponentStructure affectedStopPlaceComponentStructure : affectedComponents.getAffectedComponentList()) {
                mapped.getAffectedComponents().add(map(affectedStopPlaceComponentStructure));
            }
        }
        return mapped;
    }

    private static uk.org.siri.siri20.AffectedStopPlaceComponentStructure map(AffectedStopPlaceComponentStructure affectedStopPlaceComponentStructure) {
        uk.org.siri.siri20.AffectedStopPlaceComponentStructure mapped = new uk.org.siri.siri20.AffectedStopPlaceComponentStructure();
        if (affectedStopPlaceComponentStructure.hasComponentRef()) {
            mapped.setComponentRef(map(affectedStopPlaceComponentStructure.getComponentRef()));
        }
        if (affectedStopPlaceComponentStructure.getComponentType() != null) {
            mapped.setComponentType(map(affectedStopPlaceComponentStructure.getComponentType()));
        }
        if (affectedStopPlaceComponentStructure.getAccessFeatureType() != null) {
            mapped.setAccessFeatureType(map(affectedStopPlaceComponentStructure.getAccessFeatureType()));
        }
        return mapped;
    }

    private static StopPlaceComponentRefStructure map(uk.org.ifopt.www.ifopt.StopPlaceComponentRefStructure componentRef) {
        StopPlaceComponentRefStructure mapped = new StopPlaceComponentRefStructure();
        mapped.setValue(componentRef.getValue());
        return mapped;
    }

    private static StopPlaceRef map(StopPlaceRefStructure stopPlaceRef) {
        StopPlaceRef mapped = new StopPlaceRef();
        mapped.setValue(stopPlaceRef.getValue());
        return mapped;
    }

    private static uk.org.siri.siri20.SituationVersion map(SituationVersion version) {
        uk.org.siri.siri20.SituationVersion mapped = new uk.org.siri.siri20.SituationVersion();
        mapped.setValue(BigInteger.valueOf(version.getValue()));
        return mapped;
    }

    private static AccessibilityAssessmentStructure map(uk.org.ifopt.www.acsb.AccessibilityAssessmentStructure accessibilityAssessment) {
        AccessibilityAssessmentStructure mapped = new AccessibilityAssessmentStructure();
        mapped.setMobilityImpairedAccess(accessibilityAssessment.getMobilityImpairedAccess());
        if (accessibilityAssessment.hasLimitations()) {
            mapped.setLimitations(map(accessibilityAssessment.getLimitations()));
        }
        return mapped;
    }

    private static AccessibilityAssessmentStructure.Limitations map(uk.org.ifopt.www.acsb.AccessibilityAssessmentStructure.LimitationsType limitations) {
        AccessibilityAssessmentStructure.Limitations mapped = new AccessibilityAssessmentStructure.Limitations();
        if (limitations.getAccessibilityLimitationList() != null) {
            for (AccessibilityLimitationStructure limitationStructure : limitations.getAccessibilityLimitationList()) {
                mapped.getAccessibilityLimitations().add(map(limitationStructure));
            }
        }
        return mapped;
    }

    private static uk.org.acbs.siri20.AccessibilityLimitationStructure map(AccessibilityLimitationStructure limitationStructure) {
        uk.org.acbs.siri20.AccessibilityLimitationStructure mapped = new uk.org.acbs.siri20.AccessibilityLimitationStructure();
        if (limitationStructure.hasWheelchairAccess()) {
            mapped.setWheelchairAccess(map(limitationStructure.getWheelchairAccess()));
        }
        if (limitationStructure.hasStepFreeAccess()) {
            mapped.setStepFreeAccess(map(limitationStructure.getStepFreeAccess()));
        }
        if (limitationStructure.hasEscalatorFreeAccess()) {
            mapped.setEscalatorFreeAccess(map(limitationStructure.getEscalatorFreeAccess()));
        }
        if (limitationStructure.hasLiftFreeAccess()) {
            mapped.setLiftFreeAccess(map(limitationStructure.getLiftFreeAccess()));
        }
        return mapped;
    }

    private static AccessibilityStructure map(uk.org.ifopt.www.acsb.AccessibilityStructure accessibilityStructure) {
        AccessibilityStructure mapped = new AccessibilityStructure();
        accessibilityStructure.getValue();
        mapped.setValue(AccessibilityEnumeration.fromValue(accessibilityStructure.getValue()));
        return mapped;
    }

    private static AffectsScopeStructure.Networks map(uk.org.siri.www.siri.AffectsScopeStructure.NetworksType networks) {
        AffectsScopeStructure.Networks mapped = new AffectsScopeStructure.Networks();
        if (networks.getAffectedNetworkList() != null) {
            for (uk.org.siri.www.siri.AffectsScopeStructure.NetworksType.AffectedNetworkType affectedNetworkType : networks.getAffectedNetworkList()) {
                mapped.getAffectedNetworks().add(map(affectedNetworkType));
            }
        }
        return mapped;
    }

    private static AffectsScopeStructure.Networks.AffectedNetwork map(uk.org.siri.www.siri.AffectsScopeStructure.NetworksType.AffectedNetworkType affectedNetworkType) {
        AffectsScopeStructure.Networks.AffectedNetwork mapped = new AffectsScopeStructure.Networks.AffectedNetwork();
        if (affectedNetworkType.getAffectedOperatorList() != null) {
            for (AffectedOperatorStructure affectedOperatorStructure : affectedNetworkType.getAffectedOperatorList()) {
                mapped.getAffectedOperators().add(map(affectedOperatorStructure));
            }
        }
        if (affectedNetworkType.hasNetworkRef()) {
            mapped.setNetworkRef(map(affectedNetworkType.getNetworkRef()));
        }
        if (affectedNetworkType.getVehicleMode() != null) {
            mapped.setVehicleMode(map(affectedNetworkType.getVehicleMode()));
        }
        if (affectedNetworkType.getAirSubmode() != null) {
            mapped.setAirSubmode(map(affectedNetworkType.getAirSubmode()));
        }
        if (affectedNetworkType.getBusSubmode() != null) {
            mapped.setBusSubmode(map(affectedNetworkType.getBusSubmode()));
        }
        if (affectedNetworkType.getCoachSubmode() != null) {
            mapped.setCoachSubmode(map(affectedNetworkType.getCoachSubmode()));
        }
        if (affectedNetworkType.getMetroSubmode() != null) {
            mapped.setMetroSubmode(map(affectedNetworkType.getMetroSubmode()));
        }
        if (affectedNetworkType.getRailSubmode() != null) {
            mapped.setRailSubmode(map(affectedNetworkType.getRailSubmode()));
        }
        if (affectedNetworkType.getTramSubmode() != null) {
            mapped.setTramSubmode(map(affectedNetworkType.getTramSubmode()));
        }
        if (affectedNetworkType.getWaterSubmode() != null) {
            mapped.setWaterSubmode(map(affectedNetworkType.getWaterSubmode()));
        }
        if (affectedNetworkType.getAffectedLineList() != null) {
            for (AffectedLineStructure affectedLineStructure : affectedNetworkType.getAffectedLineList()) {
                mapped.getAffectedLines().add(map(affectedLineStructure));
            }
        }
        if (affectedNetworkType.getAllLines() != EmptyType.EMPTY_TYPE_UNSPECIFIED) {
            mapped.setAllLines("");
        }
        return mapped;
    }

    private static uk.org.siri.siri20.AffectedLineStructure map(AffectedLineStructure affectedLineStructure) {
        uk.org.siri.siri20.AffectedLineStructure mapped = new uk.org.siri.siri20.AffectedLineStructure();
        if (affectedLineStructure.hasLineRef()) {
            mapped.setLineRef(map(affectedLineStructure.getLineRef()));
        }
        if (affectedLineStructure.hasRoutes()) {
            mapped.setRoutes(map(affectedLineStructure.getRoutes()));
        }
        if (affectedLineStructure.hasPublishedLineName()) {
            mapped.setPublishedLineName(map(affectedLineStructure.getPublishedLineName()));
        }
        return mapped;
    }

    private static uk.org.siri.siri20.AffectedLineStructure.Routes map(AffectedLineStructure.RoutesType routes) {
        uk.org.siri.siri20.AffectedLineStructure.Routes mapped = new uk.org.siri.siri20.AffectedLineStructure.Routes();
        if (routes.getAffectedRouteList() != null) {
            for (AffectedRouteStructure affectedRouteStructure : routes.getAffectedRouteList()) {
                mapped.getAffectedRoutes().add(map(affectedRouteStructure));
            }
        }
        return mapped;
    }

    private static uk.org.siri.siri20.AffectedRouteStructure map(AffectedRouteStructure affectedRouteStructure) {
        uk.org.siri.siri20.AffectedRouteStructure mapped = new uk.org.siri.siri20.AffectedRouteStructure();
        if (affectedRouteStructure.hasRouteRef()) {
            mapped.setRouteRef(map(affectedRouteStructure.getRouteRef()));
        }
        if (affectedRouteStructure.hasStopPoints()) {
            mapped.setStopPoints(map(affectedRouteStructure.getStopPoints()));
        }
        return mapped;
    }

    private static uk.org.siri.siri20.AffectedRouteStructure.StopPoints map(AffectedRouteStructure.StopPointsType stopPoints) {
        uk.org.siri.siri20.AffectedRouteStructure.StopPoints mapped = new uk.org.siri.siri20.AffectedRouteStructure.StopPoints();
        if (stopPoints.getSequenceWrapperList() != null) {
            for (AffectedRouteStructure.StopPointsType.SequenceWrapper_StopPointsType stopPointsType : stopPoints.getSequenceWrapperList()) {
                Serializable stopPoint = map(stopPointsType);
                mapped.getAffectedStopPointsAndLinkProjectionToNextStopPoints().add(stopPoint);
            }
        }

        mapped.setAffectedOnly(stopPoints.getAffectedOnly());
        return mapped;
    }

    private static Serializable map(AffectedRouteStructure.StopPointsType.SequenceWrapper_StopPointsType stopPointsType) {
        AffectedStopPointStructure mapped = new AffectedStopPointStructure();
        final uk.org.siri.www.siri.AffectedStopPointStructure affectedStopPoint = stopPointsType.getAffectedStopPoint();
        if (affectedStopPoint.hasStopPointRef()) {
            mapped.setStopPointRef(map(affectedStopPoint.getStopPointRef()));
        }
        if (affectedStopPoint.getStopPointNameList() != null) {
            for (NaturalLanguageStringStructure naturalLanguageStringStructure : affectedStopPoint.getStopPointNameList()) {
                mapped.getStopPointNames().add(map(naturalLanguageStringStructure));
            }
        }
        if (affectedStopPoint.getStopConditionList() != null) {
            for (RoutePointTypeEnumeration routePointTypeEnumeration : affectedStopPoint.getStopConditionList()) {
                mapped.getStopConditions().add(map(routePointTypeEnumeration));
            }
        }
        if (affectedStopPoint.getStopPointType() != null) {
            mapped.setStopPointType(map(affectedStopPoint.getStopPointType()));
        }
        if (affectedStopPoint.hasLocation()) {
            mapped.setLocation(map(affectedStopPoint.getLocation()));
        }
        return mapped;
    }

    private static NetworkRefStructure map(uk.org.siri.www.siri.NetworkRefStructure networkRef) {
        NetworkRefStructure mapped = new NetworkRefStructure();
        mapped.setValue(networkRef.getValue());
        return mapped;
    }

    private static uk.org.siri.siri20.AffectedOperatorStructure map(AffectedOperatorStructure affectedOperatorStructure) {
        uk.org.siri.siri20.AffectedOperatorStructure mapped = new uk.org.siri.siri20.AffectedOperatorStructure();
        if (affectedOperatorStructure.hasOperatorRef()) {
            mapped.setOperatorRef(map(affectedOperatorStructure.getOperatorRef()));
        }
        return mapped;
    }

    private static PtSituationElement.InfoLinks map(PtSituationElementStructure.InfoLinksType infoLinks) {
        PtSituationElement.InfoLinks mapped = new PtSituationElement.InfoLinks();
        if (infoLinks.getInfoLinkList() != null) {
            for (InfoLinkStructure infoLinkStructure : infoLinks.getInfoLinkList()) {
                mapped.getInfoLinks().add(map(infoLinkStructure));
            }
        }
        return mapped;
    }

    private static uk.org.siri.siri20.InfoLinkStructure map(InfoLinkStructure infoLinkStructure) {
        uk.org.siri.siri20.InfoLinkStructure mapped = new uk.org.siri.siri20.InfoLinkStructure();
        mapped.setUri(infoLinkStructure.getUri());
        if (infoLinkStructure.getLabelList() != null) {
            for (NaturalLanguageStringStructure naturalLanguageStringStructure : infoLinkStructure.getLabelList()) {
                mapped.getLabels().add(map(naturalLanguageStringStructure));
            }
        }
        return mapped;
    }

    private static String map(ReportTypeEnumeration reportType) {
        switch (reportType) {
            case REPORT_TYPE_ENUMERATION_GENERAL:
                return "general";
            case REPORT_TYPE_ENUMERATION_INCIDENT:
                return "incident";
        }
        return null;
    }

    private static uk.org.siri.siri20.HalfOpenTimestampOutputRangeStructure map(HalfOpenTimestampOutputRangeStructure halfOpenTimestampOutputRangeStructure) {
        uk.org.siri.siri20.HalfOpenTimestampOutputRangeStructure mapped = new uk.org.siri.siri20.HalfOpenTimestampOutputRangeStructure();
        if (halfOpenTimestampOutputRangeStructure.hasStartTime()) {
            mapped.setStartTime(map(halfOpenTimestampOutputRangeStructure.getStartTime()));
        }
        if (halfOpenTimestampOutputRangeStructure.hasEndTime()) {
            mapped.setEndTime(map(halfOpenTimestampOutputRangeStructure.getEndTime()));
        }
        return mapped;
    }

    private static SituationSourceStructure map(uk.org.siri.www.siri.SituationSourceStructure source) {
        SituationSourceStructure mapped = new SituationSourceStructure();
        if (source.getSourceType() != null) {
            mapped.setSourceType(map(source.getSourceType()));
        }
        if (source.getPhone() != null && !source.getPhone().isEmpty()) {
            mapped.setPhone(source.getPhone());
        }
        if (source.getAgentReference() != null && !source.getAgentReference().isEmpty()) {
            mapped.setAgentReference(source.getAgentReference());
        }
        if (source.hasTimeOfCommunication()){
            mapped.setTimeOfCommunication(map(source.getTimeOfCommunication()));
        }
        return mapped;
    }

    private static SituationNumber map(EntryQualifierStructure situationNumber) {
        SituationNumber mapped = new SituationNumber();
        mapped.setValue(situationNumber.getValue());
        return mapped;
    }

    private static PtConsequencesStructure map(uk.org.siri.www.siri.PtConsequencesStructure consequences) {
        PtConsequencesStructure mapped = new PtConsequencesStructure();
        if (consequences.getConsequenceCount() > 0) {
            for (uk.org.siri.www.siri.PtConsequenceStructure consequence : consequences.getConsequenceList()) {
                mapped.getConsequences().add(map(consequence));
            }
        }
        return mapped;
    }

    private static PtConsequenceStructure map(uk.org.siri.www.siri.PtConsequenceStructure consequence) {
        PtConsequenceStructure mapped = new PtConsequenceStructure();
        if (consequence.hasAdvice()) {
            mapped.setAdvice(map(consequence.getAdvice()));
        }
        if (consequence.hasAffects()) {
            mapped.setAffects(map(consequence.getAffects()));
        }
        if (consequence.hasBlocking()) {
            mapped.setBlocking(map(consequence.getBlocking()));
        }
        if (consequence.hasBoarding()) {
            mapped.setBoarding(map(consequence.getBoarding()));
        }
        if (consequence.hasCasualties()) {
            mapped.setCasualties(map(consequence.getCasualties()));
        }
        if (consequence.getConditionCount() > 0) {
            for (uk.org.siri.www.siri.ServiceConditionEnumeration condition : consequence.getConditionList()) {
                mapped.getConditions().add(map(condition));
            }
        }
        if (consequence.hasDelays()) {
            mapped.setDelays(map(consequence.getDelays()));
        }
        if (consequence.getEasementsCount() > 0) {
            for (uk.org.siri.www.siri.EasementsStructure easement : consequence.getEasementsList()) {
                mapped.getEasements().add(map(easement));
            }
        }
        if (consequence.hasPeriod()) {
            mapped.setPeriod(map(consequence.getPeriod()));
        }
        if (consequence.getSeverity() != null) {
            mapped.setSeverity(map(consequence.getSeverity()));
        }
        return mapped;
    }

    private static PtAdviceStructure map(uk.org.siri.www.siri.PtAdviceStructure advice) {
        PtAdviceStructure mapped = new PtAdviceStructure();
        if (advice.getAdviceRef() != null) {
            mapped.setAdviceRef(map(advice.getAdviceRef()));
        }
        if (advice.getDetailsCount() > 0) {
            for (uk.org.siri.www.siri.NaturalLanguageStringStructure detail : advice.getDetailsList()) {
                mapped.getDetails().add(map(detail));
            }
        }
        return mapped;
    }

    private static AdviceRefStructure map(uk.org.siri.www.siri.AdviceRefStructure adviceRef) {
        AdviceRefStructure mapped = new AdviceRefStructure();
        mapped.setValue(adviceRef.getValue());
        return mapped;
    }

    private static BlockingStructure map(uk.org.siri.www.siri.BlockingStructure blocking) {
        BlockingStructure mapped = new BlockingStructure();
        mapped.setJourneyPlanner(blocking.getJourneyPlanner());
        mapped.setRealTime(blocking.getRealTime());
        return mapped;
    }

    private static BoardingStructure map(uk.org.siri.www.siri.BoardingStructure boarding) {
        BoardingStructure mapped = new BoardingStructure();
        if (boarding.getArrivalBoardingActivity() != null) {
            mapped.setArrivalBoardingActivity(map(boarding.getArrivalBoardingActivity()));
        }
        if (boarding.getDepartureBoardingActivity() != null) {
            mapped.setDepartureBoardingActivity(map(boarding.getDepartureBoardingActivity()));
        }
        return mapped;
    }

    private static CasualtiesStructure map(uk.org.siri.www.siri.CasualtiesStructure boarding) {
        CasualtiesStructure mapped = new CasualtiesStructure();
        mapped.setNumberOfDeaths(BigInteger.valueOf(boarding.getNumberOfDeaths()));
        mapped.setNumberOfInjured(BigInteger.valueOf(boarding.getNumberOfInjured()));
        return mapped;
    }

    private static DelaysStructure map(uk.org.siri.www.siri.DelaysStructure delays) {
        DelaysStructure mapped = new DelaysStructure();
        if (delays.hasDelay()) {
            mapped.setDelay(map(delays.getDelay()));
        }
        if (delays.getDelayBand() != null) {
            mapped.setDelayBand(map(delays.getDelayBand()));
        }
        if (delays.getDelayType() != null) {
            mapped.setDelayType(map(delays.getDelayType()));
        }
        return mapped;
    }

    private static EasementsStructure map(uk.org.siri.www.siri.EasementsStructure easement) {
        EasementsStructure mapped = new EasementsStructure();
        mapped.setEasementRef(easement.getEasementRef());
        if (easement.getEasementCount() > 0) {
            for (uk.org.siri.www.siri.NaturalLanguageStringStructure easementLanguageStructure : easement.getEasementList()) {
                mapped.getEasements().add(map(easementLanguageStructure));
            }
        }
        if (easement.getTicketRestrictions() != null) {
            mapped.setTicketRestrictions(map(easement.getTicketRestrictions()));
        }
        return mapped;
    }

    private static ReferencesStructure map(uk.org.siri.www.siri.ReferencesStructure references) {
        ReferencesStructure mapped = new ReferencesStructure();
        if (references.getRelatedToRefCount() > 0) {
            for (uk.org.siri.www.siri.RelatedSituationStructure reference : references.getRelatedToRefList()) {
                mapped.getRelatedToReves().add(map(reference));
            }
        }
        return mapped;
    }

    private static RelatedSituationStructure map(uk.org.siri.www.siri.RelatedSituationStructure reference) {
        RelatedSituationStructure mapped = new RelatedSituationStructure();
        if (reference.hasCountryRef()) {
            mapped.setCountryRef(map(reference.getCountryRef()));
        }
        if (reference.hasCreationTime()) {
            mapped.setCreationTime(map(reference.getCreationTime()));
        }
        if (reference.getExternalReference() != null && !reference.getExternalReference().isEmpty()) {
            mapped.setExternalReference(reference.getExternalReference());
        }
        if (reference.hasParticipantRef()) {
            mapped.setParticipantRef(map(reference.getParticipantRef()));
        }
        if (reference.getRelatedAs() != null) {
            mapped.setRelatedAs(map(reference.getRelatedAs()));
        }
        if (reference.hasSituationNumber()) {
            mapped.setSituationNumber(map(reference.getSituationNumber()));
        }
        if (reference.hasUpdateCountryRef()) {
            mapped.setUpdateCountryRef(map(reference.getUpdateCountryRef()));
        }
        if (reference.hasUpdateParticipantRef()) {
            mapped.setUpdateParticipantRef(map(reference.getUpdateParticipantRef()));
        }
        if (reference.hasVersion()) {
            mapped.setVersion(map(reference.getVersion()));
        }
        return mapped;
    }

    private static Extensions map(ExtensionsStructure extensions) {
        Extensions mapped = new Extensions();
        if (extensions.getAnyCount() > 0) {
            for (Any any : extensions.getAnyList()) {
                mapped.getAnies().add(map(any));
            }
        }
        return mapped;
    }
}

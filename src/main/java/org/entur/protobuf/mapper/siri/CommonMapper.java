package org.entur.protobuf.mapper.siri;

import com.google.protobuf.Timestamp;
import org.w3.www.xml._1998.namespace.LangType;
import uk.org.siri.siri20.DataFrameRefStructure;
import uk.org.siri.siri20.DatedVehicleJourneyRef;
import uk.org.siri.siri20.DestinationRef;
import uk.org.siri.siri20.GroupOfLinesRefStructure;
import uk.org.siri.siri20.JourneyPatternRef;
import uk.org.siri.siri20.LineRef;
import uk.org.siri.siri20.RequestorRef;
import uk.org.siri.siri20.RouteRefStructure;
import uk.org.siri.siri20.ServiceFeatureRef;
import uk.org.siri.siri20.SimpleContactStructure;
import uk.org.siri.siri20.SituationRef;
import uk.org.siri.siri20.SituationSimpleRef;
import uk.org.siri.siri20.StopPointRef;
import uk.org.siri.siri20.VehicleJourneyRef;
import uk.org.siri.siri20.VehicleModesEnumeration;
import uk.org.siri.siri20.VehicleRef;
import uk.org.siri.www.siri.ArrivalBoardingActivityEnumeration;
import uk.org.siri.www.siri.BlockRefStructure;
import uk.org.siri.www.siri.CallStatusEnumeration;
import uk.org.siri.www.siri.DatedVehicleJourneyRefStructure;
import uk.org.siri.www.siri.DepartureBoardingActivityEnumeration;
import uk.org.siri.www.siri.DestinationRefStructure;
import uk.org.siri.www.siri.DirectionRefStructure;
import uk.org.siri.www.siri.FramedVehicleJourneyRefStructure;
import uk.org.siri.www.siri.JourneyPatternRefStructure;
import uk.org.siri.www.siri.JourneyPlaceRefStructure;
import uk.org.siri.www.siri.LineRefStructure;
import uk.org.siri.www.siri.NaturalLanguagePlaceNameStructure;
import uk.org.siri.www.siri.NaturalLanguageStringStructure;
import uk.org.siri.www.siri.OccupancyEnumeration;
import uk.org.siri.www.siri.OperatorRefStructure;
import uk.org.siri.www.siri.ParticipantRefStructure;
import uk.org.siri.www.siri.ServiceFeatureRefStructure;
import uk.org.siri.www.siri.SituationRefStructure;
import uk.org.siri.www.siri.SituationSimpleRefStructure;
import uk.org.siri.www.siri.StopPointRefStructure;
import uk.org.siri.www.siri.VehicleJourneyRefStructure;
import uk.org.siri.www.siri.VehicleRefStructure;
import uk.org.siri.www.siri.VehicleStatusEnumeration;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CommonMapper {

    private static DatatypeFactory datatypeFactory;

    static {
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException("Unable to initialize DatatypeFactory", e);
        }
    }

    protected static com.google.protobuf.Duration map(javax.xml.datatype.Duration value)  {

        final int seconds = value.getSeconds();
        final int minutes = value.getMinutes();
        final int hours = value.getHours();
        final int days = value.getDays();
        final int sign = value.getSign(); // Positive or negative duration

        final int totalSeconds = (seconds + minutes*60 + hours*60*60 + days*60*60*24) * sign;

        return com.google.protobuf.Duration.newBuilder().setSeconds(totalSeconds).build();
    }

    protected static javax.xml.datatype.Duration map(com.google.protobuf.Duration value) {

        long seconds = value.getSeconds();

        return datatypeFactory.newDuration((seconds < 0 ? "-":"")+"PT"+ Math.abs(seconds) +"S");
    }

    protected static Timestamp map(ZonedDateTime value) {
        final Timestamp.Builder builder = Timestamp.newBuilder();
        builder.setSeconds(value.toEpochSecond());
        builder.setNanos(value.getNano());
        return builder.build();
    }

    protected static java.time.ZonedDateTime map(com.google.protobuf.Timestamp value) {
        ZonedDateTime time = ZonedDateTime.ofInstant(Instant.ofEpochSecond(value.getSeconds()), ZoneId.systemDefault());
        time = time.plusNanos(value.getNanos());
        return time;
    }


    protected static RequestorRef map(ParticipantRefStructure producerRef) {
        final RequestorRef mapped = new RequestorRef();
        mapped.setValue(producerRef.getValue());
        return mapped;
    }

    protected static ParticipantRefStructure map(RequestorRef producerRef) {
        ParticipantRefStructure.Builder builder = ParticipantRefStructure.newBuilder();
        builder.setValue(producerRef.getValue());
        return builder.build();
    }

    protected static LineRefStructure.Builder map(LineRef lineRef) {
        return LineRefStructure.newBuilder()
                .setValue(lineRef.getValue());
    }

    protected static LineRef map(LineRefStructure lineRef) {
        LineRef mapped = new LineRef();
        mapped.setValue(lineRef.getValue());
        return mapped;
    }

    protected static uk.org.siri.siri20.NaturalLanguageStringStructure map(NaturalLanguageStringStructure naturalLanguageStringStructure) {
        uk.org.siri.siri20.NaturalLanguageStringStructure mapped = new uk.org.siri.siri20.NaturalLanguageStringStructure();
        mapped.setLang(map(naturalLanguageStringStructure.getLang()));
        mapped.setValue(naturalLanguageStringStructure.getValue());
        return mapped;
    }
    protected static uk.org.siri.siri20.NaturalLanguagePlaceNameStructure map(NaturalLanguagePlaceNameStructure naturalLanguagePlaceNameStructure) {
        uk.org.siri.siri20.NaturalLanguagePlaceNameStructure mapped = new uk.org.siri.siri20.NaturalLanguagePlaceNameStructure();
        if (naturalLanguagePlaceNameStructure != null) {
            mapped.setValue(naturalLanguagePlaceNameStructure.getValue());
            if (naturalLanguagePlaceNameStructure.getLang() != null ) {
                mapped.setLang(map(naturalLanguagePlaceNameStructure.getLang()));
            }
        }
        return mapped;
    }

    private static String map(LangType lang) {
        if (lang != null && lang != LangType.LANG_TYPE_UNSPECIFIED) {
            return lang.name();
        }
        return null;
    }


    protected static NaturalLanguageStringStructure.Builder map(uk.org.siri.siri20.NaturalLanguageStringStructure naturalLanguageStringStructure) {
        final NaturalLanguageStringStructure.Builder builder = NaturalLanguageStringStructure.newBuilder();
        if (naturalLanguageStringStructure != null) {
            builder.setValue(naturalLanguageStringStructure.getValue());
            if (naturalLanguageStringStructure.getLang() != null ) {
                builder.setLang(map(naturalLanguageStringStructure.getLang()));
            }
        }
        return builder;
    }

    protected static NaturalLanguagePlaceNameStructure.Builder map(uk.org.siri.siri20.NaturalLanguagePlaceNameStructure originName) {
        final NaturalLanguagePlaceNameStructure.Builder builder = NaturalLanguagePlaceNameStructure.newBuilder();
        if (originName != null) {
            builder.setValue(originName.getValue());
            if (originName.getLang() != null ) {
                builder.setLang(map(originName.getLang()));
            }
        }
        return builder;
    }

    private static LangType map(String lang) {
        return LangType.valueOf(lang);
    }

    protected static StopPointRefStructure.Builder map(StopPointRef stopPointRef) {
        return StopPointRefStructure.newBuilder().setValue(stopPointRef.getValue());
    }

    protected static StopPointRef map(StopPointRefStructure stopPointRef) {
        StopPointRef mapped = new StopPointRef();
        mapped.setValue(stopPointRef.getValue());
        return mapped;
    }


    protected static OperatorRefStructure.Builder map(uk.org.siri.siri20.OperatorRefStructure operatorRef) {
        return OperatorRefStructure.newBuilder().setValue(operatorRef.getValue());
    }


    protected static VehicleStatusEnumeration map(uk.org.siri.siri20.VehicleStatusEnumeration vehicleStatus) {
        switch (vehicleStatus) {
            case ASSIGNED:
                return VehicleStatusEnumeration.VEHICLE_STATUS_ENUMERATION_ASSIGNED;
            case AT_ORIGIN:
                return VehicleStatusEnumeration.VEHICLE_STATUS_ENUMERATION_AT_ORIGIN;
            case CANCELLED:
                return VehicleStatusEnumeration.VEHICLE_STATUS_ENUMERATION_CANCELLED;
            case COMPLETED:
                return VehicleStatusEnumeration.VEHICLE_STATUS_ENUMERATION_COMPLETED;
            case IN_PROGRESS:
                return VehicleStatusEnumeration.VEHICLE_STATUS_ENUMERATION_IN_PROGRESS;
            case OFF_ROUTE:
                return VehicleStatusEnumeration.VEHICLE_STATUS_ENUMERATION_OFF_ROUTE;
            default:
                return null;
        }
    }
    protected static uk.org.siri.siri20.VehicleStatusEnumeration map(VehicleStatusEnumeration vehicleStatus) {
        switch (vehicleStatus) {
            case VEHICLE_STATUS_ENUMERATION_ASSIGNED:
                return uk.org.siri.siri20.VehicleStatusEnumeration.ASSIGNED;
            case VEHICLE_STATUS_ENUMERATION_AT_ORIGIN:
                return uk.org.siri.siri20.VehicleStatusEnumeration.AT_ORIGIN;
            case VEHICLE_STATUS_ENUMERATION_CANCELLED:
                return uk.org.siri.siri20.VehicleStatusEnumeration.CANCELLED;
            case VEHICLE_STATUS_ENUMERATION_COMPLETED:
                return uk.org.siri.siri20.VehicleStatusEnumeration.COMPLETED;
            case VEHICLE_STATUS_ENUMERATION_IN_PROGRESS:
                return uk.org.siri.siri20.VehicleStatusEnumeration.IN_PROGRESS;
            case VEHICLE_STATUS_ENUMERATION_OFF_ROUTE:
                return uk.org.siri.siri20.VehicleStatusEnumeration.OFF_ROUTE;
            default:
                return null;
        }
    }

    protected static uk.org.siri.www.siri.VehicleModesEnumeration map(VehicleModesEnumeration vehicleMode) {
        switch (vehicleMode) {
            case AIR:
                return uk.org.siri.www.siri.VehicleModesEnumeration.VEHICLE_MODES_ENUMERATION_AIR;
            case BUS:
                return uk.org.siri.www.siri.VehicleModesEnumeration.VEHICLE_MODES_ENUMERATION_BUS;
            case RAIL:
                return uk.org.siri.www.siri.VehicleModesEnumeration.VEHICLE_MODES_ENUMERATION_RAIL;
            case TRAM:
                return uk.org.siri.www.siri.VehicleModesEnumeration.VEHICLE_MODES_ENUMERATION_TRAM;
            case COACH:
                return uk.org.siri.www.siri.VehicleModesEnumeration.VEHICLE_MODES_ENUMERATION_COACH;
            case FERRY:
                return uk.org.siri.www.siri.VehicleModesEnumeration.VEHICLE_MODES_ENUMERATION_FERRY;
            case METRO:
                return uk.org.siri.www.siri.VehicleModesEnumeration.VEHICLE_MODES_ENUMERATION_METRO;
            case UNDERGROUND:
                return uk.org.siri.www.siri.VehicleModesEnumeration.VEHICLE_MODES_ENUMERATION_UNDERGROUND;
            default:
                return uk.org.siri.www.siri.VehicleModesEnumeration.UNRECOGNIZED;
        }
    }

    protected static CallStatusEnumeration map(uk.org.siri.siri20.CallStatusEnumeration status) {
        switch (status) {
            case EARLY:
                return CallStatusEnumeration.CALL_STATUS_ENUMERATION_EARLY;
            case MISSED:
                return CallStatusEnumeration.CALL_STATUS_ENUMERATION_MISSED;
            case ARRIVED:
                return CallStatusEnumeration.CALL_STATUS_ENUMERATION_ARRIVED;
            case DELAYED:
                return CallStatusEnumeration.CALL_STATUS_ENUMERATION_DELAYED;
            case ON_TIME:
                return CallStatusEnumeration.CALL_STATUS_ENUMERATION_ON_TIME;
            case DEPARTED:
                return CallStatusEnumeration.CALL_STATUS_ENUMERATION_DEPARTED;
            case CANCELLED:
                return CallStatusEnumeration.CALL_STATUS_ENUMERATION_CANCELLED;
            case NO_REPORT:
                return CallStatusEnumeration.CALL_STATUS_ENUMERATION_NO_REPORT;
            default:
                return null;
        }
    }

    protected static DepartureBoardingActivityEnumeration map(uk.org.siri.siri20.DepartureBoardingActivityEnumeration departureBoardingActivity) {
        switch (departureBoardingActivity) {
            case PASS_THRU:
                return DepartureBoardingActivityEnumeration.DEPARTURE_BOARDING_ACTIVITY_ENUMERATION_PASS_THRU;
            case BOARDING:
                return DepartureBoardingActivityEnumeration.DEPARTURE_BOARDING_ACTIVITY_ENUMERATION_BOARDING;
            case NO_BOARDING:
                return DepartureBoardingActivityEnumeration.DEPARTURE_BOARDING_ACTIVITY_ENUMERATION_NO_BOARDING;
            default:
                return DepartureBoardingActivityEnumeration.DEPARTURE_BOARDING_ACTIVITY_ENUMERATION_UNSPECIFIED;
        }
    }

    protected static ArrivalBoardingActivityEnumeration map(uk.org.siri.siri20.ArrivalBoardingActivityEnumeration arrivalBoardingActivity) {
        switch (arrivalBoardingActivity) {
            case PASS_THRU:
                return ArrivalBoardingActivityEnumeration.ARRIVAL_BOARDING_ACTIVITY_ENUMERATION_PASS_THRU;
            case ALIGHTING:
                return ArrivalBoardingActivityEnumeration.ARRIVAL_BOARDING_ACTIVITY_ENUMERATION_ALIGHTING;
            case NO_ALIGHTING:
                return ArrivalBoardingActivityEnumeration.ARRIVAL_BOARDING_ACTIVITY_ENUMERATION_NO_ALIGHTING;
            default:
                return ArrivalBoardingActivityEnumeration.ARRIVAL_BOARDING_ACTIVITY_ENUMERATION_UNSPECIFIED;
        }
    }

    protected static OccupancyEnumeration map(uk.org.siri.siri20.OccupancyEnumeration occupancy) {
        return OccupancyEnumeration.valueOf(occupancy.value());
    }

    protected static VehicleModesEnumeration map(uk.org.siri.www.siri.VehicleModesEnumeration vehicleMode) {
        switch (vehicleMode) {
            case VEHICLE_MODES_ENUMERATION_AIR:
                return VehicleModesEnumeration.AIR;
            case VEHICLE_MODES_ENUMERATION_BUS:
                return VehicleModesEnumeration.BUS;
            case VEHICLE_MODES_ENUMERATION_RAIL:
                return VehicleModesEnumeration.RAIL;
            case VEHICLE_MODES_ENUMERATION_TRAM:
                return VehicleModesEnumeration.TRAM;
            case VEHICLE_MODES_ENUMERATION_COACH:
                return VehicleModesEnumeration.COACH;
            case VEHICLE_MODES_ENUMERATION_FERRY:
                return VehicleModesEnumeration.FERRY;
            case VEHICLE_MODES_ENUMERATION_METRO:
                return VehicleModesEnumeration.METRO;
            case VEHICLE_MODES_ENUMERATION_UNDERGROUND:
                return VehicleModesEnumeration.UNDERGROUND;
            default:
                return null;
        }
    }

    protected static uk.org.siri.siri20.CallStatusEnumeration map(CallStatusEnumeration status) {
        switch (status) {
            case CALL_STATUS_ENUMERATION_EARLY:
                return uk.org.siri.siri20.CallStatusEnumeration.EARLY;
            case CALL_STATUS_ENUMERATION_MISSED:
                return uk.org.siri.siri20.CallStatusEnumeration.MISSED;
            case CALL_STATUS_ENUMERATION_ARRIVED:
                return uk.org.siri.siri20.CallStatusEnumeration.ARRIVED;
            case CALL_STATUS_ENUMERATION_DELAYED:
                return uk.org.siri.siri20.CallStatusEnumeration.DELAYED;
            case CALL_STATUS_ENUMERATION_CANCELLED:
                return uk.org.siri.siri20.CallStatusEnumeration.CANCELLED;
            case CALL_STATUS_ENUMERATION_ON_TIME:
                return uk.org.siri.siri20.CallStatusEnumeration.ON_TIME;
            case CALL_STATUS_ENUMERATION_DEPARTED:
                return uk.org.siri.siri20.CallStatusEnumeration.DEPARTED;
            case CALL_STATUS_ENUMERATION_NO_REPORT:
                return uk.org.siri.siri20.CallStatusEnumeration.NO_REPORT;
            case CALL_STATUS_ENUMERATION_NOT_EXPECTED:
                return uk.org.siri.siri20.CallStatusEnumeration.NOT_EXPECTED;
            default:
                return null;
        }
    }

    protected static uk.org.siri.siri20.DepartureBoardingActivityEnumeration map(DepartureBoardingActivityEnumeration boardingActivity) {
        switch (boardingActivity) {
            case DEPARTURE_BOARDING_ACTIVITY_ENUMERATION_BOARDING:
                return uk.org.siri.siri20.DepartureBoardingActivityEnumeration.BOARDING;
            case DEPARTURE_BOARDING_ACTIVITY_ENUMERATION_NO_BOARDING:
                return uk.org.siri.siri20.DepartureBoardingActivityEnumeration.NO_BOARDING;
            case DEPARTURE_BOARDING_ACTIVITY_ENUMERATION_PASS_THRU:
                return uk.org.siri.siri20.DepartureBoardingActivityEnumeration.PASS_THRU;
            default:
                return null;
        }
    }

    protected static uk.org.siri.siri20.ArrivalBoardingActivityEnumeration map(ArrivalBoardingActivityEnumeration boardingActivity) {
        switch (boardingActivity) {
            case ARRIVAL_BOARDING_ACTIVITY_ENUMERATION_ALIGHTING:
                return uk.org.siri.siri20.ArrivalBoardingActivityEnumeration.ALIGHTING;
            case ARRIVAL_BOARDING_ACTIVITY_ENUMERATION_NO_ALIGHTING:
                return uk.org.siri.siri20.ArrivalBoardingActivityEnumeration.NO_ALIGHTING;
            case ARRIVAL_BOARDING_ACTIVITY_ENUMERATION_PASS_THRU:
                return uk.org.siri.siri20.ArrivalBoardingActivityEnumeration.PASS_THRU;
            default:
                return null;
        }
    }

    protected static uk.org.siri.siri20.OccupancyEnumeration map(OccupancyEnumeration occupancy) {
        switch (occupancy) {
            case OCCUPANCY_ENUMERATION_FULL:
                return uk.org.siri.siri20.OccupancyEnumeration.FULL;
            case OCCUPANCY_ENUMERATION_SEATS_AVAILABLE:
                return uk.org.siri.siri20.OccupancyEnumeration.SEATS_AVAILABLE;
            case OCCUPANCY_ENUMERATION_STANDING_AVAILABLE:
                return uk.org.siri.siri20.OccupancyEnumeration.STANDING_AVAILABLE;
            default:
                return null;
        }
    }

    protected static DirectionRefStructure.Builder map(uk.org.siri.siri20.DirectionRefStructure directionRef) {
        DirectionRefStructure.Builder builder = DirectionRefStructure.newBuilder();
        builder.setValue(directionRef.getValue());
        return builder;
    }

    protected static DestinationRefStructure.Builder map(DestinationRef destinationRef) {
        DestinationRefStructure.Builder builder = DestinationRefStructure.newBuilder();
        builder.setValue(destinationRef.getValue());
        return builder;
    }

    protected static JourneyPlaceRefStructure.Builder map(uk.org.siri.siri20.JourneyPlaceRefStructure originRef) {
        JourneyPlaceRefStructure.Builder builder = JourneyPlaceRefStructure.newBuilder();
        builder.setValue(originRef.getValue());
        return builder;
    }

    protected static VehicleRefStructure.Builder map(VehicleRef vehicleRef) {
        return VehicleRefStructure.newBuilder().setValue(vehicleRef.getValue());
    }

    protected static BlockRefStructure.Builder map(uk.org.siri.siri20.BlockRefStructure blockRef) {
        return BlockRefStructure.newBuilder().setValue(blockRef.getValue());
    }

    protected static FramedVehicleJourneyRefStructure.Builder map(uk.org.siri.siri20.FramedVehicleJourneyRefStructure framedVehicleJourneyRef) {
        return FramedVehicleJourneyRefStructure.newBuilder()
                .setDataFrameRef(map(framedVehicleJourneyRef.getDataFrameRef()))
                .setDatedVehicleJourneyRef(framedVehicleJourneyRef.getDatedVehicleJourneyRef());
    }

    protected static uk.org.siri.siri20.FramedVehicleJourneyRefStructure map(uk.org.siri.www.siri.FramedVehicleJourneyRefStructure framedVehicleJourneyRef) {
        uk.org.siri.siri20.FramedVehicleJourneyRefStructure mapped = new uk.org.siri.siri20.FramedVehicleJourneyRefStructure();
        if (framedVehicleJourneyRef.hasDataFrameRef()) {
            mapped.setDataFrameRef(map(framedVehicleJourneyRef.getDataFrameRef()));
        }

        mapped.setDatedVehicleJourneyRef(framedVehicleJourneyRef.getDatedVehicleJourneyRef());

        return mapped;
    }

    private static DataFrameRefStructure map(uk.org.siri.www.siri.DataFrameRefStructure dataFrameRef) {
        DataFrameRefStructure mapped = new DataFrameRefStructure();
        mapped.setValue(dataFrameRef.getValue());
        return mapped;
    }

    private static uk.org.siri.www.siri.DataFrameRefStructure.Builder map(DataFrameRefStructure dataFrameRef) {
        return uk.org.siri.www.siri.DataFrameRefStructure.newBuilder()
                .setValue(dataFrameRef.getValue());
    }


    protected static VehicleRef map(VehicleRefStructure vehicleRef) {
        final VehicleRef mapped = new VehicleRef();
        mapped.setValue(vehicleRef.getValue());
        return mapped;
    }

    protected static uk.org.siri.siri20.BlockRefStructure map(uk.org.siri.www.siri.BlockRefStructure blockRef) {
        final uk.org.siri.siri20.BlockRefStructure mapped = new uk.org.siri.siri20.BlockRefStructure();
        mapped.setValue(blockRef.getValue());
        return mapped;
    }

    protected static uk.org.siri.siri20.OperatorRefStructure map(uk.org.siri.www.siri.OperatorRefStructure operatorRef) {
        final uk.org.siri.siri20.OperatorRefStructure mapped = new uk.org.siri.siri20.OperatorRefStructure();
        mapped.setValue(operatorRef.getValue());
        return mapped;
    }

    protected static uk.org.siri.siri20.DirectionRefStructure map(uk.org.siri.www.siri.DirectionRefStructure directionRef) {
        final uk.org.siri.siri20.DirectionRefStructure mapped = new uk.org.siri.siri20.DirectionRefStructure();
        mapped.setValue(directionRef.getValue());
        return mapped;
    }


    protected static VehicleJourneyRef map(VehicleJourneyRefStructure vehicleJourneyRef) {
        VehicleJourneyRef mapped = new VehicleJourneyRef();
        mapped.setValue(vehicleJourneyRef.getValue());
        return mapped;
    }

    protected static SituationRef map(SituationRefStructure situationRefStructure) {
        SituationRef mapped = new SituationRef();
        mapped.setSituationSimpleRef(map(situationRefStructure.getSituationSimpleRef()));
        return mapped;
    }

    protected static SituationSimpleRef map(SituationSimpleRefStructure situationSimpleRef) {
        SituationSimpleRef mapped = new SituationSimpleRef();
        mapped.setValue(situationSimpleRef.getValue());
        return mapped;
    }

    protected static SimpleContactStructure map(uk.org.siri.www.siri.SimpleContactStructure publicContact) {
        SimpleContactStructure mapped = new SimpleContactStructure();
        mapped.setPhoneNumber(publicContact.getPhoneNumber());
        mapped.setUrl(publicContact.getUrl());
        return mapped;
    }

    protected static GroupOfLinesRefStructure map(uk.org.siri.www.siri.GroupOfLinesRefStructure groupOfLinesRef) {
        GroupOfLinesRefStructure mapped = new GroupOfLinesRefStructure();
        mapped.setValue(groupOfLinesRef.getValue());
        return mapped;
    }

    protected static RouteRefStructure map(uk.org.siri.www.siri.RouteRefStructure routeRef) {
        RouteRefStructure mapped = new RouteRefStructure();
        mapped.setValue(routeRef.getValue());
        return mapped;
    }

    protected static JourneyPatternRef map(JourneyPatternRefStructure journeyPatternRef) {
        JourneyPatternRef mapped = new JourneyPatternRef();
        mapped.setValue(journeyPatternRef.getValue());
        return mapped;
    }

    protected static DestinationRef map(DestinationRefStructure destinationRef) {
        final DestinationRef mapped = new DestinationRef();
        mapped.setValue(destinationRef.getValue());
        return mapped;
    }

    protected static uk.org.siri.siri20.JourneyPlaceRefStructure map(uk.org.siri.www.siri.JourneyPlaceRefStructure originRef) {
        final uk.org.siri.siri20.JourneyPlaceRefStructure mapped = new uk.org.siri.siri20.JourneyPlaceRefStructure();
        mapped.setValue(originRef.getValue());
        return mapped;
    }

    protected static ServiceFeatureRef map(ServiceFeatureRefStructure serviceFeatureRefStructure) {
        final ServiceFeatureRef mapped = new ServiceFeatureRef();
        mapped.setValue(serviceFeatureRefStructure.getValue());
        return mapped;
    }

    protected static DatedVehicleJourneyRef map(DatedVehicleJourneyRefStructure datedVehicleJourneyRef) {
        final DatedVehicleJourneyRef mapped = new DatedVehicleJourneyRef();
        mapped.setValue(datedVehicleJourneyRef.getValue());
        return mapped;
    }

}

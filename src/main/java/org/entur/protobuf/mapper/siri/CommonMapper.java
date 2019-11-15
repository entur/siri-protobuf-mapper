package org.entur.protobuf.mapper.siri;

import com.google.protobuf.Timestamp;
import org.w3.www.xml._1998.namespace.LangType;
import uk.org.siri.siri20.LineRef;
import uk.org.siri.siri20.StopPointRef;
import uk.org.siri.siri20.VehicleModesEnumeration;
import uk.org.siri.www.siri.ArrivalBoardingActivityEnumeration;
import uk.org.siri.www.siri.CallStatusEnumeration;
import uk.org.siri.www.siri.DepartureBoardingActivityEnumeration;
import uk.org.siri.www.siri.LineRefStructure;
import uk.org.siri.www.siri.NaturalLanguagePlaceNameStructure;
import uk.org.siri.www.siri.NaturalLanguageStringStructure;
import uk.org.siri.www.siri.OccupancyEnumeration;
import uk.org.siri.www.siri.OperatorRefStructure;
import uk.org.siri.www.siri.StopPointRefStructure;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommonMapper {
    protected static com.google.protobuf.Duration map(javax.xml.datatype.Duration value)  {
        return com.google.protobuf.Duration.newBuilder().setSeconds(value.getTimeInMillis(new Date())).build();
    }
    protected static javax.xml.datatype.Duration map(com.google.protobuf.Duration value) throws DatatypeConfigurationException {
        return DatatypeFactory.newInstance().newDuration("PT"+value.getSeconds()+"S");
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

    protected static LineRefStructure.Builder map(LineRef lineRef) {
        return LineRefStructure.newBuilder()
                .setValue(lineRef.getValue());
    }

    protected static LineRef map(LineRefStructure lineRef) {
        LineRef mapped = new LineRef();
        mapped.setValue(lineRef.getValue());
        return mapped;
    }

    protected static Iterable<? extends NaturalLanguageStringStructure> map(List<uk.org.siri.siri20.NaturalLanguageStringStructure> stopPointNames) {
        List<NaturalLanguageStringStructure.Builder> result = new ArrayList<>();
        for (uk.org.siri.siri20.NaturalLanguageStringStructure stopPointName : stopPointNames) {
            final NaturalLanguageStringStructure.Builder builder = map(stopPointName);
            result.add(builder);
        }
        return null;
    }

    protected static NaturalLanguageStringStructure.Builder map(uk.org.siri.siri20.NaturalLanguageStringStructure stopPointName) {
        final NaturalLanguageStringStructure.Builder builder = NaturalLanguageStringStructure.newBuilder();
        if (stopPointName != null) {
            builder.setValue(stopPointName.getValue());
            if (stopPointName.getLang() != null ) {
                builder.setLang(map(stopPointName.getLang()));
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

    protected static OperatorRefStructure.Builder map(uk.org.siri.siri20.OperatorRefStructure operatorRef) {
        return OperatorRefStructure.newBuilder().setValue(operatorRef.getValue());
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
}

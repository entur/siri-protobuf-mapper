package org.entur.protobuf.mapper.siri;

import uk.org.ifopt.www.ifopt.AccessibilityFeatureEnumeration;
import uk.org.ifopt.www.ifopt.StopPlaceComponentTypeEnumeration;
import uk.org.siri.siri20.RoutePointTypeEnumeration;
import uk.org.siri.siri20.VehicleModesEnumeration;
import uk.org.siri.www.siri.AirSubmodesOfTransportEnumeration;
import uk.org.siri.www.siri.ArrivalBoardingActivityEnumeration;
import uk.org.siri.www.siri.BusSubmodesOfTransportEnumeration;
import uk.org.siri.www.siri.CallStatusEnumeration;
import uk.org.siri.www.siri.CoachSubmodesOfTransportEnumeration;
import uk.org.siri.www.siri.DepartureBoardingActivityEnumeration;
import uk.org.siri.www.siri.MetroSubmodesOfTransportEnumeration;
import uk.org.siri.www.siri.OccupancyEnumeration;
import uk.org.siri.www.siri.RailSubmodesOfTransportEnumeration;
import uk.org.siri.www.siri.SeverityEnumeration;
import uk.org.siri.www.siri.SituationSourceTypeEnumeration;
import uk.org.siri.www.siri.TramSubmodesOfTransportEnumeration;
import uk.org.siri.www.siri.VehicleModesOfTransportEnumeration;
import uk.org.siri.www.siri.VehicleStatusEnumeration;
import uk.org.siri.www.siri.WaterSubmodesOfTransportEnumeration;
import uk.org.siri.www.siri.WorkflowStatusEnumeration;

public class EnumerationMapper {



    protected static AccessibilityFeatureEnumeration map(uk.org.ifopt.siri20.AccessibilityFeatureEnumeration accessFeatureType) {
        switch (accessFeatureType) {
            case ESCALATOR:
                return AccessibilityFeatureEnumeration.ACCESSIBILITY_FEATURE_ENUMERATION_ESCALATOR;
            case LIFT:
                return AccessibilityFeatureEnumeration.ACCESSIBILITY_FEATURE_ENUMERATION_LIFT;
            case NARROW_ENTRANCE:
                return AccessibilityFeatureEnumeration.ACCESSIBILITY_FEATURE_ENUMERATION_NARROW_ENTRANCE;
            case RAMP:
                return AccessibilityFeatureEnumeration.ACCESSIBILITY_FEATURE_ENUMERATION_RAMP;
            case STAIRS:
                return AccessibilityFeatureEnumeration.ACCESSIBILITY_FEATURE_ENUMERATION_STAIRS;
        }
        return null;
    }


    protected static uk.org.ifopt.siri20.AccessibilityFeatureEnumeration map(AccessibilityFeatureEnumeration accessFeatureType) {
        switch (accessFeatureType) {
            case ACCESSIBILITY_FEATURE_ENUMERATION_ESCALATOR:
                return uk.org.ifopt.siri20.AccessibilityFeatureEnumeration.ESCALATOR;
            case ACCESSIBILITY_FEATURE_ENUMERATION_LIFT:
                return uk.org.ifopt.siri20.AccessibilityFeatureEnumeration.LIFT;
            case ACCESSIBILITY_FEATURE_ENUMERATION_NARROW_ENTRANCE:
                return uk.org.ifopt.siri20.AccessibilityFeatureEnumeration.NARROW_ENTRANCE;
            case ACCESSIBILITY_FEATURE_ENUMERATION_RAMP:
                return uk.org.ifopt.siri20.AccessibilityFeatureEnumeration.RAMP;
            case ACCESSIBILITY_FEATURE_ENUMERATION_STAIRS:
                return uk.org.ifopt.siri20.AccessibilityFeatureEnumeration.STAIRS;
        }
        return null;
    }

    protected static StopPlaceComponentTypeEnumeration map(uk.org.ifopt.siri20.StopPlaceComponentTypeEnumeration componentType) {
        switch (componentType) {
            case ACCESS_SPACE:
                return StopPlaceComponentTypeEnumeration.STOP_PLACE_COMPONENT_TYPE_ENUMERATION_ACCESS_SPACE;
            case BOARDING_POSITION:
                return StopPlaceComponentTypeEnumeration.STOP_PLACE_COMPONENT_TYPE_ENUMERATION_BOARDING_POSITION;
            case ENTRANCE:
                return StopPlaceComponentTypeEnumeration.STOP_PLACE_COMPONENT_TYPE_ENUMERATION_ENTRANCE;
            case QUAY:
                return StopPlaceComponentTypeEnumeration.STOP_PLACE_COMPONENT_TYPE_ENUMERATION_QUAY;
        }
        return null;
    }

    protected static uk.org.ifopt.siri20.StopPlaceComponentTypeEnumeration map(StopPlaceComponentTypeEnumeration componentType) {
        switch (componentType) {
            case STOP_PLACE_COMPONENT_TYPE_ENUMERATION_ACCESS_SPACE:
                return uk.org.ifopt.siri20.StopPlaceComponentTypeEnumeration.ACCESS_SPACE;
            case STOP_PLACE_COMPONENT_TYPE_ENUMERATION_BOARDING_POSITION:
                return uk.org.ifopt.siri20.StopPlaceComponentTypeEnumeration.BOARDING_POSITION;
            case STOP_PLACE_COMPONENT_TYPE_ENUMERATION_ENTRANCE:
                return uk.org.ifopt.siri20.StopPlaceComponentTypeEnumeration.ENTRANCE;
            case STOP_PLACE_COMPONENT_TYPE_ENUMERATION_QUAY:
                return uk.org.ifopt.siri20.StopPlaceComponentTypeEnumeration.QUAY;
        }
        return null;
    }

    protected static uk.org.siri.www.siri.RoutePointTypeEnumeration map(RoutePointTypeEnumeration stopCondition) {
        switch (stopCondition) {
            case EXCEPTIONAL_STOP:
                return uk.org.siri.www.siri.RoutePointTypeEnumeration.ROUTE_POINT_TYPE_ENUMERATION_EXCEPTIONAL_STOP;
            case DESTINATION:
                return uk.org.siri.www.siri.RoutePointTypeEnumeration.ROUTE_POINT_TYPE_ENUMERATION_DESTINATION;
            case NOT_STOPPING:
                return uk.org.siri.www.siri.RoutePointTypeEnumeration.ROUTE_POINT_TYPE_ENUMERATION_NOT_STOPPING;
            case REQUEST_STOP:
                return uk.org.siri.www.siri.RoutePointTypeEnumeration.ROUTE_POINT_TYPE_ENUMERATION_REQUEST_STOP;
            case START_POINT:
                return uk.org.siri.www.siri.RoutePointTypeEnumeration.ROUTE_POINT_TYPE_ENUMERATION_START_POINT;
            case STOP:
                return uk.org.siri.www.siri.RoutePointTypeEnumeration.ROUTE_POINT_TYPE_ENUMERATION_STOP;
        }
        return null;
    }

    protected static RoutePointTypeEnumeration map(uk.org.siri.www.siri.RoutePointTypeEnumeration stopCondition) {
        switch (stopCondition) {
            case ROUTE_POINT_TYPE_ENUMERATION_EXCEPTIONAL_STOP:
                return RoutePointTypeEnumeration.EXCEPTIONAL_STOP;
            case ROUTE_POINT_TYPE_ENUMERATION_DESTINATION:
                return RoutePointTypeEnumeration.DESTINATION;
            case ROUTE_POINT_TYPE_ENUMERATION_NOT_STOPPING:
                return RoutePointTypeEnumeration.NOT_STOPPING;
            case ROUTE_POINT_TYPE_ENUMERATION_REQUEST_STOP:
                return RoutePointTypeEnumeration.REQUEST_STOP;
            case ROUTE_POINT_TYPE_ENUMERATION_START_POINT:
                return RoutePointTypeEnumeration.START_POINT;
            case ROUTE_POINT_TYPE_ENUMERATION_STOP:
                return RoutePointTypeEnumeration.STOP;
        }
        return null;
    }

    protected static WaterSubmodesOfTransportEnumeration map(uk.org.siri.siri20.WaterSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case HIGH_SPEED_PASSENGER_SERVICE:
                return WaterSubmodesOfTransportEnumeration.WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_HIGH_SPEED_PASSENGER_SERVICE;
            case HIGH_SPEED_VEHICLE_SERVICE:
                return WaterSubmodesOfTransportEnumeration.WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_HIGH_SPEED_VEHICLE_SERVICE;
            case INTERNATIONAL_CAR_FERRY_SERVICE:
                return WaterSubmodesOfTransportEnumeration.WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_INTERNATIONAL_CAR_FERRY_SERVICE;
            case INTERNATIONAL_PASSENGER_FERRY:
                return WaterSubmodesOfTransportEnumeration.WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_INTERNATIONAL_PASSENGER_FERRY;
            case LOCAL_CAR_FERRY_SERVICE:
                return WaterSubmodesOfTransportEnumeration.WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_LOCAL_CAR_FERRY_SERVICE;
            case LOCAL_PASSENGER_FERRY:
                return WaterSubmodesOfTransportEnumeration.WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_LOCAL_PASSENGER_FERRY;
            case NATIONAL_PASSENGER_FERRY:
                return WaterSubmodesOfTransportEnumeration.WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_NATIONAL_CAR_FERRY_SERVICE;
            case SIGHTSEEING_SERVICE:
                return WaterSubmodesOfTransportEnumeration.WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_SIGHTSEEING_SERVICE;
        }
        return null;
    }
    
    protected static uk.org.siri.siri20.WaterSubmodesOfTransportEnumeration map(WaterSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_HIGH_SPEED_PASSENGER_SERVICE:
                return uk.org.siri.siri20.WaterSubmodesOfTransportEnumeration.HIGH_SPEED_PASSENGER_SERVICE;
            case WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_HIGH_SPEED_VEHICLE_SERVICE:
                return uk.org.siri.siri20.WaterSubmodesOfTransportEnumeration.HIGH_SPEED_VEHICLE_SERVICE;
            case WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_INTERNATIONAL_CAR_FERRY_SERVICE:
                return uk.org.siri.siri20.WaterSubmodesOfTransportEnumeration.INTERNATIONAL_CAR_FERRY_SERVICE;
            case WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_INTERNATIONAL_PASSENGER_FERRY:
                return uk.org.siri.siri20.WaterSubmodesOfTransportEnumeration.INTERNATIONAL_PASSENGER_FERRY;
            case WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_LOCAL_CAR_FERRY_SERVICE:
                return uk.org.siri.siri20.WaterSubmodesOfTransportEnumeration.LOCAL_CAR_FERRY_SERVICE;
            case WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_LOCAL_PASSENGER_FERRY:
                return uk.org.siri.siri20.WaterSubmodesOfTransportEnumeration.LOCAL_PASSENGER_FERRY;
            case WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_NATIONAL_PASSENGER_FERRY:
                return uk.org.siri.siri20.WaterSubmodesOfTransportEnumeration.NATIONAL_CAR_FERRY_SERVICE;
            case WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_SIGHTSEEING_SERVICE:
                return uk.org.siri.siri20.WaterSubmodesOfTransportEnumeration.SIGHTSEEING_SERVICE;
        }
        return null;
    }

    protected static TramSubmodesOfTransportEnumeration map(uk.org.siri.siri20.TramSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case LOCAL_TRAM_SERVICE:
                return TramSubmodesOfTransportEnumeration.TRAM_SUBMODES_OF_TRANSPORT_ENUMERATION_LOCAL_TRAM_SERVICE;
        }
        return null;
    }
    protected static uk.org.siri.siri20.TramSubmodesOfTransportEnumeration map(TramSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case TRAM_SUBMODES_OF_TRANSPORT_ENUMERATION_LOCAL_TRAM_SERVICE:
                return uk.org.siri.siri20.TramSubmodesOfTransportEnumeration.LOCAL_TRAM_SERVICE;
        }
        return null;
    }

    protected static RailSubmodesOfTransportEnumeration map(uk.org.siri.siri20.RailSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case INTERBATIONAL:
                return RailSubmodesOfTransportEnumeration.RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_INTERBATIONAL;
            case INTER_REGIONAL_RAIL_SERVICE:
                return RailSubmodesOfTransportEnumeration.RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_INTER_REGIONAL_RAIL_SERVICE;
            case LOCAL:
                return RailSubmodesOfTransportEnumeration.RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_LOCAL;
            case LONG_DISTANCE_TRAIN:
                return RailSubmodesOfTransportEnumeration.RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_LONG_DISTANCE_TRAIN;
            case SLEEPER_RAIL_SERVICE:
                return RailSubmodesOfTransportEnumeration.RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_SLEEPER_RAIL_SERVICE;
            case REGIONAL_RAIL:
                return RailSubmodesOfTransportEnumeration.RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_REGIONAL_RAIL;
            case SPECIAL_TRAIN_SERVICE:
                return RailSubmodesOfTransportEnumeration.RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_SPECIAL_TRAIN_SERVICE;
            case TOURIST_RAILWAY:
                return RailSubmodesOfTransportEnumeration.RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_TOURIST_RAILWAY;
        }
        return null;
    }

    protected static uk.org.siri.siri20.RailSubmodesOfTransportEnumeration map(RailSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_INTERBATIONAL:
                return uk.org.siri.siri20.RailSubmodesOfTransportEnumeration.INTERBATIONAL;
            case RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_INTER_REGIONAL_RAIL_SERVICE:
                return uk.org.siri.siri20.RailSubmodesOfTransportEnumeration.INTER_REGIONAL_RAIL_SERVICE;
            case RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_LOCAL:
                return uk.org.siri.siri20.RailSubmodesOfTransportEnumeration.LOCAL;
            case RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_LONG_DISTANCE_TRAIN:
                return uk.org.siri.siri20.RailSubmodesOfTransportEnumeration.LONG_DISTANCE_TRAIN;
            case RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_SLEEPER_RAIL_SERVICE:
                return uk.org.siri.siri20.RailSubmodesOfTransportEnumeration.SLEEPER_RAIL_SERVICE;
            case RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_REGIONAL_RAIL:
                return uk.org.siri.siri20.RailSubmodesOfTransportEnumeration.REGIONAL_RAIL;
            case RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_SPECIAL_TRAIN_SERVICE:
                return uk.org.siri.siri20.RailSubmodesOfTransportEnumeration.SPECIAL_TRAIN_SERVICE;
            case RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_TOURIST_RAILWAY:
                return uk.org.siri.siri20.RailSubmodesOfTransportEnumeration.TOURIST_RAILWAY;
        }
        return null;
    }

    protected static MetroSubmodesOfTransportEnumeration map(uk.org.siri.siri20.MetroSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case METRO:
                return MetroSubmodesOfTransportEnumeration.METRO_SUBMODES_OF_TRANSPORT_ENUMERATION_METRO;
            case URBAN_RAILWAY:
                return MetroSubmodesOfTransportEnumeration.METRO_SUBMODES_OF_TRANSPORT_ENUMERATION_URBAN_RAILWAY;
        }
        return null;
    }
    protected static uk.org.siri.siri20.MetroSubmodesOfTransportEnumeration map(MetroSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case METRO_SUBMODES_OF_TRANSPORT_ENUMERATION_METRO:
                return uk.org.siri.siri20.MetroSubmodesOfTransportEnumeration.METRO;
            case METRO_SUBMODES_OF_TRANSPORT_ENUMERATION_URBAN_RAILWAY:
                return uk.org.siri.siri20.MetroSubmodesOfTransportEnumeration.URBAN_RAILWAY;
        }
        return null;
    }

    protected static CoachSubmodesOfTransportEnumeration map(uk.org.siri.siri20.CoachSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case INTERNATIONAL_COACH_SERVICE:
                return CoachSubmodesOfTransportEnumeration.COACH_SUBMODES_OF_TRANSPORT_ENUMERATION_INTERNATIONAL_COACH_SERVICE;
            case NATIONAL_COACH_SERVICE:
                return CoachSubmodesOfTransportEnumeration.COACH_SUBMODES_OF_TRANSPORT_ENUMERATION_NATIONAL_COACH_SERVICE;
            case TOURIST_COACH_SERVICE:
                return CoachSubmodesOfTransportEnumeration.COACH_SUBMODES_OF_TRANSPORT_ENUMERATION_TOURIST_COACH_SERVICE;
        }
        return null;
    }
    protected static uk.org.siri.siri20.CoachSubmodesOfTransportEnumeration map(CoachSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case COACH_SUBMODES_OF_TRANSPORT_ENUMERATION_INTERNATIONAL_COACH_SERVICE:
                return uk.org.siri.siri20.CoachSubmodesOfTransportEnumeration.INTERNATIONAL_COACH_SERVICE;
            case COACH_SUBMODES_OF_TRANSPORT_ENUMERATION_NATIONAL_COACH_SERVICE:
                return uk.org.siri.siri20.CoachSubmodesOfTransportEnumeration.NATIONAL_COACH_SERVICE;
            case COACH_SUBMODES_OF_TRANSPORT_ENUMERATION_TOURIST_COACH_SERVICE:
                return uk.org.siri.siri20.CoachSubmodesOfTransportEnumeration.TOURIST_COACH_SERVICE;
        }
        return null;
    }

    protected static AirSubmodesOfTransportEnumeration map(uk.org.siri.siri20.AirSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case DOMESTIC_FLIGHT:
                return AirSubmodesOfTransportEnumeration.AIR_SUBMODES_OF_TRANSPORT_ENUMERATION_DOMESTIC_FLIGHT;
            case HELICOPTER_SERVICE:
                return AirSubmodesOfTransportEnumeration.AIR_SUBMODES_OF_TRANSPORT_ENUMERATION_HELICOPTER_SERVICE;
            case INTERNATIONAL_FLIGHT:
                return AirSubmodesOfTransportEnumeration.AIR_SUBMODES_OF_TRANSPORT_ENUMERATION_INTERNATIONAL_FLIGHT;
        }
        return null;
    }
    protected static uk.org.siri.siri20.AirSubmodesOfTransportEnumeration map(AirSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case AIR_SUBMODES_OF_TRANSPORT_ENUMERATION_DOMESTIC_FLIGHT:
                return uk.org.siri.siri20.AirSubmodesOfTransportEnumeration.DOMESTIC_FLIGHT;
            case AIR_SUBMODES_OF_TRANSPORT_ENUMERATION_HELICOPTER_SERVICE:
                return uk.org.siri.siri20.AirSubmodesOfTransportEnumeration.HELICOPTER_SERVICE;
            case AIR_SUBMODES_OF_TRANSPORT_ENUMERATION_INTERNATIONAL_FLIGHT:
                return uk.org.siri.siri20.AirSubmodesOfTransportEnumeration.INTERNATIONAL_FLIGHT;
        }
        return null;
    }

    protected static BusSubmodesOfTransportEnumeration map(uk.org.siri.siri20.BusSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case AIRPORT_LINK_BUS:
                return BusSubmodesOfTransportEnumeration.BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_AIRPORT_LINK_BUS;
            case EXPRESS_BUS:
                return BusSubmodesOfTransportEnumeration.BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_EXPRESS_BUS;
            case LOCAL_BUS_SERVICE:
                return BusSubmodesOfTransportEnumeration.BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_LOCAL_BUS_SERVICE;
            case NIGHT_BUS:
                return BusSubmodesOfTransportEnumeration.BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_NIGHT_BUS;
            case RAIL_REPLACEMENT_BUS:
                return BusSubmodesOfTransportEnumeration.BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_RAIL_REPLACEMENT_BUS;
            case REGIONAL_BUS:
                return BusSubmodesOfTransportEnumeration.BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_REGIONAL_BUS;
            case SCHOOL_BUS:
                return BusSubmodesOfTransportEnumeration.BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_SCHOOL_BUS;
            case SHUTTLE_BUS:
                return BusSubmodesOfTransportEnumeration.BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_SHUTTLE_BUS;
            case SIGHTSEEING_BUS:
                return BusSubmodesOfTransportEnumeration.BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_SIGHTSEEING_BUS;
        }
        return null;
    }
    protected static uk.org.siri.siri20.BusSubmodesOfTransportEnumeration map(BusSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_AIRPORT_LINK_BUS:
                return uk.org.siri.siri20.BusSubmodesOfTransportEnumeration.AIRPORT_LINK_BUS;
            case BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_EXPRESS_BUS:
                return uk.org.siri.siri20.BusSubmodesOfTransportEnumeration.EXPRESS_BUS;
            case BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_LOCAL_BUS_SERVICE:
                return uk.org.siri.siri20.BusSubmodesOfTransportEnumeration.LOCAL_BUS_SERVICE;
            case BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_NIGHT_BUS:
                return uk.org.siri.siri20.BusSubmodesOfTransportEnumeration.NIGHT_BUS;
            case BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_RAIL_REPLACEMENT_BUS:
                return uk.org.siri.siri20.BusSubmodesOfTransportEnumeration.RAIL_REPLACEMENT_BUS;
            case BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_REGIONAL_BUS:
                return uk.org.siri.siri20.BusSubmodesOfTransportEnumeration.REGIONAL_BUS;
            case BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_SCHOOL_BUS:
                return uk.org.siri.siri20.BusSubmodesOfTransportEnumeration.SCHOOL_BUS;
            case BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_SHUTTLE_BUS:
                return uk.org.siri.siri20.BusSubmodesOfTransportEnumeration.SHUTTLE_BUS;
            case BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_SIGHTSEEING_BUS:
                return uk.org.siri.siri20.BusSubmodesOfTransportEnumeration.SIGHTSEEING_BUS;
        }
        return null;
    }

    protected static VehicleModesOfTransportEnumeration map(uk.org.siri.siri20.VehicleModesOfTransportEnumeration vehicleMode) {
        switch (vehicleMode) {
            case ALL:
                return VehicleModesOfTransportEnumeration.VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_ALL;
            case AIR:
                return VehicleModesOfTransportEnumeration.VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_AIR;
            case BUS:
                return VehicleModesOfTransportEnumeration.VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_BUS;
            case COACH:
                return VehicleModesOfTransportEnumeration.VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_COACH;
            case FUNICULAR:
                return VehicleModesOfTransportEnumeration.VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_FUNICULAR;
            case METRO:
                return VehicleModesOfTransportEnumeration.VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_METRO;
            case RAIL:
                return VehicleModesOfTransportEnumeration.VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_RAIL;
            case TAXI:
                return VehicleModesOfTransportEnumeration.VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_TAXI;
            case TELECABIN:
                return VehicleModesOfTransportEnumeration.VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_TELECABIN;
            case TRAM:
                return VehicleModesOfTransportEnumeration.VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_TRAM;
            case WATER:
                return VehicleModesOfTransportEnumeration.VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_WATER;
            case SELF_DRIVE:
                return VehicleModesOfTransportEnumeration.VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_SELF_DRIVE;
        }
        return null;
    }


    protected static uk.org.siri.siri20.VehicleModesOfTransportEnumeration map(VehicleModesOfTransportEnumeration vehicleMode) {
        switch (vehicleMode) {
            case VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_ALL:
                return uk.org.siri.siri20.VehicleModesOfTransportEnumeration.ALL;
            case VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_AIR:
                return uk.org.siri.siri20.VehicleModesOfTransportEnumeration.AIR;
            case VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_BUS:
                return uk.org.siri.siri20.VehicleModesOfTransportEnumeration.BUS;
            case VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_COACH:
                return uk.org.siri.siri20.VehicleModesOfTransportEnumeration.COACH;
            case VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_FUNICULAR:
                return uk.org.siri.siri20.VehicleModesOfTransportEnumeration.FUNICULAR;
            case VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_METRO:
                return uk.org.siri.siri20.VehicleModesOfTransportEnumeration.METRO;
            case VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_RAIL:
                return uk.org.siri.siri20.VehicleModesOfTransportEnumeration.RAIL;
            case VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_TAXI:
                return uk.org.siri.siri20.VehicleModesOfTransportEnumeration.TAXI;
            case VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_TELECABIN:
                return uk.org.siri.siri20.VehicleModesOfTransportEnumeration.TELECABIN;
            case VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_TRAM:
                return uk.org.siri.siri20.VehicleModesOfTransportEnumeration.TRAM;
            case VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_WATER:
                return uk.org.siri.siri20.VehicleModesOfTransportEnumeration.WATER;
            case VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_SELF_DRIVE:
                return uk.org.siri.siri20.VehicleModesOfTransportEnumeration.SELF_DRIVE;
        }
        return null;
    }

    protected static SeverityEnumeration map(uk.org.siri.siri20.SeverityEnumeration severity) {
        switch (severity) {
            case NO_IMPACT:
                return SeverityEnumeration.SEVERITY_ENUMERATION_NO_IMPACT;
            case VERY_SLIGHT:
                return SeverityEnumeration.SEVERITY_ENUMERATION_VERY_SLIGHT;
            case SLIGHT:
                return SeverityEnumeration.SEVERITY_ENUMERATION_SLIGHT;
            case NORMAL:
                return SeverityEnumeration.SEVERITY_ENUMERATION_NORMAL;
            case SEVERE:
                return SeverityEnumeration.SEVERITY_ENUMERATION_SEVERE;
            case VERY_SEVERE:
                return SeverityEnumeration.SEVERITY_ENUMERATION_VERY_SEVERE;
            case UNKNOWN:
                return SeverityEnumeration.SEVERITY_ENUMERATION_UNKNOWN;
            default:
                return SeverityEnumeration.SEVERITY_ENUMERATION_UNDEFINED;
        }
    }

    protected static uk.org.siri.siri20.SeverityEnumeration map(SeverityEnumeration severity) {
        switch (severity) {
            case SEVERITY_ENUMERATION_NO_IMPACT:
                return uk.org.siri.siri20.SeverityEnumeration.NO_IMPACT;
            case SEVERITY_ENUMERATION_VERY_SLIGHT:
                return uk.org.siri.siri20.SeverityEnumeration.VERY_SLIGHT;
            case SEVERITY_ENUMERATION_SLIGHT:
                return uk.org.siri.siri20.SeverityEnumeration.SLIGHT;
            case SEVERITY_ENUMERATION_NORMAL:
                return uk.org.siri.siri20.SeverityEnumeration.NORMAL;
            case SEVERITY_ENUMERATION_SEVERE:
                return uk.org.siri.siri20.SeverityEnumeration.SEVERE;
            case SEVERITY_ENUMERATION_VERY_SEVERE:
                return uk.org.siri.siri20.SeverityEnumeration.VERY_SEVERE;
            case SEVERITY_ENUMERATION_UNKNOWN:
                return uk.org.siri.siri20.SeverityEnumeration.UNKNOWN;
            default:
                return uk.org.siri.siri20.SeverityEnumeration.UNDEFINED;
        }
    }

    protected static WorkflowStatusEnumeration map(uk.org.siri.siri20.WorkflowStatusEnumeration progress) {
        switch (progress) {
            case OPEN:
                return WorkflowStatusEnumeration.WORKFLOW_STATUS_ENUMERATION_OPEN;
            case DRAFT:
                return WorkflowStatusEnumeration.WORKFLOW_STATUS_ENUMERATION_DRAFT;
            case CLOSED:
                return WorkflowStatusEnumeration.WORKFLOW_STATUS_ENUMERATION_CLOSED;
            case CLOSING:
                return WorkflowStatusEnumeration.WORKFLOW_STATUS_ENUMERATION_CLOSING;
            case PUBLISHED:
                return WorkflowStatusEnumeration.WORKFLOW_STATUS_ENUMERATION_PUBLISHED;
            case APPROVED_DRAFT:
                return WorkflowStatusEnumeration.WORKFLOW_STATUS_ENUMERATION_APPROVED_DRAFT;
            default:
                return WorkflowStatusEnumeration.WORKFLOW_STATUS_ENUMERATION_UNSPECIFIED;
        }
    }

    protected static uk.org.siri.siri20.WorkflowStatusEnumeration map(WorkflowStatusEnumeration progress) {
        switch (progress) {
            case WORKFLOW_STATUS_ENUMERATION_OPEN:
                return uk.org.siri.siri20.WorkflowStatusEnumeration.OPEN;
            case WORKFLOW_STATUS_ENUMERATION_DRAFT:
                return uk.org.siri.siri20.WorkflowStatusEnumeration.DRAFT;
            case WORKFLOW_STATUS_ENUMERATION_CLOSED:
                return uk.org.siri.siri20.WorkflowStatusEnumeration.CLOSED;
            case WORKFLOW_STATUS_ENUMERATION_CLOSING:
                return uk.org.siri.siri20.WorkflowStatusEnumeration.CLOSING;
            case WORKFLOW_STATUS_ENUMERATION_PUBLISHED:
                return uk.org.siri.siri20.WorkflowStatusEnumeration.PUBLISHED;
            case WORKFLOW_STATUS_ENUMERATION_APPROVED_DRAFT:
                return uk.org.siri.siri20.WorkflowStatusEnumeration.APPROVED_DRAFT;
            default:
                return null;
        }
    }

    protected static SituationSourceTypeEnumeration map(uk.org.siri.siri20.SituationSourceTypeEnumeration sourceType) {
        switch (sourceType) {
            case DIRECT_REPORT:
                return SituationSourceTypeEnumeration.SITUATION_SOURCE_TYPE_ENUMERATION_DIRECT_REPORT;
            case TV:
                return SituationSourceTypeEnumeration.SITUATION_SOURCE_TYPE_ENUMERATION_TV;
            case FAX:
                return SituationSourceTypeEnumeration.SITUATION_SOURCE_TYPE_ENUMERATION_FAX;
            case WEB:
                return SituationSourceTypeEnumeration.SITUATION_SOURCE_TYPE_ENUMERATION_WEB;
            case FEED:
                return SituationSourceTypeEnumeration.SITUATION_SOURCE_TYPE_ENUMERATION_FEED;
            case POST:
                return SituationSourceTypeEnumeration.SITUATION_SOURCE_TYPE_ENUMERATION_POST;
            case TEXT:
                return SituationSourceTypeEnumeration.SITUATION_SOURCE_TYPE_ENUMERATION_TEXT;
            case EMAIL:
                return SituationSourceTypeEnumeration.SITUATION_SOURCE_TYPE_ENUMERATION_EMAIL;
            case PAGER:
                return SituationSourceTypeEnumeration.SITUATION_SOURCE_TYPE_ENUMERATION_PAGER;
            case PHONE:
                return SituationSourceTypeEnumeration.SITUATION_SOURCE_TYPE_ENUMERATION_PHONE;
            case RADIO:
                return SituationSourceTypeEnumeration.SITUATION_SOURCE_TYPE_ENUMERATION_RADIO;
            case OTHER:
                return SituationSourceTypeEnumeration.SITUATION_SOURCE_TYPE_ENUMERATION_OTHER;
            default:
                return SituationSourceTypeEnumeration.SITUATION_SOURCE_TYPE_ENUMERATION_UNSPECIFIED;
        }
    }

    protected static uk.org.siri.siri20.SituationSourceTypeEnumeration map(SituationSourceTypeEnumeration sourceType) {
        switch (sourceType) {
            case SITUATION_SOURCE_TYPE_ENUMERATION_DIRECT_REPORT:
                return uk.org.siri.siri20.SituationSourceTypeEnumeration.DIRECT_REPORT;
            case SITUATION_SOURCE_TYPE_ENUMERATION_TV:
                return uk.org.siri.siri20.SituationSourceTypeEnumeration.TV;
            case SITUATION_SOURCE_TYPE_ENUMERATION_FAX:
                return uk.org.siri.siri20.SituationSourceTypeEnumeration.FAX;
            case SITUATION_SOURCE_TYPE_ENUMERATION_WEB:
                return uk.org.siri.siri20.SituationSourceTypeEnumeration.WEB;
            case SITUATION_SOURCE_TYPE_ENUMERATION_FEED:
                return uk.org.siri.siri20.SituationSourceTypeEnumeration.FEED;
            case SITUATION_SOURCE_TYPE_ENUMERATION_POST:
                return uk.org.siri.siri20.SituationSourceTypeEnumeration.POST;
            case SITUATION_SOURCE_TYPE_ENUMERATION_TEXT:
                return uk.org.siri.siri20.SituationSourceTypeEnumeration.TEXT;
            case SITUATION_SOURCE_TYPE_ENUMERATION_EMAIL:
                return uk.org.siri.siri20.SituationSourceTypeEnumeration.EMAIL;
            case SITUATION_SOURCE_TYPE_ENUMERATION_PAGER:
                return uk.org.siri.siri20.SituationSourceTypeEnumeration.PAGER;
            case SITUATION_SOURCE_TYPE_ENUMERATION_PHONE:
                return uk.org.siri.siri20.SituationSourceTypeEnumeration.PHONE;
            case SITUATION_SOURCE_TYPE_ENUMERATION_RADIO:
                return uk.org.siri.siri20.SituationSourceTypeEnumeration.RADIO;
            case SITUATION_SOURCE_TYPE_ENUMERATION_OTHER:
                return uk.org.siri.siri20.SituationSourceTypeEnumeration.OTHER;
            default:
                return null;
        }
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
}

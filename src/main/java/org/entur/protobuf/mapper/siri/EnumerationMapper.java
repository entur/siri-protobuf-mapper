package org.entur.protobuf.mapper.siri;

import eu.datex2.schema._2_0rc1._2_0.DelaysTypeEnum;
import uk.org.ifopt.www.ifopt.AccessibilityFeatureEnumeration;
import uk.org.ifopt.www.ifopt.StopPlaceComponentTypeEnumeration;
import uk.org.siri.siri20.RoutePointTypeEnumeration;
import uk.org.siri.siri20.VehicleModesEnumeration;
import uk.org.siri.www.siri.*;

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
                return WaterSubmodesOfTransportEnumeration.WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_NATIONAL_PASSENGER_FERRY;
            case NATIONAL_CAR_FERRY_SERVICE:
                return WaterSubmodesOfTransportEnumeration.WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_NATIONAL_CAR_FERRY_SERVICE;
            case SIGHTSEEING_SERVICE:
                return WaterSubmodesOfTransportEnumeration.WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_SIGHTSEEING_SERVICE;
            case UNKNOWN:
                return WaterSubmodesOfTransportEnumeration.WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_UNKNOWN;
            default:
                return WaterSubmodesOfTransportEnumeration.WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_UNSPECIFIED;
        }
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
            case WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_NATIONAL_CAR_FERRY_SERVICE:
                return uk.org.siri.siri20.WaterSubmodesOfTransportEnumeration.NATIONAL_CAR_FERRY_SERVICE;
            case WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_NATIONAL_PASSENGER_FERRY:
                return uk.org.siri.siri20.WaterSubmodesOfTransportEnumeration.NATIONAL_PASSENGER_FERRY;
            case WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_SIGHTSEEING_SERVICE:
                return uk.org.siri.siri20.WaterSubmodesOfTransportEnumeration.SIGHTSEEING_SERVICE;
            case WATER_SUBMODES_OF_TRANSPORT_ENUMERATION_UNKNOWN:
                return uk.org.siri.siri20.WaterSubmodesOfTransportEnumeration.UNKNOWN;
        }
        return null;
    }

    protected static TramSubmodesOfTransportEnumeration map(uk.org.siri.siri20.TramSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case LOCAL_TRAM_SERVICE:
                return TramSubmodesOfTransportEnumeration.TRAM_SUBMODES_OF_TRANSPORT_ENUMERATION_LOCAL_TRAM_SERVICE;
            case UNKNOWN:
                return TramSubmodesOfTransportEnumeration.TRAM_SUBMODES_OF_TRANSPORT_ENUMERATION_UNKNOWN;
            default:
                return TramSubmodesOfTransportEnumeration.TRAM_SUBMODES_OF_TRANSPORT_ENUMERATION_UNDEFINED_TRAM_SERVICE;
        }
    }
    protected static uk.org.siri.siri20.TramSubmodesOfTransportEnumeration map(TramSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case TRAM_SUBMODES_OF_TRANSPORT_ENUMERATION_LOCAL_TRAM_SERVICE:
                return uk.org.siri.siri20.TramSubmodesOfTransportEnumeration.LOCAL_TRAM_SERVICE;
            case TRAM_SUBMODES_OF_TRANSPORT_ENUMERATION_UNKNOWN:
                return uk.org.siri.siri20.TramSubmodesOfTransportEnumeration.UNKNOWN;
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
            case UNKNOWN:
                return RailSubmodesOfTransportEnumeration.RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_UNKNOWN;
            default:
                return RailSubmodesOfTransportEnumeration.RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_UNDEFINED;
        }
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
            case RAIL_SUBMODES_OF_TRANSPORT_ENUMERATION_UNKNOWN:
                return uk.org.siri.siri20.RailSubmodesOfTransportEnumeration.UNKNOWN;
        }
        return null;
    }

    protected static MetroSubmodesOfTransportEnumeration map(uk.org.siri.siri20.MetroSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case METRO:
                return MetroSubmodesOfTransportEnumeration.METRO_SUBMODES_OF_TRANSPORT_ENUMERATION_METRO;
            case URBAN_RAILWAY:
                return MetroSubmodesOfTransportEnumeration.METRO_SUBMODES_OF_TRANSPORT_ENUMERATION_URBAN_RAILWAY;
            case UNKNOWN:
                return MetroSubmodesOfTransportEnumeration.METRO_SUBMODES_OF_TRANSPORT_ENUMERATION_UNKNOWN;
            default:
                return MetroSubmodesOfTransportEnumeration.METRO_SUBMODES_OF_TRANSPORT_ENUMERATION_UNDEFINED;
        }
    }
    protected static uk.org.siri.siri20.MetroSubmodesOfTransportEnumeration map(MetroSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case METRO_SUBMODES_OF_TRANSPORT_ENUMERATION_METRO:
                return uk.org.siri.siri20.MetroSubmodesOfTransportEnumeration.METRO;
            case METRO_SUBMODES_OF_TRANSPORT_ENUMERATION_URBAN_RAILWAY:
                return uk.org.siri.siri20.MetroSubmodesOfTransportEnumeration.URBAN_RAILWAY;
            case METRO_SUBMODES_OF_TRANSPORT_ENUMERATION_UNKNOWN:
                return uk.org.siri.siri20.MetroSubmodesOfTransportEnumeration.UNKNOWN;
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
            case UNKNOWN:
                return CoachSubmodesOfTransportEnumeration.COACH_SUBMODES_OF_TRANSPORT_ENUMERATION_UNKNOWN;
            default:
                return CoachSubmodesOfTransportEnumeration.COACH_SUBMODES_OF_TRANSPORT_ENUMERATION_UNDEFINED;
        }
    }
    protected static uk.org.siri.siri20.CoachSubmodesOfTransportEnumeration map(CoachSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case COACH_SUBMODES_OF_TRANSPORT_ENUMERATION_INTERNATIONAL_COACH_SERVICE:
                return uk.org.siri.siri20.CoachSubmodesOfTransportEnumeration.INTERNATIONAL_COACH_SERVICE;
            case COACH_SUBMODES_OF_TRANSPORT_ENUMERATION_NATIONAL_COACH_SERVICE:
                return uk.org.siri.siri20.CoachSubmodesOfTransportEnumeration.NATIONAL_COACH_SERVICE;
            case COACH_SUBMODES_OF_TRANSPORT_ENUMERATION_TOURIST_COACH_SERVICE:
                return uk.org.siri.siri20.CoachSubmodesOfTransportEnumeration.TOURIST_COACH_SERVICE;
            case COACH_SUBMODES_OF_TRANSPORT_ENUMERATION_UNKNOWN:
                return uk.org.siri.siri20.CoachSubmodesOfTransportEnumeration.UNKNOWN;
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
            case UNKNOWN:
                return AirSubmodesOfTransportEnumeration.AIR_SUBMODES_OF_TRANSPORT_ENUMERATION_UNKNOWN;
            default:
                return AirSubmodesOfTransportEnumeration.AIR_SUBMODES_OF_TRANSPORT_ENUMERATION_UNDEFINED_AIRCRAFT_SERVICE;
        }
    }
    protected static uk.org.siri.siri20.AirSubmodesOfTransportEnumeration map(AirSubmodesOfTransportEnumeration submode) {
        switch (submode) {
            case AIR_SUBMODES_OF_TRANSPORT_ENUMERATION_DOMESTIC_FLIGHT:
                return uk.org.siri.siri20.AirSubmodesOfTransportEnumeration.DOMESTIC_FLIGHT;
            case AIR_SUBMODES_OF_TRANSPORT_ENUMERATION_HELICOPTER_SERVICE:
                return uk.org.siri.siri20.AirSubmodesOfTransportEnumeration.HELICOPTER_SERVICE;
            case AIR_SUBMODES_OF_TRANSPORT_ENUMERATION_INTERNATIONAL_FLIGHT:
                return uk.org.siri.siri20.AirSubmodesOfTransportEnumeration.INTERNATIONAL_FLIGHT;
            case AIR_SUBMODES_OF_TRANSPORT_ENUMERATION_UNKNOWN:
                return uk.org.siri.siri20.AirSubmodesOfTransportEnumeration.UNKNOWN;
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
            case UNKNOWN:
                return BusSubmodesOfTransportEnumeration.BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_UNKNOWN;
            default:
                return BusSubmodesOfTransportEnumeration.BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_UNDEFINED;
        }
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
            case BUS_SUBMODES_OF_TRANSPORT_ENUMERATION_UNKNOWN:
                return uk.org.siri.siri20.BusSubmodesOfTransportEnumeration.UNKNOWN;
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
            case UNKNOWN:
                return VehicleModesOfTransportEnumeration.VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_UNKNOWN;
        }
        return VehicleModesOfTransportEnumeration.VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_UNSPECIFIED;
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
            case VEHICLE_MODES_OF_TRANSPORT_ENUMERATION_UNKNOWN:
                return uk.org.siri.siri20.VehicleModesOfTransportEnumeration.UNKNOWN;
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
                return null;
        }
    }

    protected static AudienceEnumeration map(uk.org.siri.siri20.AudienceEnumeration audience) {
        switch (audience) {
            case PUBLIC:
                return AudienceEnumeration.AUDIENCE_ENUMERATION_PUBLIC;
            case EMERGENCY_SERVICES:
                return AudienceEnumeration.AUDIENCE_ENUMERATION_EMERGENCY_SERVICES;
            case STAFF:
                return AudienceEnumeration.AUDIENCE_ENUMERATION_STAFF;
            case STATION_STAFF:
                return AudienceEnumeration.AUDIENCE_ENUMERATION_STATION_STAFF;
            case MANAGEMENT:
                return AudienceEnumeration.AUDIENCE_ENUMERATION_MANAGEMENT;
            case INFO_SERVICES:
                return AudienceEnumeration.AUDIENCE_ENUMERATION_INFO_SERVICES;
            default:
                return AudienceEnumeration.AUDIENCE_ENUMERATION_UNSPECIFIED;
        }
    }

    protected static uk.org.siri.siri20.AudienceEnumeration map(AudienceEnumeration audience) {
        switch (audience) {
            case AUDIENCE_ENUMERATION_PUBLIC:
                return uk.org.siri.siri20.AudienceEnumeration.PUBLIC;
            case AUDIENCE_ENUMERATION_EMERGENCY_SERVICES:
                return uk.org.siri.siri20.AudienceEnumeration.EMERGENCY_SERVICES;
            case AUDIENCE_ENUMERATION_STAFF:
                return uk.org.siri.siri20.AudienceEnumeration.STAFF;
            case AUDIENCE_ENUMERATION_STATION_STAFF:
                return uk.org.siri.siri20.AudienceEnumeration.STATION_STAFF;
            case AUDIENCE_ENUMERATION_MANAGEMENT:
                return uk.org.siri.siri20.AudienceEnumeration.MANAGEMENT;
            case AUDIENCE_ENUMERATION_INFO_SERVICES:
                return uk.org.siri.siri20.AudienceEnumeration.INFO_SERVICES;
            case AUDIENCE_ENUMERATION_UNSPECIFIED:
            default:
                return null;
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
                return VehicleStatusEnumeration.VEHICLE_STATUS_ENUMERATION_UNSPECIFIED;
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
                return uk.org.siri.www.siri.VehicleModesEnumeration.VEHICLE_MODES_ENUMERATION_UNSPECIFIED;
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
            case NOT_EXPECTED:
                return CallStatusEnumeration.CALL_STATUS_ENUMERATION_NOT_EXPECTED;
            default:
                return CallStatusEnumeration.CALL_STATUS_ENUMERATION_UNSPECIFIED;
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
        switch (occupancy) {
            case SEATS_AVAILABLE:
                return OccupancyEnumeration.OCCUPANCY_ENUMERATION_SEATS_AVAILABLE;
            case STANDING_AVAILABLE:
                return OccupancyEnumeration.OCCUPANCY_ENUMERATION_STANDING_AVAILABLE;
            case FULL:
                return OccupancyEnumeration.OCCUPANCY_ENUMERATION_FULL;
            default:
                return OccupancyEnumeration.OCCUPANCY_ENUMERATION_UNSPECIFIED;
        }
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

    protected static ServiceConditionEnumeration map(uk.org.siri.siri20.ServiceConditionEnumeration condition) {
        switch (condition) {
            case ADDITIONAL_SERVICE:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_ADDITIONAL_SERVICE;
            case ALTERED:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_ALTERED;
            case ARRIVES_EARLY:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_ARRIVES_EARLY;
            case CANCELLED:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_CANCELLED;
            case DELAYED:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_DELAYED;
            case DISRUPTED:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_DISRUPTED;
            case DIVERTED:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_DIVERTED;
            case EXTENDED_SERVICE:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_EXTENDED_SERVICE;
            case FULL_LENGTH_SERVICE:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_FULL_LENGTH_SERVICE;
            case INTERMITTENT_SERVICE:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_INTERMITTENT_SERVICE;
            case NO_SERVICE:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_NO_SERVICE;
            case NORMAL_SERVICE:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_NORMAL_SERVICE;
            case ON_TIME:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_ON_TIME;
            case REPLACEMENT_SERVICE:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_REPLACEMENT_SERVICE;
            case REPLACEMENT_TRANSPORT:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_REPLACEMENT_TRANSPORT;
            case SHORT_FORMED_SERVICE:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_SHORT_FORMED_SERVICE;
            case SHUTTLE_SERVICE:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_SHUTTLE_SERVICE;
            case SPECIAL_SERVICE:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_SPECIAL_SERVICE;
            case SPLITTING_TRAIN:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_SPLITTING_TRAIN;
            case UNDEFINED_SERVICE_INFORMATION:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_UNDEFINED_SERVICE_INFORMATION;
            case PTI_13_0:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_0;
            case PTI_13_1:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_1;
            case PTI_13_2:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_2;
            case PTI_13_3:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_3;
            case PTI_13_4:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_4;
            case PTI_13_5:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_5;
            case PTI_13_6:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_6;
            case PTI_13_7:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_7;
            case PTI_13_8:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_8;
            case PTI_13_9:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_9;
            case PTI_13_10:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_10;
            case PTI_13_11:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_11;
            case PTI_13_12:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_12;
            case PTI_13_13:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_13;
            case PTI_13_14:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_14;
            case PTI_13_15:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_15;
            case PTI_13_16:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_16;
            case PTI_13_17:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_17;
            case PTI_13_18:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_18;
            case PTI_13_19:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_19;
            case PTI_13_255:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_PTI13_255;
            case UNKNOWN:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_UNKNOWN;
            default:
                return ServiceConditionEnumeration.SERVICE_CONDITION_ENUMERATION_UNSPECIFIED;
        }
    }

    protected static uk.org.siri.siri20.ServiceConditionEnumeration map(ServiceConditionEnumeration condition) {
        switch (condition) {
            case SERVICE_CONDITION_ENUMERATION_ADDITIONAL_SERVICE:
                return uk.org.siri.siri20.ServiceConditionEnumeration.ADDITIONAL_SERVICE;
            case SERVICE_CONDITION_ENUMERATION_ALTERED:
                return uk.org.siri.siri20.ServiceConditionEnumeration.ALTERED;
            case SERVICE_CONDITION_ENUMERATION_ARRIVES_EARLY:
                return uk.org.siri.siri20.ServiceConditionEnumeration.ARRIVES_EARLY;
            case SERVICE_CONDITION_ENUMERATION_CANCELLED:
                return uk.org.siri.siri20.ServiceConditionEnumeration.CANCELLED;
            case SERVICE_CONDITION_ENUMERATION_DELAYED:
                return uk.org.siri.siri20.ServiceConditionEnumeration.DELAYED;
            case SERVICE_CONDITION_ENUMERATION_DISRUPTED:
                return uk.org.siri.siri20.ServiceConditionEnumeration.DISRUPTED;
            case SERVICE_CONDITION_ENUMERATION_DIVERTED:
                return uk.org.siri.siri20.ServiceConditionEnumeration.DIVERTED;
            case SERVICE_CONDITION_ENUMERATION_EXTENDED_SERVICE:
                return uk.org.siri.siri20.ServiceConditionEnumeration.EXTENDED_SERVICE;
            case SERVICE_CONDITION_ENUMERATION_FULL_LENGTH_SERVICE:
                return uk.org.siri.siri20.ServiceConditionEnumeration.FULL_LENGTH_SERVICE;
            case SERVICE_CONDITION_ENUMERATION_INTERMITTENT_SERVICE:
                return uk.org.siri.siri20.ServiceConditionEnumeration.INTERMITTENT_SERVICE;
            case SERVICE_CONDITION_ENUMERATION_NO_SERVICE:
                return uk.org.siri.siri20.ServiceConditionEnumeration.NO_SERVICE;
            case SERVICE_CONDITION_ENUMERATION_NORMAL_SERVICE:
                return uk.org.siri.siri20.ServiceConditionEnumeration.NORMAL_SERVICE;
            case SERVICE_CONDITION_ENUMERATION_ON_TIME:
                return uk.org.siri.siri20.ServiceConditionEnumeration.ON_TIME;
            case SERVICE_CONDITION_ENUMERATION_REPLACEMENT_SERVICE:
                return uk.org.siri.siri20.ServiceConditionEnumeration.REPLACEMENT_SERVICE;
            case SERVICE_CONDITION_ENUMERATION_REPLACEMENT_TRANSPORT:
                return uk.org.siri.siri20.ServiceConditionEnumeration.REPLACEMENT_TRANSPORT;
            case SERVICE_CONDITION_ENUMERATION_SHORT_FORMED_SERVICE:
                return uk.org.siri.siri20.ServiceConditionEnumeration.SHORT_FORMED_SERVICE;
            case SERVICE_CONDITION_ENUMERATION_SHUTTLE_SERVICE:
                return uk.org.siri.siri20.ServiceConditionEnumeration.SHUTTLE_SERVICE;
            case SERVICE_CONDITION_ENUMERATION_SPECIAL_SERVICE:
                return uk.org.siri.siri20.ServiceConditionEnumeration.SPECIAL_SERVICE;
            case SERVICE_CONDITION_ENUMERATION_SPLITTING_TRAIN:
                return uk.org.siri.siri20.ServiceConditionEnumeration.SPLITTING_TRAIN;
            case SERVICE_CONDITION_ENUMERATION_UNDEFINED_SERVICE_INFORMATION:
                return uk.org.siri.siri20.ServiceConditionEnumeration.UNDEFINED_SERVICE_INFORMATION;
            case SERVICE_CONDITION_ENUMERATION_PTI13_0:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_0;
            case SERVICE_CONDITION_ENUMERATION_PTI13_1:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_1;
            case SERVICE_CONDITION_ENUMERATION_PTI13_2:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_2;
            case SERVICE_CONDITION_ENUMERATION_PTI13_3:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_3;
            case SERVICE_CONDITION_ENUMERATION_PTI13_4:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_4;
            case SERVICE_CONDITION_ENUMERATION_PTI13_5:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_5;
            case SERVICE_CONDITION_ENUMERATION_PTI13_6:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_6;
            case SERVICE_CONDITION_ENUMERATION_PTI13_7:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_7;
            case SERVICE_CONDITION_ENUMERATION_PTI13_8:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_8;
            case SERVICE_CONDITION_ENUMERATION_PTI13_9:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_9;
            case SERVICE_CONDITION_ENUMERATION_PTI13_10:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_10;
            case SERVICE_CONDITION_ENUMERATION_PTI13_11:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_11;
            case SERVICE_CONDITION_ENUMERATION_PTI13_12:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_12;
            case SERVICE_CONDITION_ENUMERATION_PTI13_13:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_13;
            case SERVICE_CONDITION_ENUMERATION_PTI13_14:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_14;
            case SERVICE_CONDITION_ENUMERATION_PTI13_15:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_15;
            case SERVICE_CONDITION_ENUMERATION_PTI13_16:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_16;
            case SERVICE_CONDITION_ENUMERATION_PTI13_17:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_17;
            case SERVICE_CONDITION_ENUMERATION_PTI13_18:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_18;
            case SERVICE_CONDITION_ENUMERATION_PTI13_19:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_19;
            case SERVICE_CONDITION_ENUMERATION_PTI13_255:
                return uk.org.siri.siri20.ServiceConditionEnumeration.PTI_13_255;
            case SERVICE_CONDITION_ENUMERATION_UNKNOWN:
                return uk.org.siri.siri20.ServiceConditionEnumeration.UNKNOWN;
            default:
                return null;
        }
    }

    protected static DelayBandEnumeration map(uk.org.siri.siri20.DelayBandEnumeration delayBand) {
        switch (delayBand) {
            case BETWEEN_ONE_HOUR_AND_THREE_HOURS:
                return DelayBandEnumeration.DELAY_BAND_ENUMERATION_BETWEEN_ONE_HOUR_AND_THREE_HOURS;
            case BETWEEN_TEN_MINUTES_AND_THIRTY_MINUTES:
                return DelayBandEnumeration.DELAY_BAND_ENUMERATION_BETWEEN_TEN_MINUTES_AND_THIRTY_MINUTES;
            case BETWEEN_THIRTY_MINUTES_AND_ONE_HOUR:
                return DelayBandEnumeration.DELAY_BAND_ENUMERATION_BETWEEN_THIRTY_MINUTES_AND_ONE_HOUR;
            case BETWEEN_THREE_HOURS_AND_SIX_HOURS:
                return DelayBandEnumeration.DELAY_BAND_ENUMERATION_BETWEEN_THREE_HOURS_AND_SIX_HOURS;
            case DELAY_TWO_MINUTES:
                return DelayBandEnumeration.DELAY_BAND_ENUMERATION_DELAY_TWO_MINUTES;
            case LONGER_THAN_SIX_HOURS:
                return DelayBandEnumeration.DELAY_BAND_ENUMERATION_LONGER_THAN_SIX_HOURS;
            case NEGLIGIBLE:
                return DelayBandEnumeration.DELAY_BAND_ENUMERATION_NEGLIGIBLE;
            case UP_TO_EIGHT_MINUTES:
                return DelayBandEnumeration.DELAY_BAND_ENUMERATION_UP_TO_EIGHT_MINUTES;
            case UP_TO_FIVE_MINUTES:
                return DelayBandEnumeration.DELAY_BAND_ENUMERATION_UP_TO_FIVE_MINUTES;
            case UP_TO_FOUR_MINUTES:
                return DelayBandEnumeration.DELAY_BAND_ENUMERATION_UP_TO_FOUR_MINUTES;
            case UP_TO_TEN_MINUTES:
                return DelayBandEnumeration.DELAY_BAND_ENUMERATION_UP_TO_TEN_MINUTES;
            case UP_TO_THREE_MINUTES:
                return DelayBandEnumeration.DELAY_BAND_ENUMERATION_UP_TO_THREE_MINUTES;
            default:
                return null;
        }
    }

    protected static uk.org.siri.siri20.DelayBandEnumeration map(DelayBandEnumeration delayBand) {
        switch (delayBand) {
            case DELAY_BAND_ENUMERATION_BETWEEN_ONE_HOUR_AND_THREE_HOURS:
                return uk.org.siri.siri20.DelayBandEnumeration.BETWEEN_ONE_HOUR_AND_THREE_HOURS;
            case DELAY_BAND_ENUMERATION_BETWEEN_TEN_MINUTES_AND_THIRTY_MINUTES:
                return uk.org.siri.siri20.DelayBandEnumeration.BETWEEN_TEN_MINUTES_AND_THIRTY_MINUTES;
            case DELAY_BAND_ENUMERATION_BETWEEN_THIRTY_MINUTES_AND_ONE_HOUR:
                return uk.org.siri.siri20.DelayBandEnumeration.BETWEEN_THIRTY_MINUTES_AND_ONE_HOUR;
            case DELAY_BAND_ENUMERATION_BETWEEN_THREE_HOURS_AND_SIX_HOURS:
                return uk.org.siri.siri20.DelayBandEnumeration.BETWEEN_THREE_HOURS_AND_SIX_HOURS;
            case DELAY_BAND_ENUMERATION_DELAY_TWO_MINUTES:
                return uk.org.siri.siri20.DelayBandEnumeration.DELAY_TWO_MINUTES;
            case DELAY_BAND_ENUMERATION_LONGER_THAN_SIX_HOURS:
                return uk.org.siri.siri20.DelayBandEnumeration.LONGER_THAN_SIX_HOURS;
            case DELAY_BAND_ENUMERATION_NEGLIGIBLE:
                return uk.org.siri.siri20.DelayBandEnumeration.NEGLIGIBLE;
            case DELAY_BAND_ENUMERATION_UP_TO_EIGHT_MINUTES:
                return uk.org.siri.siri20.DelayBandEnumeration.UP_TO_EIGHT_MINUTES;
            case DELAY_BAND_ENUMERATION_UP_TO_FIVE_MINUTES:
                return uk.org.siri.siri20.DelayBandEnumeration.UP_TO_FIVE_MINUTES;
            case DELAY_BAND_ENUMERATION_UP_TO_FOUR_MINUTES:
                return uk.org.siri.siri20.DelayBandEnumeration.UP_TO_FOUR_MINUTES;
            case DELAY_BAND_ENUMERATION_UP_TO_TEN_MINUTES:
                return uk.org.siri.siri20.DelayBandEnumeration.UP_TO_TEN_MINUTES;
            case DELAY_BAND_ENUMERATION_UP_TO_THREE_MINUTES:
                return uk.org.siri.siri20.DelayBandEnumeration.UP_TO_THREE_MINUTES;
            default:
                return null;
        }
    }

    protected static DelaysTypeEnum map(eu.datex2.siri20.schema._2_0rc1._2_0.DelaysTypeEnum delayBand) {
        switch (delayBand) {
            case DELAYS:
                return DelaysTypeEnum.DELAYS_TYPE_ENUM_DELAYS;
            case DELAYS_OF_UNCERTAIN_DURATION:
                return DelaysTypeEnum.DELAYS_TYPE_ENUM_DELAYS_OF_UNCERTAIN_DURATION;
            case LONG_DELAYS:
                return DelaysTypeEnum.DELAYS_TYPE_ENUM_LONG_DELAYS;
            case VERY_LONG_DELAYS:
                return DelaysTypeEnum.DELAYS_TYPE_ENUM_VERY_LONG_DELAYS;
            default:
                return null;
        }
    }

    protected static eu.datex2.siri20.schema._2_0rc1._2_0.DelaysTypeEnum map(DelaysTypeEnum delayBand) {
        switch (delayBand) {
            case DELAYS_TYPE_ENUM_DELAYS:
                return eu.datex2.siri20.schema._2_0rc1._2_0.DelaysTypeEnum.DELAYS;
            case DELAYS_TYPE_ENUM_DELAYS_OF_UNCERTAIN_DURATION:
                return eu.datex2.siri20.schema._2_0rc1._2_0.DelaysTypeEnum.DELAYS_OF_UNCERTAIN_DURATION;
            case DELAYS_TYPE_ENUM_LONG_DELAYS:
                return eu.datex2.siri20.schema._2_0rc1._2_0.DelaysTypeEnum.LONG_DELAYS;
            case DELAYS_TYPE_ENUM_VERY_LONG_DELAYS:
                return eu.datex2.siri20.schema._2_0rc1._2_0.DelaysTypeEnum.VERY_LONG_DELAYS;
            default:
                return null;
        }
    }

    protected static TicketRestrictionEnumeration map(uk.org.siri.siri20.TicketRestrictionEnumeration delayBand) {
        switch (delayBand) {
            case ALL_TICKET_CLASSES_VALID:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_ALL_TICKET_CLASSES_VALID;
            case CERTAIN_TICKETS_ONLY:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_CERTAIN_TICKETS_ONLY;
            case FULL_FARE_ONLY:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_FULL_FARE_ONLY;
            case NO_OFF_PEAK_TICKETS:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_NO_OFF_PEAK_TICKETS;
            case NO_REDUCED_FARE_TICKETS:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_NO_REDUCED_FARE_TICKETS;
            case NO_RESTRICTIONS:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_NO_RESTRICTIONS;
            case NO_WEEKEND_RETURN_TICKETS:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_NO_WEEKEND_RETURN_TICKETS;
            case ONLY_TICKETS_OF_SPECIFIED_OPERATOR:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_ONLY_TICKETS_OF_SPECIFIED_OPERATOR;
            case SPECIAL_FARE:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_SPECIAL_FARE;
            case TICKET_WITH_RESERVATION:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_TICKET_WITH_RESERVATION;
            case UNKNOWN_TICKET_RESTRICTION:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_UNKNOWN_TICKET_RESTRICTION;
            case PTI_25_0:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_PTI25_0;
            case PTI_25_1:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_PTI25_1;
            case PTI_25_2:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_PTI25_2;
            case PTI_25_3:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_PTI25_3;
            case PTI_25_4:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_PTI25_4;
            case PTI_25_5:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_PTI25_5;
            case PTI_25_6:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_PTI25_6;
            case PTI_25_7:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_PTI25_7;
            case PTI_25_8:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_PTI25_8;
            case PTI_25_9:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_PTI25_9;
            case PTI_25_10:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_PTI25_10;
            case PTI_25_255:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_PTI25_255;
            case UNKNOWN:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_UNKNOWN;
            default:
                return TicketRestrictionEnumeration.TICKET_RESTRICTION_ENUMERATION_UNSPECIFIED;

        }
    }

    protected static uk.org.siri.siri20.TicketRestrictionEnumeration map(TicketRestrictionEnumeration delayBand) {
        switch (delayBand) {
            case TICKET_RESTRICTION_ENUMERATION_ALL_TICKET_CLASSES_VALID:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.ALL_TICKET_CLASSES_VALID;
            case TICKET_RESTRICTION_ENUMERATION_CERTAIN_TICKETS_ONLY:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.CERTAIN_TICKETS_ONLY;
            case TICKET_RESTRICTION_ENUMERATION_FULL_FARE_ONLY:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.FULL_FARE_ONLY;
            case TICKET_RESTRICTION_ENUMERATION_NO_OFF_PEAK_TICKETS:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.NO_OFF_PEAK_TICKETS;
            case TICKET_RESTRICTION_ENUMERATION_NO_REDUCED_FARE_TICKETS:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.NO_REDUCED_FARE_TICKETS;
            case TICKET_RESTRICTION_ENUMERATION_NO_RESTRICTIONS:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.NO_RESTRICTIONS;
            case TICKET_RESTRICTION_ENUMERATION_NO_WEEKEND_RETURN_TICKETS:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.NO_WEEKEND_RETURN_TICKETS;
            case TICKET_RESTRICTION_ENUMERATION_ONLY_TICKETS_OF_SPECIFIED_OPERATOR:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.ONLY_TICKETS_OF_SPECIFIED_OPERATOR;
            case TICKET_RESTRICTION_ENUMERATION_SPECIAL_FARE:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.SPECIAL_FARE;
            case TICKET_RESTRICTION_ENUMERATION_TICKET_WITH_RESERVATION:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.TICKET_WITH_RESERVATION;
            case TICKET_RESTRICTION_ENUMERATION_UNKNOWN_TICKET_RESTRICTION:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.UNKNOWN_TICKET_RESTRICTION;
            case TICKET_RESTRICTION_ENUMERATION_PTI25_0:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.PTI_25_0;
            case TICKET_RESTRICTION_ENUMERATION_PTI25_1:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.PTI_25_1;
            case TICKET_RESTRICTION_ENUMERATION_PTI25_2:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.PTI_25_2;
            case TICKET_RESTRICTION_ENUMERATION_PTI25_3:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.PTI_25_3;
            case TICKET_RESTRICTION_ENUMERATION_PTI25_4:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.PTI_25_4;
            case TICKET_RESTRICTION_ENUMERATION_PTI25_5:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.PTI_25_5;
            case TICKET_RESTRICTION_ENUMERATION_PTI25_6:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.PTI_25_6;
            case TICKET_RESTRICTION_ENUMERATION_PTI25_7:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.PTI_25_7;
            case TICKET_RESTRICTION_ENUMERATION_PTI25_8:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.PTI_25_8;
            case TICKET_RESTRICTION_ENUMERATION_PTI25_9:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.PTI_25_9;
            case TICKET_RESTRICTION_ENUMERATION_PTI25_10:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.PTI_25_10;
            case TICKET_RESTRICTION_ENUMERATION_PTI25_255:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.PTI_25_255;
            case TICKET_RESTRICTION_ENUMERATION_UNKNOWN:
                return uk.org.siri.siri20.TicketRestrictionEnumeration.UNKNOWN;
            default:
                return null;
        }
    }

    protected static RelatedToEnumeration map(uk.org.siri.siri20.RelatedToEnumeration relatedTo) {
        switch (relatedTo) {
            case ASSOCIATED:
                return RelatedToEnumeration.RELATED_TO_ENUMERATION_ASSOCIATED;
            case CAUSE:
                return RelatedToEnumeration.RELATED_TO_ENUMERATION_CAUSE;
            case EFFECT:
                return RelatedToEnumeration.RELATED_TO_ENUMERATION_EFFECT;
            case SUPERCEDED_BY:
                return RelatedToEnumeration.RELATED_TO_ENUMERATION_SUPERCEDED_BY;
            case SUPERCEDES:
                return RelatedToEnumeration.RELATED_TO_ENUMERATION_SUPERCEDES;
            case UPDATE:
                return RelatedToEnumeration.RELATED_TO_ENUMERATION_UPDATE;
            default:
                return null;
        }
    }

    protected static uk.org.siri.siri20.RelatedToEnumeration map(RelatedToEnumeration relatedTo) {
        switch (relatedTo) {
            case RELATED_TO_ENUMERATION_ASSOCIATED:
                return uk.org.siri.siri20.RelatedToEnumeration.ASSOCIATED;
            case RELATED_TO_ENUMERATION_CAUSE:
                return uk.org.siri.siri20.RelatedToEnumeration.CAUSE;
            case RELATED_TO_ENUMERATION_EFFECT:
                return uk.org.siri.siri20.RelatedToEnumeration.EFFECT;
            case RELATED_TO_ENUMERATION_SUPERCEDED_BY:
                return uk.org.siri.siri20.RelatedToEnumeration.SUPERCEDED_BY;
            case RELATED_TO_ENUMERATION_SUPERCEDES:
                return uk.org.siri.siri20.RelatedToEnumeration.SUPERCEDES;
            case RELATED_TO_ENUMERATION_UPDATE:
                return uk.org.siri.siri20.RelatedToEnumeration.UPDATE;
            default:
                return null;
        }
    }

    protected static ScopeTypeEnumeration map(uk.org.siri.siri20.ScopeTypeEnumeration scope) {
        switch (scope) {
            case ALL_PT:
                return ScopeTypeEnumeration.SCOPE_TYPE_ENUMERATION_ALL_P_T;
            case CONNECTION_LINK:
                return ScopeTypeEnumeration.SCOPE_TYPE_ENUMERATION_CONNECTION_LINK;
            case DATED_VEHICLE_JOURNEY:
                return ScopeTypeEnumeration.SCOPE_TYPE_ENUMERATION_DATED_VEHICLE_JOURNEY;
            case GENERAL:
                return ScopeTypeEnumeration.SCOPE_TYPE_ENUMERATION_GENERAL;
            case INTERCHANGE:
                return ScopeTypeEnumeration.SCOPE_TYPE_ENUMERATION_INTERCHANGE;
            case LINE:
                return ScopeTypeEnumeration.SCOPE_TYPE_ENUMERATION_LINE;
            case NETWORK:
                return ScopeTypeEnumeration.SCOPE_TYPE_ENUMERATION_NETWORK;
            case OPERATOR:
                return ScopeTypeEnumeration.SCOPE_TYPE_ENUMERATION_OPERATOR;
            case PLACE:
                return ScopeTypeEnumeration.SCOPE_TYPE_ENUMERATION_PLACE;
            case ROAD:
                return ScopeTypeEnumeration.SCOPE_TYPE_ENUMERATION_ROAD;
            case ROUTE:
                return ScopeTypeEnumeration.SCOPE_TYPE_ENUMERATION_ROUTE;
            case STOP_PLACE:
                return ScopeTypeEnumeration.SCOPE_TYPE_ENUMERATION_STOP_PLACE;
            case STOP_PLACE_COMPONENT:
                return ScopeTypeEnumeration.SCOPE_TYPE_ENUMERATION_STOP_PLACE_COMPONENT;
            case STOP_POINT:
                return ScopeTypeEnumeration.SCOPE_TYPE_ENUMERATION_STOP_POINT;
            case VEHICLE_JOURNEY:
                return ScopeTypeEnumeration.SCOPE_TYPE_ENUMERATION_VEHICLE_JOURNEY;
            default:
                return null;
        }
    }

    protected static uk.org.siri.siri20.ScopeTypeEnumeration map(ScopeTypeEnumeration scope) {
        switch (scope) {
            case SCOPE_TYPE_ENUMERATION_ALL_P_T:
                return uk.org.siri.siri20.ScopeTypeEnumeration.ALL_PT;
            case SCOPE_TYPE_ENUMERATION_CONNECTION_LINK:
                return uk.org.siri.siri20.ScopeTypeEnumeration.CONNECTION_LINK;
            case SCOPE_TYPE_ENUMERATION_DATED_VEHICLE_JOURNEY:
                return uk.org.siri.siri20.ScopeTypeEnumeration.DATED_VEHICLE_JOURNEY;
            case SCOPE_TYPE_ENUMERATION_GENERAL:
                return uk.org.siri.siri20.ScopeTypeEnumeration.GENERAL;
            case SCOPE_TYPE_ENUMERATION_INTERCHANGE:
                return uk.org.siri.siri20.ScopeTypeEnumeration.INTERCHANGE;
            case SCOPE_TYPE_ENUMERATION_LINE:
                return uk.org.siri.siri20.ScopeTypeEnumeration.LINE;
            case SCOPE_TYPE_ENUMERATION_NETWORK:
                return uk.org.siri.siri20.ScopeTypeEnumeration.NETWORK;
            case SCOPE_TYPE_ENUMERATION_OPERATOR:
                return uk.org.siri.siri20.ScopeTypeEnumeration.OPERATOR;
            case SCOPE_TYPE_ENUMERATION_PLACE:
                return uk.org.siri.siri20.ScopeTypeEnumeration.PLACE;
            case SCOPE_TYPE_ENUMERATION_ROAD:
                return uk.org.siri.siri20.ScopeTypeEnumeration.ROAD;
            case SCOPE_TYPE_ENUMERATION_ROUTE:
                return uk.org.siri.siri20.ScopeTypeEnumeration.ROUTE;
            case SCOPE_TYPE_ENUMERATION_STOP_PLACE:
                return uk.org.siri.siri20.ScopeTypeEnumeration.STOP_PLACE;
            case SCOPE_TYPE_ENUMERATION_STOP_PLACE_COMPONENT:
                return uk.org.siri.siri20.ScopeTypeEnumeration.STOP_PLACE_COMPONENT;
            case SCOPE_TYPE_ENUMERATION_STOP_POINT:
                return uk.org.siri.siri20.ScopeTypeEnumeration.STOP_POINT;
            case SCOPE_TYPE_ENUMERATION_VEHICLE_JOURNEY:
                return uk.org.siri.siri20.ScopeTypeEnumeration.VEHICLE_JOURNEY;
            default:
                return null;
        }
    }

    protected static StopPointTypeEnumeration map(uk.org.siri.siri20.StopPointTypeEnumeration stopPointType) {
        switch (stopPointType) {
            case BUS_STOP:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_BUS_STOP;
            case FERRY_BERTH:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_FERRY_BERTH;
            case HARBOUR_PIER:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_HARBOUR_PIER;
            case LANDING_STAGE:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_LANDING_STAGE;
            case PLATFORM_NUMBER:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_PLATFORM_NUMBER;
            case TERMINAL_GATE:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_TERMINAL_GATE;
            case UNDEFINED_BOOKING_INFORMATION:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_UNDEFINED_BOOKING_INFORMATION;
            case PTI_17_0:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_PTI17_0;
            case PTI_17_1:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_PTI17_1;
            case PTI_17_2:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_PTI17_2;
            case PTI_17_3:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_PTI17_3;
            case PTI_17_4:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_PTI17_4;
            case PTI_17_5:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_PTI17_5;
            case PTI_17_6:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_PTI17_6;
            case PTI_17_255:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_PTI17_255;
            case UNKNOWN:
                return StopPointTypeEnumeration.STOP_POINT_TYPE_ENUMERATION_UNKNOWN;
            default:
                return null;
        }
    }

    protected static uk.org.siri.siri20.StopPointTypeEnumeration map(StopPointTypeEnumeration relatedTo) {
        switch (relatedTo) {
            case STOP_POINT_TYPE_ENUMERATION_BUS_STOP:
                return uk.org.siri.siri20.StopPointTypeEnumeration.BUS_STOP;
            case STOP_POINT_TYPE_ENUMERATION_FERRY_BERTH:
                return uk.org.siri.siri20.StopPointTypeEnumeration.FERRY_BERTH;
            case STOP_POINT_TYPE_ENUMERATION_HARBOUR_PIER:
                return uk.org.siri.siri20.StopPointTypeEnumeration.HARBOUR_PIER;
            case STOP_POINT_TYPE_ENUMERATION_LANDING_STAGE:
                return uk.org.siri.siri20.StopPointTypeEnumeration.LANDING_STAGE;
            case STOP_POINT_TYPE_ENUMERATION_PLATFORM_NUMBER:
                return uk.org.siri.siri20.StopPointTypeEnumeration.PLATFORM_NUMBER;
            case STOP_POINT_TYPE_ENUMERATION_TERMINAL_GATE:
                return uk.org.siri.siri20.StopPointTypeEnumeration.TERMINAL_GATE;
            case STOP_POINT_TYPE_ENUMERATION_UNDEFINED_BOOKING_INFORMATION:
                return uk.org.siri.siri20.StopPointTypeEnumeration.UNDEFINED_BOOKING_INFORMATION;
            case STOP_POINT_TYPE_ENUMERATION_PTI17_0:
                return uk.org.siri.siri20.StopPointTypeEnumeration.PTI_17_0;
            case STOP_POINT_TYPE_ENUMERATION_PTI17_1:
                return uk.org.siri.siri20.StopPointTypeEnumeration.PTI_17_1;
            case STOP_POINT_TYPE_ENUMERATION_PTI17_2:
                return uk.org.siri.siri20.StopPointTypeEnumeration.PTI_17_2;
            case STOP_POINT_TYPE_ENUMERATION_PTI17_3:
                return uk.org.siri.siri20.StopPointTypeEnumeration.PTI_17_3;
            case STOP_POINT_TYPE_ENUMERATION_PTI17_4:
                return uk.org.siri.siri20.StopPointTypeEnumeration.PTI_17_4;
            case STOP_POINT_TYPE_ENUMERATION_PTI17_5:
                return uk.org.siri.siri20.StopPointTypeEnumeration.PTI_17_5;
            case STOP_POINT_TYPE_ENUMERATION_PTI17_6:
                return uk.org.siri.siri20.StopPointTypeEnumeration.PTI_17_6;
            case STOP_POINT_TYPE_ENUMERATION_PTI17_255:
                return uk.org.siri.siri20.StopPointTypeEnumeration.PTI_17_255;
            case STOP_POINT_TYPE_ENUMERATION_UNKNOWN:
                return uk.org.siri.siri20.StopPointTypeEnumeration.UNKNOWN;
            default:
                return null;
        }
    }
}

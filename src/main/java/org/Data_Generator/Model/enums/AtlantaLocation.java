package org.Data_Generator.Model.enums;



public enum AtlantaLocation {
    ATLANTA("Atlanta", 33.7490, -84.3880),
    WEST_MIDTOWN("West Midtown", 33.7860, -84.4112),
    MIDTOWN("Midtown", 33.7838, -84.3839),
    VIRGINIA_HIGHLANDS("Virginia Highlands", 33.7766, -84.3514),
    BUCKHEAD("Buckhead", 33.8485, -84.3733),
    UNDERGROUND_ATLANTA("Underground Atlanta", 33.7528, -84.3915),
    OLD_FOURTH_WARD("Old Fourth Ward", 33.7651, -84.3689),
    EAST_ATLANTA_VILLAGE("East Atlanta Village", 33.7416, -84.3406),
    INMAN_PARK("Inman Park", 33.7572, -84.3515),
    LITTLE_FIVE_POINTS("Little Five Points", 33.7655, -84.3492),
    EDGEWOOD("Edgewood", 33.7530, -84.3397),
    GRANT_PARK("Grant Park", 33.7361, -84.3717),
    CASTLEBERRY_HILL("Castleberry Hill", 33.7480, -84.4012),
    CABBAGETOWN("Cabbagetown", 33.7495, -84.3645),
    WEST_END("West End", 33.7405, -84.4170),
    DRUID_HILLS("Druid Hills", 33.7748, -84.3280),
    REYNOLDSTOWN("Reynoldstown", 33.7500, -84.3517),
    SUMMERHILL("Summerhill", 33.7356, -84.3840),
    PONCEY_HIGHLAND("Poncey-Highland", 33.7725, -84.3509),
    ATLANTIC_STATION("Atlantic Station", 33.7925, -84.3973);

    private final String displayName;
    private final double latitude;
    private final double longitude;

    AtlantaLocation(String displayName, double latitude, double longitude) {
        this.displayName = displayName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getDisplayName() {return displayName;}
    public double getLatitude() {return latitude;}
    public double getLongitude() {return longitude;}
}

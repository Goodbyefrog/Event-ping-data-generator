package org.Data_Generator.Model;

import org.Data_Generator.Model.enums.AtlantaLocation;

public class Location {

    private String userId;
    private AtlantaLocation Area;
    private String visitTimestamp;

    public Location(String userId, AtlantaLocation area, String visitTimestamp) {
        this.userId = userId;
        this.Area = area;
        this.visitTimestamp = visitTimestamp;
    }


    // Setters
    public void setUserId(String userId) {this.userId = userId;}
    public void setArea(AtlantaLocation area) {this.Area = area;}
    public void setVisitTimestamp(String visitTimestamp) {this.visitTimestamp = visitTimestamp;}


    //Getters
    public String getUserId() {return userId;}
    public AtlantaLocation getArea() {return Area;}
    public String getVisitTimestamp() {return visitTimestamp;}

    @Override
    public String toString() {
        return "Location{" +
                "userId='" + userId + '\'' +
                ", area=" + Area +
                ", latitude=" + Area.getLatitude() +
                ", longitude=" + Area.getLongitude() +
                ", visitTimestamp='" + visitTimestamp + '\'' +
                '}';
    }

}
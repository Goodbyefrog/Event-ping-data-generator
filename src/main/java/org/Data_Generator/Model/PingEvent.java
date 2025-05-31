package org.Data_Generator.Model;
import org.Data_Generator.Model.enums.AtlantaLocation;
import org.Data_Generator.Model.enums.Device_Enums.DeviceType;
import org.Data_Generator.Model.enums.EventType;
import  java.time.LocalDateTime;

public class PingEvent {

    private  User user;
    private Device device;
    private DeviceType Device_type;
    private AtlantaLocation location;
    private EventType eventType;
    private LocalDateTime TimeStamp;





    public PingEvent(User user, Device device, DeviceType Type, AtlantaLocation location, EventType eventType, LocalDateTime timestamp) {
        this.user = user;
        this.device = device;
        this.Device_type= Type;
        this.location =  location;
        this.eventType = eventType;
        this.TimeStamp = timestamp;
    }


    // Setters
    public void setUser(User user) {this.user = user;}
    public void setDevice(Device device) {this.device = device;}
    public void setLocation(AtlantaLocation location) {this.location = location;}
    public void setEventType(EventType eventType) {this.eventType = eventType;}
    public void setTimestamp(LocalDateTime timestamp) {this.TimeStamp = timestamp;}
//    End of setter Methods

    // Getters
    public User getUser() {return user;}
    public Device getDevice() {return device;}
    public AtlantaLocation getLocation() {return location;}
    public EventType getEventType() {return eventType;}
    public LocalDateTime getTimestamp() {return TimeStamp;}


    // End of getter methods

    // String representation
    @Override
    public String toString() {
        return "PingEvent{" +
                "user=" + user.getUsername() +
                ", userId=" + user.getUserId() +
                ", device=" + device.getDeviceType() + " (" + device.getModel() + ")" +
                ", location=" + location.getDisplayName() +
                ", lat=" + location.getLatitude() +
                ", lon=" + location.getLongitude() +
                ", eventType=" + eventType +
                ", timestamp=" + TimeStamp +
                '}';
    }

}



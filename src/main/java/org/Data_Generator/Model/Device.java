package org.Data_Generator.Model;
import org.Data_Generator.Model.enums.Device_Enums.DeviceType;
import org.Data_Generator.Model.enums.Device_Enums.Manufacturer;
import org.Data_Generator.Model.enums.Device_Enums.OperatingSystem;

import java.time.Instant;
import java.time.LocalDateTime;

public class Device {
    private String deviceId;
    private DeviceType deviceType;
    private OperatingSystem operatingSystem;
    private Manufacturer manufacturer;
    private String model;
    private LocalDateTime lastUsedTimestamp;



    public Device(String deviceId, DeviceType deviceType, OperatingSystem OS,
                  Manufacturer Company, String model, LocalDateTime lastUsedTimestamp) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.operatingSystem = OS;
        this.manufacturer = Company;
        this.model = model;
        this.lastUsedTimestamp = lastUsedTimestamp;
    }

    // Setters
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }
    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setLastUsedTimestamp(LocalDateTime lastUsedTimestamp) {
        this.lastUsedTimestamp = lastUsedTimestamp;
    }

    // Getters
    public String getDeviceId() {
        return deviceId;
    }
    public DeviceType getDeviceType() {
        return deviceType;
    }
    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }
    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }
    public LocalDateTime getLastUsedTimestamp() {
        return lastUsedTimestamp;
    }



    @Override
    public String toString() {
        return "Device{" +
                "deviceId='" + deviceId + '\'' +
                ", deviceType=" + deviceType +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", lastUsedTimestamp='" + lastUsedTimestamp + '\'' +
                '}';
    }

    public LocalDateTime getTimestamp() {
return lastUsedTimestamp;
    }

    public DeviceType getType() {
        return  deviceType;
    }
}

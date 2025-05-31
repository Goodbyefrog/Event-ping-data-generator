package org.Data_Generator.Generator;

import org.Data_Generator.Device.DeviceValidator;
import org.Data_Generator.Model.*;
import org.Data_Generator.User.UserValidator;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

public class PingEventValidator {

    private final UserValidator userValidator = new UserValidator();
    private final DeviceValidator deviceValidator = new DeviceValidator();

    public boolean isValid(PingEvent event) {
        if (event == null) return false;

        // Validate User object
        User user = event.getUser();
        if (user == null || !userValidator.isValid(user)) {
            return false;
        }

        // Validate Device object
        Device device = event.getDevice();
        if (device == null || !deviceValidator.isValid(device)) {
            return false;
        }

        // Validate Location - example: check non-null and valid enum
        if (event.getLocation() == null) {
            return false;
        }

        // Validate Event Type - example: check non-null
        if (event.getEventType() == null) {
            return false;
        }

        // Validate timestamp - assuming stored as String, parse to LocalDateTime
        String timestampStr = String.valueOf(event.getTimestamp());
        if (timestampStr == null || timestampStr.isEmpty()) {
            return false;
        }

        try {
            LocalDateTime.parse(timestampStr); // ISO_LOCAL_DATE_TIME format expected
        } catch (DateTimeParseException e) {
            return false;
        }

        return true; // All checks passed
    }
}

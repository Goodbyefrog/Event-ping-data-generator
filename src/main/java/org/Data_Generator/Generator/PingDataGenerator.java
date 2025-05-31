package org.Data_Generator.Generator;

import org.Data_Generator.Device.DeviceGeneration;
import org.Data_Generator.Device.RandomDevice;
import org.Data_Generator.Model.Device;
import org.Data_Generator.Model.PingEvent;
import org.Data_Generator.Model.User;
import org.Data_Generator.Model.enums.AtlantaLocation;
import org.Data_Generator.Model.enums.EventType;
import org.Data_Generator.User.UserGeneration;
import org.Data_Generator.User.RandomUser;

import java.time.LocalDateTime;
import java.util.*;

import static org.Data_Generator.Generator.PingDataGeneratorUtils.getRandomEnum;

public class PingDataGenerator {

    private static final EventType[] EVENT_TYPES = EventType.values();
    private static final AtlantaLocation[] LOCATIONS = AtlantaLocation.values();
    public static final Random RANDOM = new Random();

    private final PingEventValidator eventValidator = new PingEventValidator();

    // modular services
    private final UserGeneration userService = new RandomUser();
    private final DeviceGeneration deviceService = new RandomDevice();

    public List<PingEvent> generatePingEvents(int count) {
        List<PingEvent> events = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            PingEvent event = generateSinglePing();
            if (event != null && eventValidator.isValid(event)) {
                events.add(event);
            } else {
                System.out.println("Invalid PingEvent skipped: " + event);
            }
        }
        return events;
    }

    private PingEvent generateSinglePing() {
        User user = userService.generateUser();
        if (user == null) {
            System.err.println("Invalid user generated.");
            return null;
        }

        Device device = deviceService.generateDevice();
        if (device == null) {
            System.err.println("Invalid device generated.");
            return null;
        }

        EventType eventType = getRandomEnum(EVENT_TYPES);
        AtlantaLocation location = getRandomEnum(LOCATIONS);
        LocalDateTime timestamp = device.getTimestamp(); // reuse device's timestamp

        return new PingEvent(user, device, device.getType(), location, eventType, timestamp);
    }
}


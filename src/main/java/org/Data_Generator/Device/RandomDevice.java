package org.Data_Generator.Device;



import org.Data_Generator.Model.Device;
import org.Data_Generator.Model.enums.Device_Enums.DeviceType;
import org.Data_Generator.Model.enums.Device_Enums.Manufacturer;
import org.Data_Generator.Model.enums.Device_Enums.OperatingSystem;

import java.time.LocalDateTime;
import java.util.*;

import static org.Data_Generator.Generator.PingDataGenerator.RANDOM;

public class RandomDevice implements DeviceGeneration {

    private final DeviceValidator validator = new DeviceValidator();

    private static final Map<DeviceType, List<String>> DEVICE_MODELS = Map.of(
            DeviceType.MOBILE, List.of("iPhone 14", "Pixel 7", "Galaxy S23"),
            DeviceType.TABLET, List.of("iPad Pro", "Galaxy Tab S8"),
            DeviceType.LAPTOP, List.of("MacBook", "Dell XPS", "HP Envy"),
            DeviceType.DESKTOP, List.of("iMac", "Custom PC", "Dell OptiPlex"),
            DeviceType.WEARABLE, List.of("Apple Watch", "Fitbit", "Galaxy Watch")
    );

    @Override
    public Device generateDevice() {
        DeviceType type = getRandom(DeviceType.values());
        List<String> models = DEVICE_MODELS.getOrDefault(type, List.of("Unknown Model"));
        String model = models.get(RANDOM.nextInt(models.size()));
        OperatingSystem os = getRandom(OperatingSystem.values());
        Manufacturer manufacturer = getRandom(Manufacturer.values());
        String deviceId = "Device-" + UUID.randomUUID();
        LocalDateTime timestamp = getRandomTimestamp(30);

        Device device = new Device(deviceId, type, os, manufacturer, model, timestamp);
        return validator.isValid(device) ? device : null;
    }

    private <T> T getRandom(T[] array) {
        return array[RANDOM.nextInt(array.length)];
    }

    private LocalDateTime getRandomTimestamp(int daysBack) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime start = now.minusDays(daysBack);
        long startEpoch = start.toEpochSecond(java.time.ZoneOffset.UTC);
        long endEpoch = now.toEpochSecond(java.time.ZoneOffset.UTC);
        long randomEpoch = startEpoch + RANDOM.nextLong(endEpoch - startEpoch + 1);
        return LocalDateTime.ofEpochSecond(randomEpoch, 0, java.time.ZoneOffset.UTC);
    }
}

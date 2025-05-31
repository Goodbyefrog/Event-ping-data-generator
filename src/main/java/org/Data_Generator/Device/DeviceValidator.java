package org.Data_Generator.Device;
import org.Data_Generator.Model.Device;

public class DeviceValidator {

    public static boolean isValid(Device device) {
        return device != null &&
                isTypeValid(device) &&
                isModelValid(device);
    }

    private static boolean isTypeValid(Device device) {
        return device.getDeviceType() != null;
    }

    private static boolean isModelValid(Device device) {
        String model = device.getModel();
        return model != null && !model.trim().isEmpty();
    }
}

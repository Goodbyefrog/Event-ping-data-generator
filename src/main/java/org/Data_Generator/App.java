package org.Data_Generator;

import org.Data_Generator.Generator.PingDataGenerator;
import org.Data_Generator.Model.PingEvent;

import java.util.List;

public class App {
    public static void main(String[] args) {
        PingDataGenerator generator = new PingDataGenerator();

        // Generate 10 PingEvents (you can change the count)
        List<PingEvent> events = generator.generatePingEvents(10);

        // Print the generated events
        for (PingEvent event : events) {
            System.out.println(event);
        }

        System.out.println();
        System.out.println(events.get(0).getUser().getEmail());
    }
}

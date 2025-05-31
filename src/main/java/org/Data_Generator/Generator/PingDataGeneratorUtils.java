package org.Data_Generator.Generator;



import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PingDataGeneratorUtils {
    private static final Random RANDOM = new Random();

    /**
     * Returns a random element from the given enum values.
     */
    public static <T> T getRandomEnum(T[] values) {
        return values[RANDOM.nextInt(values.length)];
    }

    /**
     * Returns a random element from a List.
     */
    public static <T> T getRandomFromList(List<T> list) {
        return list.get(RANDOM.nextInt(list.size()));
    }

    /**
     * Returns a random integer between min (inclusive) and max (exclusive).
     */
    public static int getRandomInt(int min, int max) {
        return RANDOM.nextInt(max - min) + min;
    }

    /**
     * Returns a random LocalDateTime within the last X days.
     */
    public static LocalDateTime getRandomTimestamp(int daysBack) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime start = now.minusDays(daysBack);

        long startEpoch = start.toEpochSecond(java.time.ZoneOffset.UTC);
        long endEpoch = now.toEpochSecond(java.time.ZoneOffset.UTC);
        long randomEpoch = startEpoch + (long) (RANDOM.nextDouble() * (endEpoch - startEpoch));

        return LocalDateTime.ofEpochSecond(randomEpoch, 0, java.time.ZoneOffset.UTC);
    }

    public static final List<String> EMAIL_DOMAINS = Arrays.asList(
            "example.com", "testmail.com", "mailinator.com", "fakemail.org", "webmail.net"
    );
}

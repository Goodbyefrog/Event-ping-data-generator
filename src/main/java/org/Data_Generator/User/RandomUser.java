package org.Data_Generator.User;


import org.Data_Generator.Model.User;
import org.Data_Generator.Model.enums.User_Enums.Gender;
import org.Data_Generator.Model.enums.User_Enums.Language;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static org.Data_Generator.Generator.PingDataGenerator.RANDOM;
import static org.Data_Generator.Generator.PingDataGeneratorUtils.EMAIL_DOMAINS;

public class RandomUser implements UserGeneration {

    private final UserValidator userValidator = new UserValidator();

    @Override
    public User generateUser() {
        List<String> USERNAMES = Arrays.asList(
                "TrinixX", "Justin234", "Mike234", "AriWave", "NovaPulse",
                "NeoVibe", "ZayDash", "EchoKnight", "LunaWraith", "SkyZephyr",
                "RogueAura", "KodaFlux", "VibeShift", "NoxMuse", "JetPixel",
                "LexNova", "WaveCrest", "AshZen", "BlazeRio", "TyroSpark"
        );

        Collections.shuffle(USERNAMES);
        String username = USERNAMES.get(0);

        int age = ThreadLocalRandom.current().nextInt(18, 81);
        String email = generateRandomEmail(username);
        Gender gender = getRandom(Gender.values());
        Language language = getRandom(Language.values());
        LocalDate registrationDate = getRandomTimestamp(60).toLocalDate();

        User user = new User(username, age, email, gender, language, registrationDate);
        return userValidator.isValid(user) ? user : null;
    }

    private <T> T getRandom(T[] array) {
        return array[RANDOM.nextInt(array.length)];
    }

    private String generateRandomEmail(String username) {
        String domain = EMAIL_DOMAINS.get(RANDOM.nextInt(EMAIL_DOMAINS.size()));
        return username.toLowerCase() + RANDOM.nextInt(1000) + "@" + domain;
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

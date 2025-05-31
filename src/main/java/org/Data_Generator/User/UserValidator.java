package org.Data_Generator.User;



import org.Data_Generator.Model.enums.User_Enums.*;
import org.Data_Generator.Model.User;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class UserValidator {

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
    );

    public static boolean isValid(User user) {
        return user != null &&
                isUserIdValid(user.getUserId()) &&
                isUsernameValid(user.getUsername()) &&
                isAgeValid(user.getAge()) &&
                isEmailValid(user.getEmail()) &&
                isGenderValid(user.getGender()) &&
                isPreferredLanguageValid(user.getPreferredLanguage()) &&
                isRegistrationDateValid(user.getRegistrationDate());
    }

    private static boolean isUserIdValid(String userId) {
        return userId != null && !userId.trim().isEmpty();
    }

    private static boolean isUsernameValid(String username) {
        return username != null && !username.trim().isEmpty();
    }

    private static boolean isAgeValid(int age) {
        return age >= 0 && age <= 120;  // Adjust max age as needed
    }

    private static boolean isEmailValid(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }

    private static boolean isGenderValid(Gender gender) {
        return gender != null;
    }

    private static boolean isPreferredLanguageValid(Language language) {
        return language != null;
    }

    private static boolean isRegistrationDateValid(LocalDate date) {
        return date != null && !date.isAfter(LocalDate.now());
    }
}

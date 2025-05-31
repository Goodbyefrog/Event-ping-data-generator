package org.Data_Generator.Model;

import org.Data_Generator.Model.enums.User_Enums.Gender;
import org.Data_Generator.Model.enums.User_Enums.Language;

import java.time.LocalDate;
import java.util.UUID;

public class User {

        private String userId;
        private String username;
        private int age;
        private String email;
        private Gender gender;
        private Language preferredLanguage;
        private LocalDate registrationDate;

        public User(String userId, String username){


        }

        public User(String username, int age, String email, Gender gender, Language preferredLanguage, LocalDate registrationDate) {
                this.userId = UUID.randomUUID().toString(); // auto-generate Unique user ID
                this.username = username;
                this.age = age;
                this.email = email;
                this.gender = gender;
                this.preferredLanguage = preferredLanguage;
                this.registrationDate = registrationDate;
        }


        // Setter Methods
        public void setUserId(String userId) {this.userId = userId;}
        public void setUsername(String username) {this.username = username;}
        public void setAge(int age) {this.age = age;}
        public void setEmail(String email) {this.email = email;}
        public void setGender(Gender gender) {this.gender = gender;}
        public void setPreferredLanguage(Language preferredLanguage) {this.preferredLanguage = preferredLanguage;}
        public void setRegistrationDate(LocalDate registrationDate) {this.registrationDate = registrationDate;}


        // Getters
        public String getUserId() {return userId;}
        public String getUsername() {return username;}
        public int getAge() {return age;}
        public String getEmail() {return email;}
        public Gender getGender() {return gender;}
        public Language getPreferredLanguage() {return preferredLanguage;}
        public LocalDate getRegistrationDate() {return registrationDate;}

        @Override
        public String toString() {
                return "User{" +
                        "userId='" + userId + '\'' +
                        ", username='" + username + '\'' +
                        ", age=" + age +
                        ", email='" + email + '\'' +
                        ", gender=" + gender +
                        ", preferredLanguage=" + preferredLanguage +
                        ", registrationDate=" + registrationDate +
                        '}';
        }
}

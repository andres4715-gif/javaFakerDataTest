package org.javaFaker.test.builderLombok.completeExample;

import lombok.Getter;

@Getter
public class UserDTO {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phoneNumber;
    private final String birthday;
    private final String gender;
    private final String civilState;

    public UserDTO(String firstName, String lastName, String email, String phoneNumber, String birthday, String gender, String civilState, String name) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.gender = gender;
        this.civilState = civilState;
    }
    public UserDTO(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.birthday = builder.birthday;
        this.gender = builder.gender;
        this.civilState = builder.civilState;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String birthday;
        private String gender;
        private String civilState;

        public UserDTO.Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTO.Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDTO.Builder email(String email) {
            this.email = email;
            return this;
        }

        public UserDTO.Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserDTO.Builder birthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        public UserDTO.Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public UserDTO.Builder civilState(String civilState) {
            this.civilState = civilState;
            return this;
        }

        public UserDTO build() {
            if(firstName == "Andres") {
                firstName = "Andres2";
            }
            return new UserDTO(this);

        }
    }
}



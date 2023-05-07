package org.javaFaker.test.builderLombok.lombokExample;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserLombok {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phoneNumber;
    private final String birthday;
    private final String gender;
    private final String civilState;
}

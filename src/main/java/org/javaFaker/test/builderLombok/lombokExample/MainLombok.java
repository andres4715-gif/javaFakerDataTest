package org.javaFaker.test.builderLombok.lombokExample;

public class MainLombok {
    public static void main(String[] args) {
        UserLombok userLombok = UserLombok.builder()
                .firstName("Carlos")
                .lastName("Rios")
                .email("andres4715@gmail.com")
                .phoneNumber("3017678798")
                .birthday("jun")
                .gender("M")
                .civilState("Single")
                .build();
        System.out.println(userLombok.getEmail());
    }
}

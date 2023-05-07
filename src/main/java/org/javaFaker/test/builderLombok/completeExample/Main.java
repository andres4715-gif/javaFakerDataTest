package org.javaFaker.test.builderLombok.completeExample;

public class Main {
    public static void main(String[] args) {
        UserDTO user1 = new UserDTO.Builder()
                .firstName("Andres")
                .lastName("Rios")
                .email("andres4715@gmail.com")
                .phoneNumber("3017678798")
                .birthday("jun")
                .gender("M")
                .civilState("Single")
                .build();
        System.out.println(user1.getFirstName());
    }
}

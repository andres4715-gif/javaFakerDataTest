package org.javaFaker.test.builderLombok.sampleExample;

public class main {

    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Person person1 = Person.builder()
                .name("Juan")
                .age(56)
                .address("Aguacatala")
                .build();
        int age = person1.getAge();
        System.out.println(age);
    }
}

package org.javaFaker.test.builderLombok.builderInConstructorLombok;

public class MainPersonLombok {

    public static void main(String[] args) {
        Person p1 = Person.builder()
                .name("Steve")
                .age(78)
                .build();

        System.out.println(p1.name + " " + p1.age);
    }
}

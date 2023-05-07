package org.javaFaker.test.builderLombok.returingNewInstance;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Contractor {
    String name;
    int age;
    boolean isActive;
    String role;

    public Contractor(String name, int age, boolean isActive, String role) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
        this.role = role;
    }

    @Builder
    public static Contractor createInstance(String name, int age) {
        return new Contractor(name, age, true, "Engineer");
    }
}

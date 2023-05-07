package org.javaFaker.test.builderLombok.sampleExample;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Person {
    private String name;
    private int age;
    private String address;
}

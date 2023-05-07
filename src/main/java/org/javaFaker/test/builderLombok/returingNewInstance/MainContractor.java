package org.javaFaker.test.builderLombok.returingNewInstance;

import org.testng.annotations.Test;

public class MainContractor {

    @Test
    public void testScenario() {
        Contractor c1 = Contractor.builder()
                .name("lisa")
                .age(56).build();

        System.out.println(
                c1.getName() +
                        " " + c1.getAge() +
                        " " + c1.isActive +
                        " " + c1.getRole());
    }
}

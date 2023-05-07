package org.javaFaker.test.apachePoi;

import com.github.javafaker.Faker;
import com.github.javafaker.service.RandomService;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

import static java.lang.String.format;
import static java.time.LocalTime.now;
import static java.time.LocalTime.ofInstant;
import static java.time.Period.between;
import static java.time.ZoneId.systemDefault;
import static java.util.stream.Collectors.toList;

@UtilityClass
public class DataFakes {
    public static List<Employee> getSetOfFakeDataOf(int size) {
        var faker = Faker.instance(Locale.forLanguageTag("es"));
        var random = faker.random();
        return IntStream.range(0, size)
                .mapToObj(num->getFakeEmployee(faker, random))
                .collect(toList());
    }

    private static Employee getFakeEmployee(Faker faker, RandomService randomService) {
        var nameComplete = faker.name();
        var zone = systemDefault();
        var randomDate = ofInstant(faker.date().birthday().toInstant(), zone);

        return Employee.of()
                .name(nameComplete.firstName())
                .surnames(format("%s %s", nameComplete.lastName(), nameComplete.lastName()))
                .birthdate(LocalDate.from(randomDate))
                .age(between(randomDate,now()).getYears())
                .category(faker.job().position())
                .employeeNumber(randomService.nextInt(100, 10000))
                .NIF(faker.bothify("###########?", true))
                .construct();
    }
}

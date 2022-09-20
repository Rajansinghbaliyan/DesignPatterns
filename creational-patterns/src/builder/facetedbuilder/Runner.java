package builder.facetedbuilder;

import builder.facetedbuilder.builder.PersonBuilder;
import builder.facetedbuilder.io.Person;

public class Runner {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder
                .info()
                .firstName("James")
                .lastName("Potter")
                .email("jamespotter@gmail.com")
                .lives()
                .at("1121 black street")
                .in("London")
                .withPostcode("201010")
                .works()
                .worksAt("Google")
                .asA("Developer")
                .earning(1000000);

        Person person = personBuilder.build();
        System.out.println(person);
    }
}

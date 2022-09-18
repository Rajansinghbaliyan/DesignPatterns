package builder.fluentbuilder;

import builder.fluentbuilder.io.Person;
import builder.fluentbuilder.io.builder.EmployeeBuilder;
import builder.fluentbuilder.io.builder.PersonBuilder;

public class Runner {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        Person james = personBuilder.withName("James").build();

        System.out.println(james);

        EmployeeBuilder employeeBuilder = new EmployeeBuilder();

        Person harry = employeeBuilder
                .withName("Harry")
                .withPosition("wizard")
                .build();

        System.out.println(harry);

    }
}

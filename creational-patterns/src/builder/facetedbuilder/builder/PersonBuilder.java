package builder.facetedbuilder.builder;

import builder.facetedbuilder.io.Person;

public class PersonBuilder {
    protected Person person = new Person();

    public PersonInfoBuilder info(){
        return new PersonInfoBuilder(person);
    }

    public PersonAddressBuilder lives(){
        return new PersonAddressBuilder(person);
    }

    public FinanceInfoBuilder works(){
        return new FinanceInfoBuilder(person);
    }

    public Person build(){
        return person;
    }
}

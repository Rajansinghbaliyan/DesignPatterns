package builder.facetedbuilder.builder;

import builder.facetedbuilder.io.Person;

public class PersonInfoBuilder extends PersonBuilder{
    public PersonInfoBuilder(Person person){
        this.person = person;
    }

    public PersonInfoBuilder firstName(String firstName){
        this.person.firstName = firstName;
        return this;
    }

    public PersonInfoBuilder lastName(String lastName){
        this.person.lastName = lastName;
        return this;
    }

    public PersonInfoBuilder email(String email){
        this.person.email = email;
        return this;
    }
}

package builder.facetedbuilder.builder;

import builder.facetedbuilder.io.Person;

public class PersonAddressBuilder extends PersonBuilder {
    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder at(String streetAddress) {
        this.person.streetName = streetAddress;
        return this;
    }

    public PersonAddressBuilder in(String city) {
        this.person.city = city;
        return this;
    }

    public PersonAddressBuilder withPostcode(String postcode) {
        this.person.postcode = postcode;
        return this;
    }
}

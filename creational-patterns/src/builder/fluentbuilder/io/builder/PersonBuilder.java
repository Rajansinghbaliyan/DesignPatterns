package builder.fluentbuilder.io.builder;

import builder.fluentbuilder.io.Person;

public class PersonBuilder <SELF extends PersonBuilder<SELF>>{
    protected Person person = new Person();

    public SELF withName(String name){
        person.setName(name);
        return self();
    }

    protected SELF self(){
        System.out.println("Inside the self of parent");
        return (SELF) this;
    }

    public Person build(){
        return person;
    }
}

package builder.facetedbuilder.io;

public class Person {
    // personal info
    public String firstName, lastName, email;

    // address info
    public String streetName, city, postcode;

    // finance info
    public String companyName, designation;
    public int annualIncome;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", postcode='" + postcode + '\'' +
                ", companyName='" + companyName + '\'' +
                ", designation='" + designation + '\'' +
                ", annualIncome=" + annualIncome +
                '}';
    }
}

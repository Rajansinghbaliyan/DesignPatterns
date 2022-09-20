package builder.facetedbuilder.builder;

import builder.facetedbuilder.io.Person;

public class FinanceInfoBuilder extends PersonBuilder {
    public FinanceInfoBuilder(Person person){
        this.person = person;
    }

    public FinanceInfoBuilder worksAt(String companyName){
        this.person.companyName = companyName;
        return this;
    }

    public FinanceInfoBuilder asA(String designation){
        this.person.designation = designation;
        return this;
    }

    public  FinanceInfoBuilder earning(int annualIncome){
        this.person.annualIncome = annualIncome;
        return this;
    }
}

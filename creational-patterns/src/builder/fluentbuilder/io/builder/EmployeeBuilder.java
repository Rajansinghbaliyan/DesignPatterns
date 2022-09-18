package builder.fluentbuilder.io.builder;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder>{
    public EmployeeBuilder withPosition(String position){
        person.setPosition(position);
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}

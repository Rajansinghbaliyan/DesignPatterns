package builder.fluentbuilder.io;

public class Person {
    private String name, position;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public Person setPosition(String position) {
        this.position = position;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

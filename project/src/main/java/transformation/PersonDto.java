package transformation;

public class PersonDto {

    private String name;
    private String lastName;

    public PersonDto(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public PersonDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "PersonDto{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


}

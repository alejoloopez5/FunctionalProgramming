package transformation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TransformationMap {

    static Person person = new Person();

    public static void main(String[] args) {
        fillPerson();
        List<Person> people = new ArrayList<>();
        people.add(person);
        List<PersonDto> dtos = people.stream()
                .map(p -> new PersonDto(p.getName(), p.getLastName())).collect(Collectors.toList());
        dtos.forEach(System.out::println);
    }

    private static void fillPerson(){
        person.setName("Manu");
        person.setLastName("Lopez");
        person.setPhone("311");
        person.setEmail("alejo@gmail.com");
    }
}

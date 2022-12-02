import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> Persons = new ArrayList<>();
        Persons.add(new Person("Gaius Julius ", "Caligula", 55));
        Persons.add(new Person("Claudius", "Ptolemy", 30));
        Persons.add(new Person("Julius", "Gaius", 50));
        Persons.add(new Person("Lucius", "Nero", 20));
        Persons.add(new Person("Marcus", "Aurelius", 30));

        System.out.println(Persons);

        Collections.sort(Persons, new PersonComparator());
        for (Person Person : Persons)
        {
            System.out.println(Person);
        }
    }
}



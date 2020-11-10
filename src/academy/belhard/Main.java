package academy.belhard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Address address1 = new Address("Los Angeles", "Beverly hills", 90210);
        Person person1=new Person("Brad", "Pitt", address1);

        Address address2 = new Address("Washington", "Pennsylvania Avenue", 1600);
        Person person2=new Person("Donald", "Trump", address2);

        Address address3 = new Address("Palo Alto", "Deer Creek Road", 3500);
        Person person3=new Person("Elon", "Musk", address3);

        Address address4 = new Address("Минск", "Строителей", 5);
        Person person4=new Person(null, "Сидоров", address4);

        Address address5 = new Address("Минск", "Центральная", 77);
        Person person5=new Person("Василий", null, address5);

        Person person6=new Person("Иван", "Иванов", null);


        List<Person> personsList = new ArrayList<>();
        personsList.add(person1);
        personsList.add(person2);
        personsList.add(person3);
        personsList.add(person4);
        personsList.add(person5);
        personsList.add(person6);

        List<String> result= personsList
            .stream()
            .filter(x -> x.getFirstName() != null && x.getLastName() != null && x.getAddress()!=null )
            .sorted(Comparator.comparingInt(x -> (x.getAddress().getNumberOfHouse())))
            .map(x -> x.toString())
            .collect(Collectors.toList());

        for (String person : result) {
            System.out.println(person);
        }

    }


}

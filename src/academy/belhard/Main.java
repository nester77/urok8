package academy.belhard;

import java.util.ArrayList;
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
            .sorted( (x1, x2) -> (x1.getAddress().getNumberOfHouse()).compareTo(x2.getAddress().getNumberOfHouse()))
            .map(x -> x.toString())
            .collect(Collectors.toList());

        for (String person : result) {
            System.out.println(person);
        }

    }
//

}


//    Создайте новый проект, залинкуйте его с удаленным репозиторием на GitHub, добавьте файл .gitignore и сделайте коммит (без .gitignore домашка не принимается)
//        Создайте класс Address с тремя полями: город, улица и номер дома (числом). Все поля должны быть с модификатором private. Инициализация полей только в
//        конструкторе. Создайте геттеры для каждого поля - если не помните, что такое геттеры :)
//        Создайте класс Person с тремя полями: имя, фамилия и адрес. Поле адрес должно быть типа Address, которое создали в пункте 1. Инициализация полей
//        только в конструкторе. Создайте геттеры для каждого поля. Переопределите метод toString()
//        Для демонстрации работы приложения создайте:
//        3 полностью заполненных экземпляра класса Person
//        1 экземпляр класса Person с именем = null
//        1 экземпляр класса Person с фамилией = null
//        1 экземпляр класса Person с адресом = null
//        Сложите полученных 6 экземпляров в коллекцию List
//        Коллекцию из пункта 5 с помощью Stream API:
//        отфильтруйте на предмет того, что ни одно из полей класса Person не равно null
//        отсортируйте коллекцию экземпляров класса Person по возрастанию по полю “номер дома”
//        преобразуйте каждый объект в строку (с помощью метода toString())
//        сформируйте результирующую коллекцию
//        Залить код в репозиторий и отправить ссылку на репозиторий преподавателю

package academy.belhard;

public class Person {
private String firstName;
private String lastName;
private Address address;

public Person (String firstName, String lastName, Address address) {
    this.firstName=firstName;
    this.lastName=lastName;
    this.address=address;
}
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }


    @Override
    public String toString() {

        return "Person {Имя: "+ firstName+", Фамилия: "+ lastName + ", Адрес: "+address + "}";
    }

}



    //Создайте класс Person с тремя полями: имя, фамилия и адрес. Поле адрес должно быть типа Address, которое создали в пункте 1. Инициализация полей
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
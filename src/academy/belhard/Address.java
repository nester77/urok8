package academy.belhard;

class Address {
    private String city;
    private String street;
    private int numberOfHouse;

    public Address (String city, String street, int numberOfHouse) {
        this.city=city;
        this.street=street;
        this.numberOfHouse=numberOfHouse;
    }


    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    @Override
    public String toString() {

        return "Город: "+ city+", Улица: "+ street + ", Номер дома: "+numberOfHouse;
    }


}



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
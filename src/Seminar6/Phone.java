package Seminar6;

// 1. Создайте класс Phone, который содержит переменные number, model и weight.
// 2. Создайте три экземпляра этого класса.
// 3. Выведите на консоль значения их переменных.
// 4. Добавить в класс Phone методы:
//    receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
//    getNumber – возвращает номер телефона.
//    Вызвать эти методы для каждого из объектов.
// 5. Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса -
//    number, model и weight.
// 6. Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса -
//    number, model.
// 8. Добавить конструктор без параметров.
// 9. Вызвать из конструктора с тремя параметрами конструктор с двумя.
// 10. Добавьте перегруженный метод receiveCall, который принимает два параметра -
//     имя звонящего и номер телефона звонящего.
//     Вызвать этот метод.
// 11. Создать метод sendMessage с аргументами переменной длины.
//     Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
//     Метод выводит на консоль номера этих телефонов.

public class Phone {
    String number;
    String model;
    Integer weight;

    public Phone(String number, String model, int weight) {
//        this.number = number;
//        this.model = model;
        this(number, model);  // this() - вызов конструктора внутри конструктора
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + ", номер: " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Отправка сообщений с номера: " + number);
        for (String number : numbers) {
            System.out.println("Номер для отправки: " + number);
        }
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("100", "Sumsung", 250);
        Phone phone2 = new Phone("200", "Nokia", 200);
        Phone phone3 = new Phone("300", "LG", 300);
        Phone phone4 = new Phone("400", "Huawei");
        Phone phone5 = new Phone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone4);
        System.out.println(phone5);

        phone1.receiveCall("Tom");
        phone2.receiveCall("John", "600");

        System.out.println(phone1.getNumber());

        phone3.sendMessage("1245");
        phone4.sendMessage("126", "863");

        String[] phones = {"456", "958", "673"};
        phone2.sendMessage(phones);
    }
}

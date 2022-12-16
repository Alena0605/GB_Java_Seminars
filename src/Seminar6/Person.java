package Seminar6;

public class Person {
    // поля
    String name;
    int age;

    // конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    // функции экземпляра
    @Override
    public String toString() {
        return "Person { " +
                "name: " + name + ", " +
                "age: " + age + " }";
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Alena";
        p1.age = 27;
        System.out.println(p1);

        Person p2 = new Person("Some", 20);
        System.out.println(p2);
        p2.setName("Max");
        System.out.println(p2);
    }
}

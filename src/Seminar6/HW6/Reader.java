package Seminar6.HW6;

public class Reader {
    String name;
    String surname;
    String patronymic;
    Integer libraryCard;
    String faculty;
    String birthday;
    String phone;

    public Reader(String name, String surname, String patronymic, Integer libraryCard, String faculty,
                  String birthday, String phone) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", libraryCard=" + libraryCard +
                ", faculty='" + faculty + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void takeBook() {
        System.out.println(surname + " " + name + " взял(а) книг(и).");
    }

    public void takeBook(int count) {
        System.out.println(surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) +
                ". взял(а) " + count + " книг(и).");
    }

    public void takeBook(String... books) {
        System.out.print(surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) +
                ". взял(а) " + "книг(и): ");

        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i] + ", ");
        }

        System.out.println(books[books.length - 1] + ".");
    }

    public void takeBook(Book... books) {
        System.out.print(surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) +
                ". взял(а) " + "книг(и): ");

        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i].getName() + " (" + books[i].getAuthor() + ")" + ", ");
        }

        System.out.println(books[books.length - 1].getName() + " (" + books[books.length - 1].getAuthor() + ")" + ".");
    }

    public void returnBook() {
        System.out.println(surname + " " + name + " вернул(а) книг(и).");
    }

    public void returnBook(int count) {
        System.out.println(surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) +
                ". вернул(а) " + count + " книг(и).");
    }

    public void returnBook(String... books) {
        System.out.print(surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) +
                ". вернул(а) " + "книг(и): ");

        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i] + ", ");
        }

        System.out.println(books[books.length - 1] + ".");
    }

    public void returnBook(Book... books) {
        System.out.print(surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) +
                ". вернул(а) " + "книг(и): ");

        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i].getName() + " (" + books[i].getAuthor() + ")" + ", ");
        }

        System.out.println(books[books.length - 1].getName() + " (" + books[books.length - 1].getAuthor() + ")" + ".");
    }
}

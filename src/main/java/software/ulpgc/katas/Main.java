package software.ulpgc.katas;


import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Person person = new Person("Alvaro", LocalDate.of(2004, 7, 2));
        System.out.println(person.getAge());
    }
}
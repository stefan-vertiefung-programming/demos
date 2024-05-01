package at.ac.univie.vp.vo1.vererbung.einfuehrung.loesung;

import at.ac.univie.vp.vo1.vererbung.einfuehrung.loesung.model.Person;
import at.ac.univie.vp.vo1.vererbung.einfuehrung.loesung.model.Professor;
import at.ac.univie.vp.vo1.vererbung.einfuehrung.loesung.model.Student;

public class MainEinfuehrungLoesung {

    public static void main(String[] args) {
        Professor professor1 = new Professor(
                "Barbara Liskov",
                "Programmiersprachen"
        );

        // Jeder Professor ist auch eine Person
        // ABER damit sind nur mehr die Attribute/Methoden von Person sichtbar
        Person professor2 = new Professor(
                "Douglas Engelbart",
                "Human Computer Interaction"
        );

        Student student1 = new Student(
                "Jane Doe",
                "0202020"
        );
        Person student2 = new Student(
                "Erika Mustermann",
                "1212121"
        );

        System.out.println();
        System.out.println(professor1.greets(student1));
        System.out.println(professor2.greets(professor1));
        System.out.println();
        System.out.println(student1.greets(professor1));
        System.out.println(student2.greets(student1));

        System.out.println();
        printName(student1);
        printName(professor1);
    }

    // Methode muss nicht mehr dupliziert werden
    // Diese Methode akzeptiert Person, Student und Professor
    public static void printName(Person person) {
        System.out.println("Name: " + person.getName());
    }
}

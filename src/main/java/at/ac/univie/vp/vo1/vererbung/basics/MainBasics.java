package at.ac.univie.vp.vo1.vererbung.basics;

import at.ac.univie.vp.vo1.vererbung.basics.model.Person;
import at.ac.univie.vp.vo1.vererbung.basics.model.Professor;
import at.ac.univie.vp.vo1.vererbung.basics.model.Student;

public class MainBasics {

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
                "Jane Doe",
                "0202020"
        );

        System.out.println();
        System.out.println(professor1.greets(student1));
        System.out.println(professor2.greets(professor1));
        System.out.println();
        System.out.println(student1.greets(professor1));
        System.out.println(student2.greets(student1));

        System.out.println();
        System.out.println(professor1.specialGreets(professor1));
        // System.out.println(professor1.specialGreets(professor2)); // Ist nicht gültig, da professor2 "nur" Typ Person hat, specialGreets erfordert Typ Professor
        // System.out.println(professor2.getResearchFocus()); // Ist nicht gültig, da professor2 "nur" Typ Person hat

        System.out.println();
        printName(professor1);
        printName(student1);
    }

    private static void printName(Person person) {
        System.out.println("Name: " + person.getName());
    }
}

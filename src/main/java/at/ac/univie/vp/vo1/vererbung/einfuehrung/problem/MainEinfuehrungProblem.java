package at.ac.univie.vp.vo1.vererbung.einfuehrung.problem; // Die Klasse liegt in diesem Package

import at.ac.univie.vp.vo1.vererbung.einfuehrung.problem.model.Professor;  // Diese Klasse verwendet Professor aus einem anderen Package
import at.ac.univie.vp.vo1.vererbung.einfuehrung.problem.model.Student;

public class MainEinfuehrungProblem {

    public static void main(String[] args) {
        Professor professor1 = new Professor(
                "Barbara Liskov",
                "Programmiersprachen"
        );
        Professor professor2 = new Professor(
                "Douglas Engelbart",
                "Human Computer Interaction"
        );

        Student student1 = new Student(
                "Jane Doe",
                "0202020"
        );
        Student student2 = new Student(
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

    // Methode ist dupliziert für Student und Professor
    public static void printName(Student student) {
        System.out.println("Name: " + student.getName());
    }

    public static void printName(Professor professor) {
        System.out.println("Name: " + professor.getName());
    }
}

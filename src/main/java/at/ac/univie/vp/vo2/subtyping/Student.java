package at.ac.univie.vp.vo2.subtyping;

// Ersetzbarkeit gegeben, Student erweitert nur Person
// sayHello erweitert die Funktionalität von Person, kann jetzt öfters Hallo sagen
public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    @Override
    public void sayHello(int times) {
        printHello(times, 10);
    }
}

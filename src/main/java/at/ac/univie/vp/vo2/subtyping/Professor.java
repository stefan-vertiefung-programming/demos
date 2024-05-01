package at.ac.univie.vp.vo2.subtyping;

// Ersetzbarkeit nicht gegeben
// Ein Professor kann nicht so oft Hallo sagen wie eine Person
// Professor schränkt die Funktionalität von Person ein
public class Professor extends Person {

    public Professor(String name) {
        super(name);
    }

    @Override
    public void sayHello(int times) {
        printHello(times, 2);
    }
}

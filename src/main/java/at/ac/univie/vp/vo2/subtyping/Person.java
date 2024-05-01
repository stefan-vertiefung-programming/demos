package at.ac.univie.vp.vo2.subtyping;

public abstract class Person {

    protected final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello(int times) {
        printHello(times, 5);
    }

    protected final void printHello(int times, int maxTimes) {
        if (times < 0) {
            System.err.println("Negative zahlen sind nicht erlaubt");
            return;
        }
        if (times > maxTimes) {
            System.err.println("So oft kann ich nicht Hallo sagen");
            return;
        }
        for (int i = 0; i < times; i++) {
            System.out.println("Hallo, ich bin " + getName());
        }
    }
}

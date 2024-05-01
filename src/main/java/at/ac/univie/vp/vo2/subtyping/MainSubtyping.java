package at.ac.univie.vp.vo2.subtyping;

public class MainSubtyping {

    public static void main(String[] args) {
        Professor professor = new Professor("Barbara Liskov");
        Student student = new Student("Jane Doe");
        Lehrer teacher = new Lehrer("Eckhard Gussmack", "Elektrotechnisches Fächer");

        sayHello(teacher, 5);
        sayHello(student, 5);
        sayHello(professor, 5);
    }

    public static void sayHello(Person person, int times) {
        System.out.println();
        person.sayHello(times);
    }
}

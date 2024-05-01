package at.ac.univie.vp.vo1.vererbung.vertiefung;

public class MainVertiefung {

    public static void main(String[] args) {
        Professor professor1 = new Professor(
                "Barbara Liskov",
                "Programmiersprachen"
        );
        Person professor2 = new Professor(
                "Barbara Liskov",
                "Andere Programmiersprachen"
        );

        Student student1 = new Student(
                "Jane Doe",
                "0202020"
        );
        Person student2 = new Student(
                "Jane Doe",
                "0202020"
        );

        Person student3 = student1;
        System.out.println();
        System.out.println(student1 == student1); // true
        System.out.println(student1 == student2); // false
        System.out.println(student3 == student1); // true

        System.out.println();
        System.out.println(student1 instanceof Student); // true
        System.out.println(student1 instanceof Person); // true
        System.out.println(student2 instanceof Professor); // false

        System.out.println();
        System.out.println(((Student) student2).getMatrikelnummer()); // student2 hat Typ Person, kann mit Casting wieder zu Student konvertiert werden
        // System.out.println(((Student) professor2).getMatrikelnummer()); // professor2 ist kein Student, führt zu ClassCastException

        System.out.println();
        System.out.println(student1.getClass());

        System.out.println();
        System.out.println(student1.equals(student2)); // true
        System.out.println(professor1.equals(professor2)); // true, obwohl der researchFocus unterschiedlich ist
        System.out.println(professor2.equals(student2)); // false

        System.out.println();
        System.out.println(student2); // In System.out.println wird toString() aufgerufen
    }
}

package at.ac.univie.vp.vo2.generics.einfuehrung.problem;

public class MainEinfuehrungProblem {

    public static void main(String[] args) {
        // Eine eigene Klasse für Strings
        StringBox stringBox = new StringBox();
        stringBox.box("ABC");
        String outputString = stringBox.unbox().toLowerCase();
        System.out.println(outputString);

        // Eine eigene Klasse für Integers
        IntegerBox integerBox = new IntegerBox();
        integerBox.box(123);
        Integer outputInteger = integerBox.unbox();
        System.out.println(outputInteger);

        // Die ObjectBox kann alle Typen (Klassen, Interfaces) aufnehmen (da jede Klasse von Object erbt)
        // Aber die ObjectBox kann nur Objekte vom Typ Object zurückliefern
        // Ein Cast ist notwendig, um den speziellen Typen wiederherzustellen
        // Das kann zu ClassCastExceptions führen
        ObjectBox objectBox1 = new ObjectBox();
        objectBox1.box("Hello World");
        String outputObject1 = ((String) objectBox1.unbox()).toLowerCase();
        System.out.println(outputObject1);

        ObjectBox objectBox2 = new ObjectBox();
        objectBox2.box(456);
        int outputObject2 = ((Integer) objectBox2.unbox()).intValue();
        System.out.println(outputObject2);
    }
}

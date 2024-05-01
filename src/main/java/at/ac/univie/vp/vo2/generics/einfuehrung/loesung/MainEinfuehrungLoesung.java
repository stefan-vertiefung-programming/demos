package at.ac.univie.vp.vo2.generics.einfuehrung.loesung;


public class MainEinfuehrungLoesung {

    public static void main(String[] args) {

        // Beim Erstellen des Objekts wird der gewünschte Typ angegeben
        Box<String> stringBox = new Box<String>();
        stringBox.box("ABC");
        // unbox liefert wieder einen String zurück
        String outputString = stringBox.unbox().toLowerCase();
        System.out.println(outputString);

        // Man kann beliebige Typen einsetzen
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.box(123);
        Integer outputInteger = integerBox.unbox();
        System.out.println(outputInteger);

        Box<Double> doubleBox = new Box<Double>();
        doubleBox.box(123.1);
        Double outputDouble = doubleBox.unbox();
        System.out.println(outputDouble);
    }
}

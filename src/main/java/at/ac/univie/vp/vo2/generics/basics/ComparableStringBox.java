package at.ac.univie.vp.vo2.generics.basics;

// Auch Interfaces können generisch sein (siehe Comparable, https://www.javatpoint.com/Comparable-interface-in-collection-framework)
// Vererbung, Interfaces und Generics können kombiniert werden, sie schließen sich nicht gegenseitig aus

// Eine Typvariable kann beim vererben/implementieren fixiert werden
public class ComparableStringBox
        extends Box<String>
        implements Comparable<ComparableStringBox> {

    @Override
    public int compareTo(ComparableStringBox o) {
        if (this.isEmpty() && o.isEmpty()) {
            return 0;
        }
        if (this.isEmpty()) {
            return 1;
        }
        if (o.isEmpty()) {
            return -1;
        }
        String thisString = this.peek();
        String otherString = o.peek();
        return thisString.compareTo(otherString); // String erbt selbst von Comparable, deswegen kann hier compareTo aufgerufen werden
    }
}

package at.ac.univie.vp.vo2.generics.basics;

// Auch Interfaces können generisch sein (siehe Comparable)
// Vererbung, Interfaces und Generics können kombiniert werden, sie schließen sich nicht gegenseitig aus

// T extends Comparable<T>                 ... T muss von Comparable<T> erben
// extends Box<T>                          ... ComparableBox erbt von Box
// implements Comparable<ComparableBox<T>> ... Comparable definiert compareTo
public class ComparableBox<T extends Comparable<T>>
        extends Box<T>
        implements Comparable<ComparableBox<T>> {

    @Override
    public int compareTo(ComparableBox<T> o) {
        if (this.isEmpty() && o.isEmpty()) {
            return 0;
        }
        if (this.isEmpty()) {
            return 1;
        }
        if (o.isEmpty()) {
            return -1;
        }
        T thisElement = this.peek();
        T otherElement = o.peek();
        return thisElement.compareTo(otherElement); // Wegen dem compareTo hier muss T Comparable implementieren
    }
}
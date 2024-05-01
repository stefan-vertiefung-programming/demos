package at.ac.univie.vp.vo2.generics.einfuehrung.loesung;

// Typ T ist eine Typvariable
// T ist ein Platzhalter für beliebigen Typ
public class Box<T> {

    private T element = null;

    public void box(T element) {
        if (isFull()) {
            System.err.println("Box is full");
            return;
        }
        this.element = element;
    }

    public T unbox() {
        if (isEmpty()) {
            System.err.println("Box is empty");
            return null;
        }
        T el =  element;
        element = null;
        return el;
    }

    public boolean isEmpty() {
        return element == null;
    }

    public boolean isFull() {
        return element != null;
    }
}

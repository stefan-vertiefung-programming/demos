package at.ac.univie.vp.vo2.generics.einfuehrung.problem;

public class StringBox {

    // 3-mal die gleiche Klasse, mit unterschiedlichen Typen
    private String element = null;

    public void box(String element) {
        if (isFull()) {
            System.err.println("Box is full");
            return;
        }
        this.element = element;
    }

    public String unbox() {
        if (isEmpty()) {
            System.err.println("Box is empty");
            return null;
        }
        String el =  element;
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

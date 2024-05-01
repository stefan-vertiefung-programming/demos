package at.ac.univie.vp.vo2.generics.einfuehrung.problem;

public class ObjectBox {

    // 3-mal die gleiche Klasse, mit unterschiedlichen Typen
    private Object element = null;

    public void box(Object element) {
        if (isFull()) {
            System.err.println("Box is full");
            return;
        }
        this.element = element;
    }

    public Object unbox() {
        if (isEmpty()) {
            System.err.println("Box is empty");
            return null;
        }
        Object el =  element;
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

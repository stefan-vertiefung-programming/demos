package at.ac.univie.vp.vo2.generics.einfuehrung.problem;

public class IntegerBox {

    // 3-mal die gleiche Klasse, mit unterschiedlichen Typen
    // Integer ist ein Wrapper-Type (https://www.w3schools.com/java/java_wrapper_classes.asp)
    private Integer element = null;

    public void box(Integer element) {
        if (isFull()) {
            System.err.println("Box is full");
            return;
        }
        this.element = element;
    }

    public Integer unbox() {
        if (isEmpty()) {
            System.err.println("Box is empty");
            return null;
        }
        Integer el =  element;
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

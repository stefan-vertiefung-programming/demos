package at.ac.univie.vp.vo2.generics.basics;

// Klasse ist generisch. Sie besitzt eine Typvariable T
// T kann für einen beliebigen Typen (Klasse oder Interface) stehen
// Konvention in Java: Typvariablen sind einzelne Großbuchstaben
public class Box<T> {

    private T element = null;

    public Box() {
    }

    public Box(T element) {
        this.element = element;
    }

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

    public T peek() {
        return element;
    }

    public boolean isEmpty()  {
        return element == null;
    }

    public boolean isFull()  {
        return element != null;
    }
}

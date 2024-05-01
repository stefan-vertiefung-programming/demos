package at.ac.univie.vp.vo2.subtyping;

// Ersetzbarkeit gegeben, Lehrer erweitert nur Person
public class Lehrer extends Person {

    private final String unterrichtsFach;

    public Lehrer(String name, String unterrichtsFach) {
        super(name);
        this.unterrichtsFach = unterrichtsFach;
    }

    public String getUnterrichtsFach() {
        return unterrichtsFach;
    }
}

package at.ac.univie.vp.vo1.vererbung.einfuehrung.loesung.model;

public class Student extends Person {

    private final String matrikelnummer;

    public Student(String name, String matrikelnummer) {
        super(name);
        this.matrikelnummer = matrikelnummer;
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    @Override
    public String getIntroduction() {
        return name + " (Matrikelnummer: " + matrikelnummer + ")";
    }
}

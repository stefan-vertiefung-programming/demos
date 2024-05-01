package at.ac.univie.vp.vo1.vererbung.basics.model;

// Von finalen Klassen kann nicht geerbt werden
public final class Student extends Person {

    private final String matrikelnummer;

    public Student(String name, String matrikelnummer) {
        super(name);
        this.matrikelnummer = matrikelnummer;
    }

    @Override
    public String getIntroduction() {
        return name + " (Matrikelnummer: " + matrikelnummer + ")";
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }
}

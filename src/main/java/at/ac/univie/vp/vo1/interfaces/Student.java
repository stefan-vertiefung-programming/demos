package at.ac.univie.vp.vo1.interfaces;

public class Student implements Introducible, Named {

    private final String name;
    private final String matrikelnummer;

    public Student(String name, String matrikelnummer) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }

    @Override
    public String getIntroduction() {
        return name + " (Matrikelnummer: " + matrikelnummer + ")";
    }

    public String getName() {
        return name;
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }
}

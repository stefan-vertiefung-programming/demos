package at.ac.univie.vp.vo1.vererbung.einfuehrung.problem.model;

// Viel Code ist dupliziert
public class Student {

    // Professor hat auch "name"
    private final String name;
    private final String matrikelnummer;

    public Student(String name, String matriculationNumber) {
        this.name = name;
        this.matrikelnummer = matriculationNumber;
    }

    public String getName() {
        return name;
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getIntroduction() {
        return name + " (Matrikelnummer: " + matrikelnummer + ")";
    }

    // greets(...) muss für jeden Type implementiert werden

    public String greets(Student student) {
        return "Hallo " + student.getIntroduction() + ", ich bin " + this.getIntroduction();
    }

    public String greets(Professor professor) {
        return "Hallo " + professor.getIntroduction() + ", ich bin " + this.getIntroduction();
    }
}

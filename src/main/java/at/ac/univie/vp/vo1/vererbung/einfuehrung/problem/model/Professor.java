package at.ac.univie.vp.vo1.vererbung.einfuehrung.problem.model;

// Viel Code ist dupliziert
public class Professor {

    // Student hat auch "name"
    private final String name;
    private final String researchFocus;

    public Professor(String name, String researchFocus) {
        this.name = name;
        this.researchFocus = researchFocus;
    }

    public String getName() {
        return name;
    }

    public String getResearchFocus() {
        return researchFocus;
    }

    public String getIntroduction() {
        return name + " (Research Focus: " + researchFocus + ")";
    }

    // greets(...) muss für jeden Type implementiert werden

    public String greets(Student student) {
        return "Hallo " + student.getIntroduction() + ", ich bin " + this.getIntroduction();
    }

    public String greets(Professor professor) {
        return "Hallo " + professor.getIntroduction() + ", ich bin " + this.getIntroduction();
    }
}

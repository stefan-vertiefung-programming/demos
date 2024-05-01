package at.ac.univie.vp.vo1.vererbung.basics.model;

// Professor "erbt" von Person, das bedeutet, dass Attribute und Methoden von Person auch Teil von Professor sind
// Professor ist in diesem Beispiel die Subklasse, Person ist die Superklasse
// Man kann nur von einer Klasse erben
// Auch von Professor kann geerbt werden
public class Professor extends Person {

    private final String researchFocus;

    // In einem Konstruktor einer Subklasse muss immer als ersteres ein Konstruktor der Superklasse aufgerufen werden
    public Professor(String name, String researchFocus) {
        super(name); // Aufruf des Person Konstruktors
        this.researchFocus = researchFocus;
    }

    // Da getIntroduction() in Person abstrakt ist, muss es hier implementiert werden
    @Override
    public String getIntroduction() {
        return name + " (ResearchFocus: " + researchFocus + ")";
    }

    public String specialGreets(Professor professor) {
        return "Servus " + professor.getName() + ", mein Name ist " + this.getName();
    }

    public String getResearchFocus() {
        return researchFocus;
    }
}

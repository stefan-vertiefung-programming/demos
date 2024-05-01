package at.ac.univie.vp.vo1.vererbung.einfuehrung.loesung.model;

// Professor "erbt" von Person, bedeutet alles protected/public Attribute und Methoden sind auch Teil von Professor
// Professor ist in diesem Beispiel die Subklasse, Person ist die Superklasse
// Man kann nur von einer Klasse erben
// Auch von Professor kann geerbt werden
public class Professor extends Person {

    private final String researchFocus;

    public Professor(String name, String researchFocus) {
        super(name);
        this.researchFocus = researchFocus;
    }

    public String getResearchFocus() {
        return researchFocus;
    }

    // getIntroduction() kann für Professor überschrieben werden
    // @Override ist eine Kennzeichnung, dass diese Methode eine andere überschreibt
    @Override
    public String getIntroduction() {
        return name + " (ResearchFocus: " + researchFocus + ")";
    }
}

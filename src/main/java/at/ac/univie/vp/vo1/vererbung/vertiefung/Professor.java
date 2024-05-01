package at.ac.univie.vp.vo1.vererbung.vertiefung;

public class Professor extends Person {

    private final String researchFocus;

    public Professor(String name, String researchFocus) {
        super(name);
        this.researchFocus = researchFocus;
    }

    @Override
    public String getIntroduction() {
        return name + " (ResearchFocus: " + researchFocus + ")";
    }
}

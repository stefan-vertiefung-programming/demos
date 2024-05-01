package at.ac.univie.vp.vo1.interfaces;

// Um Interfaces zu implementieren, verwendet man das keyword "implements"
// Eine Klasse kann mehrere Interfaces implementieren
public class Professor implements Introducible, Named {

    private final String name;
    private final String researchFocus;

    public Professor(String name, String researchFocus) {
        this.name = name;
        this.researchFocus = researchFocus;
    }

    // getIntroduction() wird wegen Introducible implementiert
    @Override
    public String getIntroduction() {
        return name + " (Research Focus: " + researchFocus + ")";
    }

    // getName() wird wegen Named implementiert
    @Override
    public String getName() {
        return name;
    }

    public String getResearchFocus() {
        return researchFocus;
    }
}

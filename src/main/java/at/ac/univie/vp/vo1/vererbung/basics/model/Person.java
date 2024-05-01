package at.ac.univie.vp.vo1.vererbung.basics.model;

// Lösung
// Den gemeinsamen Code in einer Klasse zusammenfassen. Andere Klassen können von dieser Klasse erben.
// Das bedeutet sie können diesen Code wiederverwenden

// Eine Klasse kann "abstract" sein, muss aber nicht. Abstrakte Klassen kann man nicht instanzieren
public abstract class Person {

    // Mit "protected" wird das Attribut "name" auch an vererbten Klassen sichtbar
    protected final String name;

    public Person(String name) {
        this.name = name;
    }

    // Abstrakte Methoden können nur in abstrakten Klassen existieren, sie müssen in vererbten Klasse implementiert werden
    public abstract String getIntroduction();

    // greets(...) muss nur einmal definiert werden. Jede Instanz von Person kann übergeben werden.
    // mit final kann die Methode nicht in Student oder Professor überschrieben werden
    public final String greets(Person person) {
        return "Hallo " + person.getIntroduction() + ", Ich bin " + this.getIntroduction();
    }

    public String getName() {
        return name;
    }
}

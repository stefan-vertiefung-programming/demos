package at.ac.univie.vp.vo1.vererbung.einfuehrung.loesung.model;

// Den gemeinsamen Code in einer Klasse zusammenfassen. Andere Klassen können von dieser Klasse erben.
// Das bedeutet sie können diesen Code wiederverwenden
public class Person {

    protected final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIntroduction() {
        return name;
    }

    // greets(...) muss nur einmal definiert werden. Jede Instanz von Person kann übergeben werden.
    public String greets(Person person) {
        return "Hallo " + person.getIntroduction() + ", Ich bin " + this.getIntroduction();
    }
}

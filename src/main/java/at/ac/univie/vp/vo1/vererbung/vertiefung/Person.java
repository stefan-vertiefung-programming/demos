package at.ac.univie.vp.vo1.vererbung.vertiefung;

// Person erbt implizit von Object
public abstract class Person {

    protected final String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract String getIntroduction();

    public String greets(Person person) {
        return "Hallo " + person.getIntroduction() + ", Ich bin " + this.getIntroduction();
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        if (name == null) {
            result = prime * result;
        } else {
            result = prime * result + name.hashCode();
        }
        return result;
    }
}

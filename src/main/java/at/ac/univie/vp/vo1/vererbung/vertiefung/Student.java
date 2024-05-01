package at.ac.univie.vp.vo1.vererbung.vertiefung;

public class Student extends Person {

    private final String matrikelnummer;

    public Student(String name, String matrikelnummer) {
        super(name); // Aufruf des Person Konstruktors
        this.matrikelnummer = matrikelnummer;  // this referenziert das Attribut matrikelnummer in der aktuellen Klasse
    }

    @Override
    public String getIntroduction() {
        return name + " (Matrikelnummer: " + matrikelnummer + ")";
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) { // Mit super wir equals von Person aufgerufen
            return false;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student other = (Student) obj;
        if (matrikelnummer == null) {
            // Man kann auf private Attribute anderer Objekte der gleichen Klasse zugreifen
            // matrikelnummer ist private
            if (other.matrikelnummer != null) {
                return false;
            }
        } else if (!matrikelnummer.equals(other.matrikelnummer)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        if (matrikelnummer == null) {
            result = prime * result;
        } else {
            result = prime * result + matrikelnummer.hashCode();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrikelnummer='" + matrikelnummer + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

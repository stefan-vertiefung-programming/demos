package at.ac.univie.vp.vo1.interfaces;

// Interfaces sind wie abstrakte Klasse nur mit abstrakten Methoden
// Wird verwendet um "Eigenschaften" zu beschreiben
// Jede Klasse, welche dieses Interface implementiert, muss eine Implementierung für getIntroduction() zur Verfügung stellen
public interface Introducible {

    String getIntroduction();
}

package at.ac.univie.vp.vo1.interfaces;

public class MainInterfaces {

    public static void main(String[] args) {
        Introducible professor = new Professor(
                "Douglas Engelbart",
                "Human Computer Interaction"
        );

        Student student = new Student(
                "Erika Mustermann",
                "1212121"
        );
        Introducible introducibleStudent = student;
        Named namedStudent = student;

        System.out.println();
        System.out.println(professor.getIntroduction());
        System.out.println(student.getIntroduction());
        System.out.println(introducibleStudent.getIntroduction());
        System.out.println(namedStudent.getName());

        // Ist nicht gültig, da professor "nur" Typ Introducible hat, getName() erfordert Typ Professor oder Named
        // System.out.println(professor.getName());

        // Ist nicht gültig, da professor "nur" Typ Introducible hat, getResearchFocus() erfordert Typ Professor
        // System.out.println(professor.getResearchFocus());
    }
}

package at.ac.univie.vp.vo2.generics.basics;

public class MainBasics {

    public static void main(String[] args) {
        Box<String> stringBox = new Box<String>();
        stringBox.box("abc");
        String outputString = stringBox.unbox().toUpperCase();
        System.out.println(outputString);

        StringBox stringBox2 = new StringBox();
        stringBox2.box("abc");
        String outputString2 = stringBox2.unbox().toUpperCase();
        System.out.println(outputString2);

        // Falls auf der linken Seite die Typvariablen angegeben sind müssen sie auf der rechten Seite nicht
        // mehr angegebenen werden (Diamond Operator)
        Pair<String, Integer> pair = new Pair<>("xxx", -1);
        System.out.println();
        System.out.println(pair);

        System.out.println();
        System.out.println(safelyUnbox(stringBox));


        Box<Number> numberBox = new Box<>(123);
        System.out.println();
        System.out.println(safelyUnbox(numberBox));
        System.out.println(safeIsEmpty(numberBox));
        System.out.println(unboxNumberAsDouble(numberBox));

        Box<Integer> emptyNumberBox = new Box<>();
        initializeWithZero(emptyNumberBox);
        System.out.println();
        System.out.println(emptyNumberBox.unbox());

        ComparableBox<String> comparableBox = new ComparableBox<>();
        ComparableStringBox comparableStringBox = new ComparableStringBox();
        System.out.println();
        System.out.println(comparableBox.compareTo(comparableBox));
        System.out.println(comparableStringBox.compareTo(comparableStringBox));
    }

    /**
     * Generische Methoden
     */

    // Falls ein Argument generisch ist und die Typvariable in der Methode benötigt wird
    // kann die Typvariable in der Methodensignatur deklariert werden
    // <T>    ... Definition der Typvariable
    // T      ... Rückgabetyp
    // Box<T> ... generisches Argument, bestimmt den konkreten Typ der Typvariable
    public static <T> T safelyUnbox(Box<T> box) {
        if (box == null || box.isEmpty()) {
            return null;
        }
        return box.unbox();
    }

    // Falls die Typvariable nicht benötigt wird, kann eine Wildcard (?) verwendet werden
    public static boolean safeIsEmpty(Box<?> box) {
        return box == null || box.isEmpty();
    }

    // Die Wildcard kann gebunden werden. Dadurch sind nur bestimmte Typvariablen erlaubt.
    // Mit 'extends' kann eine obere Schranke definiert werden.
    // In diesem Beispiel muss die Typvariable von Number erben.
    // Integer, Double und Long, zum Beispiel, erben von Number
    // https://docs.oracle.com/en%2Fjava%2Fjavase%2F22%2Fdocs%2Fapi%2F%2F/java.base/java/lang/Number.html
    // https://www.tutorialspoint.com/java/java_lang_number.htm
    // Erlaubt sind also Box<Integer>, Box<Double>, Box<Long>, etc.
    public static double unboxNumberAsDouble(Box<? extends Number> box) {
        if (box == null || box.isEmpty()) {
            return 0;
        }
        return box.unbox().doubleValue();
    }

    // In diesem Beispiel muss die Typvariable "über oder gleich" von Integer liegen
    // Erlaubt sind Box<Integer>, Box<Number> und Box<Object>
    public static void initializeWithZero(Box<? super Integer> box) {
        box.box(0);
    }
}

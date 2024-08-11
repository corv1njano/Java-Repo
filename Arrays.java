public class Arrays {
    public static void main(String[] arguments) {

        // Arrays sind eine Ansammlung von Werten in einem Behälter
        int[] integerArray = { 3, 7, 10, 2};
        
        String[] stringArray = { "Hans", "Marie", "Lukas" };

        // Auf Element eines Arrays zugreifen, Position im Array nennet man Index, man beginnt hier schon ab 0 zu zählen
        // Element an Position 2 (0 -> 1 -> 2), also an der Stelle, wo die Zahl 10 steht, wird mit einer 5 ersetzt
        integerArray[2] = 5;

        // neues leeres Array Objekt erstellen
        // leeres Array mit max. 5 Positionen erstellen 
        byte[] byteArrayName = new byte[5];

        // Jedes Element eines Arrays auslesen mit for-each-Schleife
        for (int zahl : integerArray) {
            System.out.println(zahl);
        }
    }
}
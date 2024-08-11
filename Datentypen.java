public class Datentypen {
    public static void main(String[] arguments) {

        // Byte (8 Bit), von -128 bis 127
        byte zahl1 = 127;

        // Short (16 Bit), von -32.768 bis 32.767
        short zahl2 = 23310;

        // Integer (32 Bit), von -2.147.483.648 bis 2.147.483.647
        // der "Standard-Datentyp" eines Java-Programms
        int zahl3 = 124194902;

        // Long (64 Bit), von -9.223.372.036.854.775.808 bis 9.223.372.036.854.775.807
        long zahl4 = 3492348623471l; // bei Long-Variable muss an den Schluss der Zahl von ein kleines L

        // Float (32 Bit), von -1,4 * 10^45 bis 3,4 * 10^38 (gerundet)
        // Kommas als Punkt schreiben -> wie im Englischen
        float zahl5 = 3552.0193837f; // kleines F hinter die Zahl

        // Double (64 Bit), von -4,9 * 10^324 bis 1,8 * 10^308 (gerundet)
        double zahl6 = 3552.04543543450987193837d; // kleines D hinter die Zahl

        // Char (16 Bit), von 0 bis 65.535
        // nur ein einzelnes Zeichen oder ASCII-Zeichencode
        char zeichen1 = 'B'; // keine Anführungszeichen "" schreiben, sondern Hoch-Kommas!

        char zeichen2 = 65; // ASCII Wert für den Buchstaben A

        // Boolean (1 Bit), true (1) oder false (0)
        boolean boolean1 = true;

        boolean boolean2 = false;
    }
}
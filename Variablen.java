public class Variablen {
    public static void main(String[] arguments) {

        // Syntax: Datentyp, Variablen-Name, Ausdruck
        int zahl1 = 2;

        // Variable Zahl erhält einen neuen Wert; der alte Wert 2 wird somit überschrieben
        zahl1 = 34;

        // eine weitere Variable wurde deklariert, aber noch keinen Wert zugewiesen
        int zahl2;

        // der Variable zahl2 wird hier zum ersten Mal einen Wert zugewiesen
        // man sagt dann, dass die Variable nun initialisiert wurde
        zahl2 = 4;

        // mit dem Keyword final kann man eine konstante Variable erstellen
        // der Wert der final-Variable kann also nicht mehr geändert werden
        final int zahl3 = 100;

        // auch Konstanten kann man zunächst ohne Wert deklarieren
        final int zahl4;

        // man kann der noch nicht initialisierten Variable zahl4 dann natürlich noch einen Wert zuweisen, da diese Variable noch keinen Wert zuvor bekommen hat
        zahl4 = 4555;

    }
}
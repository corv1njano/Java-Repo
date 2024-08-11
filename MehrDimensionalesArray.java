public class MehrDimensionalesArray {
    public static void main(String[] arguments) {

        // 1D Array ("normales" Array)
        int[] eineDimension = { 5, 7, 2 };

        // 2D Array -> Array in einem Array
        int[][] zweiDimensionen1 = { { 3, 5, 9 }, { 6, 12, 4 } };

        // andere Schreibweise eines zweidimensionalen Arrays (als Matrix oder Tabelle)
        // Vorteil: lesbarer
        int[][] zweiDimensionen2 = {
            { 3, 5, 9 },
            { 6, 12, 4 }
        };

        // weiteres Beispiel
        String[][] namenArray = {
            { "Hans",   "Meier" },
            { "Marie",  "Zimmermann" },
            { "Lukas",  "Müller" }
        };

        // ein 2D Array mit 2 Reihen und 4 Spalten erstellen
        int[][] neuesArray = new int[2][4]; // erste Kalmmer steht für Reihen, zweite Klammer für Spalten

        // das Array befüllen
        neuesArray[0][0] = 0; // Reihe 0, Spalte 0 
        neuesArray[0][1] = 1; // Reihe 0, Splate 1
        neuesArray[0][2] = 2; // ...
        neuesArray[0][3] = 3; // ...
        neuesArray[1][0] = 4; // ...
        neuesArray[1][1] = 5; // Reihe 1, Splate 1
        neuesArray[1][2] = 6; // Reihe 1, Splate 2
        neuesArray[1][3] = 7; // ...

        // 2D Array auslesen (for-Schleife in for-Schleife)
        for (int i = 0; i < neuesArray.length; i++) { // jede Reihe durchgehen
            for (int j = 0; j < neuesArray[i].length; j++) { // jedes Element pro Reihe durchgehen
                System.out.println(neuesArray[i][j]); // jedes Element ausgeben
            }
        }

        // 3D Array -> Array in Array in einem Array
        // dieses Array hat zwei weitere Arrays und jedes davon hat 3 weitere Arrays
        int[][][] dreiDimensionen = {
            {
                { 0, 1, 2 },
                { 3, 4, 5 },
                { 6, 7, 8 }
            },
            {
                { 9, 10, 11 },
                { 12, 13, 14 },
                { 15, 16, 17 }
            }
        };

        // 3D Array auslesen
        for (int i = 0; i < dreiDimensionen.length; i++) { // das erste durchgehen (gibt 2 Arrays in diesem Array)
            for (int j = 0; j < dreiDimensionen[i].length; j++) { // die beiden Arrays durchgehen (jedes hat 3 weitere Arrays)
                for (int k = 0; k < dreiDimensionen[i][j].length; k++) { // jedes Element der 3 Arrays durchgehen
                    System.out.println(dreiDimensionen[i][j][k]); // jedes Element ausgeben
                }
            }
        }

        // gleiches Prozedere für 4D, 5D, 6D usw. Arrays
        // wofür braucht man diese Arrays zum Beispiel? -> 2D: Matrizen (oder Tabellen) & 3D: Vektorrechnung
    }
}

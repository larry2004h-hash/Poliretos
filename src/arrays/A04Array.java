package arrays;
public class A04Array {

    public void mostrarSeries(int n) throws InterruptedException {
        String nombre = "SamuelRobayo";
        int delay = 20; // milisegundos: mientras más pequeño, más rápido

        System.out.println("\n=== MATRIZ CON BUCLE FOR ===");
        char[][] matrizFor = generarConFor(n, nombre);
        imprimirConDelay(matrizFor, delay);

        System.out.println("\n=== MATRIZ CON BUCLE WHILE ===");
        char[][] matrizWhile = generarConWhile(n, nombre);
        imprimirConDelay(matrizWhile, delay);

        System.out.println("\n=== MATRIZ CON BUCLE DO-WHILE ===");
        char[][] matrizDo = generarConDoWhile(n, nombre);
        imprimirConDelay(matrizDo, delay);
    }

    // ---------- BUCLE FOR ----------
    private char[][] generarConFor(int n, String nombre) {
        char[][] matriz = new char[n][n];

        // Llenar con espacios
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matriz[i][j] = ' ';

        // Formar X con letras del nombre
        for (int i = 0; i < n; i++) {
            char c = nombre.charAt(i % nombre.length());
            matriz[i][i] = c; // diagonal principal
            matriz[i][n - 1 - i] = c; // diagonal secundaria
        }
        return matriz;
    }

    // ---------- BUCLE WHILE ----------
    private char[][] generarConWhile(int n, String nombre) {
        char[][] matriz = new char[n][n];

        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                matriz[i][j] = ' ';
                j++;
            }
            i++;
        }

        i = 0;
        while (i < n) {
            char c = nombre.charAt(i % nombre.length());
            matriz[i][i] = c;
            matriz[i][n - 1 - i] = c;
            i++;
        }

        return matriz;
    }

    // ---------- BUCLE DO-WHILE ----------
    private char[][] generarConDoWhile(int n, String nombre) {
        char[][] matriz = new char[n][n];
        int i = 0;

        // Llenar con espacios
        do {
            int j = 0;
            do {
                matriz[i][j] = ' ';
                j++;
            } while (j < n);
            i++;
        } while (i < n);

        i = 0;
        do {
            char c = nombre.charAt(i % nombre.length());
            matriz[i][i] = c;
            matriz[i][n - 1 - i] = c;
            i++;
        } while (i < n);

        return matriz;
    }

    // ---------- IMPRIMIR CON DELAY ----------
    private void imprimirConDelay(char[][] matriz, int delay) throws InterruptedException {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                Thread.sleep(delay);
            }
            System.out.println();
        }
    }
}

package arrays;
import java.util.Random;

public class A05Array {

    public void mostrarSeries(int n) throws InterruptedException {
        String nombre = "Samuel";
        String apellido = "Robayo";

        System.out.println("\n=== MATRIZ CON BUCLE FOR ===");
        char[][] matrizFor = generarConFor(n, nombre, apellido);
        imprimirConDelay(matrizFor, 20);

        System.out.println("\n=== MATRIZ CON BUCLE WHILE ===");
        char[][] matrizWhile = generarConWhile(n, nombre, apellido);
        imprimirConDelay(matrizWhile, 20);

        System.out.println("\n=== MATRIZ CON BUCLE DO-WHILE ===");
        char[][] matrizDo = generarConDoWhile(n, nombre, apellido);
        imprimirConDelay(matrizDo, 20);
    }

    // ---------- BUCLE FOR ----------
    private char[][] generarConFor(int n, String nombre, String apellido) {
        char[][] matriz = new char[n][n];
        Random rand = new Random();

        // Inicializar matriz con espacios
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matriz[i][j] = ' ';

        // Colocar letras del nombre
        for (int i = 0; i < nombre.length(); i++) {
            int fila = rand.nextInt(n);
            int col = rand.nextInt(n);
            matriz[fila][col] = nombre.charAt(i);
        }

        // Colocar letras del apellido
        for (int i = 0; i < apellido.length(); i++) {
            int fila = rand.nextInt(n);
            int col = rand.nextInt(n);
            char c = apellido.charAt(i);
            if (matriz[fila][col] != ' ' && matriz[fila][col] != c)
                matriz[fila][col] = '*';
            else
                matriz[fila][col] = c;
        }
        return matriz;
    }

    // ---------- BUCLE WHILE ----------
    private char[][] generarConWhile(int n, String nombre, String apellido) {
        char[][] matriz = new char[n][n];
        Random rand = new Random();

        // Inicializar matriz con espacios
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                matriz[i][j] = ' ';
                j++;
            }
            i++;
        }

        // Colocar letras del nombre
        i = 0;
        while (i < nombre.length()) {
            int fila = rand.nextInt(n);
            int col = rand.nextInt(n);
            matriz[fila][col] = nombre.charAt(i);
            i++;
        }

        // Colocar letras del apellido
        i = 0;
        while (i < apellido.length()) {
            int fila = rand.nextInt(n);
            int col = rand.nextInt(n);
            char c = apellido.charAt(i);
            if (matriz[fila][col] != ' ' && matriz[fila][col] != c)
                matriz[fila][col] = '*';
            else
                matriz[fila][col] = c;
            i++;
        }
        return matriz;
    }

    // ---------- BUCLE DO-WHILE ----------
    private char[][] generarConDoWhile(int n, String nombre, String apellido) {
        char[][] matriz = new char[n][n];
        Random rand = new Random();

        // Inicializar matriz con espacios
        int i = 0;
        do {
            int j = 0;
            do {
                matriz[i][j] = ' ';
                j++;
            } while (j < n);
            i++;
        } while (i < n);

        // Colocar letras del nombre
        i = 0;
        do {
            int fila = rand.nextInt(n);
            int col = rand.nextInt(n);
            matriz[fila][col] = nombre.charAt(i);
            i++;
        } while (i < nombre.length());

        // Colocar letras del apellido
        i = 0;
        do {
            int fila = rand.nextInt(n);
            int col = rand.nextInt(n);
            char c = apellido.charAt(i);
            if (matriz[fila][col] != ' ' && matriz[fila][col] != c)
                matriz[fila][col] = '*';
            else
                matriz[fila][col] = c;
            i++;
        } while (i < apellido.length());
        return matriz;
    }

    // ---------- IMPRIMIR MATRIZ CON DELAY ----------
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



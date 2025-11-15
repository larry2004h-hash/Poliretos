package arrays;

import java.util.Random;
import java.util.Scanner; 

public class A05Array {

    public void mostrarSeries(int n, Scanner sc) throws InterruptedException {
        
        System.out.print("Ingrese un nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese un apellido: ");
        String apellido = sc.nextLine();

    
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

   // ========================= FOR =========================
    private char[][] generarConFor(int n, String nombre, String apellido) {
        char[][] matriz = new char[n][n];
        Random rand = new Random();

    
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matriz[i][j] = ' ';

       
        if (nombre.length() > 0) {
            for (int i = 0; i < nombre.length(); i++) {
                int fila = rand.nextInt(n);
                int col = rand.nextInt(n);
                matriz[fila][col] = nombre.charAt(i);
            }
        }

        
        if (apellido.length() > 0) {
            for (int i = 0; i < apellido.length(); i++) {
                int fila = rand.nextInt(n);
                int col = rand.nextInt(n);
                char c = apellido.charAt(i);
                if (matriz[fila][col] != ' ' && matriz[fila][col] != c)
                    matriz[fila][col] = '*';
                else
                    matriz[fila][col] = c;
            }
        }
        return matriz;
    }

    // ========================= WHILE =========================
    private char[][] generarConWhile(int n, String nombre, String apellido) {
        char[][] matriz = new char[n][n];
        Random rand = new Random();

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
        if (nombre.length() > 0) {
            while (i < nombre.length()) {
                int fila = rand.nextInt(n);
                int col = rand.nextInt(n);
                matriz[fila][col] = nombre.charAt(i);
                i++;
            }
        }

        i = 0;
        if (apellido.length() > 0) {
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
        }
        return matriz;
    }

    // ========================= DO...WHILE =========================
    private char[][] generarConDoWhile(int n, String nombre, String apellido) {
        char[][] matriz = new char[n][n];
        Random rand = new Random();
        
        if (n == 0) return matriz;

        int i = 0;
        do {
            int j = 0;
            do {
                matriz[i][j] = ' ';
                j++;
            } while (j < n);
            i++;
        } while (i < n);

  
        i = 0;
        if (nombre.length() > 0) {
            do {
                int fila = rand.nextInt(n);
                int col = rand.nextInt(n);
                matriz[fila][col] = nombre.charAt(i);
                i++;
            } while (i < nombre.length());
        }

        
        i = 0;
        if (apellido.length() > 0) {
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
        }
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

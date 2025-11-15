package arrays;

import java.util.Scanner;

public class A04Array {

    public void mostrarSeries(int n, Scanner sc) throws InterruptedException {
        
        
        System.out.print("Ingrese el nombre a graficar (sin espacios): ");
        String nombre = sc.nextLine(); 

        int delay = 20; 

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


// ========================== FOR =========================
    private char[][] generarConFor(int n, String nombre) {
        char[][] matriz = new char[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matriz[i][j] = ' ';

      
        for (int i = 0; i < n; i++) {
            if (nombre.length() == 0) continue; 
            char c = nombre.charAt(i % nombre.length());
            matriz[i][i] = c; 
            matriz[i][n - 1 - i] = c; 
        }
        return matriz;
    }

// ========================= WHILE =========================
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
            if (nombre.length() == 0) break;
            char c = nombre.charAt(i % nombre.length());
            matriz[i][i] = c;
            matriz[i][n - 1 - i] = c;
            i++;
        }

        return matriz;
    }

   // ========================= DO...WHILE =========================
    private char[][] generarConDoWhile(int n, String nombre) {
        char[][] matriz = new char[n][n];
    
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

        if (nombre.length() == 0) return matriz;

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
package arrays;
import java.util.Random;

public class A01Arrays {

    public static void main(String[] args) {
        String nombre = "Samuel Esteban Robayo Morcillo";
        String texto = nombre.replace(" ", "");        // quitar espacios
        char[] letras = texto.toCharArray();
        int total = letras.length;

        // tamaño mínimo cuadrado compacto
        int n = (int) Math.ceil(Math.sqrt(total));

        System.out.println("Nombre: " + nombre);
        System.out.println("Total letras: " + total + " → Matriz " + n + "x" + n);
        System.out.println();

        System.out.println("=== MÉTODO CON FOR ===");
        metodoFor(letras, n);

        System.out.println("\n=== MÉTODO CON WHILE ===");
        metodoWhile(letras, n);

        System.out.println("\n=== MÉTODO CON DO...WHILE ===");
        metodoDoWhile(letras, n);
    }

    // 🔹 MÉTODO CON FOR
    public static void metodoFor(char[] letras, int n) {
        char[][] matriz = new char[n][n];
        Random rand = new Random();

        // inicializar con espacios
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matriz[i][j] = ' ';

        // colocar letras aleatoriamente
        for (int k = 0; k < letras.length; k++) {
            int x = rand.nextInt(n);
            int y = rand.nextInt(n);
            if (matriz[x][y] == ' ')
                matriz[x][y] = letras[k];
            else
                matriz[x][y] = '*';
        }

        mostrarMatriz(matriz);
    }

    // 🔹 MÉTODO CON WHILE
    public static void metodoWhile(char[] letras, int n) {
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

        int k = 0;
        while (k < letras.length) {
            int x = rand.nextInt(n);
            int y = rand.nextInt(n);
            if (matriz[x][y] == ' ')
                matriz[x][y] = letras[k];
            else
                matriz[x][y] = '*';
            k++;
        }

        mostrarMatriz(matriz);
    }

    // 🔹 MÉTODO CON DO...WHILE
    public static void metodoDoWhile(char[] letras, int n) {
        char[][] matriz = new char[n][n];
        Random rand = new Random();

        int i = 0;
        do {
            int j = 0;
            do {
                matriz[i][j] = ' ';
                j++;
            } while (j < n);
            i++;
        } while (i < n);

        int k = 0;
        do {
            int x = rand.nextInt(n);
            int y = rand.nextInt(n);
            if (matriz[x][y] == ' ')
                matriz[x][y] = letras[k];
            else
                matriz[x][y] = '*';
            k++;
        } while (k < letras.length);

        mostrarMatriz(matriz);
    }

    // 🔸 Mostrar matriz compacta
    public static void mostrarMatriz(char[][] matriz) {
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}



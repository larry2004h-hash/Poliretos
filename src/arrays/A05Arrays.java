package arrays;
import java.util.Random;


public class A05Arrays {

    public static void main(String[] args) throws InterruptedException {
        String nombre = "Samuel Esteban Robayo Morcillo";
        String texto = nombre.replace(" ", "");        // quitar espacios
        char[] letras = texto.toCharArray();
        int total = letras.length;

        // tamaño mínimo cuadrado para alojar todas las letras (más compacto)
        int n = (int) Math.ceil(Math.sqrt(total));

        System.out.println("Nombre (sin espacios): " + texto);
        System.out.println("Total letras: " + total + " -> Matriz " + n + "x" + n);
        System.out.println();

        System.out.println("=== MÉTODO CON FOR ===");
        metodoFor(letras, n, 150);

        System.out.println("\n=== MÉTODO CON WHILE ===");
        metodoWhile(letras, n, 150);

        System.out.println("\n=== MÉTODO CON DO...WHILE ===");
        metodoDoWhile(letras, n, 150);
    }

    // Método con FOR
    public static void metodoFor(char[] letras, int n, int delayMs) throws InterruptedException {
        char[][] matriz = new char[n][n];
        Random rand = new Random();

        // inicializar
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matriz[i][j] = ' ';

        for (int k = 0; k < letras.length; k++) {
            int x = rand.nextInt(n);
            int y = rand.nextInt(n);

            if (matriz[x][y] == ' ')
                matriz[x][y] = letras[k];
            else
                matriz[x][y] = '*';

            mostrarMatriz(matriz);
            Thread.sleep(delayMs);
        }
    }

    // Método con WHILE
    public static void metodoWhile(char[] letras, int n, int delayMs) throws InterruptedException {
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

            mostrarMatriz(matriz);
            Thread.sleep(delayMs);
            k++;
        }
    }

    // Método con DO...WHILE
    public static void metodoDoWhile(char[] letras, int n, int delayMs) throws InterruptedException {
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

            mostrarMatriz(matriz);
            Thread.sleep(delayMs);
            k++;
        } while (k < letras.length);
    }

    // Imprime matriz de forma compacta (un espacio entre columnas para legibilidad)
    public static void mostrarMatriz(char[][] matriz) {
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < matriz.length; j++) {
                sb.append(matriz[i][j]);
                if (j < matriz.length - 1) sb.append(' '); // separador sencillo
            }
            System.out.println(sb.toString());
        }
        System.out.println("---------------------------");
    }
}


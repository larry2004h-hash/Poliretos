package arrays;

public class A03Arrays {

    public void mostrarSeries(int n) {
        if (n < 1) {
            System.out.println("El tamaño debe ser mayor a 0. Usando tamaño 6 por defecto.");
            n = 6;
        }

        System.out.println("Plano de coordenadas positivas");
        System.out.println("Función: f(x) = 2x");
        System.out.println("Nombre usado: SamuelRobayo\n");

        String nombre = "SamuelRobayo";
        char[] letras = nombre.toCharArray();

        System.out.println("=== MÉTODO CON FOR ===");
        metodoFor(n, letras);

        System.out.println("\n=== MÉTODO CON WHILE ===");
        metodoWhile(n, letras);

        System.out.println("\n=== MÉTODO CON DO...WHILE ===");
        metodoDoWhile(n, letras);
    }

    // ---------- FOR ----------
    private void metodoFor(int n, char[] letras) {
        int indice = 0;
        for (int y = n; y >= 0; y--) {
            System.out.print(y + "|");
            for (int x = 0; x <= y; x++) {
                System.out.print(" ");
            }
            if (indice < letras.length) {
                System.out.println(letras[indice]);
                indice++;
            } else {
                System.out.println();
            }
        }

        System.out.print("0|");
        for (int i = 0; i <= n + 2; i++) System.out.print("_");
        System.out.println();
    }

    // ---------- WHILE ----------
    private void metodoWhile(int n, char[] letras) {
        int y = n;
        int indice = 0;

        while (y >= 0) {
            System.out.print(y + "|");
            int x = 0;
            while (x <= y) {
                System.out.print(" ");
                x++;
            }
            if (indice < letras.length) {
                System.out.println(letras[indice]);
                indice++;
            } else {
                System.out.println();
            }
            y--;
        }

        System.out.print("0|");
        int i = 0;
        while (i <= n + 2) {
            System.out.print("_");
            i++;
        }
        System.out.println();
    }

    // ---------- DO...WHILE ----------
    private void metodoDoWhile(int n, char[] letras) {
        int y = n;
        int indice = 0;

        do {
            System.out.print(y + "|");
            int x = 0;
            do {
                System.out.print(" ");
                x++;
            } while (x <= y);
            if (indice < letras.length) {
                System.out.println(letras[indice]);
                indice++;
            } else {
                System.out.println();
            }
            y--;
        } while (y >= 0);

        System.out.print("0|");
        int i = 0;
        do {
            System.out.print("_");
            i++;
        } while (i <= n + 2);
        System.out.println();
    }
}

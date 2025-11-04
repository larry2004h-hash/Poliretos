package arrays;

public class A03Arrays {
    public static void main(String[] args) {
        String nombre = "Samuel"; 
        char[] letras = nombre.toCharArray();

        System.out.println("=== MÉTODO CON FOR ===");
        metodoFor(letras);

        System.out.println("\n=== MÉTODO CON WHILE ===");
        metodoWhile(letras);

        System.out.println("\n=== MÉTODO CON DO...WHILE ===");
        metodoDoWhile(letras);
    }




    // Método con FOR
    public static void metodoFor(char[] letras) {
        int maxX = letras.length - 1;
        int maxY = 2 * maxX;

        for (int y = maxY; y >= 0; y--) {
            System.out.printf("%2d | ", y);

            boolean dibujoHecho = false;
            for (int x = 0; x <= maxX; x++) {
                int fx = 2 * x; 
                if (fx == y) {
                    System.out.print(letras[x]);
                    dibujoHecho = true;
                    break;
                } else {
                    System.out.print("   ");
                }
            }
            if (!dibujoHecho) System.out.print("");
            System.out.println();
        }

        System.out.print(" 0 |");
        for (int i = 0; i <= maxX * 3; i++) System.out.print("_");
        System.out.println();

        System.out.print("     ");
        for (int i = 0; i <= maxX; i++) System.out.printf("%-3d", i);
        System.out.println();
    }






    // Método con WHILE
    public static void metodoWhile(char[] letras) {
        int maxX = letras.length - 1;
        int maxY = 2 * maxX;

        int y = maxY;
        while (y >= 0) {
            System.out.printf("%2d | ", y);

            int x = 0;
            boolean dibujoHecho = false;

            while (x <= maxX) {
                int fx = 2 * x;
                if (fx == y) {
                    System.out.print(letras[x]);
                    dibujoHecho = true;
                    break;
                } else {
                    System.out.print("   ");
                }
                x++;
            }

            if (!dibujoHecho) System.out.print("");
            System.out.println();
            y--;
        }

        int i = 0;
        System.out.print(" 0 |");
        while (i <= maxX * 3) {
            System.out.print("_");
            i++;
        }
        System.out.println();

        i = 0;
        System.out.print("     ");
        while (i <= maxX) {
            System.out.printf("%-3d", i);
            i++;
        }
        System.out.println();
    }






    // Método con DO...WHILE
    public static void metodoDoWhile(char[] letras) {
        int maxX = letras.length - 1;
        int maxY = 2 * maxX;

        int y = maxY;
        do {
            System.out.printf("%2d | ", y);

            int x = 0;
            boolean dibujoHecho = false;

            do {
                int fx = 2 * x;
                if (fx == y) {
                    System.out.print(letras[x]);
                    dibujoHecho = true;
                    break;
                } else {
                    System.out.print("   ");
                }
                x++;
            } while (x <= maxX);

            if (!dibujoHecho) System.out.print("");
            System.out.println();
            y--;
        } while (y >= 0);

        int i = 0;
        System.out.print(" 0 |");
        do {
            System.out.print("_");
            i++;
        } while (i <= maxX * 3);
        System.out.println();

        i = 0;
        System.out.print("     ");
        do {
            System.out.printf("%-3d", i);
            i++;
        } while (i <= maxX);
        System.out.println();
    }
}




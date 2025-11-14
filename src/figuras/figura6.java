package figuras;

public class figura6 {

 
    public void g4_dibujarConFor(int niveles) {
        System.out.println("\nFigura 6 con FOR:");
        for (int i = 1; i <= niveles; i++) {
            // Espacios
            for (int e = 1; e <= niveles - i; e++) {
                System.out.print("  ");
            }
            // Asteriscos
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

  
    public void g4_dibujarConWhile(int niveles) {
        System.out.println("\nFigura 6 con WHILE:");
        int i = 1;
        while (i <= niveles) {
            int e = 1;
            while (e <= niveles - i) {
                System.out.print("  ");
                e++;
            }
            int j = 1;
            while (j <= (2 * i - 1)) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

  
    public void g4_dibujarConDoWhile(int niveles) {
        System.out.println("\nFigura 6 con DO-WHILE:");
        int i = 1;
        do {
            int e = 1;
            do {
                if (e > niveles - i) break;
                System.out.print("  ");
                e++;
            } while (true);

            int j = 1;
            do {
                if (j > (2 * i - 1)) break;
                System.out.print("* ");
                j++;
            } while (true);

            System.out.println();
            i++;
        } while (i <= niveles);
    }
}

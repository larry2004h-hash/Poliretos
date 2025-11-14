package figuras;

public class figura8 {


    public void g4_dibujarConFor(int niveles) {
        System.out.println("\nFigura 8 con FOR:");
        for (int i = niveles - 1; i >= 0; i--) {
            // Espacios antes del escalón
            for (int e = 0; e < i * 2; e++) {
                System.out.print(" ");
            }
            System.out.print("_\n");
            if (i > 0) {
                for (int e = 0; e < (i * 2) - 1; e++) {
                    System.out.print(" ");
                }
                System.out.print("|\n");
            }
        }
    }


    public void g4_dibujarConWhile(int niveles) {
        System.out.println("\nFigura 8 con WHILE:");
        int i = niveles - 1;
        while (i >= 0) {
            int e = 0;
            while (e < i * 2) {
                System.out.print(" ");
                e++;
            }
            System.out.print("_\n");

            if (i > 0) {
                e = 0;
                while (e < (i * 2) - 1) {
                    System.out.print(" ");
                    e++;
                }
                System.out.print("|\n");
            }
            i--;
        }
    }

  
    public void g4_dibujarConDoWhile(int niveles) {
        System.out.println("\nFigura 8 con DO-WHILE:");
        int i = niveles - 1;
        do {
            int e = 0;
            do {
                if (e >= i * 2) break;
                System.out.print(" ");
                e++;
            } while (true);
            System.out.print("_\n");

            if (i > 0) {
                e = 0;
                do {
                    if (e >= (i * 2) - 1) break;
                    System.out.print(" ");
                    e++;
                } while (true);
                System.out.print("|\n");
            }
            i--;
        } while (i >= 0);
    }
}
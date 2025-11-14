package figuras;

public class figura9 {

    
    public void g4_dibujarConFor(int niveles) {
        System.out.println("\nFigura 9 con FOR:");
        for (int i = 0; i < niveles; i++) {
            // Espacios iniciales para centrar
            for (int e = 0; e < (niveles - i - 1) * 2; e++) {
                System.out.print(" ");
            }
            // Parte izquierda
            System.out.print("_");
            // Espacios entre las dos partes
            for (int e = 0; e < i * 4; e++) {
                System.out.print(" ");
            }
            // Parte derecha
            if (i > 0) System.out.print("_");
            System.out.println();

            if (i < niveles - 1) {
                for (int e = 0; e < (niveles - i - 1) * 2; e++) {
                    System.out.print(" ");
                }
                System.out.print("|");
                for (int e = 0; e < i * 4; e++) {
                    System.out.print(" ");
                }
                if (i > 0) System.out.print("|");
                System.out.println();
            }
        }
    }

    
    public void g4_dibujarConWhile(int niveles) {
        System.out.println("\nFigura 9 con WHILE:");
        int i = 0;
        while (i < niveles) {
            int e = 0;
            while (e < (niveles - i - 1) * 2) {
                System.out.print(" ");
                e++;
            }
            System.out.print("_");
            e = 0;
            while (e < i * 4) {
                System.out.print(" ");
                e++;
            }
            if (i > 0) System.out.print("_");
            System.out.println();

            if (i < niveles - 1) {
                e = 0;
                while (e < (niveles - i - 1) * 2) {
                    System.out.print(" ");
                    e++;
                }
                System.out.print("|");
                e = 0;
                while (e < i * 4) {
                    System.out.print(" ");
                    e++;
                }
                if (i > 0) System.out.print("|");
                System.out.println();
            }
            i++;
        }
    }

   
    public void g4_dibujarConDoWhile(int niveles) {
        System.out.println("\nFigura 9 con DO-WHILE:");
        int i = 0;
        do {
            int e = 0;
            do {
                if (e >= (niveles - i - 1) * 2) break;
                System.out.print(" ");
                e++;
            } while (true);
            System.out.print("_");
            e = 0;
            do {
                if (e >= i * 4) break;
                System.out.print(" ");
                e++;
            } while (true);
            if (i > 0) System.out.print("_");
            System.out.println();

            if (i < niveles - 1) {
                e = 0;
                do {
                    if (e >= (niveles - i - 1) * 2) break;
                    System.out.print(" ");
                    e++;
                } while (true);
                System.out.print("|");
                e = 0;
                do {
                    if (e >= i * 4) break;
                    System.out.print(" ");
                    e++;
                } while (true);
                if (i > 0) System.out.print("|");
                System.out.println();
            }
            i++;
        } while (i < niveles);
    }
}
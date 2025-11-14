package figuras;

public class figura7 {


    public void g4_dibujarConFor(int niveles) {
        System.out.println("\nFigura 7 con FOR:");
        for (int i = 0; i < niveles; i++) {
            // Espacios antes del escalón
            for (int e = 0; e < i * 2; e++) {
                System.out.print(" ");
            }
            System.out.print("_\n");
            if (i < niveles - 1) {
                for (int e = 0; e < (i * 2) + 1; e++) {
                    System.out.print(" ");
                }
                System.out.print("|\n");
            }
        }
    }

   
    public void g4_dibujarConWhile(int niveles) {
        System.out.println("\nFigura 7 con WHILE:");
        int i = 0;
        while (i < niveles) {
            int e = 0;
            while (e < i * 2) {
                System.out.print(" ");
                e++;
            }
            System.out.print("_\n");

            if (i < niveles - 1) {
                e = 0;
                while (e < (i * 2) + 1) {
                    System.out.print(" ");
                    e++;
                }
                System.out.print("|\n");
            }
            i++;
        }
    }

    
    public void g4_dibujarConDoWhile(int niveles) {
        System.out.println("\nFigura 7 con DO-WHILE:");
        int i = 0;
        do {
            int e = 0;
            do {
                if (e >= i * 2) break;
                System.out.print(" ");
                e++;
            } while (true);
            System.out.print("_\n");

            if (i < niveles - 1) {
                e = 0;
                do {
                    if (e >= (i * 2) + 1) break;
                    System.out.print(" ");
                    e++;
                } while (true);
                System.out.print("|\n");
            }
            i++;
        } while (i < niveles);
    }
}

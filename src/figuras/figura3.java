package figuras;

public class figura3 {


    public void g4_dibujarFor(int niveles) {
        System.out.println("\nFigura 3 con FOR:");
        for (int i = 1; i <= niveles; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

   
    public void g4_dibujarWhile(int niveles) {
        System.out.println("\nFigura 3 con WHILE:");
        int i = 1;
        while (i <= niveles) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    
    public void g4_dibujarDoWhile(int niveles) {
        System.out.println("\nFigura 3 con DO-WHILE:");
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print("* ");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= niveles);
    }

   
}
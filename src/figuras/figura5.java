package figuras;

public class figura5 {

    
    public void g4_dibujarConFor(int niveles) {
        System.out.println("\nFigura 5 con FOR:");
        for (int i = niveles; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

   
    public void g4_dibujarConWhile(int niveles) {
        System.out.println("\nFigura 5 con WHILE:");
        int i = niveles;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }

  
    public void g4_dibujarConDoWhile(int niveles) {
        System.out.println("\nFigura 5 con DO-WHILE:");
        int i = niveles;
        do {
            int j = 1;
            do {
                System.out.print("* ");
                j++;
            } while (j <= i);
            System.out.println();
            i--;
        } while (i >= 1);
    }
}

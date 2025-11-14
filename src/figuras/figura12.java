package figuras;

public class figura12 {


    public void g4_dibujarConFor(int niveles) {
        System.out.println("\nFigura 12 con FOR:");
        for (int i = niveles; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

  
    public void g4_dibujarConWhile(int niveles) {
        System.out.println("\nFigura 12 con WHILE:");
        int i = niveles;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i--;
        }
    }

    
    public void g4_dibujarConDoWhile(int niveles) {
        System.out.println("\nFigura 12 con DO-WHILE:");
        int i = niveles;
        do {
            int j = 1;
            do {
                if (j > i) break;
                System.out.print(j);
                j++;
            } while (true);
            System.out.println();
            i--;
        } while (i >= 1);
    }
}

package figuras;

public class figura13 {

    
    public void g4_dibujarConFor(int niveles) {
        System.out.println("\nFigura 13 con FOR:");
        for (int i = 1; i <= niveles; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    
    public void g4_dibujarConWhile(int niveles) {
        System.out.println("\nFigura 13 con WHILE:");
        int i = 1;
        while (i <= niveles) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }

   
    public void g4_dibujarConDoWhile(int niveles) {
        System.out.println("\nFigura 13 con DO-WHILE:");
        int i = 1;
        do {
            int j = 1;
            do {
                if (j > i) break;
                System.out.print(j);
                j++;
            } while (true);
            System.out.println();
            i++;
        } while (i <= niveles);
    }
}
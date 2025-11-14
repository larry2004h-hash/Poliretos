package figuras;

public class figura1 {

    public void g4_dibujarConFor(int tamaFigura) {
        System.out.println("\nFigura con FOR:");
        for (int i = 0; i < tamaFigura; i++) {
            for (int j = 0; j < tamaFigura; j++) {
                if (i == 0 || i == tamaFigura - 1 || j == 0 || j == tamaFigura - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    
    public void g4_dibujarConWhile(int tamaFigura) {
        System.out.println("\nFigura con WHILE:");
        int i = 0;
        while (i < tamaFigura) {
            int j = 0;
            while (j < tamaFigura) {
                if (i == 0 || i == tamaFigura - 1 || j == 0 || j == tamaFigura - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

   
    public void g4_dibujarConDoWhile(int tamaFigura) {
        System.out.println("\nFigura con DO-WHILE:");
        int i = 0;
        do {
            int j = 0;
            do {
                if (i == 0 || i == tamaFigura - 1 || j == 0 || j == tamaFigura - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            } while (j < tamaFigura);
            System.out.println();
            i++;
        } while (i < tamaFigura);
    }


}
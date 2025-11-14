package figuras;


public class figura2 {


    public void g4_dibujarConFor(int tamFigura) {
        System.out.println("\nFigura F2 con FOR:");
        for (int i = 0; i < tamFigura; i++) {
            for (int j = 0; j < tamFigura; j++) {
                if (i == 0 || i == tamFigura - 1 || j == 0 || j == tamFigura - 1) {
                    // Alternar entre * y +
                    if ((i + j) % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    
    public void g4_dibujarConWhile(int tamFigura) {
        System.out.println("\nFigura F2 con WHILE:");
        int i = 0;
        while (i < tamFigura) {
            int j = 0;
            while (j < tamFigura) {
                if (i == 0 || i == tamFigura - 1 || j == 0 || j == tamFigura - 1) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

  
    public void g4_dibujarConDoWhile(int tamFigura) {
        System.out.println("\nFigura F2 con DO-WHILE:");
        int i = 0;
        do {
            int j = 0;
            do {
                if (i == 0 || i == tamFigura - 1 || j == 0 || j == tamFigura - 1) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {
                    System.out.print("  ");
                }
                j++;
            } while (j < tamFigura);
            System.out.println();
            i++;
        } while (i < tamFigura);
    }

}


package figuras;

public class figura17 {

    
    public void g4_dibujarConFor(int niveles) {
        System.out.println("\nFigura 17 con FOR:");
        for (int i = 0; i < niveles; i++) {
            for (int j = 0; j < niveles; j++) {
                if ((i == 0 && (j == 0 || j == niveles - 1)) ||
                    (i == niveles - 1 && (j == 0 || j == niveles - 1)) ||
                    (i == niveles / 2 && j == niveles / 2)) {
                    System.out.print("1 ");
                } else if ((i == 1 && (j == 1 || j == niveles - 2)) ||
                           (i == niveles - 2 && (j == 1 || j == niveles - 2))) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

   
    public void g4_dibujarConWhile(int niveles) {
        System.out.println("\nFigura 17 con WHILE:");
        int i = 0;
        while (i < niveles) {
            int j = 0;
            while (j < niveles) {
                if ((i == 0 && (j == 0 || j == niveles - 1)) ||
                    (i == niveles - 1 && (j == 0 || j == niveles - 1)) ||
                    (i == niveles / 2 && j == niveles / 2)) {
                    System.out.print("1 ");
                } else if ((i == 1 && (j == 1 || j == niveles - 2)) ||
                           (i == niveles - 2 && (j == 1 || j == niveles - 2))) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

    
    public void g4_dibujarConDoWhile(int niveles) {
        System.out.println("\nFigura 17 con DO-WHILE:");
        int i = 0;
        do {
            int j = 0;
            do {
                if (j >= niveles) break;
                if ((i == 0 && (j == 0 || j == niveles - 1)) ||
                    (i == niveles - 1 && (j == 0 || j == niveles - 1)) ||
                    (i == niveles / 2 && j == niveles / 2)) {
                    System.out.print("1 ");
                } else if ((i == 1 && (j == 1 || j == niveles - 2)) ||
                           (i == niveles - 2 && (j == 1 || j == niveles - 2))) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
                j++;
            } while (true);
            System.out.println();
            i++;
        } while (i < niveles);
    }
}

package figuras;

public class figura14 {

    public void g4_dibujarConFor(int niveles) {
        System.out.println("\nFigura 14 con FOR:");
        for (int i = 0; i < niveles; i++) {
            // Espacios para centrar
            for (int s = 0; s < niveles - i; s++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

   
    public void g4_dibujarConWhile(int niveles) {
        System.out.println("\nFigura 14 con WHILE:");
        int i = 0;
        while (i < niveles) {
            int s = 0;
            while (s < niveles - i) {
                System.out.print(" ");
                s++;
            }
            int j = 0;
            int num = 1;
            while (j <= i) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }

  
    public void g4_dibujarConDoWhile(int niveles) {
        System.out.println("\nFigura 14 con DO-WHILE:");
        int i = 0;
        do {
            int s = 0;
            do {
                if (s >= niveles - i) break;
                System.out.print(" ");
                s++;
            } while (true);
            int j = 0;
            int num = 1;
            do {
                if (j > i) break;
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
                j++;
            } while (true);
            System.out.println();
            i++;
        } while (i < niveles);
    }
}

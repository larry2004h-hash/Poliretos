package figuras;

public class figura15 {

    
    public void g4_dibujarConFor(int niveles) {
        System.out.println("\nFigura 15 con FOR:");
        for (int i = 0; i < niveles; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

   
    public void g4_dibujarConWhile(int niveles) {
        System.out.println("\nFigura 15 con WHILE:");
        int i = 0;
        while (i < niveles) {
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
        System.out.println("\nFigura 15 con DO-WHILE:");
        int i = 0;
        do {
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
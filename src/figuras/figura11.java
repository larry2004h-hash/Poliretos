package figuras;

public class figura11 {

   
    public void g4_dibujarConFor(int niveles) {
        System.out.println("\nFigura 11 con FOR:");
        for (int i = 0; i < niveles; i++) {
            // Espacios antes de la barra vertical
            for (int e = 0; e < i * 2; e++) {
                System.out.print(" ");
            }
            System.out.println("|");

            
            for (int e = 0; e < i * 2; e++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.print("_");
            }
            System.out.println();
        }
    }

    
    public void g4_dibujarConWhile(int niveles) {
        System.out.println("\nFigura 11 con WHILE:");
        int i = 0;
        while (i < niveles) {
            int e = 0;
            while (e < i * 2) {
                System.out.print(" ");
                e++;
            }
            System.out.println("|");

            e = 0;
            while (e < i * 2) {
                System.out.print(" ");
                e++;
            }
            int j = 0;
            while (j <= i) {
                System.out.print("_");
                j++;
            }
            System.out.println();
            i++;
        }
    }

   
    public void g4_dibujarConDoWhile(int niveles) {
        System.out.println("\nFigura 11 con DO-WHILE:");
        int i = 0;
        do {
            int e = 0;
            do {
                if (e >= i * 2) break;
                System.out.print(" ");
                e++;
            } while (true);
            System.out.println("|");

            e = 0;
            do {
                if (e >= i * 2) break;
                System.out.print(" ");
                e++;
            } while (true);

            int j = 0;
            do {
                if (j > i) break;
                System.out.print("_");
                j++;
            } while (true);
            System.out.println();
            i++;
        } while (i < niveles);
    }
}
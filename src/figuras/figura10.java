package figuras;

public class figura10 {

    public void g4_dibujarConFor(int niveles) {
        System.out.println("\nFigura 10 con FOR:");
        for (int i = 0; i < niveles; i++) {
            // Espacios antes del escalón
            for (int e = 0; e < i * 2; e++) {
                System.out.print(" ");
            }
            // Alternar entre _+_ y _-_
            if (i % 2 == 0) {
                System.out.print("_+_\n");
            } else {
                System.out.print("_-_\n");
            }
            // Dibujar la barra vertical si no es el último nivel
            if (i < niveles - 1) {
                for (int e = 0; e < (i * 2) + 2; e++) {
                    System.out.print(" ");
                }
                System.out.print("|\n");
            }
        }
    }

 
    public void g4_dibujarConWhile(int niveles) {
        System.out.println("\nFigura 10 con WHILE:");
        int i = 0;
        while (i < niveles) {
            int e = 0;
            while (e < i * 2) {
                System.out.print(" ");
                e++;
            }
            if (i % 2 == 0) {
                System.out.print("_+_\n");
            } else {
                System.out.print("_-_\n");
            }
            if (i < niveles - 1) {
                e = 0;
                while (e < (i * 2) + 2) {
                    System.out.print(" ");
                    e++;
                }
                System.out.print("|\n");
            }
            i++;
        }
    }

    public void g4_dibujarConDoWhile(int niveles) {
        System.out.println("\nFigura 10 con DO-WHILE:");
        int i = 0;
        do {
            int e = 0;
            while (e < i * 2) {
                System.out.print(" ");
                e++;
            }
            if (i % 2 == 0) {
                System.out.print("_+_\n");
            } else {
                System.out.print("_-_\n");
            }
            if (i < niveles - 1) {
                e = 0;
                while (e < (i * 2) + 2) {
                    System.out.print(" ");
                    e++;
                }
                System.out.print("|\n");
            }
            i++;
        } while (i < niveles);
    }

}

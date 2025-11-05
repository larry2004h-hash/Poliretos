package figuras;

public class figura1 {

    
    public void g4_dibujarFigura1(int niveles) {

        // Primera fila de asteriscos
        for (int i = 0; i < niveles; i++) {
            System.out.print("* ");
        }
        System.out.println();

        
        for (int i = 0; i < niveles - 2; i++) {
            System.out.print("* ");
            for (int j = 0; j < niveles - 2; j++) {
                System.out.print("  "); // dos espacios
            }
            System.out.println("*");
        }

        
        if (niveles > 1) {
            for (int i = 0; i < niveles; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package figuras;

public class figura9 {

    public void g4_dibujarFigura9(int niveles) {
      

        int espacio = niveles * 2;

        
        for (int i = 0; i < niveles; i++) {
            for (int e = 0; e < espacio - (i * 2); e++) {
                System.out.print(" ");
            }
            System.out.print("___");
            if (i > 0) {
                for (int e = 0; e < (i - 1) * 4; e++) {
                    System.out.print(" ");
                }
                System.out.print("___");
            }
            System.out.println();
            if (i < niveles - 1) {
                for (int e = 0; e < espacio - (i * 2) - 1; e++) {
                    System.out.print(" ");
                }
                System.out.print("|");
                for (int e = 0; e < (i * 4) + 2; e++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }
    }
}

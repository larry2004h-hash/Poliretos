package figuras;

public class figura3 {

    
    public void g4_dibujarFigura3(int niveles) {


        for (int fila = 1; fila <= niveles; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

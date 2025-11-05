package figuras;

public class figura6 {

  
    public void g4_dibujarFigura6(int niveles) {
      

        for (int fila = 1; fila <= niveles; fila++) {
            
            for (int espacios = 0; espacios < niveles - fila; espacios++) {
                System.out.print(" ");
            }
           
            for (int col = 1; col <= fila; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

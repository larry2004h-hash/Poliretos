package figuras;

public class figura5 {

   
    public void g4_dibujarFigura5(int niveles) {
        
        for (int fila = 0; fila < niveles; fila++) {
            
            for (int espacios = 0; espacios < fila; espacios++) {
                System.out.print(" ");
            }
           
            for (int col = 0; col < (niveles - fila); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

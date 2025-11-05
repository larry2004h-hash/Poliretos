package figuras;

public class figura8 {

    public void g4_dibujarFigura8(int niveles) {
     

        for (int i = 0; i < niveles; i++) {
           
            for (int esp = niveles - i - 1; esp > 0; esp--) {
                System.out.print("   ");
            }
            System.out.println("|");

           
            for (int esp = niveles - i - 1; esp > 1; esp--) {
                System.out.print("   ");
            }
            System.out.println("___");
        }
    }
}

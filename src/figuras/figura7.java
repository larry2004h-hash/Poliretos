package figuras;

public class figura7 {

    
    public void g4_dibujarFigura7(int niveles) {
      

        
        for (int i = 0; i < niveles; i++) {
            
            for (int esp = 0; esp < i * 3; esp++) {
                System.out.print(" ");
            }
            
            // Parte superior del escalón
            System.out.println("___");
            
            for (int esp = 0; esp < i * 3 + 2; esp++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}

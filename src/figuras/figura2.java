package figuras;

public class figura2 {

    
    public void g4_dibujarFigura2(int tamaFigura) {
       

        
        for (int i = 0; i < tamaFigura; i++) {
            System.out.print((i % 2 == 0) ? "* " : "+ ");
        }
        System.out.println();

        
        for (int fila = 1; fila < tamaFigura - 1; fila++) {
            for (int col = 0; col < tamaFigura; col++) {
                if (col == 0 || col == tamaFigura - 1) {
                   
                    System.out.print((fila % 2 == 1) ? "+ " : "* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }

       
        for (int i = 0; i < tamaFigura; i++) {
            System.out.print((i % 2 == 0) ? "* " : "+ ");
        }
        System.out.println();
    }
}

    


package figuras;

public class figura13 {

    public void g4_dibujarFigura13(int niveles) {
        for (int i = 1; i <= niveles; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

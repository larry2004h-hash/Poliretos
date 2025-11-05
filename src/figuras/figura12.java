package figuras;

public class figura12 {

    public void g4_dibujarFigura12(int niveles) {
        for (int i = niveles; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

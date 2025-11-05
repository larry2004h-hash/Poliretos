package figuras;

public class figura16 {

    public void g4_dibujarFigura16(int niveles) {
        for (int i = 0; i < niveles; i++) {
            for (int j = 0; j < niveles; j++) {
                if (i == j || i + j == niveles - 1) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

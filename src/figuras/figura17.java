package figuras;

public class figura17 {

    public void g4_dibujarFigura17(int niveles) {
        for (int i = 0; i < niveles; i++) {
            for (int j = 0; j < niveles; j++) {
                if (j == i || j == niveles - 1 - i) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

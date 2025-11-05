package figuras;

public class figura10 {

    public void g4_dibujarFigura10(int niveles) {

        for (int i = 0; i < niveles; i++) {
            for (int esp = 0; esp < i * 4; esp++) {
                System.out.print(" ");
            }

            char signo = (i % 2 == 0) ? '+' : '-';
            System.out.println("_" + signo + "_");

            for (int esp = 0; esp < i * 4 + 2; esp++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}

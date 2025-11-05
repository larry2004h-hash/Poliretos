package figuras;

public class figura11 {

    public void g4_dibujarFigura11(int niveles) {
        int desplazamiento = 0;
        for (int i = 0; i < niveles; i++) {
            for (int esp = 0; esp < desplazamiento; esp++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int guion = 0; guion < i + 2; guion++) {
                System.out.print("_");
            }
            System.out.println();
            desplazamiento += i + 2;
        }
    }
}

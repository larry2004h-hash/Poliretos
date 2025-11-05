package figuras;

public class figura15 {

    public void g4_dibujarFigura15(int niveles) {
        for (int i = 0; i < niveles; i++) {
            int numero = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(numero + " ");
                numero = numero * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

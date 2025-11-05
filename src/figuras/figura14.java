package figuras;

public class figura14 {

    public void g4_dibujarFigura14(int niveles) {
        for (int i = 0; i < niveles; i++) {
            for (int espacios = 0; espacios < niveles - i - 1; espacios++) {
                System.out.print(" ");
            }
            int numero = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(numero + " ");
                numero = numero * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}



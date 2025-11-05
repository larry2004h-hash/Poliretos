package figuras;

public class figura19 {

    public void g4_dibujarFigura19(int niveles) {

        if (niveles >= 1) {
            System.out.println("*");
        }

        if (niveles >= 2) {
            System.out.println("+ *");
        }

        int[] filaAnterior = null;

        for (int nivel = 3; nivel <= niveles; nivel++) {
            int longitud = nivel - 1;
            int[] filaActual = new int[longitud];

            for (int i = 0; i < longitud; i++) {
                if (i == 0) {
                    filaActual[i] = nivel;
                } else if (i == longitud - 1) {
                    filaActual[i] = 2;
                } else {
                    filaActual[i] = filaAnterior[i - 1] + filaAnterior[i];
                }
            }

            filaAnterior = filaActual;

            System.out.print("+ ");
            for (int num : filaActual) {
                System.out.print(num + " ");
            }
            System.out.println("*");
        }
    }
}

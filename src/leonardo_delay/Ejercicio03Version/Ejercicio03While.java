package leonardo_delay.Ejercicio03Version;
import java.util.Scanner;
public class Ejercicio03While {

    public static void g4_cargarDesplazamiento() {
        Scanner sc = new Scanner(System.in);
        final int LONGITUD_BARRA = 20;
        System.out.print("Ingrese el caracter para simular la carga: ");
        char simbolo = sc.next().charAt(0);
        int i=0;

        while(i<=100) {
            int posicion = (i * (LONGITUD_BARRA - 1)) / 100;

            StringBuilder barra = new StringBuilder(" ".repeat(LONGITUD_BARRA));
            barra.setCharAt(posicion, simbolo);

            System.out.printf("\r[%s] %3d%%", barra, i);
            System.out.flush();

            try {
                Thread.sleep(120);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            i+=5;
        }
        System.out.println("\nCarga completada!");
    }
}

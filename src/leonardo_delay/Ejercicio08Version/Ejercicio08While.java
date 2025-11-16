package leonardo_delay.Ejercicio08Version;

import java.util.Scanner;

public class Ejercicio08While {
    public static void g4_cargarNombre() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre y apellidos: ");
        String nombre = sc.nextLine();

        int longitudTotal = 20;
        int delay = 150;
        int letras = nombre.length();

        System.out.println("\nCargando nombre...\n");

        int i = 0;
        while (i <= letras) {

            String parte = nombre.substring(0, i);

            StringBuilder barra = new StringBuilder(parte);

            int j = i;
            while (j < longitudTotal) {
                barra.append(" ");
                j++;
            }

            int porcentaje = (i * 100) / letras;
            if (porcentaje > 100) porcentaje = 100;

            System.out.print("\r[" + barra + "] " + porcentaje + "%");
            Thread.sleep(delay);

            i++;
        }

        System.out.println("\n\nCarga completada");
    }
}

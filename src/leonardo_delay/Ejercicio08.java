package leonardo_delay;

import java.util.Scanner;

public class Ejercicio08 {
    public static void g4_cargarNombre() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre y apellidos: ");
        String nombre = sc.nextLine();

        int longitudTotal = 20;
        int delay = 150;
        int letras = nombre.length();

        System.out.println("\nCargando nombre...\n");

        for (int i = 0; i <= letras; i++) {

            String parte = nombre.substring(0, i);

            StringBuilder barra = new StringBuilder(parte);
            for (int j = i; j < longitudTotal; j++) {
                barra.append(" ");
            }

            // porcentaje
            int porcentaje = (i * 100) / letras;
            if (porcentaje > 100) porcentaje = 100;

            System.out.print("\r[" + barra + "] " + porcentaje + "%");
            Thread.sleep(delay);
        }

        System.out.println("\n\nCarga completada");
    }
}

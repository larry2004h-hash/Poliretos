package leonardo_delay;

import java.util.Scanner;

public class Ejercicio09 {
    public static void g4_cargarLetraPorLetra() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre completo: ");
        String nombre = sc.nextLine();

        int longitud = nombre.length();
        int ancho = 20;
        int delay = 200;

        System.out.println("\nCargando nombre letra a letra...\n");

        for (int i = 0; i < longitud; i++) {
            char letra = nombre.charAt(i);


            int posicion = (i * ancho) / longitud;


            StringBuilder barra = new StringBuilder("[");
            for (int j = 0; j < ancho; j++) {
                if (j == posicion) barra.append(letra);
                else barra.append(" ");
            }
            barra.append("]");

            int porcentaje = (i * 100) / (longitud - 1);
            if (porcentaje > 100) porcentaje = 100;


            System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
            System.out.flush();

            Thread.sleep(delay);
        }

        System.out.println("\n\nCarga finalizada ");
    }
}


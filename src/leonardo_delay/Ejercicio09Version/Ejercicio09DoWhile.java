package leonardo_delay.Ejercicio09Version;

import java.util.Scanner;

public class Ejercicio09DoWhile {
    public static void g4_cargarLetraPorLetra() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre completo: ");
        String nombre = sc.nextLine();

        int longitud = nombre.length();
        int ancho = 20;
        int delay = 200;

        System.out.println("\nCargando nombre letra a letra...\n");

        int i = 0;
        if (longitud == 0) return;

        do {

            char letra = nombre.charAt(i);

            int posicion = (i * ancho) / longitud;

            StringBuilder barra = new StringBuilder("[");
            int j = 0;

            do {
                if (j == posicion) barra.append(letra);
                else barra.append(" ");
                j++;
            } while (j < ancho);

            barra.append("]");

            int porcentaje = (i * 100) / (longitud - 1);
            if (porcentaje > 100) porcentaje = 100;

            System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
            System.out.flush();

            Thread.sleep(delay);
            i++;

        } while (i < longitud);

        System.out.println("\n\nCarga finalizada ");
    }
}

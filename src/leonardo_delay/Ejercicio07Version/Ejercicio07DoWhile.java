package leonardo_delay.Ejercicio07Version;

public class Ejercicio07DoWhile {

    public static void g4_cargarRotacionPunta() throws InterruptedException {

        int longitud = 20;
        int delay = 100;
        char[] rotacion = {'\\', '|', '/', '-'};

        int i = 0;

        do {

            int r = 0;

            do {

                StringBuilder barra = new StringBuilder();

                int j = 0;
                while (j < i) {
                    barra.append("=");
                    j++;
                }

                if (i < longitud)
                    barra.append(rotacion[r]);
                else
                    barra.append("=");

                j = i + 1;
                while (j < longitud) {
                    barra.append(" ");
                    j++;
                }

                int porcentaje = (i * 100) / longitud;

                System.out.print("\r[" + barra + "] " + porcentaje + "%");
                Thread.sleep(delay);

                r++;

            } while (r < rotacion.length);

            i++;

        } while (i <= longitud);

        System.out.println("\nCompletado ");
    }
}

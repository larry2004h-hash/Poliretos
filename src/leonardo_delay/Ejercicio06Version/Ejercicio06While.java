package leonardo_delay.Ejercicio06Version;

public class Ejercicio06While {

    public static void g4_cargarDesplazamientoPunta() throws InterruptedException {

        int longitud = 20;
        int delay = 100;

        int i = 0;

        while (i <= longitud) {

            StringBuilder barra = new StringBuilder();

            int j = 0;
            while (j < i) {
                barra.append(" ");
                j++;
            }

            barra.append("<=>");

            j = i + 3;
            while (j < longitud + 3) {
                barra.append(" ");
                j++;
            }

            int porcentaje = (i * 100) / longitud;

            System.out.print("\r[" + barra + "] " + porcentaje + "%");
            Thread.sleep(delay);

            i++;
        }

        System.out.println("\nFinalizado ");
    }
}


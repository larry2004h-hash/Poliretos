package leonardo_delay;

public class Ejercicio06 {
    public static void g4_cargarDesplazamientoPunta() throws InterruptedException {
        int longitud = 20;
        int delay = 100;

        for (int i = 0; i <= longitud; i++) {
            StringBuilder barra = new StringBuilder();

            for (int j = 0; j < i; j++) {
                barra.append(" ");
            }

            barra.append("<=>");

            for (int j = i + 3; j < longitud + 3; j++) {
                barra.append(" ");
            }

            int porcentaje = (i * 100) / longitud;

            System.out.print("\r[" + barra + "] " + porcentaje + "%");
            Thread.sleep(delay);
        }

        System.out.println("\nFinalizado ");
    }
}

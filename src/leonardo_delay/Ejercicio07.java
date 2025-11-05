package leonardo_delay;

public class Ejercicio07 {
    public static void g4_cargarRotacionPunta() throws InterruptedException {
        int longitud = 20;
        int delay = 100;
        char[] rotacion = {'\\', '|', '/', '-'};

        for (int i = 0; i <= longitud; i++) {
            for (int r = 0; r < rotacion.length; r++) {
                StringBuilder barra = new StringBuilder();

                for (int j = 0; j < i; j++) {
                    barra.append("=");
                }

                if (i < longitud)
                    barra.append(rotacion[r]);
                else
                    barra.append("=");

                for (int j = i + 1; j < longitud; j++) {
                    barra.append(" ");
                }
                int porcentaje = (i * 100) / longitud;

                System.out.print("\r[" + barra + "] " + porcentaje + "%");
                Thread.sleep(delay);
            }
        }

        System.out.println("\nCompletado ");
    }
}

package leonardo_delay.Ejercicio05Version;

public class Ejercicio05For {

    public static void g4_cargarPuntaAlterna() throws InterruptedException {
        final int LONGITUD = 20;
        final int DELAY_MS = 100;
        for (int percent = 0; percent <= 100; percent += 5) {
            int llenas = (percent * LONGITUD) / 100;

            String barra;
            if (llenas == 0) {
                char punta = (percent / 5 % 2 == 0) ? '>' : '-';
                String derecha = " ".repeat(LONGITUD - 1);
                barra = String.format("[%c%s]", punta, derecha);
            } else if (llenas >= LONGITUD) {
                barra = "[" + "=".repeat(LONGITUD) + "]";
            } else {

                char punta = (percent / 5 % 2 == 0) ? '>' : '-';
                String llena = "=".repeat(llenas - 1);
                String vacia = " ".repeat(LONGITUD - llenas);
                barra = String.format("[%s%c%s]", llena, punta, vacia);
            }

            System.out.printf("\r%s %3d%%", barra, percent);
            System.out.flush();

            Thread.sleep(DELAY_MS);
        }

        System.out.println("\nCarga completada.");
    }
}

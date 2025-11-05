package leonardo_delay;
public class Ejercicio02 {
    public static void g4_cargarBarra() {
        final int LONGITUD_BARRA = 20;
        char simbolo = '#';

        for (int i = 0; i <= 100; i += 5) {
            int cantidadLlena = (i * LONGITUD_BARRA) / 100;
            String llena = String.valueOf(simbolo).repeat(cantidadLlena);
            String vacia = " ".repeat(LONGITUD_BARRA - cantidadLlena);

            System.out.printf("\r[%s%s] %3d%%", llena, vacia, i);
            System.out.flush();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\nCarga completada!");
    }
}

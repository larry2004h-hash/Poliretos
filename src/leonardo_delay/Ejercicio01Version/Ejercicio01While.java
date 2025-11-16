package leonardo_delay.Ejercicio01Version;

public class Ejercicio01While {

    public static void g4_cargarIndicador() {

        String[] rotacion = {"|", "/", "-", "\\"};
        int i = 0;

        while (i <= 100) {
            String simbolo = rotacion[i % rotacion.length];
            System.out.printf("\r%s %d%%", simbolo, i);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            i++;
        }

        System.out.println("\nCarga completada!");
    }
}

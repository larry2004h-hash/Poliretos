package leonardo_delay.Ejercicio01Version;

public class Ejercicio01DoWhile {

    public static void g4_cargarIndicador() {

        String[] rotacion = {"|", "/", "-", "\\"};
        int i = 0;

        do {
            String simbolo = rotacion[i % rotacion.length];
            System.out.printf("\r%s %d%%", simbolo, i);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            i++;
        } while (i <= 100);

        System.out.println("\nCarga completada!");
    }
}


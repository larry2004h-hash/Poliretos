package leonardo_delay.Ejercicio01Version;
public class Ejercicio01For {
    public static void g4_cargarIndicador() throws InterruptedException {
        String[] rotacion = {"|", "/", "-", "\\"};

        for (int i = 0; i <= 100; i++) {
            String simbolo = rotacion[i % rotacion.length];
            System.out.printf("\r%s %d%%", simbolo, i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\nCarga completada!");
    }
}


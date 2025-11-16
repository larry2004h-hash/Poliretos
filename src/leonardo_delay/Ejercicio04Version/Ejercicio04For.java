package leonardo_delay.Ejercicio04Version;

public class Ejercicio04For {
    public static void g4_cargarWaiting() throws InterruptedException {
        String[] frames = {"o0o", "0o0"};

        for(int porcentaje=0; porcentaje<=100; porcentaje++){
            String frame = frames[porcentaje % 2];
            System.out.printf("\r%s %d%%", frame, porcentaje);
            System.out.flush();
            Thread.sleep(80);
        }
        System.out.println("\nCompletado!");
    }
}

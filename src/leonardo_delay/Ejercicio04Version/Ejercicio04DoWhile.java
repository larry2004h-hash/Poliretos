package leonardo_delay.Ejercicio04Version;

public class Ejercicio04DoWhile {
    public static void g4_cargarWaiting() throws InterruptedException {
        int porcentaje = 0;
        String[] frames = {"o0o", "0o0"};

        do{
            String frame = frames[porcentaje % 2];
            System.out.printf("\r%s %d%%", frame, porcentaje);
            System.out.flush();
            Thread.sleep(80);
            porcentaje++;
        }while(porcentaje<=100);
        System.out.println("\nCompletado!");
    }

}

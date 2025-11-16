package leonardo_delay.Ejercicio02Version;

public class Ejercicio02DoWhile {
    public static void g4_cargarBarra() {
        final int LONGITUD_BARRA = 20;
        char simbolo = '#';
        int i=0;
        do{
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
            i+=5;
        }while(i<=100);
        System.out.println("\nCarga completada!");
    }
}

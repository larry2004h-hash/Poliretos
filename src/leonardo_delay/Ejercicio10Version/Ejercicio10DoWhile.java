package leonardo_delay.Ejercicio10Version;

import java.util.Random;

public class Ejercicio10DoWhile {

    public static void g4_descargarArchivo() throws InterruptedException {
        Random random = new Random();

        double total = 10 + random.nextInt(91);
        double descargado = 0;
        int anchoBarra = 30;
        String nombreArchivo = "ArchivoYarl-win_amd64.whl";

        System.out.printf("Downloading %s (%.1f kB)\n", nombreArchivo, total);

        final String RESET = "\u001B[0m";
        final String VERDE = "\u001B[32m";
        final String CYAN = "\u001B[36m";

        do {
            descargado += random.nextDouble() * 5;
            if (descargado > total) descargado = total;

            double progreso = descargado / total;
            int llenos = (int) (progreso * anchoBarra);

            String barra = "━".repeat(llenos) + " ".repeat(anchoBarra - llenos);

            System.out.printf("\r%s%s%s %.1f / %.1f kB",VERDE,barra,RESET,descargado,total);

            if (descargado >= total) break;

            System.out.flush();
            Thread.sleep(200);

        } while (true);

        System.out.printf("\n%sDescarga completada correctamente %s\n", CYAN, RESET);
    }
}


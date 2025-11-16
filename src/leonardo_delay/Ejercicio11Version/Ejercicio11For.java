package leonardo_delay.Ejercicio11Version;

import java.util.Random;

public class Ejercicio11For {

    public static void g4_animarSenal() throws InterruptedException {
        Random random = new Random();
        int repeticiones = 15;
        final String VERDE = "\u001B[32m";
        final String RESET = "\u001B[0m";

        String[] longitudes = {
            "-|- ",
            "--|-- ",
            "---|--- ",
            "----|---- ",
            "-----|----- ",
            "------|------ ",
            "-------|------- ",
            "--------|-------- ",
            "---------|--------- "
        };

        for (int i = 0; i < repeticiones; i++) {

            String barra = longitudes[random.nextInt(longitudes.length)];

            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.print(VERDE + barra + RESET);
            Thread.sleep(500);
        }

        System.out.println();
    }
}

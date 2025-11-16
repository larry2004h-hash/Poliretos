package leonardo_delay.Ejercicio12Version;

public class Ejercicio12For {
    public static void g4_animarFigura() throws InterruptedException {
        String[] figura = {
            "   \\||//",
            "   (> <)",
            "ooO-(_)-Ooo"
        };

        int maxDesplazamiento = 20;

        for (int ciclo = 0; ciclo < 2; ciclo++) {
            for (int desplazamiento = 0; desplazamiento <= maxDesplazamiento; desplazamiento++) {
                System.out.print("\033[H\033[2J");
                System.out.flush();

                String espacios = " ".repeat(desplazamiento);
                for (String linea : figura) {
                    System.out.println("\033[36m" + espacios + linea + "\033[0m");
                }
                Thread.sleep(100);
            }

            for (int desplazamiento = maxDesplazamiento; desplazamiento >= 0; desplazamiento--) {
                System.out.print("\033[H\033[2J");
                System.out.flush();

                String espacios = " ".repeat(desplazamiento);
                for (String linea : figura) {
                    System.out.println("\033[36m" + espacios + linea + "\033[0m");
                }
                Thread.sleep(100);
            }
        }
    }
}

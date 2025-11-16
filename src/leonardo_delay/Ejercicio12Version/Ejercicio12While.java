package leonardo_delay.Ejercicio12Version;

public class Ejercicio12While {

    public static void g4_animarFigura() throws InterruptedException {

        String[] figura = {
            "   \\||//",
            "   (> <)",
            "ooO-(_)-Ooo"
        };

        int max = 20;
        int ciclos = 0;

        while (ciclos < 2) {

            int d = 0;
            while (d <= max) {
                System.out.print("\033[H\033[2J");
                System.out.flush();

                String esp = " ".repeat(d);
                for (String linea : figura) {
                    System.out.println("\033[36m" + esp + linea + "\033[0m");
                }

                Thread.sleep(100);
                d++;
            }

            d = max;
            while (d >= 0) {
                System.out.print("\033[H\033[2J");
                System.out.flush();

                String esp = " ".repeat(d);
                for (String linea : figura) {
                    System.out.println("\033[36m" + esp + linea + "\033[0m");
                }

                Thread.sleep(100);
                d--;
            }

            ciclos++;
        }
    }
}

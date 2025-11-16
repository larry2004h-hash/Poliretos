package leonardo_delay.Ejercicio12Version;

public class Ejercicio12DoWhile {

    public static void g4_animarFigura() throws InterruptedException {

        String[] figura = {
            "   \\||//",
            "   (> <)",
            "ooO-(_)-Ooo"
        };

        int max = 20;
        int ciclos = 0;

        do {

            int d = 0;
            do {
                System.out.print("\033[H\033[2J");
                System.out.flush();

                String esp = " ".repeat(d);
                for (String linea : figura) {
                    System.out.println("\033[36m" + esp + linea + "\033[0m");
                }

                Thread.sleep(100);
                d++;

            } while (d <= max);

            d = max;
            do {
                System.out.print("\033[H\033[2J");
                System.out.flush();

                String esp = " ".repeat(d);
                for (String linea : figura) {
                    System.out.println("\033[36m" + esp + linea + "\033[0m");
                }

                Thread.sleep(100);
                d--;

            } while (d >= 0);

            ciclos++;

        } while (ciclos < 2);
    }
}

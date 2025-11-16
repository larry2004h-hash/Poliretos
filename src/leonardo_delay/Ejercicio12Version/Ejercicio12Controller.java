package leonardo_delay.Ejercicio12Version;

import java.util.Scanner;

public class Ejercicio12Controller {

    public static void ejecutar() throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio 12 - Seleccione la version a ejecutar:");
        System.out.println("1. For");
        System.out.println("2. While");
        System.out.println("3. DoWhile");
        System.out.print("Ingrese opcion: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Ejercicio12For.g4_animarFigura();
                break;

            case 2:
                Ejercicio12While.g4_animarFigura();
                break;

            case 3:
                Ejercicio12DoWhile.g4_animarFigura();
                break;

            default:
                System.out.println("opcion invalida");
        }
    }
}


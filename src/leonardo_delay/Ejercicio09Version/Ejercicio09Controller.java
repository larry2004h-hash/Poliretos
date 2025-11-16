package leonardo_delay.Ejercicio09Version;

import java.util.Scanner;

public class Ejercicio09Controller {

    public static void ejecutar() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el modo a ejecutar:");
        System.out.println("1. Version FOR");
        System.out.println("2. Version WHILE");
        System.out.println("3. Version DO-WHILE");
        System.out.print("Opcion: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Ejercicio09For.g4_cargarLetraPorLetra();
                break;

            case 2:
                Ejercicio09While.g4_cargarLetraPorLetra();
                break;

            case 3:
                Ejercicio09DoWhile.g4_cargarLetraPorLetra();
                break;

            default:
                System.out.println("Opcion invalida");
        }
    }
}


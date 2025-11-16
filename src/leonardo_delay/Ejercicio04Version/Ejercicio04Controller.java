package leonardo_delay.Ejercicio04Version;

import java.util.Scanner;

public class Ejercicio04Controller {

    public static void ejecutar() throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione la forma de ejecución:");
        System.out.println("1. for");
        System.out.println("2. while");
        System.out.println("3. do while");
        System.out.print("Opción: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Ejercicio04For.g4_cargarWaiting();
                break;
            case 2:
                Ejercicio04While.g4_cargarWaiting();
                break;
            case 3:
                Ejercicio04DoWhile.g4_cargarWaiting();
                break;
            default:
                System.out.println("Opción inválida");
        }

        System.out.println("====================");

    }
}


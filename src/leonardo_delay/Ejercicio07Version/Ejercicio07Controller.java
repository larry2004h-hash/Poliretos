package leonardo_delay.Ejercicio07Version;

import java.util.Scanner;

public class Ejercicio07Controller {

    public static void ejecutar() throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione la forma de ejecucion:");
        System.out.println("1. for");
        System.out.println("2. while");
        System.out.println("3. do while");
        System.out.print("Opcion: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Ejercicio07For.g4_cargarRotacionPunta();
                break;
            case 2:
                Ejercicio07While.g4_cargarRotacionPunta();
                break;
            case 3:
                Ejercicio07DoWhile.g4_cargarRotacionPunta();
                break;
            default:
                System.out.println("Opcion invalida");
        }

        System.out.println("====================");
    }
}




package leonardo_delay.Ejercicio02Version;

import java.util.Scanner;

public class Ejercicio02Controller {

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione la forma de ejecución:");
        System.out.println("1. for");
        System.out.println("2. while");
        System.out.println("3. do while");
        System.out.print("Opción: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Ejercicio02For.g4_cargarBarra();
                break;
            case 2:
                Ejercicio02While.g4_cargarBarra();
                break;
            case 3:
                Ejercicio02DoWhile.g4_cargarBarra();
                break;
            default:
                System.out.println("Opción inválida");
        }

        System.out.println("====================");
    }
}


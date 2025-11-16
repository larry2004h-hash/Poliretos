package leonardo_delay.Ejercicio03Version;

import java.util.Scanner;

public class Ejercicio03Controller {

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
                Ejercicio03For.g4_cargarDesplazamiento();
                break;
            case 2:
                Ejercicio03While.g4_cargarDesplazamiento();
                break;
            case 3:
                Ejercicio03DoWhile.g4_cargarDesplazamiento();
                break;
            default:
                System.out.println("Opción inválida");
        }

        System.out.println("====================");

    }
}


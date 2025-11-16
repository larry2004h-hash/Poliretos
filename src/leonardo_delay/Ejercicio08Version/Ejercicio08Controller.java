package leonardo_delay.Ejercicio08Version;

import java.util.Scanner;

public class Ejercicio08Controller {

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
                Ejercicio08For.g4_cargarNombre();
                break;

            case 2:
                Ejercicio08While.g4_cargarNombre();
                break;

            case 3:
                Ejercicio08DoWhile.g4_cargarNombre();
                break;

            default:
                System.out.println("Opcion invalida");
        }
    }
}


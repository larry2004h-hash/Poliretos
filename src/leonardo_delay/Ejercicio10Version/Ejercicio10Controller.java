package leonardo_delay.Ejercicio10Version;

import java.util.Scanner;

public class Ejercicio10Controller {

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
                Ejercicio10For.g4_descargarArchivo();
                break;

            case 2:
                Ejercicio10While.g4_descargarArchivo();
                break;

            case 3:
                Ejercicio10DoWhile.g4_descargarArchivo();
                break;

            default:
                System.out.println("Opcion invalida");
        }
    }
}


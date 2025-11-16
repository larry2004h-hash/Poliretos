package leonardo_delay.Ejercicio06Version;

import java.util.Scanner;

public class Ejercicio06Controller {

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
                Ejercicio06For.g4_cargarDesplazamientoPunta();
                break;
            case 2:
                Ejercicio06While.g4_cargarDesplazamientoPunta();
                break;
            case 3:
                Ejercicio06DoWhile.g4_cargarDesplazamientoPunta();
                break;
            default:
                System.out.println("Opcion invalida");
        }

        System.out.println("====================");

    }
}


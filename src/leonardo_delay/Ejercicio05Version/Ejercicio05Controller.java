package leonardo_delay.Ejercicio05Version;

import java.util.Scanner;

public class Ejercicio05Controller {

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
                Ejercicio05For.g4_cargarPuntaAlterna();
                break;
            case 2:
                Ejercicio05While.g4_cargarPuntaAlterna();
                break;
            case 3:
                Ejercicio05DoWhile.g4_cargarPuntaAlterna();
                break;
            default:
                System.out.println("Opcion invalida");
        }

        System.out.println("====================");
    }
}

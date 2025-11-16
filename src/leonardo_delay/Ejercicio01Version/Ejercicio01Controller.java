package leonardo_delay.Ejercicio01Version;

import java.util.Scanner;

public class Ejercicio01Controller {

    public static void ejecutar() throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione la forma de ejecucion:");
        System.out.println("1. for");
        System.out.println("2. while");
        System.out.println("3. do while");
        System.out.print("Opción: ");
        
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Ejercicio01For.g4_cargarIndicador();
                break;
            case 2:
                Ejercicio01While.g4_cargarIndicador();
                break;
            case 3:
                Ejercicio01DoWhile.g4_cargarIndicador();
                break;
            default:
                System.out.println("Opción inválida");
        }

        System.out.println("====================");
    }
}


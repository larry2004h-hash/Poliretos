package leonardo_delay.Ejercicio11Version;

import java.util.Scanner;

public class Ejercicio11Controller {

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
                System.out.println("=== Animacion de Senal (FOR) ===");
                Ejercicio11For.g4_animarSenal();
                break;

            case 2:
                System.out.println("=== Animacion de Senal (WHILE) ===");
                Ejercicio11While.g4_animarSenal();
                break;

            case 3:
                System.out.println("=== Animacion de Senal (DO WHILE) ===");
                Ejercicio11DoWhile.g4_animarSenal();
                break;

            default:
                System.out.println("Opcion invalida");
        }

    }
}



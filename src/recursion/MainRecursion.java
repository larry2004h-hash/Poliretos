package recursion;

import java.util.Scanner;

public class MainRecursion {

    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("Grupo 4");
        System.out.println("Integrantes:");
        System.out.println("Rios.Mateo");
        System.out.println("Robayo.Samuel");
        System.out.println("Roman.Leonardo");
        System.out.println("Rosero.Mao");
        System.out.println("Sasnalema.Jhoan");
        System.out.println("Soria.Ariel");
        System.out.println("==================================");

        Scanner sc = new Scanner(System.in);

        // ================================
        //  R01 - FACTORIAL
        // ================================
        System.out.println("\n=== R01: Factorial ===");
        System.out.print("Ingrese un número entero para calcular su factorial: ");
        int n1 = sc.nextInt();

        R01Recursion r01 = new R01Recursion();
        r01.mostrarFactoriales(n1);


        // ================================
        //  R02 - SUMA (a + b)
        // ================================
        System.out.println("\n=== R02: Suma Recursiva ===");
        System.out.print("Ingrese el primer número: ");
        int a2 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b2 = sc.nextInt();

        R02Recursion r02 = new R02Recursion();
        r02.mostrarSuma(a2, b2);


        // ================================
        //  R03 - MULTIPLICACIÓN
        // ================================
        System.out.println("\n=== R03: Multiplicación Recursiva ===");
        System.out.print("Ingrese el primer número: ");
        int a3 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b3 = sc.nextInt();

        R03Recursion r03 = new R03Recursion();
        r03.mostrarMultiplicacion(a3, b3);


        // ================================
        //  R04 - POTENCIA
        // ================================
        System.out.println("\n=== R04: Potencia Recursiva ===");
        System.out.print("Ingrese la base: ");
        int base4 = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exp4 = sc.nextInt();

        R04Recursion r04 = new R04Recursion();
        r04.mostrarPotencia(base4, exp4);


        // ================================
        //  R05 - CONTEO PROGRESIVO
        // ================================
        System.out.println("\n=== R05: Conteo Progresivo ===");
        System.out.print("Ingrese el número final del conteo: ");
        int n5 = sc.nextInt();

        R05Recursion r05 = new R05Recursion();
        r05.mostrarConteo(n5);


        // ================================
        //  R06 - CONTEO REGRESIVO
        // ================================
        System.out.println("\n=== R06: Conteo Regresivo ===");
        System.out.print("Ingrese el número inicial del conteo regresivo: ");
        int n6 = sc.nextInt();

        R06Recursion r06 = new R06Recursion();
        r06.mostrarConteoRegresivo(n6);


        // Cerrar Scanner
        sc.close();

        System.out.println("\n=== Fin del módulo de Recursión ===");
    }
}

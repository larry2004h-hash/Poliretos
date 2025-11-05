import java.util.Scanner;
import recursion.*;
import seriescaracteres.*;
import seriesnumericas.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("      Proyecto: Poliretos - Series Numéricas");
        System.out.println("Grupo: 4");
        System.out.println("Integrantes:");
        System.out.println("-Jhoan Patricio Sasnalema De La Cruz\nPongan sus nombres aqui muchachos");
        System.out.println("==========================================\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de términos a generar: ");
        int n = sc.nextInt();

        System.out.println("\n=== SERIE NUMERICA 1 ===");
        S1Numerica serie1 = new S1Numerica();
        serie1.mostrarSeries(n);


        System.out.println("\n=== SERIE NUMERICA 2 ===");
        S2Numerica serie2 = new S2Numerica();
        serie2.mostrarSeries(n);


        System.out.println("\n=== SERIE NUMERICA 3 ===");
        S3Numerica serie3 = new S3Numerica();
        serie3.mostrarSeries(n);


        System.out.println( "\n=== SERIE NUMERICA 4 ===");
        S4Numerica serie4 = new S4Numerica();
        serie4.mostrarSeries(n);

        System.out.println("\n=== SERIE NUMERICA 5 ==="   );
        S5Numerica serie5 = new S5Numerica();
        serie5.mostrarSeries(n);



        System.out.println("\n=== SERIE NUMERICA 6 ===");
        S6Numerica serie6 = new S6Numerica();
        serie6.mostrarSeries(n);


        System.out.println("\n=== SERIE NUMERICA 7 ===");
        S7Numerica serie7 = new S7Numerica();
        serie7.mostrarSeries(n);

        System.out.println("\n=== SERIE NUMERICA 8 ===");
        S8Numerica serie8 = new S8Numerica();
        serie8.mostrarSeries(n);

        System.out.println("\n=== SERIE NUMERICA 9 ===");
        S9Numerica serie9 = new S9Numerica();
        serie9.mostrarSeries(n);


        System.out.println("\n=== SERIE NUMERICA 10 ===");
        S10Numerica serie10 = new S10Numerica();
        serie10.mostrarSeries(n);


        System.out.println("\n=== SERIE NUMERICA12 ===");
        S12Numerica serie12 = new S12Numerica();
        serie12.mostrarSeries(n);



        System.out.println("\n=== SERIE DE CARACTERES 1 ===");
        S1Caracteres serieS1 = new S1Caracteres();
        serieS1.mostrarSeries(n);


        System.out.println("\n=== SERIE DE CARACTERES 2 ===");
        S2Caracteres serieS2 = new S2Caracteres();
        serieS2.mostrarSeries(n);

        System.out.println("\n=== SERIE DE CARACTERES 3 ===");
        S3Caracteres serieS3 = new S3Caracteres();
        serieS3.mostrarSeries(n);

        System.out.println("\n=== SERIE DE CARACTERES 4 ===");
        S4Caracteres serieS4 = new S4Caracteres();
        serieS4.mostrarSeries(n);

        System.out.println("\n=== SERIE DE CARACTERES 5 ===");
        S5Caracteres serieS5 = new S5Caracteres();
        serieS5.mostrarSeries(n);

        System.out.println("\n=== SERIE DE CARACTERES 6 ===");
        S6Caracteres serieS6 = new S6Caracteres();
        serieS6.mostrarSeries(n);

        System.out.println("\n=== SERIE DE CARACTERES 7 ===");
        S7Caracteres serieS7 = new S7Caracteres();
        serieS7.mostrarSeries(n);


        System.out.println("\n=== SERIE DE CARACTERES 8 ===");
        S8Caracteres serieS8 = new S8Caracteres();
        serieS8.mostrarSeries(n);


        System.out.println("\n=== SERIE DE CARACTERES 9 ===");
        S9Caracteres serieS9 = new S9Caracteres();
        serieS9.mostrarSeries(n);


        System.out.println("\n=== RECURSIÓN 1 ===");
        R01Recursion rec1 = new R01Recursion();
        rec1.mostrarFactoriales(n);


        System.out.println("\n=== RECURSIÓN 2 ===");
        R02Recursion rec2 = new R02Recursion();
        System.out.print("Ingrese el primer número (a): ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número (b): ");
        int b = sc.nextInt();
        rec2.mostrarSuma(a, b);


        System.out.println("\n=== RECURSIÓN 3 ===");
        R03Recursion rec3 = new R03Recursion();
        rec3.mostrarMultiplicacion(a, b);
        

        System.out.println("\n=== RECURSIÓN 4 ===");
        R04Recursion rec4 = new R04Recursion();
        rec4.mostrarPotencia(a, b);


        System.out.println("\n=== RECURSIÓN 5 ===");
        R05Recursion rec5 = new R05Recursion();
        rec5.mostrarConteo(n);


        System.out.println("\n=== RECURSIÓN 6 ===");
        R06Recursion rec6 = new R06Recursion();
        rec6.mostrarConteoRegresivo(n);


        sc.close();
    }
}

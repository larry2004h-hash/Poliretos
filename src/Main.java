import java.util.Scanner;
import seriesnumericas.*;
import seriescaracteres.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("      Proyecto: Poliretos - Series Numéricas");
        System.out.println("      Grupo: 4");
        System.out.println("      Integrantes:");
        System.out.println("      -Jhoan Patricio Sasnalema De La Cruz\nPongan sus nombres aqui muchachos");
        System.out.println("==========================================\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de términos a generar: ");
        int n = sc.nextInt();

        System.out.println("\n=== SERIE 1 ===");
        S1Numerica serie1 = new S1Numerica();
        serie1.mostrarSeries(n);


        System.out.println("\n=== SERIE 2 ===");
        S2Numerica serie2 = new S2Numerica();
        serie2.mostrarSeries(n);


        System.out.println("\n=== SERIE 3 ===");
        S3Numerica serie3 = new S3Numerica();
        serie3.mostrarSeries(n);


        System.out.println( "\n=== SERIE 4 ===");
        S4Numerica serie4 = new S4Numerica();
        serie4.mostrarSeries(n);

        System.out.println("\n=== SERIE 5 ==="   );
        S5Numerica serie5 = new S5Numerica();
        serie5.mostrarSeries(n);



        System.out.println("\n=== SERIE 6 ===");
        S6Numerica serie6 = new S6Numerica();
        serie6.mostrarSeries(n);


        System.out.println("\n=== SERIE 7 ===");
        S7Numerica serie7 = new S7Numerica();
        serie7.mostrarSeries(n);

        System.out.println("\n=== SERIE 8 ===");
        S8Numerica serie8 = new S8Numerica();
        serie8.mostrarSeries(n);

        System.out.println("\n=== SERIE 9 ===");
        S9Numerica serie9 = new S9Numerica();
        serie9.mostrarSeries(n);


        System.out.println("\n=== SERIE 10 ===");
        S10Numerica serie10 = new S10Numerica();
        serie10.mostrarSeries(n);


        System.out.println("\n=== SERIE 12 ===");
        S12Numerica serie12 = new S12Numerica();
        serie12.mostrarSeries(n);



        System.out.println("\n=== SERIE DE CARACTERES ===");
        S1Caracteres serieS1 = new S1Caracteres();
        serieS1.mostrarSeries(n);


        System.out.println("\n=== SERIE DE CARACTERES ===");
        S2Caracteres serieS2 = new S2Caracteres();
        serieS2.mostrarSeries(n);
        


        sc.close();
    }
}

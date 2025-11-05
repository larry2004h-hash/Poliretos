import java.util.Scanner;
import seriesnumericas.*;
import seriescaracteres.*;
import arrays.*;
import cadenas.*;
import figuras.*;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("==========================================");
        System.out.println("      Escuela Politécnica Nacional");
        System.out.println("      Proyecto: Poliretos - Series Numéricas");
        System.out.println("Grupo: 4");
        System.out.println("Integrantes:"); 
        System.out.println("-Jhoan Patricio Sasnalema De La Cruz\nRobayo Morcillo Samuel Esteban \nMateo Sebastián Rios Taco");
        System.out.println("==========================================\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de términos a generar: ");
        int n = sc.nextInt();

        System.out.print("Ingrese el número de tamaño de la figura: ");
        int tamaFigura = sc.nextInt();

        System.out.print("Ingrese el número de niveles de la figura: ");
        int niveles = sc.nextInt();
        sc.nextLine();

        
        System.out.print("Ingrese una frase para contar vocales: ");
        String frase = sc.nextLine();
        
        System.out.print("Ingrese una frase para contar letras: ");
        String frase1 = sc.nextLine();
        

         System.out.print("Ingrese una frase para eliminar vocal: ");
        String frase3 = sc.nextLine();
        System.out.print("Ingrese la vocal a eliminar: ");
        char vocal = sc.next().charAt(0);

        System.out.print("Ingrese una frase para eliminar letra: ");
        sc.nextLine(); 
        String frase4 = sc.nextLine();
        System.out.print("Ingrese una letra a eliminar: ");
        char letra = sc.next().charAt(0);

        sc.nextLine(); 
        System.out.print("Ingrese una frase para darle la vuelta y cambiar las vocales a Mayusculas: ");
        String frase5 = sc.nextLine();

        System.out.print("Ingrese una frase para presentarla inverida con las letras en mayusculas: ");
        String frase6 = sc.nextLine();
         

        System.out.print("Ingrese una frase para poner mayúsculas sin J: ");
        String frase7 = sc.nextLine();

       
        
        System.out.print("Ingrese una frase para convertir mayusculas y minusculas alternadas: ");
         String frase9 = sc.nextLine();
        

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

        // ================== Figuras ==================
        
        System.out.println("\n=== FIGURA 1 ===");
        figura1 f1 = new figura1();
        f1.g4_dibujarFigura1(tamaFigura);
        
         System.out.println("\n=== FIGURA 2 ===");
        figura2 f2 = new figura2();
        f2.g4_dibujarFigura2(tamaFigura);

         System.out.println("\n=== FIGURA 3 ===");
        figura3 f3 = new figura3();
        f3.g4_dibujarFigura3(niveles);

        System.out.println("\n=== FIGURA 4  ===");
        figura4 f4= new figura4();
         f4.g4_dibujarFigura3Invertida(niveles);

        System.out.println("\n=== FIGURA 5 ===");
        figura5 f5 = new figura5();
        f5.g4_dibujarFigura5(niveles);

        System.out.println("\n=== FIGURA 6 ===");
         figura6 f6 = new figura6();
        f6.g4_dibujarFigura6(niveles);

        System.out.println("\n=== FIGURA 7 ===");
        figura7 f7 = new figura7();
        f7.g4_dibujarFigura7(niveles);

        System.out.println("\n=== FIGURA 8 ===");
        figura8 fig8 = new figura8();
        fig8.g4_dibujarFigura8(niveles);

        System.out.println("\n=== FIGURA 9  ===");
        figura9 fig9 = new figura9();
        fig9.g4_dibujarFigura9(niveles);

        System.out.println("\n=== FIGURA 10  ===");
        figura10 fig10 = new figura10();
        fig10.g4_dibujarFigura10(niveles);

        System.out.println("\n=== FIGURA 11 ===");
        figura11 f11 = new figura11();
        f11.g4_dibujarFigura11(niveles);

        System.out.println("\n=== FIGURA 12 ===");
        figura12 f12 = new figura12();
        f12.g4_dibujarFigura12(niveles);

        System.out.println("\n=== FIGURA 13 ===");
        figura13 f13 = new figura13();
        f13.g4_dibujarFigura13(niveles);

        System.out.println("\n=== FIGURA 14 ===");
        figura14 f14 = new figura14();
        f14.g4_dibujarFigura14(niveles);

        System.out.println("\n=== FIGURA 15 ===");
        figura15 f15 = new figura15();
        f15.g4_dibujarFigura15(niveles);
        
        System.out.println("\n=== FIGURA 16 ===");
        figura16 f16 = new figura16();
        f16.g4_dibujarFigura16(niveles);

        System.out.println("\n=== FIGURA 17 ===");
        figura17 f17 = new figura17();
        f17.g4_dibujarFigura17(niveles);
 
        System.out.println("\n=== FIGURA 18 ===");
        figura18 f18 = new figura18();
        f18.g4_dibujarFigura18(niveles);


         System.out.println("\n=== FIGURA 19 ===");
        figura19 f19 = new figura19();
        f19.g4_dibujarFigura19(niveles);
 //================== Cadenas ==================
 
      System.out.println("\n=== Cadenas de caracteres ===");

         Cadena1 c1 = new Cadena1();
        int totalVocales = c1.contarVocales(frase); 
        System.out.println("La frase tiene " + totalVocales + " vocales.");
        
        Cadena2 c2 = new Cadena2();
        int totalLetras = c2.contarLetras(frase1);
        System.out.println("La frase tiene " + totalLetras + " letras.");

        Cadena3 c3 = new Cadena3();
        System.out.println("Resultado: " + c3.eliminarVocal(frase3, vocal));

        Cadena4 c4 = new Cadena4();
        System.out.println("Resultado: " + c4.eliminarLetra(frase4, letra));

        Cadena5 c5 = new Cadena5();
        System.out.println("Resultado: " + c5.invertirVocalesMayus(frase5));
        Cadena6 c6 = new Cadena6();
        System.out.println("Invertida mayus: " + c6.invertirLetrasMayus(frase6));

        Cadena7 c7 = new Cadena7();
        System.out.println("Resultado: " + c7.mayusSinJ(frase7));

        Cadena8 c8 = new Cadena8();
        c8.juegoAnagramas();


        Cadena9 c9 = new Cadena9();
        String resultado = c9.convertirMayusMinus(frase9);
        System.out.println("Resultado: " + resultado);



        // ================== Arreglos ==================


        System.out.println("\n=== ARREGLO 1 ===");
        A01Arrays arr1 = new A01Arrays();
        arr1.mostrarSeries(n);

        System.out.println("\n=== ARREGLO 2 ===");
        A02Arrays arr2 = new A02Arrays();
        arr2.mostrarSeries(n);

        System.out.println("\n=== ARREGLO 3 ===");
        A03Arrays arr3 = new A03Arrays();
        arr3.mostrarSeries(n);


        System.out.println("\n=== ARREGLO 4 ===");
        A04Array arr4 = new A04Array();
        arr4.mostrarSeries(n);


        System.out.println("\n=== ARREGLO 5 ===");
        A05Array arr5 = new A05Array();
        arr5.mostrarSeries(n);


        sc.close();
    }
}

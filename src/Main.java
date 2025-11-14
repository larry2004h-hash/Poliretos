import arrays.*;
import cadenas.*;
import figuras.*;
import java.util.Scanner;
import seriescaracteres.*;
import seriesnumericas.*;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("==========================================");
        System.out.println("      Escuela Politécnica Nacional");
        System.out.println("      Proyecto: Poliretos - Series Numéricas");
        System.out.println("Grupo: 4");
        System.out.println("Integrantes:"); 
        System.out.println("-Jhoan Patricio Sasnalema De La Cruz\nRobayo Morcillo Samuel Esteban \nMateo Sebastián Rios Taco \nAriel Alejandro Soria Yanez\n" + //
                        "Mao Tsetung Rosero Duran");
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
        
        f1.g4_dibujarConFor(tamaFigura);
        f1.g4_dibujarConWhile(tamaFigura);
        f1.g4_dibujarConDoWhile(tamaFigura);

        
         System.out.println("\n=== FIGURA 2 ===");
        figura2 f2 = new figura2();
        
        f2.g4_dibujarConFor(tamaFigura);
        f2.g4_dibujarConWhile(tamaFigura);
        f2.g4_dibujarConDoWhile(tamaFigura);


         System.out.println("\n=== FIGURA 3 ===");
        figura3 f3 = new figura3();
        
        f3.g4_dibujarFor(niveles);
        f3.g4_dibujarWhile(niveles);
        f3.g4_dibujarDoWhile(niveles);


        System.out.println("\n=== FIGURA 4  ===");
        figura4 f4= new figura4();
         
        f4.g4_dibujarConFor(niveles);
        f4.g4_dibujarConWhile(niveles);
        f4.g4_dibujarConDoWhile(niveles);


        System.out.println("\n=== FIGURA 5 ===");
        figura5 f5 = new figura5();
        
        f5.g4_dibujarConFor(niveles);
        f5.g4_dibujarConWhile(niveles);
        f5.g4_dibujarConDoWhile(niveles);

        System.out.println("\n=== FIGURA 6 ===");
        figura6 f6 = new figura6();
        f6.g4_dibujarConFor(niveles);
        f6.g4_dibujarConWhile(niveles);
        f6.g4_dibujarConDoWhile(niveles);

        System.out.println("\n=== FIGURA 7 ===");
        figura7 f7 = new figura7();
        
        f7.g4_dibujarConFor(niveles);
        f7.g4_dibujarConWhile(niveles);
        f7.g4_dibujarConDoWhile(niveles);


        System.out.println("\n=== FIGURA 8 ===");
        figura8 f8 = new figura8();
       
        f8.g4_dibujarConFor(niveles);
        f8.g4_dibujarConWhile(niveles);
        f8.g4_dibujarConDoWhile(niveles);

        System.out.println("\n=== FIGURA 9  ===");
        figura9 f9 = new figura9();
      
        f9.g4_dibujarConFor(niveles);
        f9.g4_dibujarConWhile(niveles);
        f9.g4_dibujarConDoWhile(niveles);

        System.out.println("\n=== FIGURA 10  ===");
        figura10 f10 = new figura10();
       
        f10.g4_dibujarConFor(niveles);
        f10.g4_dibujarConWhile(niveles);
        f10.g4_dibujarConDoWhile(niveles);

   

        System.out.println("\n=== FIGURA 11 ===");
        figura11 f11 = new figura11();
     
        f11.g4_dibujarConFor(niveles);
        f11.g4_dibujarConWhile(niveles);
        f11.g4_dibujarConDoWhile(niveles);


        System.out.println("\n=== FIGURA 12 ===");
        figura12 f12 = new figura12();
       
        f12.g4_dibujarConFor(niveles);
        f12.g4_dibujarConWhile(niveles);
        f12.g4_dibujarConDoWhile(niveles);


        System.out.println("\n=== FIGURA 13 ===");
        figura13 f13 = new figura13();
       
        f13.g4_dibujarConFor(niveles);
        f13.g4_dibujarConWhile(niveles);
        f13.g4_dibujarConDoWhile(niveles);

        System.out.println("\n=== FIGURA 14 ===");
        figura14 f14 = new figura14();
      
        f14.g4_dibujarConFor(niveles);
        f14.g4_dibujarConWhile(niveles);
        f14.g4_dibujarConDoWhile(niveles);


        System.out.println("\n=== FIGURA 15 ===");
        figura15 f15 = new figura15();
        
        f15.g4_dibujarConFor(niveles);
        f15.g4_dibujarConWhile(niveles);
        f15.g4_dibujarConDoWhile(niveles);

        
        System.out.println("\n=== FIGURA 16 ===");
        figura16 f16 = new figura16();
       
        f16.g4_dibujarConFor(niveles);
        f16.g4_dibujarConWhile(niveles);
        f16.g4_dibujarConDoWhile(niveles);


        System.out.println("\n=== FIGURA 17 ===");
        figura17 f17 = new figura17();
      
        f17.g4_dibujarConFor(niveles);
        f17.g4_dibujarConWhile(niveles);
        f17.g4_dibujarConDoWhile(niveles);

 
        System.out.println("\n=== FIGURA 18 ===");
        figura18 f18 = new figura18();
   
        f18.g4_dibujarConFor(niveles);
        f18.g4_dibujarConWhile(niveles);
        f18.g4_dibujarConDoWhile(niveles);



         System.out.println("\n=== FIGURA 19 ===");
        figura19 f19 = new figura19();
   
          f19.g4_dibujarFigura19(niveles);
          f19.g4_dibujarrFigura19(niveles);
          f19.g4_dibujarrrFigura19(niveles);
      

    
 //================== Cadenas ==================
 
      System.out.println("\n=== Cadenas de caracteres ===");

         Cadena1 c1 = new Cadena1();

        // FOR
        int totalFor = c1.contarVocalesFor(frase);
        System.out.println("La frase tiene " + totalFor + " vocales. (Contado con FOR)");

        // WHILE
        int totalWhile = c1.contarVocalesWhile(frase);
        System.out.println("La frase tiene " + totalWhile + " vocales. (Contado con WHILE)");

        // DO-WHILE
        int totalDoWhile = c1.contarVocalesDoWhile(frase);
        System.out.println("La frase tiene " + totalDoWhile + " vocales. (Contado con DO-WHILE)");

        ///////////////////////////////////////
    
        Cadena2 c2 = new Cadena2();

      
        int totalFor1 = c2.contarLetrasFor(frase1);
        System.out.println("La frase tiene " + totalFor1 + " letras. (Contado con FOR)");

      
        int totalWhile1 = c2.contarLetrasWhile(frase1);
        System.out.println("La frase tiene " + totalWhile1 + " letras. (Contado con WHILE)");

        
        int totalDoWhile1= c2.contarLetrasDoWhile(frase1);
        System.out.println("La frase tiene " + totalDoWhile1 + " letras. (Contado con DO-WHILE)");


        Cadena3 c3 = new Cadena3();

      
        String resultadoFor = c3.eliminarVocalFor(frase3, vocal);
        System.out.println("Resultado con FOR: " + resultadoFor);

        
        String resultadoWhile = c3.eliminarVocalWhile(frase3, vocal);
        System.out.println("Resultado con WHILE: " + resultadoWhile);

       
        String resultadoDoWhile = c3.eliminarVocalDoWhile(frase3, vocal);
        System.out.println("Resultado con DO-WHILE: " + resultadoDoWhile);

        //////////////////////////

       Cadena4 c4 = new Cadena4();

    
        String resultadoFor2 = c4.eliminarLetraFor(frase4, letra);
        System.out.println("Resultado con FOR: " + resultadoFor2);

     
        String resultadoWhile2 = c4.eliminarLetraWhile(frase4, letra);
        System.out.println("Resultado con WHILE: " + resultadoWhile2);


        String resultadoDoWhile2 = c4.eliminarLetraDoWhile(frase4, letra);
        System.out.println("Resultado con DO-WHILE: " + resultadoDoWhile2);

        /////////////////////////////



        Cadena5 c5 = new Cadena5();

        
        String resultadoFor3 = c5.invertirConFor(frase5);
        System.out.println("Resultado con FOR: " + resultadoFor3);

       
        String resultadoWhile3 = c5.invertirConWhile(frase5);
        System.out.println("Resultado con WHILE: " + resultadoWhile3);

        
        String resultadoDoWhile3 = c5.invertirConDoWhile(frase5);
        System.out.println("Resultado con DO-WHILE: " + resultadoDoWhile3);

        //////////////////////////
        Cadena6 c6 = new Cadena6();

        
        String resultadoFor4 = c6.invertirMayusculasFor(frase6);
        System.out.println("Resultado con FOR: " + resultadoFor4);

        
        String resultadoWhile4 = c6.invertirMayusculasWhile(frase6);
        System.out.println("Resultado con WHILE: " + resultadoWhile4);

       
        String resultadoDoWhile4 = c6.invertirMayusculasDoWhile(frase6);
        System.out.println("Resultado con DO-WHILE: " + resultadoDoWhile4);

        //////////////////////////

        Cadena7 c7 = new Cadena7();

      
        String resultadoFor5 = c7.eliminarJConFor(frase7);
        System.out.println("Resultado con FOR: " + resultadoFor5);

       
        String resultadoWhile5 = c7.eliminarJConWhile(frase7);
        System.out.println("Resultado con WHILE: " + resultadoWhile5);

        
        String resultadoDoWhile5 = c7.eliminarJConDoWhile(frase7);
        System.out.println("Resultado con DO-WHILE: " + resultadoDoWhile5);

        //////////////////////////


        Cadena8 c8 = new Cadena8();
        c8.juegoAnagramas();
       
        //////////////////////////

         Cadena9 c9 = new Cadena9();

        // FOR
        String resultadoFor7 = c9.alternarMayusMinusFor(frase9);
        System.out.println("Resultado con FOR: " + resultadoFor7);

        // WHILE
        String resultadoWhile7 = c9.alternarMayusMinusWhile(frase9);
        System.out.println("Resultado con WHILE: " + resultadoWhile7);

        // DO-WHILE
        String resultadoDoWhile7 = c9.alternarMayusMinusDoWhile(frase9);
        System.out.println("Resultado con DO-WHILE: " + resultadoDoWhile7);


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
    
     // ================== Grafos ==================
       System.out.println("\n=== GRAFOS Y AUTÓMATAS 1 ===");

        // A01: a* b+ c  (c exactly one at end)
        System.out.print("\nIngrese una cadena para el ejercicio A01 (a*b+c): ");
        String gA01 = sc.nextLine();
        A01Grafos ga01 = new A01Grafos();
        System.out.println("Con for");
        ga01.g4_grafosFor(gA01);
        System.out.println("Con while");
        ga01.g4_grafosWhile(gA01);
        System.out.println("Con do-while");
        ga01.g4_grafosDoWhile(gA01);

        // A02: a b+ c a  (pattern: a then >=1 b then c then a)
        System.out.print("\nIngrese una cadena para el ejercicio A02 (ab+ca): ");
        String gA02 = sc.nextLine();
        A02Grafos ga02 = new A02Grafos();
        System.out.println("Con for");
        ga02.g4_grafosFor(gA02);
        System.out.println("Con while");
        ga02.g4_grafosWhile(gA02);
        System.out.println("Con do-while");
        ga02.g4_grafosDoWhile(gA02);

        // A03: a+  | b+ | c+  (only a's or only b's or only c's, at least one)
        System.out.print("\nIngrese una cadena para el ejercicio A03 (a+/b+/c+): ");
        String gA03 = sc.nextLine();
        A03Grafos ga03 = new A03Grafos();
        System.out.println("Con for");
        ga03.g4_grafosFor(gA03);
        System.out.println("Con while");
        ga03.g4_grafosWhile(gA03);
        System.out.println("Con do-while");
        ga03.g4_grafosDoWhile(gA03);

        // A04: 1+ 0+ 1*  (one or more '1', then one or more '0', then zero or more '1')
        System.out.print("\nIngrese una cadena para el ejercicio A04 (1+/0+1*): ");
        String gA04 = sc.nextLine();
        A04Grafos ga04 = new A04Grafos();
        System.out.println("Con for");
        ga04.g4_grafosFor(gA04);
        System.out.println("Con while");
        ga04.g4_grafosWhile(gA04);
        System.out.println("Con do-while");
        ga04.g4_grafosDoWhile(gA04);

        // A05: validar número decimal (ej: 123, -12.34, +0.5)
        System.out.print("\nIngrese una cadena para el ejercicio A05 (numero decimal): ");
        String gA05 = sc.nextLine();
        A05Grafos ga05 = new A05Grafos();
        System.out.println("Con for");
        ga05.g4_grafosFor(gA05);
        System.out.println("Con while");
        ga05.g4_grafosWhile(gA05);
        System.out.println("Con do-while");
        ga05.g4_grafosDoWhile(gA05);

        // A06: validar declaracion de variable Java (identificador + ; , = possibly with space)
        System.out.print("\nIngrese una cadena para el ejercicio A06 (declaracion variable Java): ");
        String gA06 = sc.nextLine();
        A06Grafos ga06 = new A06Grafos();
        System.out.println("Con for");
        ga06.g4_grafosFor(gA06);
        System.out.println("Con while");
        ga06.g4_grafosWhile(gA06);
        System.out.println("Con do-while");
        ga06.g4_grafosDoWhile(gA06);

        // A07: validar palabras reservadas {for, if, else, ifelse, foreach} (y permitiendo '(' o ' (' after)
        System.out.print("\nIngrese una cadena para el ejercicio A07 (keywords for/if/else/ifelse/foreach): ");
        String gA07 = sc.nextLine();
        A07Grafos ga07 = new A07Grafos();
        System.out.println("Con for");
        ga07.g4_grafosFor(gA07);
        System.out.println("Con while");
        ga07.g4_grafosWhile(gA07);
        System.out.println("Con do-while");
        ga07.g4_grafosDoWhile(gA07);

        // A08: validador de clave: al menos una mayuscula, una minuscula, un numero, un caracter especial
        System.out.print("\nIngrese una cadena para el ejercicio A08 (validador de clave): ");
        String gA08 = sc.nextLine();
        A08Grafos ga08 = new A08Grafos();
        System.out.println("Con for");
        ga08.g4_grafosFor(gA08);
        System.out.println("Con while");
        ga08.g4_grafosWhile(gA08);
        System.out.println("Con do-while");
        ga08.g4_grafosDoWhile(gA08);

        sc.close();
        System.out.println("\nProceso de grafos finalizado.");
    }   
      
}

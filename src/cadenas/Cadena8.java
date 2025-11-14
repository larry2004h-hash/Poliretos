package cadenas;

import java.util.Scanner;

public class Cadena8 {

    public void juegoAnagramas() {
        Scanner sc = new Scanner(System.in);

        String[] palabras = {"delira", "ballena", "alondra", "españa", "enrique"};
        String[] anagramas = {"lidera", "llenaba", "ladrona", "apañes", "quieren"};

        System.out.println("Conjunto de palabras:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println((i + 1) + ". " + palabras[i]);
        }

        System.out.print("\nElige el número de una palabra (1-5): ");
        int opcion = sc.nextInt();
        sc.nextLine(); 

        String palabra = palabras[opcion - 1];
        String anagramaCorrecto = anagramas[opcion - 1];

        int intentos = 0;
        String respuesta = "";

        while (intentos < 3) {
            System.out.print("Ingresa el anagrama de " + palabra + ": ");
            respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase(anagramaCorrecto)) {
                System.out.println(" ¡Correcto! El anagrama de " + palabra + " es " + anagramaCorrecto);
                break;
            } else {
                System.out.println(" Incorrecto. Intenta de nuevo.");
                intentos++;
            }
        }

        if (!respuesta.equalsIgnoreCase(anagramaCorrecto)) {
            System.out.println("4 Fallaste. La respuesta correcta era: " + anagramaCorrecto);
        }

        sc.close();
    }
}

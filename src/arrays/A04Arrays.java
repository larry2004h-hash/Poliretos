package arrays;

public class A04Arrays {
    public static void main(String[] args) {
        String nombre = "Samuel Robayo";
        char[] letras = nombre.replace(" ", "").toCharArray(); 
        int n = letras.length; 

        System.out.println("=== MÉTODO CON FOR ===");
        metodoFor(letras, n);

        System.out.println("\n=== MÉTODO CON WHILE ===");
        metodoWhile(letras, n);

        System.out.println("\n=== MÉTODO CON DO...WHILE ===");
        metodoDoWhile(letras, n);
    }



    // Método con FOR
    public static void metodoFor(char[] letras, int n) {
        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < n; col++) {
                if (col == fila) {
                    System.out.print(letras[fila]); 
                } else if (col == n - fila - 1) {
                    System.out.print(letras[col]);   
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
    }



    // Método con WHILE
    public static void metodoWhile(char[] letras, int n) {
        int fila = 0;
        while (fila < n) {
            int col = 0;
            while (col < n) {
                if (col == fila) {
                    System.out.print(letras[fila]);
                } else if (col == n - fila - 1) {
                    System.out.print(letras[col]);
                } else {
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            fila++;
        }
    }



    // Método con DO...WHILE
    public static void metodoDoWhile(char[] letras, int n) {
        int fila = 0;
        do {
            int col = 0;
            do {
                if (col == fila) {
                    System.out.print(letras[fila]);
                } else if (col == n - fila - 1) {
                    System.out.print(letras[col]);
                } else {
                    System.out.print(" ");
                }
                col++;
            } while (col < n);
            System.out.println();
            fila++;
        } while (fila < n);
    }
}



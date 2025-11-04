package arrays;

public class A02Arrays {
    public static void main(String[] args) {
        char inicial1 = 'S';
        char inicial2 = 'R';
        int tamaño = 5;
        char caracter = '*';

        System.out.println("=== MÉTODO CON FOR ===");
        metodoFor(tamaño, caracter, inicial1, inicial2);

        System.out.println("\n=== MÉTODO CON WHILE ===");
        metodoWhile(tamaño, caracter, inicial1, inicial2);

        System.out.println("\n=== MÉTODO CON DO...WHILE ===");
        metodoDoWhile(tamaño, caracter, inicial1, inicial2);
    }



    //  Método con FOR
    public static void metodoFor(int n, char c, char i1, char i2) {
        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < n * 2 + 1; col++) {

                
                if (col < n && (fila == 0 || fila == n - 1 || fila == n / 2 ||
                        (col == 0 && fila < n / 2) || (col == n - 1 && fila > n / 2))) {
                    System.out.print(c);
                }

                
                else if (col == n) {
                    System.out.print(' ');
                }

        
                else if (col > n && (fila == 0 || col == n + 1 || fila == n / 2 ||
                        (col == n + n && fila < n / 2) ||
                        (fila - (n / 2) == col - (n + 1) && fila > n / 2))) {
                    System.out.print(c);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }





    // Método con WHILE
    public static void metodoWhile(int n, char c, char i1, char i2) {
        int fila = 0;
        while (fila < n) {
            int col = 0;
            while (col < n * 2 + 1) {

                if (col < n && (fila == 0 || fila == n - 1 || fila == n / 2 ||
                        (col == 0 && fila < n / 2) || (col == n - 1 && fila > n / 2))) {
                    System.out.print(c);
                } else if (col == n) {
                    System.out.print(' ');
                } else if (col > n && (fila == 0 || col == n + 1 || fila == n / 2 ||
                        (col == n + n && fila < n / 2) ||
                        (fila - (n / 2) == col - (n + 1) && fila > n / 2))) {
                    System.out.print(c);
                } else {
                    System.out.print(' ');
                }

                col++;
            }
            System.out.println();
            fila++;
        }
    }




    // Método con DO...WHILE
    public static void metodoDoWhile(int n, char c, char i1, char i2) {
        int fila = 0;
        do {
            int col = 0;
            do {

                if (col < n && (fila == 0 || fila == n - 1 || fila == n / 2 ||
                        (col == 0 && fila < n / 2) || (col == n - 1 && fila > n / 2))) {
                    System.out.print(c);
                } else if (col == n) {
                    System.out.print(' ');
                } else if (col > n && (fila == 0 || col == n + 1 || fila == n / 2 ||
                        (col == n + n && fila < n / 2) ||
                        (fila - (n / 2) == col - (n + 1) && fila > n / 2))) {
                    System.out.print(c);
                } else {
                    System.out.print(' ');
                }

                col++;
            } while (col < n * 2 + 1);
            System.out.println();
            fila++;
        } while (fila < n);
    }
}



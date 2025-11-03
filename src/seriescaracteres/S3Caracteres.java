package seriescaracteres;

public class S3Caracteres {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S3 (caracteres): ++ +++ +++++ +++++++ +++++++++++ +++++++++++++ ...\n");

        System.out.println("→ Usando FOR:");
        g4_S3_for(n);

        System.out.println("\n→ Usando WHILE:");
        g4_S3_while(n);

        System.out.println("→ Usando DO-WHILE:");
        g4_S3_doWhile(n);
    }

    // =============================
    // Serie S3 - FOR
    // =============================
    public void g4_S3_for(int n) {
        int length = 2; // empieza con "++"
        int incremento = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("+");
            }
            System.out.print(" ");
            incremento += 2;   // el salto aumenta en números impares
            length += incremento;
        }
        System.out.println();
    }

    // =============================
    // Serie S3 - WHILE
    // =============================
    public void g4_S3_while(int n) {
        int length = 2;
        int incremento = 1;
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < length) {
                System.out.print("+");
                j++;
            }
            System.out.print(" ");
            incremento += 2;
            length += incremento;
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S3 - DO-WHILE
    // =============================
    public void g4_S3_doWhile(int n) {
        if (n <= 0) return;
        int length = 2;
        int incremento = 1;
        int i = 1;
        do {
            int j = 0;
            do {
                System.out.print("+");
                j++;
            } while (j < length);
            System.out.print(" ");
            incremento += 2;
            length += incremento;
            i++;
        } while (i <= n);
        System.out.println();
    }
}

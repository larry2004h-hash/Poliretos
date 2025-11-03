package seriescaracteres;

public class S9Caracteres {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S9 (caracteres): a b c dd eee fffff gggggggg ...\n");

        System.out.println("→ Usando FOR:");
        g4_S9_for(n);

        System.out.println("\n→ Usando WHILE:");
        g4_S9_while(n);

        System.out.println("→ Usando DO-WHILE:");
        g4_S9_doWhile(n);
    }

    // =============================
    // Serie S9 - FOR
    // =============================
    public void g4_S9_for(int n) {
        int a = 1, b = 1, rep;
        for (int i = 0; i < n; i++) {
            char letra = (char) ('a' + (i % 26));
            if (i < 3) rep = 1; 
            else {
                rep = a + b;
                a = b;
                b = rep;
            }
            for (int j = 0; j < rep; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    // =============================
    // Serie S9 - WHILE
    // =============================
    public void g4_S9_while(int n) {
        int i = 0, a = 1, b = 1, rep;
        while (i < n) {
            char letra = (char) ('a' + (i % 26));
            if (i < 3) rep = 1; 
            else {
                rep = a + b;
                a = b;
                b = rep;
            }
            int j = 0;
            while (j < rep) {
                System.out.print(letra);
                j++;
            }
            System.out.print(" ");
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S9 - DO-WHILE
    // =============================
    public void g4_S9_doWhile(int n) {
        if (n <= 0) return;
        int i = 0, a = 1, b = 1, rep;
        do {
            char letra = (char) ('a' + (i % 26));
            if (i < 3) rep = 1; 
            else {
                rep = a + b;
                a = b;
                b = rep;
            }
            int j = 0;
            do {
                System.out.print(letra);
                j++;
            } while (j < rep);
            System.out.print(" ");
            i++;
        } while (i < n);
        System.out.println();
    }
}

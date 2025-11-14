package figuras;

public class figura18 {

   
    public void g4_dibujarConFor(int niveles) {
        System.out.println("\nFigura 18 con FOR:");
        int[][] pascal = new int[niveles][niveles];

        for (int i = 0; i < niveles; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    pascal[i][j] = (i == 0) ? 2 : 1; 
                    pascal[i][j] = 2; 
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }

   
    public void g4_dibujarConWhile(int niveles) {
        System.out.println("\nFigura 18 con WHILE:");
        int[][] pascal = new int[niveles][niveles];
        int i = 0;
        while (i < niveles) {
            int j = 0;
            while (j <= i) {
                if (j == 0) {
                    pascal[i][j] = (i == 0) ? 2 : 1;
                } else if (j == i) {
                    pascal[i][j] = 2;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
                System.out.print(pascal[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public void g4_dibujarConDoWhile(int niveles) {
        System.out.println("\nFigura 18 con DO-WHILE:");
        int[][] pascal = new int[niveles][niveles];
        int i = 0;
        do {
            int j = 0;
            do {
                if (j > i) break;
                if (j == 0) {
                    pascal[i][j] = (i == 0) ? 2 : 1;
                } else if (j == i) {
                    pascal[i][j] = 2;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
                System.out.print(pascal[i][j] + " ");
                j++;
            } while (true);
            System.out.println();
            i++;
        } while (i < niveles);
    }
}
package figuras;

public class figura18 {

    public void g4_dibujarFigura18(int niveles) {
        System.out.println("2");
        int[] prev = {1, 2};
        for (int i = 2; i <= niveles; i++) {
            int[] current = new int[i];
            current[0] = 1;
            current[i - 1] = 2;
            for (int j = 1; j < i - 1; j++) {
                current[j] = prev[j - 1] + prev[j];
            }
            for (int val : current) {
                System.out.print(val + " ");
            }
            System.out.println();
            prev = current;
        }
    }
}

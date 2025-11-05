public class A01_G4_GrafosAutomatas extends Base_G4_GrafosAutomatas {

    public static void main(String[] args) {
        A01_G4_GrafosAutomatas obj = new A01_G4_GrafosAutomatas();
        obj.mostrarEncabezado("A01 - Validar a*b+c");

        String cadena = obj.leerCadena("Ingrese una cadena: ");

        System.out.println("\n--- FOR ---");
        obj.g4_A01_For(cadena);

        System.out.println("\n--- WHILE ---");
        obj.g4_A01_While(cadena);

        System.out.println("\n--- DO-WHILE ---");
        obj.g4_A01_DoWhile(cadena);
    }

    public void g4_A01_For(String s) {
        int i = 0;
        int n = s.length();
        int b = 0;

        for (i = 0; i < n && s.charAt(i) == 'a'; i++)
            System.out.println("Leyendo 'a' en posición " + i);

        for (; i < n && s.charAt(i) == 'b'; i++) {
            System.out.println("Leyendo 'b' en posición " + i);
            b++;
        }

        if (i == n - 1 && s.charAt(i) == 'c' && b > 0)
            System.out.println("Si acepta");
        else
            System.out.println("No acepta");
    }

    public void g4_A01_While(String s) {
        int i = 0;
        int b = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == 'a') {
            System.out.println("Leyendo 'a' en posición " + i);
            i++;
        }
        while (i < n && s.charAt(i) == 'b') {
            System.out.println("Leyendo 'b' en posición " + i);
            b++;
            i++;
        }

        if (i == n - 1 && s.charAt(i) == 'c' && b > 0)
            System.out.println("Si acepta");
        else
            System.out.println("No acepta");
    }

    public void g4_A01_DoWhile(String s) {
        int i = 0, n = s.length(), b = 0;

        if (i < n && s.charAt(i) == 'a') {
            do {
                System.out.println("Leyendo 'a' en posición " + i);
                i++;
            } while (i < n && s.charAt(i) == 'a');
        }
        if (i < n && s.charAt(i) == 'b') {
            do {
                System.out.println("Leyendo 'b' en posición " + i);
                b++;
                i++;
            } while (i < n && s.charAt(i) == 'b');
        }

        if (i == n - 1 && s.charAt(i) == 'c' && b > 0)
                    System.out.println("Si acepta");
        else
            System.out.println("No acepta");
    }
}

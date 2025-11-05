public class A02_G4_GrafosAutomatas extends Base_G4_GrafosAutomatas {

    public static void main(String[] args) {
        A02_G4_GrafosAutomatas obj = new A02_G4_GrafosAutomatas();
        obj.mostrarEncabezado("A02 - Validar ab+ca");
        String s = obj.leerCadena("Ingrese la cadena: ");

        System.out.println("\n--- FOR ---");
        obj.g4_A02_For(s);

        System.out.println("\n--- WHILE ---");
        obj.g4_A02_While(s);

        System.out.println("\n--- DO-WHILE ---");
        obj.g4_A02_DoWhile(s);
    }

    public void g4_A02_For(String s) {
        int n = s.length(), i = 0, b = 0;

        if (n < 3 || s.charAt(0) != 'a') {
            System.out.println("Debe empezar con 'a'");
            return;
        }

        for (i = 1; i < n && s.charAt(i) == 'b'; i++) {
            System.out.println("Leyendo 'b' en posición " + i);
            b++;
        }

        if (b > 0 && i + 1 == n - 1 && s.charAt(i) == 'c' && s.charAt(i + 1) == 'a')
            System.out.println("Si acepta ");
        else
            System.out.println("No acepta");
    }

    public void g4_A02_While(String s) {
        int i = 0, b = 0, n = s.length();

        if (s.charAt(i) != 'a') {
            System.out.println("Debe empezar con 'a'");
            return;
        }
        i++;

        while (i < n && s.charAt(i) == 'b') {
            System.out.println("Leyendo 'b' en posición " + i);
            i++;
            b++;
        }

        if (b > 0 && i + 1 == n - 1 && s.charAt(i) == 'c' && s.charAt(i + 1) == 'a')
            System.out.println("Si acepta");
        else
            System.out.println("No acepta");
    }

    public void g4_A02_DoWhile(String s) {
        int i = 0, b = 0, n = s.length();

        if (s.charAt(i) != 'a') {
            System.out.println("Debe empezar con 'a'");
            return;
        }
        i++;

        if (i < n && s.charAt(i) == 'b') {
            do {
                System.out.println("Leyendo 'b' en posición " + i);
                b++;
                i++;
            } while (i < n && s.charAt(i) == 'b');
        }

        if (b > 0 && i + 1 == n - 1 && s.charAt(i) == 'c' && s.charAt(i + 1) == 'a')
            System.out.println("Si acepta");
        else
            System.out.println("No acepta");
    }
}

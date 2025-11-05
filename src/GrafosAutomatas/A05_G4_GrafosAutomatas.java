public class A05_G4_GrafosAutomatas extends Base_G4_GrafosAutomatas {

    public static void main(String[] args) {
        A05_G4_GrafosAutomatas obj = new A05_G4_GrafosAutomatas();
        obj.mostrarEncabezado("A05 - Validar a+b+");
        String s = obj.leerCadena("Ingrese la cadena: ");

        System.out.println("\n--- FOR ---");
        obj.g4_A05_For(s);

        System.out.println("\n--- WHILE ---");
        obj.g4_A05_While(s);

        System.out.println("\n--- DO-WHILE ---");
        obj.g4_A05_DoWhile(s);
    }

    public void g4_A05_For(String s) {
        int i = 0, n = s.length();
        int a = 0, b = 0;

        for (i = 0; i < n && s.charAt(i) == 'a'; i++) a++;
        for (; i < n && s.charAt(i) == 'b'; i++) b++;

        if (i == n && a > 0 && b > 0)
            System.out.println("Si acepta");
        else
            System.out.println("No acepta");
    }

    public void g4_A05_While(String s) {
        int i = 0, n = s.length(), a = 0, b = 0;

        while (i < n && s.charAt(i) == 'a') {
            a++;
            i++;
        }
        while (i < n && s.charAt(i) == 'b') {
            b++;
            i++;
        }

        if (i == n && a > 0 && b > 0)
            System.out.println("Si acepta");
        else
            System.out.println("No acepta");
    }

    public void g4_A05_DoWhile(String s) {
        if (s.length() == 0) {
            System.out.println("No acepta");
            return;
        }

        int i = 0, n = s.length(), a = 0, b = 0;

        if (s.charAt(i) == 'a') {
            do {
                a++;
                i++;
            } while (i < n && s.charAt(i) == 'a');
        }

        if (i < n && s.charAt(i) == 'b') {
            do {
                b++;
                i++;
            } while (i < n && s.charAt(i) == 'b');
        }

        if (i == n && a > 0 && b > 0)
            System.out.println("Si acepta");
        else
            System.out.println("No acepta");
    }
}

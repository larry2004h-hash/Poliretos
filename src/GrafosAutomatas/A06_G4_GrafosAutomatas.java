public class A06_G4_GrafosAutomatas extends Base_G4_GrafosAutomatas {

    public static void main(String[] args) {
        A06_G4_GrafosAutomatas obj = new A06_G4_GrafosAutomatas();
        obj.mostrarEncabezado("A06 - Validar (ab)+");
        String s = obj.leerCadena("Ingrese la cadena: ");

        System.out.println("\n--- FOR ---");
        obj.g4_A06_For(s);

        System.out.println("\n--- WHILE ---");
        obj.g4_A06_While(s);

        System.out.println("\n--- DO-WHILE ---");
        obj.g4_A06_DoWhile(s);
    }

    public void g4_A06_For(String s) {
        int n = s.length();
        if (n % 2 != 0) {
            System.out.println("Debe tener cantidad par de caracteres , no acepta ");
            return;
        }

        for (int i = 0; i < n; i += 2) {
            if (s.charAt(i) != 'a' || s.charAt(i + 1) != 'b') {
                System.out.println("Patrón incorrecto en posición " + i + ", no acepta ");
                return;
            }
        }
        System.out.println("Cadena válida ✅");
    }

    public void g4_A06_While(String s) {
        int i = 0;
        if (s.length() % 2 != 0) {
            System.out.println("Debe tener cantidad par de caracteres, no acepta ");
            return;
        }

        while (i < s.length()) {
            if (s.charAt(i) != 'a' || s.charAt(i + 1) != 'b') {
                System.out.println("Patrón incorrecto, no acepta ");
                return;
            }
            i += 2;
        }
        System.out.println("Si acepta");
    }

    public void g4_A06_DoWhile(String s) {
        if (s.length() % 2 != 0) {
            System.out.println("Debe tener cantidad par de caracteres, no acepta ");
            return;
        }

        int i = 0;
        do {
            if (s.charAt(i) != 'a' || s.charAt(i + 1) != 'b') {
                System.out.println("Patrón incorrecto, no acepta ");
                return;
            }
            i += 2;
        } while (i < s.length());

        System.out.println("Si acepta");
    }
}

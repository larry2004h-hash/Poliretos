public class A03_G4_GrafosAutomatas extends Base_G4_GrafosAutomatas {

    public static void main(String[] args) {
        A03_G4_GrafosAutomatas obj = new A03_G4_GrafosAutomatas();
        obj.mostrarEncabezado("A03 - Validar a+/b+/c+");
        String s = obj.leerCadena("Ingrese la cadena: ");

        System.out.println("\n--- FOR ---");
        obj.g4_A03_For(s);

        System.out.println("\n--- WHILE ---");
        obj.g4_A03_While(s);

        System.out.println("\n--- DO-WHILE ---");
        obj.g4_A03_DoWhile(s);
    }

    public void g4_A03_For(String s) {
        int i = 0, n = s.length();
        if (n == 0) {
            System.out.println("No acepta");
            return;
        }

        char letra = s.charAt(0);
        System.out.println("Esperando solo '" + letra + "'");
        for (i = 0; i < n; i++) {
            System.out.println("Leyendo '" + s.charAt(i) + "' en posición " + i);
            if (s.charAt(i) != letra) {
                System.out.println("No acepta");
                return;
            }
        }
        System.out.println("Si acepta");
    }

    public void g4_A03_While(String s) {
        int i = 0;
        if (s.length() == 0) {
            System.out.println("No acepta");
            return;
        }

        char letra = s.charAt(0);
        System.out.println("Esperando solo '" + letra + "'");
        while (i < s.length()) {
            System.out.println("Leyendo '" + s.charAt(i) + "' en posición " + i);
            if (s.charAt(i) != letra) {
                System.out.println("No acepta");
                return;
            }
            i++;
        }
        System.out.println("Si acepta");
    }

    public void g4_A03_DoWhile(String s) {
        if (s.length() == 0) {
            System.out.println("No acepta");
            return;
        }

        int i = 0;
        char letra = s.charAt(0);
        System.out.println("Esperando solo '" + letra + "'");

        do {
            System.out.println("Leyendo '" + s.charAt(i) + "' en posición " + i);
            if (s.charAt(i) != letra) {
                System.out.println("No acepta");
                return;
            }
            i++;
        } while (i < s.length());

        System.out.println("Si acepta");
    }
}

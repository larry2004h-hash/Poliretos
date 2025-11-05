public class A04_G4_GrafosAutomatas extends Base_G4_GrafosAutomatas {

    public static void main(String[] args) {
        A04_G4_GrafosAutomatas obj = new A04_G4_GrafosAutomatas();
        obj.mostrarEncabezado("A04 - Validar número decimal");
        String s = obj.leerCadena("Ingrese un número: ");

        System.out.println("\n--- FOR ---");
        obj.g4_A04_For(s);

        System.out.println("\n--- WHILE ---");
        obj.g4_A04_While(s);

        System.out.println("\n--- DO-WHILE ---");
        obj.g4_A04_DoWhile(s);
    }

    public void g4_A04_For(String s) {
        boolean punto = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println("Leyendo '" + c + "'");

            if (c == '.') {
                if (punto) {
                    System.out.println("Más de un punto, no acepta");
                    return;
                }
                punto = true;
            } else if (!Character.isDigit(c)) {
                System.out.println("No es número, no acepta");
                return;
            }
        }
        System.out.println("Número válido, si acepta");
    }

    public void g4_A04_While(String s) {
        int i = 0;
        boolean punto = false;
        while (i < s.length()) {
            char c = s.charAt(i);
            System.out.println("Leyendo '" + c + "'");
            if (c == '.') {
                if (punto) {
                    System.out.println("Más de un punto, no acepta");
                    return;
                }
                punto = true;
            } else if (!Character.isDigit(c)) {
                System.out.println("No es número, no acepta ");
                return;
            }
            i++;
        }
        System.out.println("Número válido, si acepta ");
    }

    public void g4_A04_DoWhile(String s) {
        if (s.length() == 0) {
            System.out.println("Cadena vacía, no acepta");
            return;
        }

        int i = 0;
        boolean punto = false;
        do {
            char c = s.charAt(i);
            System.out.println("Leyendo '" + c + "'");
            if (c == '.') {
                if (punto) {
                    System.out.println("Más de un punto, no acepta");
                    return;
                }
                punto = true;
            } else if (!Character.isDigit(c)) {
                System.out.println("No acepta");
                return;
            }
            i++;
        } while (i < s.length());

        System.out.println("Si acepta");
    }
}

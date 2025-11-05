public class A07_G4_GrafosAutomatas extends Base_G4_GrafosAutomatas {

    public static void main(String[] args) {
        A07_G4_GrafosAutomatas obj = new A07_G4_GrafosAutomatas();
        obj.mostrarEncabezado("A07 - Validar a(b|c)+");
        String s = obj.leerCadena("Ingrese la cadena: ");

        System.out.println("\n--- FOR ---");
        obj.g4_A07_For(s);

        System.out.println("\n--- WHILE ---");
        obj.g4_A07_While(s);

        System.out.println("\n--- DO-WHILE ---");
        obj.g4_A07_DoWhile(s);
    }

    public void g4_A07_For(String s) {
        if (s.length() < 2 || s.charAt(0) != 'a') {
            System.out.println("Debe empezar con 'a' , no acepta");
            return;
        }

        boolean valido = true;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != 'b' && c != 'c') {
                valido = false;
                System.out.println("Caracter inválido en posición " + i + " ,no acepta");
                break;
            }
        }
        System.out.println(valido ? "Cadena válida ✅" : "No acepta");
    }

    public void g4_A07_While(String s) {
        if (s.length() < 2 || s.charAt(0) != 'a') {
            System.out.println("Debe empezar con 'a' ,no acepta");
            return;
        }

        int i = 1;
        while (i < s.length() && (s.charAt(i) == 'b' || s.charAt(i) == 'c')) {
            i++;
        }

        if (i == s.length())
            System.out.println("Si acepta");
        else
            System.out.println("No acepta");
    }

    public void g4_A07_DoWhile(String s) {
        if (s.length() < 2 || s.charAt(0) != 'a') {
            System.out.println("Debe empezar con 'a' , no acepta");
            return;
        }

        int i = 1;
        do {
            char c = s.charAt(i);
            if (c != 'b' && c != 'c') {
                System.out.println("Caracter inválido en posición " + i + " ,no acepta");
                return;
            }
            i++;
        } while (i < s.length());

        System.out.println("Si acepta");
    }
}

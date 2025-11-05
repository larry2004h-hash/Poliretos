package grafosAutomatas;

public class A05Grafos {

    // Validar número decimal usando for
    public void g4_grafosFor(String cadena) {
        boolean punto = false;
        boolean valido = true;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isDigit(c)) {
                continue;
            } else if (c == '.') {
                if (punto) {
                    valido = false;
                    break;
                }
                punto = true;
            } else {
                valido = false;
                break;
            }
        }

        if (valido && cadena.length() > 0 && cadena.charAt(0) != '.' && cadena.charAt(cadena.length() - 1) != '.') {
            System.out.println("La cadena Sí acepta");
        } else {
            System.out.println("La cadena No acepta");
        }
    }

    // Validar número decimal usando while
    public void g4_grafosWhile(String cadena) {
        boolean punto = false;
        boolean valido = true;
        int i = 0;

        while (i < cadena.length()) {
            char c = cadena.charAt(i);
            if (Character.isDigit(c)) {
                // válido
            } else if (c == '.') {
                if (punto) {
                    valido = false;
                    break;
                }
                punto = true;
            } else {
                valido = false;
                break;
            }
            i++;
        }

        if (valido && cadena.length() > 0 && cadena.charAt(0) != '.' && cadena.charAt(cadena.length() - 1) != '.') {
            System.out.println("La cadena Sí acepta");
        } else {
            System.out.println("La cadena No acepta");
        }
    }

    // Validar número decimal usando do-while
    public void g4_grafosDoWhile(String cadena) {
        if (cadena.isEmpty()) {
            System.out.println("La cadena No acepta");
            return;
        }

        boolean punto = false;
        boolean valido = true;
        int i = 0;

        do {
            char c = cadena.charAt(i);
            if (Character.isDigit(c)) {
                // válido
            } else if (c == '.') {
                if (punto) {
                    valido = false;
                    break;
                }
                punto = true;
            } else {
                valido = false;
                break;
            }
            i++;
        } while (i < cadena.length());

        if (valido && cadena.charAt(0) != '.' && cadena.charAt(cadena.length() - 1) != '.') {
            System.out.println("La cadena Sí acepta");
        } else {
            System.out.println("La cadena No acepta");
        }
    }
}

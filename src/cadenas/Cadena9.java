package cadenas;

public class Cadena9 {

    // Método con FOR
    public String alternarMayusMinusFor(String frase) {
        String resultado = "";
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                if (i % 2 == 0) {
                    resultado += Character.toUpperCase(c);
                } else {
                    resultado += Character.toLowerCase(c);
                }
            } else {
                resultado += c; // mantener espacios y signos
            }
        }
        return resultado;
    }

    // Método con WHILE
    public String alternarMayusMinusWhile(String frase) {
        String resultado = "";
        frase = frase.toLowerCase();
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                if (i % 2 == 0) {
                    resultado += Character.toUpperCase(c);
                } else {
                    resultado += Character.toLowerCase(c);
                }
            } else {
                resultado += c;
            }
            i++;
        }
        return resultado;
    }

    // Método con DO-WHILE
    public String alternarMayusMinusDoWhile(String frase) {
        String resultado = "";
        frase = frase.toLowerCase();
        int i = 0;
        if (frase.length() > 0) {
            do {
                char c = frase.charAt(i);
                if (Character.isLetter(c)) {
                    if (i % 2 == 0) {
                        resultado += Character.toUpperCase(c);
                    } else {
                        resultado += Character.toLowerCase(c);
                    }
                } else {
                    resultado += c;
                }
                i++;
            } while (i < frase.length());
        }
        return resultado;
    }
}

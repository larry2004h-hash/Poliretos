package cadenas;

public class Cadena7 {

   
    public String eliminarJConFor(String frase) {
        String resultado = "";
        frase = frase.toUpperCase();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c != 'J') {
                resultado += c;
            }
        }
        return resultado;
    }

    
    public String eliminarJConWhile(String frase) {
        String resultado = "";
        frase = frase.toUpperCase();
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (c != 'J') {
                resultado += c;
            }
            i++;
        }
        return resultado;
    }

   
    public String eliminarJConDoWhile(String frase) {
        String resultado = "";
        frase = frase.toUpperCase();
        int i = 0;
        if (frase.length() > 0) {
            do {
                char c = frase.charAt(i);
                if (c != 'J') {
                    resultado += c;
                }
                i++;
            } while (i < frase.length());
        }
        return resultado;
    }
}


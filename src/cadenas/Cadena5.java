package cadenas;

public class Cadena5 {

  
    public String invertirConFor(String frase) {
        String resultado = "";
        frase = frase.toLowerCase();
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(c) >= 0) {
                resultado += Character.toUpperCase(c);
            } else {
                resultado += c;
            }
        }
        return resultado;
    }

    public String invertirConWhile(String frase) {
        String resultado = "";
        frase = frase.toLowerCase();
        int i = frase.length() - 1;
        while (i >= 0) {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(c) >= 0) {
                resultado += Character.toUpperCase(c);
            } else {
                resultado += c;
            }
            i--;
        }
        return resultado;
    }

  
    public String invertirConDoWhile(String frase) {
        String resultado = "";
        frase = frase.toLowerCase();
        int i = frase.length() - 1;
        if (frase.length() > 0) {
            do {
                char c = frase.charAt(i);
                if ("aeiou".indexOf(c) >= 0) {
                    resultado += Character.toUpperCase(c);
                } else {
                    resultado += c;
                }
                i--;
            } while (i >= 0);
        }
        return resultado;
    }
}

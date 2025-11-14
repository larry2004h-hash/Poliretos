package cadenas;

public class Cadena4 {

    public String eliminarLetraFor(String frase, char letra) {
        String resultado = "";
        frase = frase.toLowerCase();
        letra = Character.toLowerCase(letra);
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == letra) {
                resultado += " "; 
            } else {
                resultado += c;
            }
        }
        return resultado;
    }

    
    public String eliminarLetraWhile(String frase, char letra) {
        String resultado = "";
        frase = frase.toLowerCase();
        letra = Character.toLowerCase(letra);
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (c == letra) {
                resultado += " ";
            } else {
                resultado += c;
            }
            i++;
        }
        return resultado;
    }

    
    public String eliminarLetraDoWhile(String frase, char letra) {
        String resultado = "";
        frase = frase.toLowerCase();
        letra = Character.toLowerCase(letra);
        int i = 0;
        if (frase.length() > 0) {
            do {
                char c = frase.charAt(i);
                if (c == letra) {
                    resultado += " ";
                } else {
                    resultado += c;
                }
                i++;
            } while (i < frase.length());
        }
        return resultado;
    }
}


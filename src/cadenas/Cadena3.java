package cadenas;

public class Cadena3 {


    public String eliminarVocalFor(String frase, char vocal) {
        String resultado = "";
        frase = frase.toLowerCase();
        vocal = Character.toLowerCase(vocal);
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c != vocal) {
                resultado += c;
            }
        }
        return resultado;
    }


    public String eliminarVocalWhile(String frase, char vocal) {
        String resultado = "";
        frase = frase.toLowerCase();
        vocal = Character.toLowerCase(vocal);
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (c != vocal) {
                resultado += c;
            }
            i++;
        }
        return resultado;
    }

    
    public String eliminarVocalDoWhile(String frase, char vocal) {
        String resultado = "";
        frase = frase.toLowerCase();
        vocal = Character.toLowerCase(vocal);
        int i = 0;
        if (frase.length() > 0) {
            do {
                char c = frase.charAt(i);
                if (c != vocal) {
                    resultado += c;
                }
                i++;
            } while (i < frase.length());
        }
        return resultado;
    }
}

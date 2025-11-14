package cadenas;

public class Cadena6 {

    // Método con FOR
    public String invertirMayusculasFor(String frase) {
        String resultado = "";
        frase = frase.toUpperCase();
        for (int i = frase.length() - 1; i >= 0; i--) {
            resultado += frase.charAt(i);
        }
        return resultado;
    }

    // Método con WHILE
    public String invertirMayusculasWhile(String frase) {
        String resultado = "";
        frase = frase.toUpperCase();
        int i = frase.length() - 1;
        while (i >= 0) {
            resultado += frase.charAt(i);
            i--;
        }
        return resultado;
    }

    // Método con DO-WHILE
    public String invertirMayusculasDoWhile(String frase) {
        String resultado = "";
        frase = frase.toUpperCase();
        int i = frase.length() - 1;
        if (frase.length() > 0) {
            do {
                resultado += frase.charAt(i);
                i--;
            } while (i >= 0);
        }
        return resultado;
    }
}


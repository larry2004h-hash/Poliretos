package cadenas;

public class Cadena1 {

    
    public int contarVocalesFor(String frase) {
        int contador = 0;
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(c) >= 0) {
                contador++;
            }
        }
        return contador;
    }

    
    public int contarVocalesWhile(String frase) {
        int contador = 0;
        frase = frase.toLowerCase();
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(c) >= 0) {
                contador++;
            }
            i++;
        }
        return contador;
    }

   
    public int contarVocalesDoWhile(String frase) {
        int contador = 0;
        frase = frase.toLowerCase();
        int i = 0;
        if (frase.length() > 0) {
            do {
                char c = frase.charAt(i);
                if ("aeiou".indexOf(c) >= 0) {
                    contador++;
                }
                i++;
            } while (i < frase.length());
        }
        return contador;
    }
}
package cadenas;

public class Cadena1 {
    public int contarVocales(String frase) {
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
}

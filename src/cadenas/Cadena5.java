package cadenas;

public class Cadena5 {
    public String invertirVocalesMayus(String frase) {
        String resultado = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                resultado += Character.toUpperCase(c);
            } else {
                resultado += c;
            }
        }
        return resultado;
    }
}

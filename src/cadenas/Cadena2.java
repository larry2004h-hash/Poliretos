package cadenas;

public class Cadena2 {
    public int contarLetras(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
}

package cadenas;

public class Cadena2 {

    
    public int contarLetrasFor(String frase1) {
        int contador = 0;
        for (int i = 0; i < frase1.length(); i++) {
            if (Character.isLetter(frase1.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

   
    public int contarLetrasWhile(String frase1) {
        int contador = 0;
        int i = 0;
        while (i < frase1.length()) {
            if (Character.isLetter(frase1.charAt(i))) {
                contador++;
            }
            i++;
        }
        return contador;
    }

    public int contarLetrasDoWhile(String frase1) {
        int contador = 0;
        int i = 0;
        if (frase1.length() > 0) {
            do {
                if (Character.isLetter(frase1.charAt(i))) {
                    contador++;
                }
                i++;
            } while (i < frase1.length());
        }
        return contador;
    }
}

package cadenas;

public class Cadena9 {

    public String convertirMayusMinus(String frase) {
        String resultado = "";
        boolean mayuscula = true;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                if (mayuscula) resultado += Character.toUpperCase(c);
                else resultado += Character.toLowerCase(c);
                mayuscula = !mayuscula;
            } else {
                resultado += c;
            }
        }
        return resultado;
    }
}

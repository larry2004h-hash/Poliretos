package cadenas;

public class Cadena4 {
    public String eliminarLetra(String frase, char letra) {
        return frase.replace(String.valueOf(letra), "");
    }
}

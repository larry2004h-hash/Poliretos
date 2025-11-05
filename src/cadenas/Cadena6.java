package cadenas;

public class Cadena6 {
    public String invertirLetrasMayus(String frase) {
        return new StringBuilder(frase).reverse().toString().toUpperCase();
    }
}

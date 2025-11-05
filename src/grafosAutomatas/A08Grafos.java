package grafosAutomatas;

public class A08Grafos {
    // Password validator: at least one uppercase, one lowercase, one digit, one special character
    public void g4_grafosFor(String s) {
        if (s == null || s.length() == 0) { System.out.println("La cadena No acepta"); return; }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }

        if (hasUpper && hasLower && hasDigit && hasSpecial) System.out.println("La cadena Si acepta");
        else System.out.println("La cadena No acepta");
    }

    public void g4_grafosWhile(String s) {
        if (s == null || s.length() == 0) { System.out.println("La cadena No acepta"); return; }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
            i++;
        }

        if (hasUpper && hasLower && hasDigit && hasSpecial) System.out.println("La cadena Si acepta");
        else System.out.println("La cadena No acepta");
    }

    public void g4_grafosDoWhile(String s) {
        if (s == null || s.length() == 0) { System.out.println("La cadena No acepta"); return; }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        int i = 0;
        do {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
            i++;
        } while (i < s.length());

        if (hasUpper && hasLower && hasDigit && hasSpecial) System.out.println("La cadena Si acepta");
        else System.out.println("La cadena No acepta");
    }
}

package grafosAutomatas;

public class A06Grafos {
    // validar declaración de variable Java:
    // identifier: starts with letter [a-z], then letters/digits/_/$, then optional spaces then one of ; , =
    public void g4_grafosFor(String s) {
        if (s == null) { System.out.println("La cadena No acepta"); return; }
        String str = s;
        int len = str.length();
        int i = 0;

        // skip leading spaces
        while (i < len && str.charAt(i) == ' ') i++;

        if (i >= len) { System.out.println("La cadena No acepta"); return; }

        // first char must be a letter (lowercase considered in alphabet)
        char ch0 = str.charAt(i);
        if (!isLetter(ch0)) { System.out.println("La cadena No acepta"); return; }
        i++;

        // identifier body
        for (; i < len; i++) {
            char ch = str.charAt(i);
            if (isLetter(ch) || isDigit(ch) || ch == '_' || ch == '$') {
                continue;
            } else {
                break;
            }
        }

        // skip spaces
        while (i < len && str.charAt(i) == ' ') i++;

        // now must have one of ; , =
        if (i < len) {
            char last = str.charAt(i);
            if (last == ';' || last == ',' || last == '=') {
                // acceptable
                System.out.println("La cadena Si acepta");
            } else {
                System.out.println("La cadena No acepta");
            }
        } else {
            // nothing after identifier -> not acceptable (should have terminator)
            System.out.println("La cadena No acepta");
        }
    }

    public void g4_grafosWhile(String s) {
        if (s == null) { System.out.println("La cadena No acepta"); return; }
        String str = s;
        int len = str.length();
        int i = 0;

        // skip leading spaces
        while (i < len && str.charAt(i) == ' ') i++;

        if (i >= len) { System.out.println("La cadena No acepta"); return; }

        char ch0 = str.charAt(i);
        if (!isLetter(ch0)) { System.out.println("La cadena No acepta"); return; }
        i++;

        while (i < len) {
            char ch = str.charAt(i);
            if (isLetter(ch) || isDigit(ch) || ch == '_' || ch == '$') i++;
            else break;
        }

        while (i < len && str.charAt(i) == ' ') i++;

        if (i < len) {
            char last = str.charAt(i);
            if (last == ';' || last == ',' || last == '=') System.out.println("La cadena Si acepta");
            else System.out.println("La cadena No acepta");
        } else {
            System.out.println("La cadena No acepta");
        }
    }

    public void g4_grafosDoWhile(String s) {
        if (s == null) { System.out.println("La cadena No acepta"); return; }
        String str = s;
        int len = str.length();
        int i = 0;

        // skip leading spaces
        if (len == 0) { System.out.println("La cadena No acepta"); return; }
        do {
            if (i < len && str.charAt(i) == ' ') i++;
            else break;
        } while (i < len && str.charAt(i) == ' ');

        if (i >= len) { System.out.println("La cadena No acepta"); return; }

        char ch0 = str.charAt(i);
        if (!isLetter(ch0)) { System.out.println("La cadena No acepta"); return; }
        i++;

        if (i < len) {
            do {
                if (i < len) {
                    char ch = str.charAt(i);
                    if (isLetter(ch) || isDigit(ch) || ch == '_' || ch == '$') i++;
                    else break;
                } else break;
            } while (i < len);
        }

        // skip trailing spaces
        while (i < len && str.charAt(i) == ' ') i++;

        if (i < len) {
            char last = str.charAt(i);
            if (last == ';' || last == ',' || last == '=') System.out.println("La cadena Si acepta");
            else System.out.println("La cadena No acepta");
        } else {
            System.out.println("La cadena No acepta");
        }
    }

    private boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}

package grafosAutomatas;

public class A06Grafos {
    // validar declaración de variable Java:
    // 
    public void g4_grafosFor(String s) {
        if (s == null) { System.out.println("La cadena No acepta"); return; }
        String str = s;
        int len = str.length();
        int i = 0;


        while (i < len && str.charAt(i) == ' ') i++;

        if (i >= len) { System.out.println("La cadena No acepta"); return; }


        char ch0 = str.charAt(i);
        if (!isLetter(ch0)) { System.out.println("La cadena No acepta"); return; }
        i++;

 
        for (; i < len; i++) {
            char ch = str.charAt(i);
            if (isLetter(ch) || isDigit(ch) || ch == '_' || ch == '$') {
                continue;
            } else {
                break;
            }
        }


        while (i < len && str.charAt(i) == ' ') i++;


        if (i < len) {
            char last = str.charAt(i);
            if (last == ';' || last == ',' || last == '=') {
                // acceptable
                System.out.println("La cadena Si acepta");
            } else {
                System.out.println("La cadena No acepta");
            }
        } else {
          
            System.out.println("La cadena No acepta");
        }
    }

    public void g4_grafosWhile(String s) {
        if (s == null) { System.out.println("La cadena No acepta"); return; }
        String str = s;
        int len = str.length();
        int i = 0;


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

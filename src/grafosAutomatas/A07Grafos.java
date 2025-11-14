package grafosAutomatas;

public class A07Grafos {
    // Validate if input begins with one of the keywords: for, if, else, ifelse, foreach
    // and next char is '(' or spaces then '('.
    private String[] keys = {"for", "ifelse", "foreach", "if", "else"};

    public void g4_grafosFor(String s) {
        if (s == null || s.length() == 0) { System.out.println("La cadena No acepta"); return; }
        // use for to check each keyword
        for (int k = 0; k < keys.length; k++) {
            String kw = keys[k];
            if (s.startsWith(kw)) {
                // after keyword, allow '(' or spaces then '('
                int pos = kw.length();
                int len = s.length();
                while (pos < len && s.charAt(pos) == ' ') pos++;
                if (pos < len && s.charAt(pos) == '(') {
                    System.out.println("La cadena Si acepta");
                    return;
                } else {
                    System.out.println("La cadena No acepta");
                    return;
                }
            }
        }
        System.out.println("La cadena No acepta");
    }

    public void g4_grafosWhile(String s) {
        if (s == null || s.length() == 0) { System.out.println("La cadena No acepta"); return; }
        int k = 0;
        while (k < keys.length) {
            String kw = keys[k];
            if (s.startsWith(kw)) {
                int pos = kw.length();
                int len = s.length();
                while (pos < len && s.charAt(pos) == ' ') pos++;
                if (pos < len && s.charAt(pos) == '(') { System.out.println("La cadena Si acepta"); return; }
                else { System.out.println("La cadena No acepta"); return; }
            }
            k++;
        }
        System.out.println("La cadena No acepta");
    }

    public void g4_grafosDoWhile(String s) {
        if (s == null || s.length() == 0) { System.out.println("La cadena No acepta"); return; }
        int k = 0;
        do {
            String kw = keys[k];
            if (s.startsWith(kw)) {
                int pos = kw.length();
                int len = s.length();
                while (pos < len && s.charAt(pos) == ' ') pos++;
                if (pos < len && s.charAt(pos) == '(') { System.out.println("La cadena Si acepta"); return; }
                else { System.out.println("La cadena No acepta"); return; }
            }
            k++;
        } while (k < keys.length);
        System.out.println("La cadena No acepta");
    }
}

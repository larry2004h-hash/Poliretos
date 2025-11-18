package grafosAutomatas;

public class A03Grafos {
    // pattern: a+ | b+ | c+  
    public void g4_grafosFor(String s) {
        if (s.length() == 0) { System.out.println("La cadena No acepta"); return; }
        char first = s.charAt(0);
        if (first != 'a' && first != 'b' && first != 'c') { System.out.println("La cadena No acepta"); return; }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != first) { System.out.println("La cadena No acepta"); return; }
        }
        System.out.println("La cadena Si acepta");
    }

    public void g4_grafosWhile(String s) {
        if (s.length() == 0) { System.out.println("La cadena No acepta"); return; }
        char first = s.charAt(0);
        if (first != 'a' && first != 'b' && first != 'c') { System.out.println("La cadena No acepta"); return; }

        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) != first) { System.out.println("La cadena No acepta"); return; }
            i++;
        }
        System.out.println("La cadena Si acepta");
    }

    public void g4_grafosDoWhile(String s) {
        int len = s.length();
        if (len == 0) { System.out.println("La cadena No acepta"); return; }
        char first = s.charAt(0);
        if (first != 'a' && first != 'b' && first != 'c') { System.out.println("La cadena No acepta"); return; }

        int i = 0;
        do {
            if (s.charAt(i) != first) { System.out.println("La cadena No acepta"); return; }
            i++;
        } while (i < len);

        System.out.println("La cadena Si acepta");
    }
}

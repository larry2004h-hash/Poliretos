package grafosAutomatas;

public class A02Grafos {
    // pattern assumed: a b+ c a  (starts with 'a', then >=1 'b', then 'c', then 'a')
    public void g4_grafosFor(String s) {
        int state = 0; // 0: expect 'a' start, 1: b+, 2: expect c, 3: expect final a
        int len = s.length();
        int i;
        int countB = 0;

        for (i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (state == 0) {
                if (ch == 'a') state = 1;
                else { System.out.println("La cadena No acepta"); return; }
            } else if (state == 1) {
                if (ch == 'b') countB++;
                else if (ch == 'c') {
                    if (countB < 1) { System.out.println("La cadena No acepta"); return; }
                    state = 3;
                } else { System.out.println("La cadena No acepta"); return; }
            } else if (state == 3) {
                if (ch == 'a' && i == len - 1) { System.out.println("La cadena Si acepta"); return; }
                else { System.out.println("La cadena No acepta"); return; }
            }
        }
        System.out.println("La cadena No acepta");
    }

    public void g4_grafosWhile(String s) {
        int state = 0;
        int i = 0;
        int len = s.length();
        int countB = 0;

        while (i < len) {
            char ch = s.charAt(i);
            if (state == 0) {
                if (ch == 'a') state = 1;
                else { System.out.println("La cadena No acepta"); return; }
            } else if (state == 1) {
                if (ch == 'b') countB++;
                else if (ch == 'c') {
                    if (countB < 1) { System.out.println("La cadena No acepta"); return; }
                    state = 3;
                } else { System.out.println("La cadena No acepta"); return; }
            } else if (state == 3) {
                if (ch == 'a' && i == len - 1) { System.out.println("La cadena Si acepta"); return; }
                else { System.out.println("La cadena No acepta"); return; }
            }
            i++;
        }
        System.out.println("La cadena No acepta");
    }

    public void g4_grafosDoWhile(String s) {
        int state = 0;
        int i = 0;
        int len = s.length();
        int countB = 0;
        if (len == 0) { System.out.println("La cadena No acepta"); return; }

        do {
            char ch = s.charAt(i);
            if (state == 0) {
                if (ch == 'a') state = 1;
                else { System.out.println("La cadena No acepta"); return; }
            } else if (state == 1) {
                if (ch == 'b') countB++;
                else if (ch == 'c') {
                    if (countB < 1) { System.out.println("La cadena No acepta"); return; }
                    state = 3;
                } else { System.out.println("La cadena No acepta"); return; }
            } else if (state == 3) {
                if (ch == 'a' && i == len - 1) { System.out.println("La cadena Si acepta"); return; }
                else { System.out.println("La cadena No acepta"); return; }
            }
            i++;
        } while (i < len);

        System.out.println("La cadena No acepta");
    }
}

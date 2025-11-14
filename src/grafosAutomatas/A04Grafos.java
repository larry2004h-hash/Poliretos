package grafosAutomatas;

public class A04Grafos {
    // pattern: 1+ 0+ 1*  (one or more '1', then one or more '0', then zero or more '1')
    public void g4_grafosFor(String s) {
        int len = s.length();
        if (len == 0) { System.out.println("La cadena No acepta"); return; }

        int i;
        int state = 0; // 0: reading leading 1+, 1: reading 0+ (at least one), 2: trailing 1*
        int count1 = 0;
        int count0 = 0;

        for (i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (state == 0) {
                if (ch == '1') count1++;
                else if (ch == '0') {
                    if (count1 < 1) { System.out.println("La cadena No acepta"); return; }
                    state = 1;
                    count0++;
                } else { System.out.println("La cadena No acepta"); return; }
            } else if (state == 1) {
                if (ch == '0') count0++;
                else if (ch == '1') state = 2;
                else { System.out.println("La cadena No acepta"); return; }
            } else {
                if (ch != '1') { System.out.println("La cadena No acepta"); return; }
            }
        }

        if (count1 >= 1 && count0 >= 1) System.out.println("La cadena Si acepta");
        else System.out.println("La cadena No acepta");
    }

    public void g4_grafosWhile(String s) {
        int len = s.length();
        if (len == 0) { System.out.println("La cadena No acepta"); return; }
        int i = 0;
        int state = 0;
        int count1 = 0;
        int count0 = 0;

        while (i < len) {
            char ch = s.charAt(i);
            if (state == 0) {
                if (ch == '1') count1++;
                else if (ch == '0') {
                    if (count1 < 1) { System.out.println("La cadena No acepta"); return; }
                    state = 1;
                    count0++;
                } else { System.out.println("La cadena No acepta"); return; }
            } else if (state == 1) {
                if (ch == '0') count0++;
                else if (ch == '1') state = 2;
                else { System.out.println("La cadena No acepta"); return; }
            } else {
                if (ch != '1') { System.out.println("La cadena No acepta"); return; }
            }
            i++;
        }

        if (count1 >= 1 && count0 >= 1) System.out.println("La cadena Si acepta");
        else System.out.println("La cadena No acepta");
    }

    public void g4_grafosDoWhile(String s) {
        int len = s.length();
        if (len == 0) { System.out.println("La cadena No acepta"); return; }
        int i = 0;
        int state = 0;
        int count1 = 0;
        int count0 = 0;

        do {
            char ch = s.charAt(i);
            if (state == 0) {
                if (ch == '1') count1++;
                else if (ch == '0') {
                    if (count1 < 1) { System.out.println("La cadena No acepta"); return; }
                    state = 1;
                    count0++;
                } else { System.out.println("La cadena No acepta"); return; }
            } else if (state == 1) {
                if (ch == '0') count0++;
                else if (ch == '1') state = 2;
                else { System.out.println("La cadena No acepta"); return; }
            } else {
                if (ch != '1') { System.out.println("La cadena No acepta"); return; }
            }
            i++;
        } while (i < len);

        if (count1 >= 1 && count0 >= 1) System.out.println("La cadena Si acepta");
        else System.out.println("La cadena No acepta");
    }
}

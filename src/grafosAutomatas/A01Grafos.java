package grafosAutomatas;

public class A01Grafos {

    // a* b+ c  
    public void g4_grafosFor(String s) {
        int state = 0; 
        int i;
        boolean accept = false;
        int len = s.length();
        int countB = 0;

        for (i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (state == 0) {
                if (ch == 'a') {
                    // stay in state 0
                } else if (ch == 'b') {
                    state = 1;
                    countB++;
                } else {
                    accept = false;
                    System.out.println("La cadena No acepta");
                    return;
                }
            } else if (state == 1) {
                if (ch == 'b') {
                    countB++;
                } else if (ch == 'c') {
                    state = 2;
                } else {
                    System.out.println("La cadena No acepta");
                    return;
                }
            } else if (state == 2) {
                // after seeing c, no more symbols allowed
                System.out.println("La cadena No acepta");
                return;
            }
        }

        if (state == 2 && countB >= 1) {
            accept = true;
        } else {
            accept = false;
        }

        System.out.println(accept ? "La cadena Si acepta" : "La cadena No acepta");
    }

    public void g4_grafosWhile(String s) {
        int state = 0;
        int i = 0;
        int len = s.length();
        int countB = 0;
        boolean accept = false;

        while (i < len) {
            char ch = s.charAt(i);
            if (state == 0) {
                if (ch == 'a') {
                } else if (ch == 'b') {
                    state = 1;
                    countB++;
                } else {
                    System.out.println("La cadena No acepta");
                    return;
                }
            } else if (state == 1) {
                if (ch == 'b') {
                    countB++;
                } else if (ch == 'c') {
                    state = 2;
                } else {
                    System.out.println("La cadena No acepta");
                    return;
                }
            } else {
                System.out.println("La cadena No acepta");
                return;
            }
            i++;
        }

        if (state == 2 && countB >= 1) accept = true;
        System.out.println(accept ? "La cadena Si acepta" : "La cadena No acepta");
    }

    public void g4_grafosDoWhile(String s) {
        int state = 0;
        int i = 0;
        int len = s.length();
        int countB = 0;
        boolean accept = false;

        if (len == 0) {
            System.out.println("La cadena No acepta");
            return;
        }

        do {
            char ch = s.charAt(i);
            if (state == 0) {
                if (ch == 'a') {
                } else if (ch == 'b') {
                    state = 1;
                    countB++;
                } else {
                    System.out.println("La cadena No acepta");
                    return;
                }
            } else if (state == 1) {
                if (ch == 'b') {
                    countB++;
                } else if (ch == 'c') {
                    state = 2;
                } else {
                    System.out.println("La cadena No acepta");
                    return;
                }
            } else {
                System.out.println("La cadena No acepta");
                return;
            }
            i++;
        } while (i < len);

        if (state == 2 && countB >= 1) accept = true;
        System.out.println(accept ? "La cadena Si acepta" : "La cadena No acepta");
    }
}


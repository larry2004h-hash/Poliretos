package arrays;

public class A01Arrays {

    public void mostrarSeries(int n) {
        String nombre = "Samuel Esteban Robayo Morcillo";
        String[] palabras = nombre.split(" ");
        int[] porcentajes = {100, 75, 50, 25};

        System.out.println("=== A01 - BARRAS (FOR) ===");
        metodoFor(palabras, porcentajes);

        System.out.println("\n=== A01 - BARRAS (WHILE) ===");
        metodoWhile(palabras, porcentajes);

        System.out.println("\n=== A01 - BARRAS (DO...WHILE) ===");
        metodoDoWhile(palabras, porcentajes);
    }

   
    private String generarBarra(int porcentaje) {
        int total = 20; 
        int filled = porcentaje * total / 100; 
        if (porcentaje == 100) filled = total;
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < filled; i++) sb.append("=");
        sb.append(">");
        for (int i = filled + 1; i < total; i++) sb.append(" ");
        sb.append("]");
        return sb.toString();
    }

    
    private String recortar(String palabra, int porcentaje) {
        int len = palabra.length();
        int nuevaLong = (int) Math.ceil(len * (porcentaje / 100.0));
        if (nuevaLong < 1) nuevaLong = 1;
        if (nuevaLong > len) nuevaLong = len;
        return palabra.substring(0, nuevaLong);
    }

    // ========================= FOR =========================
    private void metodoFor(String[] palabras, int[] porcentajes) {
        int limit = Math.min(palabras.length, porcentajes.length);
        for (int i = 0; i < limit; i++) {
            String barra = generarBarra(porcentajes[i]);
            String rec = recortar(palabras[i], porcentajes[i]);
            System.out.printf("%s %3d%% %s%n", barra, porcentajes[i], rec);
        }
    }

    // ========================= WHILE =========================
    private void metodoWhile(String[] palabras, int[] porcentajes) {
        int i = 0;
        int limit = Math.min(palabras.length, porcentajes.length);
        while (i < limit) {
            String barra = generarBarra(porcentajes[i]);
            String rec = recortar(palabras[i], porcentajes[i]);
            System.out.printf("%s %3d%% %s%n", barra, porcentajes[i], rec);
            i++;
        }
    }

    // ========================= DO...WHILE =========================
    private void metodoDoWhile(String[] palabras, int[] porcentajes) {
        int limit = Math.min(palabras.length, porcentajes.length);
        if (limit == 0) return;
        int i = 0;
        do {
            String barra = generarBarra(porcentajes[i]);
            String rec = recortar(palabras[i], porcentajes[i]);
            System.out.printf("%s %3d%% %s%n", barra, porcentajes[i], rec);
            i++;
        } while (i < limit);
    }
}


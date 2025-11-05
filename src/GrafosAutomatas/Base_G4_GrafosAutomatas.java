
public class Base_G4_GrafosAutomatas {

    protected final int grupo = 4;
    protected final String integrante = "soria_ariel";
    protected Scanner sc = new Scanner(System.in);

    // Método para mostrar encabezado general
    protected void mostrarEncabezado(String ejercicio) {
        System.out.println("====================================");
        System.out.println("Número de grupo: " + grupo);
        System.out.println("Integrante: " + integrante);
        System.out.println("Ejercicio: " + ejercicio);
        System.out.println("====================================");
    }

    // Método para pedir una cadena
    protected String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }
}

public class DiasSemana {

    enum Dias{LUNES, MARTES, MIERCOLES, JUEVES, VIERNES}

    public static void mostrarDia(){
        System.out.println("Hoy es " + Dias.MIERCOLES);
        System.out.println("Mañana es " + Dias.JUEVES);
    }

    public static void main(String[] args) {
        mostrarDia();
    }
}

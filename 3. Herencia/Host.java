public class Host {
    public static void main(String[] args) {
        // SUPER CLASS
        Web Page = new Web();
        // Asignando Valores
        Page.setColumnas(6);
        Page.setOpciones(5);
        Page.setEstado("En Mantenimiento");
        Page.setColor("Azul");
        // Imprimiendo Valores
        System.out.println(Page.getColumnas());
        System.out.println(Page.getOpciones());
        System.out.println(Page.getEstado());
        System.out.println(Page.getColor());
        // Metodos
        Page.Abrir_Web();
        Page.Responsive();
        Page.Chequeo_Estado_Pag();

        // SUB CLASS
        Mobile Disp = new Mobile();
        // Asignando Valores
        Disp.setColumnas(4);
        Disp.setOpciones(2);
        Disp.setEstado("Activo");
        Disp.setColor("Gris");
        // Imprimiendo Valores
        System.out.println(Disp.getColumnas());
        System.out.println(Disp.getOpciones());
        System.out.println(Disp.getEstado());
        System.out.println(Disp.getColor());
        //Metodos
        Disp.Abrir_Web();
        Disp.usarAnimacion();
        Disp.usoDispositivo();
        // Metodos Sobre escritos
        Disp.Responsive();
        Disp.Chequeo_Estado_Pag();
    }
}
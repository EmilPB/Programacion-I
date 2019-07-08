// Web class(Parent) and Mobile class(Child) Exercise 
// 27/05/2019    ------MAIN CLASS------
public class Web {
    private String Dis;
    private String Color;
    private String Online;
    private int Columnas;
    private int Opciones;
    private boolean Resp;
    
    public Web() {
        Dis = "Material";
        Color = "Azul";
        Columnas = 12;
        Opciones = 4;
        Resp = true; // Responsive
        Online = "Activa";
        System.out.println("Class Name: Web");
    }

    /*~~~~~~~~~~ Encapsulamiento (Getters & Setters) ~~~~~~~~~~*/
    public int getColumnas(){ // Getter 
        return Columnas;
    }

    public void setColumnas(int numColumnas) { // Setter => Void
        this.Columnas = numColumnas;
    }

    public int getOpciones() { // Getter
        return Opciones;
    }

    public void setOpciones(int opciones) { // Setter
        this.Opciones = opciones;
    }

    public String getEstado() {
        return Online;
    }

    public void setEstado(String online) {
        this.Online = online;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    public void Abrir_Web() {
        System.out.println("Se ha abierto la pagina web, su diseño es " + Dis 
        + " | su color de tema es " + Color + " | tiene " + Opciones + " opciones.");
    }

    public void Numero_Columnas() {
        System.out.println("El numero de columnas es de " + Columnas);
    }

    public void Chequeo_Estado_Pag() {
        System.out.println("Estado de la pagina: " + Online);
    }

    public void Responsive() {
        System.out.println("Responsive: " + Resp);
    }
}
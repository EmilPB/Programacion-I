// Web class(Parent) and Mobile class(Child) Exercise 
// 27/05/2019    ------SUBCLASS------
public class Mobile extends Web {

    /*~~~~~~~~~~ Encapsulamiento (Getters & Setters) ~~~~~~~~~~*/
    private String Animaciones;
    private String Dispositivo;
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    public Mobile() {
        super();
        Dispositivo = "iPhone 6S";
        Animaciones = "Material";
        System.out.println("Class Name: Mobile");
    }

    /* ~~~~~~~~~~~~~~~~~~ Sobreescritura de Metodos ~~~~~~~~~~~~~~~~~~~~ */
    @Override
    public void Responsive() {
        System.out.println("Resposive: Default"); // Active by Default
    }
    
    @Override
    public void Chequeo_Estado_Pag() {
        super.Chequeo_Estado_Pag();
        System.out.println("Estado de la pagina: Default"); // Online by Default
    }
    /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

    /*------------------ Encapsulamiento (Getters & Setters) --------------------*/
    public String getAnimacion() { //Getter
        return Animaciones;
    }

    public void setAnimacion(String Animacion_Mobile) { // Setter
        Animaciones = Animacion_Mobile;
    }

    public String getDispositivo() { //Getter
        return Dispositivo;
    }

    public void setDispositivo(String Disp) { // Setter
        Dispositivo = Disp;
    }
    /*---------------------------------------------*/

    public void usarAnimacion() {
        System.out.println("Animaciones Activadas");
    }

    public void usoDispositivo() {
        System.out.println("El dispositivo es: iPhone Xs");
    }
}
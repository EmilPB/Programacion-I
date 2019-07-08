// EJemplos desarrollados en clase

public class Persona {
    String Nombre;
    String Apellido;
    int Edad;
    String Sexo;

    public static void main(String[] args){}

    public void Caminar() {
        System.out.println("Caminando...");
    }

    public void Comer() {
        System.out.println("Comiendo...");
    }

    public String Saludar(String Nombre) {
        return "Hola " + Nombre;
    }
}
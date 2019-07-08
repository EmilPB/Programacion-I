// Clase que hereda de Persona.java

public class PersonaTest {

    public static void main(String[] args) {
        Persona p1 = new Persona();

        p1.Nombre = "John";
        p1.Apellido = "Doe";
        p1.Edad = 21;
        p1.Sexo = "Male";

        p1.Caminar();
        System.out.println(p1.Nombre);
        System.out.println(p1.Saludar("Angel"));
    }
}

// Clase de Prueba Final - Ejercicios: Persona.java , Calculo.java , ManejaCadenas.java
public class Test {
    public static void main(String[] args) {
        System.out.println("_______________________");
        // Clase Persona: Metodos
        Persona John = new Persona();
        
        System.out.println(John.Nombre + ", " + John.Apellido + ", " + John.Edad + ", " + John.Sexo);
        Persona.Dormir();
        Persona.Comer();
        Persona.Caminar();
        Persona.Correr();
        System.out.println("_______________________");
        // Clase Calculo: Metodos
        Calculo Math = new Calculo();

        System.out.println(Math.Sumar(35, 60));
        System.out.println(Math.Sumar(35, 60, 56)); // Sobrecarga

        System.out.println(Math.Restar(50, 15));
        System.out.println(Math.Restar(50, 15, 5, 2)); // Sobrecarga

        System.out.println(Math.Multiplicar(45, 12));
        System.out.println(Math.Multiplicar(45, 12, 34)); // Sobrecarga

        System.out.println(Math.Dividir(50, 5));
        System.out.println(Math.Dividir(500, 200, 100, 10)); // Sobrecarga

        System.out.println("_______________________");
        // Clase Maneja Cadenas: Metodos
        ManejaCadenas Palabras = new ManejaCadenas();
        
        System.out.println(Palabras.Reverso("Constitucionalmente"));
        System.out.println(Palabras.EliminaVocales("Murcielago"));
        System.out.println(Palabras.CuentaVocales("El cielo esta nublado!"));
        System.out.println(Palabras.CuentaConsonantes("La partida ya empezó."));
        System.out.println(Palabras.CuentaPalabras("Leyra no sabe quien es Sasori."));
        System.out.println("_______________________");
    }
}
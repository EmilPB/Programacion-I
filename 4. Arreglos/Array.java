
/* Practica 4: Arreglos

Esta clase se encarga de ejecutar todos los metodos
y mostrar los resultados.

 */

public class Array {
    public static void main(String[] args) {

        // Ejercicio 1:
        Exercises Ex = new Exercises();
        Ex.One(new int[] { 11, 22, 33 });

        // Ejercicio 2:
        Ex.Two(new int[] { 10, 20, 30, 40, 50 });

        // Ejercicio 3:
        Ex.Three(new int[][] { { 20, 25, 30 }, { 97, 98, 99 }, { 54, 56, 58 } });

        // Ejercicio 4:
        Ex.Four(new int[] { 11, 345, 70 }, new int[] { 25, 500, 1024 });

        // ------------------------ Ejercicio 5: -------------------------------

        // Arreglo con enteros Aleatorios
        Ex.Random();

        // Arreglo ordenado de forma Descendente
        Ex.Descendente(new int[] { 34, 76, 45, 11, 98, 167, 549, 43 });

        // Arreglo ordenado de forma Ascendente
        Ex.QuickSort(new int[] { 17, 60, 27, 342, 44, 234, 549, 12 });

        // --------------------------------------------------------------------

        // Ejercicio 6:
        Ex.Six(new int[][] { { 11, 22, 33 }, { 15, 20, 30 }, { 17, 22, 10 } },
                new int[][] { { 11, 22, 33 }, { 15, 20, 30 }, { 17, 22, 10 } });
    }
}
public class Practice {

    public static void main(String[] args) {
        System.out.println("-------1-------");

        // 1. Realizar un programa que imprima en pantalla su nombre y su correo electrónico.
        System.out.println("Nombre: Emil | Correo: AsherBarranco@icloud.com");
        System.out.println("-------2-------");


        // 2. Realizar un programa que imprima los números del 1 al 10.
        for (int i = 1; i < 11; i++) {
            System.out.println("Count: " + i);
        }
        System.out.println("-------3-------");


        // 3. Realizar un programa que imprima los números del -10 al 0.
        int b = -11;
        while (b < 0) {
            b++;
            System.out.println("Count: " + b);
        }
        System.out.println("-------4-------");


        // 4. Realizar un programa que imprima la sumatoria de los números del 1 al 20.
        int n = 20;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Result: " + sum);
        System.out.println("-------5-------");


        // 5. Realizar un programa que imprima la tabla de multiplicar del 2 al 10.
        for(int i = 1; i < 10; i++) {
            System.out.println(i * 2);
        }
        System.out.println("-------6-------");


        // 6. Realizar un programa que imprima la serie Fibonacci (investigar) de un valor dado (valor fijo)
        int A, B, N, i, Aux;
        N = 10; // Valor fijo
        A = 0;
        B = 1;
        for (i = 0; i < N; i++)  // Se repite para el número de veces deseado
        {
            Aux = A;
            A = B; // Intercambio valores
            B = Aux + A; // Calculo el nuevo valor
            System.out.println(Aux); // Imprimo el valor
        }
        System.out.println("-------7-------");


        // 7. Realizar un programa que imprima los números pares del 2 al 100.
        int even = 101;
        for(int c = 1; c <= even; c++){
            if(c % 2 == 0) {
                System.out.println(c);
            }
        }
        System.out.println("-------8-------");
        

        // 8. Realizar un programa que imprima los números impares del 1 al 100.
        int odd = 100;
        for(int d = 0; d <= odd; d++){
            if(d % 2 != 0) {
                System.out.println(d);
            }
        }
        System.out.println("-------9-------");


        // 9. Realizar un programa que imprima la sumatoria de los números impares del 1 al 1000.
        int e = 1000;
        int add = 0;
        for (int f = 0; f <= e; f++) {
            if (f % 2 != 0) {
                add = add + f;
            }
        }
        System.out.println("Result: " + add);
        System.out.println("-------10-------");


        // 10. Realizar un programa que imprima el área del triangulo de base 26 y altura 38. (investigar fórmula)
        int Base = 26;
        int Altura = 38;
        int AreaDelTriangulo = Base * Altura / 2;
        System.out.println("Area del Triangulo: " + AreaDelTriangulo);
    }
}
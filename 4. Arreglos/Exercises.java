
/* 
Practica 4: Arreglos 
En esta clase se definen los metodos y sus funciones

*/

import java.util.Arrays;

public class Exercises {
    // Ejercicio 1:
    public void One(int[] Nums) {
        int ans = 0;
        for (int i = 0; i < Nums.length; i++) {
            ans = ans + Nums[i];
        }
        System.out.println("\n" + "1. La suma es de: " + ans + "\n");
    }

    // Ejercicio 2:
    public void Two(int[] Nums) {
        System.out.println("2. Los inversos son: \n");
        for (int i = Nums.length - 1; i >= 0; i--) {
            System.out.println(Nums[i]);
        }
    }

    // Ejercio 3:
    public void Three(int[][] Matrix) {
        System.out.println("\n" + "3. Las matriz inversa es: \n");
        for (int i = 0; i < Matrix.length; i++) {
            for (int x = Matrix.length - 1; x >= 0; x--) {
                System.out.print(Matrix[i][x] + " ");
            }
            System.out.println();
        }
    }

    // Ejercicio 4:
    public void Four(int[] Right, int[] Left) {

        int[] Sort = new int[Right.length + Left.length];

        for (int i = 0; i < Right.length; i++) {
            Sort[i] = Right[i];
        }

        for (int i = 0; i < Left.length; i++) {
            Sort[i + Right.length] = Left[i];
        }

        int ans = 0;

        for (int i = Sort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Sort[j] > Sort[j + 1]) {
                    ans = Sort[j];
                    Sort[j] = Sort[j + 1];
                    Sort[j + 1] = ans;
                }
            }
        }

        System.out.println("\n" + "4. La secuencia ordenada BubbleSort es: \n");
        for (int x = 0; x < Sort.length; x++) {
            System.out.println(Sort[x]);
        }
    }

    /*-------------------------- Ejercicio 5 ------------------------*/
    public void Random() {
        int[] Zero = new int[6];
        System.out.println("\n" + "5.1 Arreglo con Numeros Aleatorios: " + "\n");
        for (int i = 0; i < Zero.length; i++) {
            Zero[i] = (int) (Math.random() * 1722); // Cracion de la misma cantidad
            System.out.println(Zero[i]); // de numeros pero aleatorios
        }
        System.out.println();
    }

    public void Descendente(int[] Zero) {
        Arrays.sort(Zero);
        System.out.println("\n" + "5.2 Arreglo Descendente: " + "\n");
        for (int i = Zero.length - 1; i >= 0; i--) {
            System.out.println(Zero[i]);
        }
        System.out.println();
    }

    public void quickSort(int[] arr, int start, int end) {

        int partition = partition(arr, start, end);

        if (partition - 1 > start) {
            quickSort(arr, start, partition - 1);
        }
        if (partition + 1 < end) {
            quickSort(arr, partition + 1, end);
        }
    }

    public int partition(int[] arr, int start, int end) {
        int pivot = arr[end];

        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }

        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;
    }

    public void QuickSort(int[] Zero) {

        quickSort(Zero, 0, Zero.length - 1);
        System.out.println("\n" + "5.3 QuickSort Ascendente: " + Arrays.toString(Zero) + "\n");
    }

    /*----------------------------------------------------------------*/

    // Ejercicio 6:
    public void Six(int[][] Matrix1, int[][] Matrix2) {
        System.out.println("\n" + "6. Suma de Matrices, Resultado: \n");
        int[][] Result = new int[3][3];

        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                Result[a][b] = 0;
                for (int i = 0; i < 3; i++) {
                    Result[a][b] += Matrix1[a][i] + Matrix2[i][b];
                }
                System.out.print(Result[a][b] + " ");
            }
            System.out.println();
        }
    }
}
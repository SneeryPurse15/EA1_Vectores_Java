import java.util.Scanner;

public class VectoresEA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[15];

        // Vector ya creado y llenado (del commit 1)
        for (int i = 0; i < vector.length; i++) {
            int num;
            do {
                System.out.print("Ingrese un número entre 10 y 100: ");
                num = sc.nextInt();
                if (num < 10 || num > 100) {
                    System.out.println("Número fuera de rango, intente de nuevo.");
                }
            } while (num < 10 || num > 100);
            vector[i] = num;
        }

        // Mostrar vector
        System.out.println("\nVector completo:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Buscar un valor
        System.out.print("\nIngrese un número para buscar: ");
        int buscar = sc.nextInt();
        boolean encontrado = false;
        int mayor = vector[0], menor = vector[0];

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar) {
                System.out.println("Número encontrado en la posición: " + i);
                encontrado = true;
            }
            if (vector[i] > mayor) mayor = vector[i];
            if (vector[i] < menor) menor = vector[i];
        }

        if (!encontrado) {
            System.out.println("El número no está en el vector.");
        }

        System.out.println("Mayor: " + mayor + " | Menor: " + menor);

        sc.close();
    }
}

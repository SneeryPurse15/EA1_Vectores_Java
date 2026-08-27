import java.util.Scanner;

public class VectoresEA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[15];

        // 1. Crear y llenar vector con validación
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

        sc.close();
    }
}

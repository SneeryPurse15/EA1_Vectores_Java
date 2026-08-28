import java.util.Scanner;

public class VectoresEA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[15];

        // Commit 1: Crear y llenar vector con validación
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

        // Commit 2: Búsqueda de valor + mayor/menor
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

        // Commit 3: Mostrar múltiplos del número seleccionado
        if (encontrado) {
            System.out.println("\nMúltiplos de " + buscar + " dentro del vector:");
            boolean hayMultiplos = false;
            for (int num : vector) {
                if (num % buscar == 0 && num != buscar) {
                    System.out.print(num + " ");
                    hayMultiplos = true;
                }
            }
            if (!hayMultiplos) {
                System.out.println("No hay múltiplos de " + buscar + " en el vector.");
            }
            System.out.println();
        }

        // Commit 4: Suma, promedio y nuevo vector
        int suma = 0;
        for (int num : vector) {
            suma += num;
        }
        double promedio = (double) suma / vector.length;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);

        System.out.println("\nNúmeros mayores al promedio:");
        int count = 0;
        for (int num : vector) {
            if (num > promedio) {
                System.out.print(num + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No hay números mayores al promedio.");
        } else {
            System.out.println("\nCantidad: " + count);
        }

        sc.close();
    }
}

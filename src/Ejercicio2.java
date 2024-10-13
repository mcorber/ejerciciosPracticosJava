import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        int arrayLength = 7;

        // Declaramos el array
        int[] numeros = new int[arrayLength];

        // Solicitamos los valores del array
        for (int i = 0; i < numeros.length; i++) {
            boolean esValido = false;
            do {
                System.out.println("Valor en la posición : " + (i + 1));
                if (sc.hasNextInt()) {
                    numeros[i] = sc.nextInt();
                    esValido = true;
                } else {
                    System.out.println("Valor no valido para la posición: " + (i + 1));
                    sc.next(); // descartamos el valor inválido
                }
            } while (!esValido);
        }

        // Número de posiciones a rotar
        int posicionesArotar = 0;
        do {
            System.out.println("Introduzca el número de posiciones a rotar:");
            if (sc.hasNextInt()) {
                posicionesArotar = sc.nextInt();
                if (posicionesArotar < 1) {
                    System.out.println("Número no válido");
                }
            } else {
                System.out.println("Valor no válido");
                sc.next(); // descartamos el valor inválido
            }
        } while (posicionesArotar < 1);

        // Dirección de rotación
        System.out.println("Introduzca la dirección de rotación (izquierda/derecha):");
        String direccion = sc.next();
        boolean rotarIzquierda = direccion.equalsIgnoreCase("izquierda");

        // Crear el array rotado
        int[] arrayRotado = new int[arrayLength];

        // Lógica de rotación
        for (int i = 0; i < arrayLength; i++) {
            if (rotarIzquierda) {
                // Rotación hacia la izquierda
                arrayRotado[i] = numeros[(i + posicionesArotar) % arrayLength];
            } else {
                // Rotación hacia la derecha
                arrayRotado[i] = numeros[(i - posicionesArotar + arrayLength) % arrayLength];
            }
        }

        // Mostramos el array original
        System.out.println("Array original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + " : " + numeros[i]);
        }

        // Mostramos el array rotado
        System.out.println("Array rotado:");
        for (int i = 0; i < arrayRotado.length; i++) {
            System.out.println((i + 1) + " : " + arrayRotado[i]);
        }
    }
}

package es.practica1;

import java.util.Scanner;

/**
 * @author Alejandro Pina Diarte
 */
public class GestionArray {

    private static final int[] array = new int[10];

    private static boolean arrayLleno;

    private static final Scanner sc = new Scanner(System.in);
    private static String opcion;

    public static void main(String[] args) {

        mostrarMenu();

    }
// Método para mostrar el menú

    private static void mostrarMenu() {

        System.out.println("\t ---------- Bienvenido al sistema Gestión de Array ----------");
        System.out.println("\t Elige una operación a realizar:");
        System.out.println("\t 1 - Introducir los valores.");
        System.out.println("\t 2 - Mostrar el contenido.");
        System.out.println("\t 3 - Obtener el valor mayor.");
        System.out.println("\t 4 - Obtener el valor menor.");
        System.out.println("\t 5 - Obtener la suma de los valores.");
        System.out.println("\t 6 - Obtener la media de los valores.");
        System.out.println("\t 7 - Salir.");
        System.out.println("\t ------------------------------------------------------------");
        System.out.print("Escribe aquí el número de la opción a realizar: ");

        opcion = sc.next();
        switch (opcion) {
            case "1":
                introducir();
                mostrarMenu();
                break;
            case "2":
                mostrar();
                mostrarMenu();
                break;
            case "3":
                obtenerMayor();
                System.out.println("------------------------------------------------------------");
                System.out.println("El valor mayor del array es: " + obtenerMayor());
                System.out.println("------------------------------------------------------------");
                mostrarMenu();
                break;
            case "4":
                obtenerMenor();
                System.out.println("------------------------------------------------------------");
                System.out.println("El valor menor del array es: " + obtenerMenor());
                System.out.println("------------------------------------------------------------");
                mostrarMenu();
                break;
            case "5":
                obtenerSuma();
                System.out.println("------------------------------------------------------------");
                System.out.println("La suma de los valores del array es: " + obtenerSuma());
                System.out.println("------------------------------------------------------------");
                mostrarMenu();
                break;
            case "6":
                obtenerMedia();
                System.out.println("------------------------------------------------------------");
                System.out.println("La media de los valores del array es: " + obtenerMedia());
                System.out.println("------------------------------------------------------------");
                mostrarMenu();
                break;
            case "7":
                salir();
                break;
            default:
                System.out.println("------------------------------------------------------------");
                System.out.println("¡¡¡¡Opción no valida, porfavor seleccione una de la lista!!!!");
                System.out.println("------------------------------------------------------------");
                mostrarMenu();
        }

    }

// Método para introducir datos en el array
    private static void introducir() {
        System.out.println("------------------------------------------------------------");
        System.out.println("Escribe los valores a intruducir en el array.");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Valor nº" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        arrayLleno = true;
        System.out.println("------------------------------------------------------------");
        opcion = "";
    }

    // Método para mostrar los valores en el array
    private static void mostrar() {
        System.out.println("------------------------------------------------------------");
        if (arrayLleno == true) {
            System.out.print("Los valores en el array son: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.println("");
            System.out.println("------------------------------------------------------------");
        } else {
            System.out.println("¡¡¡¡El array está vacío, porfavor selecciona la opción 1 para llenarlo!!!!");
            System.out.println("------------------------------------------------------------");
            mostrarMenu();
        }
        opcion = "";

    }

    // Método para obtener el valor mayor en el array
    private static int obtenerMayor() {
        int mayor = array[0];
        if (arrayLleno == true) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > mayor) {
                    mayor = array[i];
                }
            }
        } else {
            System.out.println("------------------------------------------------------------");
            System.out.println("¡¡¡¡El array está vacío, porfavor selecciona la opción 1 para llenarlo!!!!");
            System.out.println("------------------------------------------------------------");
            opcion = "";
            mostrarMenu();
        }
        return mayor;
    }

    // Método para obtener el menor valor en el array
    private static int obtenerMenor() {
        int menor = array[0];
        if (arrayLleno == true) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < menor) {
                    menor = array[i];
                }
            }
        } else {
            System.out.println("------------------------------------------------------------");
            System.out.println("¡¡¡¡El array está vacío, porfavor selecciona la opción 1 para llenarlo!!!!");
            System.out.println("------------------------------------------------------------");
            opcion = "";
            mostrarMenu();
        }
        return menor;
    }

    // Método para obtener la suma de los valores en el array
    private static long obtenerSuma() {
        long suma = 0;
        if (arrayLleno == true) {
            for (int i = 0; i < array.length; i++) {
                suma += array[i];
            }
        } else {
            System.out.println("------------------------------------------------------------");
            System.out.println("¡¡¡¡El array está vacío, porfavor selecciona la opción 1 para llenarlo!!!!");
            System.out.println("------------------------------------------------------------");
            mostrarMenu();
        }
        return suma;
    }

    // Método para obtener la media de los valores del array
    private static double obtenerMedia() {
        double media = 0;
        if (arrayLleno == true) {
            media = (double) obtenerSuma() / array.length; // Fixed
        } else {
            System.out.println("------------------------------------------------------------");
            System.out.println("¡¡¡¡El array está vacío, porfavor selecciona la opción 1 para llenarlo!!!!");
            System.out.println("------------------------------------------------------------");
            mostrarMenu();
        }
        return media;

    }

    // Método para salir del programa
    private static void salir() {
        System.out.println("------------------------------------------------------------");
        System.out.println("Has finalizado el Sistema de Gestión de Array");
        System.out.println("¡¡¡¡Hasta pronto!!!!");
        System.out.println("------------------------------------------------------------");
        System.exit(0);

    }
}

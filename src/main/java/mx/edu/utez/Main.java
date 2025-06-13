package mx.edu.utez;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opc = 0;
        while(opc != 5){
            System.out.println("¿Qué quieres hacer hoy?");
            System.out.println("Ingresa un número en la consola:");
            System.out.println("1.- Determinar si un número es par o impar");
            System.out.println("2.- Determinar si un número es positivo, negativo o cero");
            System.out.println("3.- Determinar si un número es múltiplo de 5");
            System.out.println("4.- Determinar si un número es divisible entre 3 y 4 al mismo tiempo");
            System.out.println("5.- Salir");

            opc = scanner.nextInt();

            if(opc == 5){
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();

            switch (opc){
                case 1:
                    if (numero % 2 == 0) {
                        System.out.println("El número es par.");
                    } else {
                        System.out.println("El número es impar.");
                    }
                    break;
                case 2:
                    if (numero > 0) {
                        System.out.println("El número es positivo.");
                    } else if (numero < 0) {
                        System.out.println("El número es negativo.");
                    } else {
                        System.out.println("El número es cero.");
                    }
                    break;
                case 3:
                    if (numero % 5 == 0) {
                        System.out.println("El número es múltiplo de 5.");
                    } else {
                        System.out.println("El número no es múltiplo de 5.");
                    }
                    break;
                case 4:
                    if (numero % 3 == 0 && numero % 4 == 0) {
                        System.out.println("El número es divisible entre 3 y 4.");
                    } else {
                        System.out.println("El número no es divisible entre 3 y 4 al mismo tiempo.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}

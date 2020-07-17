package Practico2;

import java.util.Scanner;

public class Practico2_Ej2 {
    public static void main(String[] args) {
        //Pedir el ingreso del nombre y el año de nacimiento.
        // Mostrar el nombre y la edad de la persona.
        Scanner input = new Scanner(System.in);

        int año = 0;
        System.out.println("Ingrese su nombre");
        String nombre = input.nextLine();

        System.out.println("Ingreso su año de nacimiento");
        año = input.nextInt();

        int edad = 2020-año;
        System.out.println("Su nombre es: " + nombre + "  y su edad es: " + edad);
        System.out.println("El programa ha finalizado");
    }
}

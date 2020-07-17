package Practico2;

import java.util.Scanner;

public class Practico2_Ej3 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        /*3- Pedir el ingreso de 3 números y mostrar la suma de ellos.*/
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int suma = 0;
        System.out.println("Ingrese el numero 1");
        num1 = input.nextInt();
        System.out.println("Ingrese el numero 2");
        num2 = input.nextInt();
        System.out.println("Ingrese el numero 3");
        num3 = input.nextInt();

        suma = num1 + num2 + num3;

        System.out.println("La suma de los numeros ingresado es: " + suma);
    }

}


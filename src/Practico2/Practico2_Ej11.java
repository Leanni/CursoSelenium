package Practico2;

import java.util.Scanner;

public class Practico2_Ej11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //11- Programa que lea 6 números e indique en pantalla si son positivos o negativos y pares o impares
        int num1 = 0;
        System.out.println("Por favor, ingrese 6 números");
        for (int i = 1; i <= 6; i ++) {
            System.out.println("Ingrese el número "  +  i);
            num1 = input.nextInt();
            if (num1 < 0) {
                if (num1 % 2 == 0) {
                    System.out.println("El número " + num1 + " ingresado" + " es: Negativo y par");
                } else {
                    System.out.println("El número " + num1 + " ingresado" + " es: Negativo e impar");
                }
            } else {
                if (num1 % 2 == 0) {
                    System.out.println("El número " + num1 + " ingresado" +  " e: Positivo y par");
                } else {
                    System.out.println("El número " + num1 + " ingresado" +  " es: Positivo e impar");
                }
            }
        }
    }
}

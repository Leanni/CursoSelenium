package Practico2;

import java.util.Scanner;

public class Practico2_Ej5_6_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 5-6-7 Pedir el ingreso de 3 números, indicar si hay números repetidos
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        System.out.println("Ingrese el número 1");
        num1 = input.nextInt();
        System.out.println("Ingrese el número 2");
        num2 = input.nextInt();
        System.out.println("Ingrese el número 3");
        num3 = input.nextInt();
         if (num1 == num2 || num1 == num3 || num2== num3){
             System.out.println("Hay números repetidos");
         } else {
             System.out.println("No hay números repetidos");
         }
    }
}

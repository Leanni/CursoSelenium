package Practico2;

import java.util.Scanner;

public class Practico2_Ej10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //10- Programa Java que lea dos números y muestre los números entre ellos.

        int num1 = 0;
        int num2 = 0;
        System.out.println("Ingrese el numero 1");
        num1 = input.nextInt();
        System.out.println("Ingrese el numero 2");
        num2 = input.nextInt();
        if (num1 < num2 && num1>0 && num2 >0){
            System.out.println("Los numeros entre " + num1 + " y "+ num2 + " son: ");
            for (int i = num1; i < num2-1; i++){
                int var = i + 1;
                System.out.print(" " + var + " ");
            }
        }else if (num1 > num2 && num1>0 && num2 >0){
            System.out.println("Los numeros entre " + num1 + " y "+ num2 + " son: ");
            for (int i = num2; i < num1-1; i++){
                int var = i + 1;
                System.out.print(" " + var + " ");
            }
        } else if (num1==0 || num2 ==0){
            System.out.println("Por favor, ingrese números mayores que 0");
        }else {
            System.out.println("Por favor, ingrese numeros positivos");
        }

    }

}

package Practico2;

import java.util.Scanner;

public class Practico2_Ej4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 4- Pedir el ingreso de un dato, e indicar si es menor o mayor a 0
        int num = 0;
        System.out.println("Ingrese un numero");
        num = input.nextInt();
        if (num < 0){
            System.out.println("El numero ingresado es menor que O ");
        }else if (num >0){
            System.out.println("El numero ingresado es mayor que O");
        }else {
            System.out.println("Es igual a 0");
        }
    }
}

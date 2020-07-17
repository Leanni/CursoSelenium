package Practico2;

import java.util.Scanner;

public class Practico2_Ej8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //8- Pedir el ingreso de números hasta que aparezca uno negativo.

        int num1 = 0;
        do{
            System.out.println("Ingrese un numero");
            num1 = input.nextInt();
            if (num1 >= 0){
                System.out.println("Hasta que no se ingrese un numero negativo no termina el programa");
            }else {
                System.out.println("El programa finaliza, se introdujo un numero negativo");
            }
        }while(num1 >= 0);

    }
}

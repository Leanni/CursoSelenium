package Practico2;

import java.util.Scanner;

public class Practico2_Ej9 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    /*9- Programa Java que pida un número NUM ingresado por el usuario.
     Luego muestre los números desde 1 hasta NUM utilizando la instrucción for.
     Ejemplo. NUM = 5 ---> 1 2 3 4 5*/
        int num = 0;
        System.out.println("Ingrese un numero");
        num = input.nextInt();
        if (num > 0) {
            System.out.print("Numero = " + num  + " ---> ");
            for (int i = 1; i <= num; i++) {
                System.out.print( i + " ");
            }
        }else {
            System.out.println("Debes intruducir un numero postivo mayor a 0");
        }
    }

}

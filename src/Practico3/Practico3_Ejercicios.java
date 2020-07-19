package Practico3;

import java.util.Scanner;

public class Practico3_Ejercicios {
    public static void main(String args []){

        Scanner input = new Scanner(System.in);
        //Parte 1
      /*  // 3 Método que reciba dos enteros y retorne la multiplicación de la misma.
        System.out.println("Ingrese un numero");
        int num1 = input.nextInt();
        System.out.println("Ingrese un numero");
        int num2 = input.nextInt();
        int resul = multiplicarDosNumeros(num1, num2);
        System.out.println("La multiplicación entre los numeros " + num1 + " y " + num2 + " es " + resul );

      // 4 Método que reciba dos números y retorne su suma
        System.out.println("Ingrese un numero");
        int num41 = input.nextInt();
        System.out.println("Ingrese un numero");
        int num42 = input.nextInt();
        int suma = sumarDosNumeros(num41, num42);
        System.out.println("La suma entre los numeros " + num41 + " y " + num42 + " es " + suma );

          //5 Método que reciba un número entero y un número double, y
          //retorne su multiplicación. Que tipo de retorno tiene este método?
        System.out.println("Ingrese un numero");
        int num51 = input.nextInt();
        System.out.println("Ingrese un numero");
        int num52 = input.nextInt();
        double mult = multiplicarEnteroConDoble(num51, num52);
        System.out.println("La suma entre los numeros " + num51 + " y " + num52 + " es " + mult );

        //7 Crear un método que reciba un número entero n,
        //y muestre en pantalla la suma desde 1 hasta ese número n. Ej. Si n es 4, se debe mostrar en pantalla 10.
        System.out.println("Ingrese un numero");
        int num7 = input.nextInt();
        int sum = sumarNumeroHastaNumeroN(num7);
        System.out.println("la suma desde 1 hasta el numero " + num7 + " es " + sum );

       // 8 Crear un método que retorne verdadero si y sólo si el número es par, de lo contrario, debe retornar falso.
        System.out.println("Ingrese un numero");
        int num8 = input.nextInt();
        boolean seraPar= esPar(num8);
        if (seraPar == true){
            System.out.println("El numero " + num8 + " es  par");
        }else {
            System.out.println("El numero " + num8 + " es  impar");
        }

       // 9
        System.out.println("Ingrese el radio del circulo");
        int radio = input.nextInt();
        double area = areaCirculo(radio);
        System.out.println("El area del circulo es " + area);

   //12 Crear un método que permita reciba el radio de un círculo,
        //y retorne su area (radio^2)*PI (utilizar una variable estática para el valor de PI)
        System.out.println("Ingrese su sueldo");
        float sueldo = input.nextInt();
        float iva = calcularIva(sueldo);
        System.out.println("Para un sueldo de " + sueldo + " se descontara un IVA (22%) de " + iva + " pesos");
   */

  /*     // Parte 2
    /* 1- Dado un número, un máximo y un mínimo (recibido por parámetro), retorne verdadero si el
     numero esta dentro del máximo y el mínimo. Si el número se encuentra dentro
     del max y min, el método debe mostrar  “El numero es valido” sino, se debe
     retornar, “El numero esta fuera de rango.”*/
 /*       System.out.println("Ingrese un numero");
        int numero = input.nextInt();
        System.out.println("Ingrese un numero que sera un minimo");
        int min = input.nextInt();
        System.out.println("Ingrese un numero que sera un maximo");
        int max = input.nextInt();
        boolean rango = numeroEnElRango(numero,min,max);
        if (rango){
            System.out.println("El numero: " + numero + " es valido");
        }else {
            System.out.println("El numero " + numero + " esta fuera de rango");
        }
 */
        /* 2- Método llamado convertirAMillas, que reciba un entero llamado kilómetros
    y retorne el equivalente a las millas. Se debe imprimir el valor en millas en pantalla. (1 milla = 1.6 kms)*/
/*        System.out.println("Ingrese los kilómetros");
        int kilometro = input.nextInt();
        float millas = convertirAMillas(kilometro);
        System.out.println(kilometro + " kilómetros son "+ millas + " millas");
*/

    /*3- Crear un método que retorne la suma de los números pares entre 1 y n, siendo n un parámetro. */
/*        System.out.println("Ingrese un numero");
        int n= input.nextInt();
        if (n>0){
            int sumapar=sumarNumerosPares(n);
            System.out.println("La suma de los numeros pares  de 1 hasta "+ n + " es "+ sumapar);

        }else {
            System.out.println("Ingrese un numero mayor que 0, por favor");
        }
*/ /*5- Crear un método llamado factorial que reciba un número y retorne el factorial de ese número.
    Ej. si el número recibido es 5, se deberá retornar el siguiente valor: 5*4*3*2*1.
    Sugerencia: utilizar un acumulador.*/
 /*       System.out.println("Ingreso un numero");
        int nume=input.nextInt();
        System.out.println("El factorial de " + " es : ");
        factorial(nume);
*/

            /* 7 -Crear un método llamado valorAbsoluto, que reciba un número y
    retorne el valor absoluto del mismo. Ej. si se recibe un -4, el método debe retornar 4.*/
        System.out.println("Ingrese un numero");
        int valor= input.nextInt();
         System.out.println("El valor obsoluto de |" + valor +"|" + " es: " + valorAbsoluto(valor)+"");


    }



    // ***** Parte 1 ****
    //1- Escribir un método que reciba un número y retorne su doble
    public static int numeroDoble(int num){
        return num * 2;
    }

    //3- Método que reciba dos enteros y retorne la multiplicación de la misma.
    public static int multiplicarDosNumeros(int num1, int num2){
        return num1*num2;
    }

    //4- Método que reciba dos números y retorne su suma
    public static int sumarDosNumeros(int num1, int num2){
        return num1 + num2;
    }
    //5-Método que reciba un número entero y un número double,
    // y retorne su multiplicación. Que tipo de retorno tiene este método?
    public static double multiplicarEnteroConDoble(int num1, double num2){
        return num1 * num2;
    }

    //7- Crear un método que reciba un número entero n, y muestre en pantalla
    // la suma desde 1 hasta ese número n. Ej. Si n es 4, se debe mostrar en pantalla 10.
    public static int sumarNumeroHastaNumeroN(int num) {
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            suma = suma + i;
        }
        return suma;
    }
    //8- Crear un método que retorne verdadero si y sólo si el número es par, de lo contrario, debe retornar falso.
    public static boolean esPar(int num){
        if (num %2==0){
            return  true;
        }else {
            return false;
        }
    }
    //9- Crear un método que permita reciba el radio de un círculo, y retorne
    // su area (radio^2)*PI (utilizar una variable estática para el valor de PI)
    public static double areaCirculo(int radio){
        double pi = 3.14;
        return Math.pow(radio,2)*pi;
    }

    //12- Realizar un método llamado calcularIva, que calcule el IVA (22%) dado un número float
    // llamado sueldo, recibido por parámetro. Sugerencia: utilizar variables estáticas.
    public static float calcularIva(float sueldo){
        return  (sueldo*22)/100;
    }

    // ***** Parte 2 ****

    /* 1- Dado un número, un máximo y un mínimo (recibido por parámetro), retorne verdadero si el
     numero esta dentro del máximo y el mínimo. Si el número se encuentra dentro
     del max y min, el método debe mostrar  “El numero es valido” sino, se debe
     retornar, “El numero esta fuera de rango.”*/
    public static boolean numeroEnElRango(Integer num, Integer min, Integer max){
        if (num>=min && num<=max){
            return true;
        }else{ return false;}
    }
   /* 2- Método llamado convertirAMillas, que reciba un entero llamado kilómetros
    y retorne el equivalente a las millas. Se debe imprimir el valor en millas en pantalla. (1 milla = 1.6 kms)*/
    public static float convertirAMillas(int kilometro){
        return (float) (kilometro*1.6);
    }
    /*3- Crear un método que retorne la suma de los números pares entre 1 y n, siendo n un parámetro. */
    public static int sumarNumerosPares(int n){
        int suma =0;
        for (int i=1;i<=n;i++){
            if (i%2==0){
                suma+=i;
            }
        }
        return suma;
    }

    /*5- Crear un método llamado factorial que reciba un número y retorne el factorial de ese número.
    Ej. si el número recibido es 5, se deberá retornar el siguiente valor: 5*4*3*2*1.
    Sugerencia: utilizar un acumulador.*/
    public static void factorial(int num){
       System.out.print(num );
       while (num!=1){
            num--;
            System.out.print(" * " + num);
        }
    }

     /* 7 -Crear un método llamado valorAbsoluto, que reciba un número y
    retorne el valor absoluto del mismo. Ej. si se recibe un -4, el método debe retornar 4.*/
    public static int valorAbsoluto(int n){
        if (n<0) {
            return n * (-1);
        }else
            return n;
    }


}

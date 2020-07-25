package Practico6;

import javax.swing.*;
import java.util.Scanner;

public class Metodos_Arreglos {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        /*5-Definir un arreglo de Double de 16 posiciones.
         Imprimir todos los valores del mismo.
         */
       /* double[] arregloDoubles= new double[16];
        int iter=1;

            System.out.println("Bievenido: Ingrese la información solicitada");

            for (int i=0; i<16; i++){
              System.out.println("Ingrese el numero " + iter);
                double numero=input.nextDouble();
                arregloDoubles[i]=numero;
                iter++;
            }

        System.out.println("Los numeros que contiene el arreglo de double son: ");
        for (int i=0; i< arregloDoubles.length; i++){
            System.out.print(arregloDoubles[i] +  "|");
        }

        /*6- Definir un arreglo de Booleanos con 9 posiciones.
        Imprimir todos los valores del arreglo*/
        /*boolean[] arregloBooleanos= new boolean[9];
        int iter=1;
        System.out.println("Bievenido: Ingrese la información solicitada");
        for (int i=0; i<9; i++){
            System.out.println("Responda true o false: Le gusta viajar " + iter);
            boolean isboolean=input.nextBoolean();
            arregloBooleanos[i]=isboolean;
            iter++;
        }
        System.out.println("Los valores que contiene el arreglo de boolean: ");
        for (int i=0; i< arregloBooleanos.length; i++){
            System.out.print(arregloBooleanos[i] +  " | ");
        }
        */
        /*7- Crear un array de números de 100 posiciones, que contendrá los números del 1 al 100.
        Obtener la suma de todos ellos y el promedio.*/
       /*Integer [] arregloEnteros = new Integer[100];
        int suma=0;
        System.out.println("********** Bievenido **********");
        for (int i=0; i<100; i++){

            suma+= arregloEnteros[i]=i+1;
        }
        System.out.println("La suma es : " + suma);
        */

        /*8-Llenar un array con números aleatorios. Imprimir todos los números en pantalla.*/
        /*Integer [] arregloEnteros1 = new Integer[10];
        for (int i=0 ; i<arregloEnteros1.length ; i++){
            arregloEnteros1[i]=(int)(Math.random()*10+1);
        }
        System.out.println("Los numeros aleatorios que contiene el arreglo son: ");
        for (int i=0; i< arregloEnteros1.length; i++){
            System.out.print(arregloEnteros1[i] + " | ");
        }
        */
        /*Crear un array de booleanos con 10 posiciones llamado asientosLibres y colocar todos sus elementos en true.*/
        /*boolean[] asientosLibres= new boolean[10];
        for (int i=0 ; i<asientosLibres.length ; i++){
            asientosLibres[i]=true;
        }
        System.out.println("Los valores que contiene el arreglo de boolean son : ");
        for (int i=0; i< asientosLibres.length; i++){
            System.out.print(asientosLibres[i] +  " | ");
        }
        */


    }
    /* 12- Crear un método llamado crearArregloBooleano que retorne un arreglo de 10 posiciones de tipo booleanos
     donde todas sus posiciones tengan valor false. */
    public boolean [] crearArregloBooleano(){
        boolean [] arregloBoleanos = new boolean [10];
        for (int i=0 ; i<arregloBoleanos.length ; i++){
            arregloBoleanos[i]=false;
        }
        return arregloBoleanos;
    }
    /* 13- Crear un método llamado imprimirArreglo que imprima en pantalla todos los elementos de un
    array de enteros el cual es recibido por parámetro.*/
    public void  imprimirArreglo(int [] arreglosEnteros){
        for (int i=0 ; i< arreglosEnteros.length ; i++){
            System.out.println(arreglosEnteros[i]);
        }
    }
    /* 14- Crear un método llamado imprimirArreglo que imprima en pantalla todos los elementos de un
    array de booleanos el cual es recibido por parámetro.*/
    public void  imprimirArregloBoolean(boolean [] arreglosBoolean){
        for (int i=0 ; i< arreglosBoolean.length ; i++){
            System.out.println(arreglosBoolean[i]);
        }
    }
    /*20-Crear un método llamado hayVacantes que reciba un arreglo de booleanos y retorne verdadero
     si alguna de sus posiciones esta en true, de lo contrario, deberá retornar false.
     */
    public boolean hayVacantes(boolean [] tendreVacantes){
        for (int i=0; i< tendreVacantes.length ; i++){
            if (tendreVacantes[i]==true){
            return true;
            }
        }
        return false;
    }
    /*21- Crear un método reciba un arreglo de enteros por parámetro y que solicite el ingreso de un valor.
    Debe retornar true si y sólo si el valor ingresado por el usuario se encuentra en el arreglo.*/
    public boolean estaValorIngresado(int [] arregloEnteros, int valor){
        int cont=0;
        for (int i=0; i<arregloEnteros.length; i++){
            if (arregloEnteros[i]==valor){
                return true;
            }
        }
        return false;
    }

    /*22- Crear un método que reciba un arreglo de booleanos y retorne true si y sólo si, todos los elementos son verdaderos.*/
    public boolean estanTodosLosElementos(boolean [] elementos){
        int cont=0;
        for (int i=0; i<elementos.length; i++){
            if (elementos[i]==false){
                return false;
            }
        }
        return true;
    }


}



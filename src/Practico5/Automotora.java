package Practico5;

import java.util.Scanner;

public class Automotora {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        //Constructor sin parametros
        Camion c1= new Camion();
        c1.setChapa(54123);
        c1.setColor("Blanco");
        System.out.println(c1);

        Camion c11=new Camion();
        System.out.println(c11);

        //Constructor 1 parametro
        Camion c2=new Camion(95147);
        System.out.println(c2);

        //Constructor con parametros
        Camion c3=new Camion(96587, "Amarillo");
        System.out.println(c3);

        System.out.println("Bienvenido precisamos los datos de su camión");
        System.out.println("Ingrese el color del camión");
        String color=input.nextLine();
        System.out.println("Ingrese la chapa del camión");
        int chapa=input.nextInt();
        System.out.println("Ingrese año de compra");
        int compra=input.nextInt();
        Camion c4=new Camion(chapa,color,compra);
        System.out.println(c4);

        //Comparar color de los camiones
        boolean compararColor=c2.tieneMismoColor(c3);
        if (compararColor==true){
            System.out.println("Tienen el mismo color ambos camiones");
        }else{
            System.out.println("No tienen el mismo color los camiones");
        }





    }
}

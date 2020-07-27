package Practico5;

import java.util.Scanner;

public class GestionarProductos {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);


        int i=1;
        boolean esimportado=false;

        System.out.println(" ********************** Bienvenidos *************************");
        System.out.println("Ingrese la cantidad de productos");
        int cantProd=input.nextInt();

            while (cantProd!=0) {
                System.out.println("Ingrese el nombre del producto " + i);
                String nombre = input.next();
                System.out.println("Ingrese codigo del producto "+ i);
                int codi = input.nextInt();
                System.out.println("Ingrese numero de lote del producto "+ i);
                String nroLote = input.next();
                System.out.println("Diga 1 si no importado es el producto y 0 caso contrario");
                int importado = input.nextInt();
                if (importado != 0) {
                    esimportado = true;
                }
                Producto p1=new Producto(nombre,codi,esimportado,nroLote);

                cantProd--;
                i++;
                System.out.println("*************************************");
                System.out.println(p1);
                System.out.println("*************************************");
            }



    }
}

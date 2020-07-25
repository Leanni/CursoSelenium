package Practico6;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicios_Listas {

    /*3- Crear un método imprimirListaEnteros que reciba una lista de enteros, y los imprima en pantalla.*/
    public void imprimirListaEnteros(ArrayList<Integer> listaEnteros) {
        for (int i = 0; i < listaEnteros.size(); i++) {
            System.out.println(listaEnteros.get(i));
        }
    }

    /*4- Crear un método imprimirListaStrings que reciba una lista de Strings, y los imprima en pantalla.*/
    public void imprimirListaStrings(ArrayList<String> listaString) {
        for (int i = 0; i < listaString.size(); i++) {
            System.out.println(listaString.get(i));
        }
    }

    /*5- Método que reciba una lista de enteros, y retorne la cantidad de elementos de la misma.*/
    public Integer imprimirListEnteros(ArrayList<Integer> listaEnteros) {
        return listaEnteros.size();
    }

    /*6- Método que reciba una lista de enteros, y retorne la verdadero si y sólo si la lista está vacía*/
    public boolean estaListaVacia(ArrayList<Integer> listaEnteros) {
        if (listaEnteros.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /*7-Método que reciba una lista de enteros, y retorne la suma.*/
    public int sumaEnteros(ArrayList<Integer> lista) {
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);
        }
        return suma;
    }

    /*8- Método que reciba una lista de enteros, y retorne el promedio de los mismos.*/
    public float Promedio(ArrayList<Integer> lista) {
        int suma = sumaEnteros(lista);
        return suma / lista.size();
    }

    /*9- Método que reciba una lista de enteros, y retorne el menor.*/
    public int enteroMenor(ArrayList<Integer> lista) {
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < menor) {
                menor = lista.get(i);
            }
        }
        return menor;
    }

    /*10- Método que reciba una lista de enteros, y retorne el mayor.*/
    public int enteroMayor(ArrayList<Integer> lista) {
        int mayor = Integer.MAX_VALUE;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > mayor) {
                mayor = lista.get(i);
            }
        }
        return mayor;
    }

    /*11-Método que reciba una lista de booleanos, y verdadero si y sólo si,
     todos los elementos de la lista son true. De lo contrario se debe retornar false. Sugerencia: utilizar cortocircuito.*/
    public boolean todoSonVerdadores(ArrayList<Boolean> lista) {
        int mayor = Integer.MAX_VALUE;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == false) {
                return false;
            }
        }
        return true;
    }

    /*12-Método leerValores(): pide por teclado los números y los almacena en el ArrayList.
    La lectura acaba cuando se introduce el valor -99.
    El método devuelve mediante return el ArrayList con los valores introducidos.*/
    public ArrayList<Integer> leerValores(){
        Scanner input= new Scanner(System.in);
        ArrayList<Integer> lista= new ArrayList<Integer>();
        int cant=0;
        int numero=0;
        while (cant!=-99){
            System.out.println("Ingrese un numero.");
            numero = input.nextInt();
            lista.add(numero);
            System.out.println("Si ingresas -99 finaliza");
        }

        return lista;

    }

}

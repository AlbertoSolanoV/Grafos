import Clases.Grafos;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Grafos<String> grafo = new Grafos<>();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        String dato,dato2,dato1;
        while(!salir){

            System.out.println("1. Agregar vertice");
            System.out.println("2. Agregar arista");
            System.out.println("3. Imprimir grafo");
            System.out.println("4. Imprimir matriz");
            System.out.println("5. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Escribe el nombre del vertice");
                    dato = sn.next();
                    grafo.agregarVertice(dato);
                    break;
                case 2:
                    System.out.println("Escribe el nombre del vertice A");
                    dato1 = sn.next();
                    System.out.println("Escribe el nombre del vertice B");
                    dato2 = sn.next();
                    grafo.agregarArista(dato1, dato2);
                    break;
                case 3:
                    grafo.imprimirGrafo();
                    break;
                case 4:
                    grafo.imprimirGrafoMatriz();
                    break;
                case 5:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5");
            }

        }

    }
}


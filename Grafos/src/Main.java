import Clases.Grafos;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Grafos<Integer> grafo = new Grafos<>();

        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);

        grafo.agregarArista(1, 2);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(3, 4);
        grafo.agregarArista(4, 1);

        grafo.imprimirGrafo();

        List<Integer> adyacentes = grafo.obtenerAdyacentes(2);
        System.out.println("Adyacentes de 2: " + adyacentes);
    }
}


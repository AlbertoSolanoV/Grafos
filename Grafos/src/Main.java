import Clases.Grafos;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Grafos<String> grafo = new Grafos<>();

        grafo.agregarVertice("A");
        grafo.agregarVertice("B");
        grafo.agregarVertice("C");
        grafo.agregarVertice("D");

        grafo.agregarArista("A", "B");
        grafo.agregarArista("B", "C");
        grafo.agregarArista("C", "D");
        grafo.agregarArista("D", "C");

        grafo.imprimirGrafo();

        List<String> adyacentes = grafo.obtenerAdyacentes("A");
        System.out.println("Adyacentes de 2: " + adyacentes);
        grafo.imprimirGrafoMatriz();
    }
}


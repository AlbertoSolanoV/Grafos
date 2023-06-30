package Clases;

import java.util.*;

public class Grafos<T> {
    private Map<T, List<T>> adyacencias;

    public Grafos() {
        adyacencias = new HashMap<>();
    }

    public void agregarVertice(T vertice) {
        adyacencias.put(vertice, new ArrayList<>());
    }

    public void agregarArista(T origen, T destino) {
        if (!adyacencias.containsKey(origen) || !adyacencias.containsKey(destino)) {
            throw new IllegalArgumentException("Los vértices de la arista deben existir en el grafo.");
        }

        adyacencias.get(origen).add(destino);
        adyacencias.get(destino).add(origen); // En caso de ser un grafo no dirigido
    }

    public List<T> obtenerAdyacentes(T vertice) {
        if (!adyacencias.containsKey(vertice)) {
            throw new IllegalArgumentException("El vértice no existe en el grafo.");
        }

        return adyacencias.get(vertice);
    }

    public void imprimirGrafo() {
        for (Map.Entry<T, List<T>> entry : adyacencias.entrySet()) {
            T vertice = entry.getKey();
            List<T> adyacentes = entry.getValue();

            System.out.print("Vértice " + vertice + ": ");

            for (T adyacente : adyacentes) {
                System.out.print(adyacente + " ");
            }

            System.out.println();
        }
    }

    public void imprimirGrafoMatriz() {
        // Obtener una lista ordenada de los vértices
        List<T> vertices = new ArrayList<>(adyacencias.keySet());
        vertices.sort(Comparator.comparing(Object::toString));

        // Imprimir encabezado de las columnas
        System.out.print("     ");
        for (T vertice : vertices) {
            System.out.print(vertice + " ");
        }
        System.out.println();

        // Imprimir filas
        for (T vertice : vertices) {
            System.out.print(vertice + " | ");

            for (T otroVertice : vertices) {
                if (adyacencias.get(vertice).contains(otroVertice)) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
package algoritmos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

import grafos.Arista;
import grafos.Grafo;

public class Prim {
    
    public static Grafo crearGrafoPrim(Grafo grafoOriginal) {
        HashSet<String> vertices = new HashSet<>();
        Grafo nuevoGrafo = new Grafo();
        PriorityQueue<Arista> pq = new PriorityQueue<>(Comparator.comparingInt(Arista::getPeso));
        
        // Comenzamos desde un vértice arbitrario (el primero en el grafo original)
        String verticeInicial = grafoOriginal.getAristas().get(0).getOrigen().getNombre();
        vertices.add(verticeInicial);
        nuevoGrafo.crearVertice(verticeInicial, grafoOriginal.getVertice(verticeInicial).getCoordenadas());
        
        // Añadimos todas las aristas del vértice inicial a la cola de prioridad
        for (Arista arista : grafoOriginal.getAristasVecinos(verticeInicial)) {
            pq.offer(arista);
        }
        
        while (!pq.isEmpty() && vertices.size() < grafoOriginal.tamanio()) {
            Arista aristaPesoMin = pq.poll();
            
            if (aristaPesoMin != null) {
                String destino = aristaPesoMin.getDestino().getNombre();
                
                // Solo añadimos el destino si no está ya en el conjunto de vertices
                if (!vertices.contains(destino)) {
                    vertices.add(destino);
                    nuevoGrafo.crearVertice(destino, aristaPesoMin.getDestino().getCoordenadas());
                    nuevoGrafo.agregarArista(aristaPesoMin);
                    
                    // Añadimos las aristas del nuevo vértice a la cola
                    for (Arista arista : grafoOriginal.getAristasVecinos(destino)) {
                        if (!vertices.contains(arista.getDestino().getNombre())) {
                            pq.offer(arista);
                        }
                    }
                }
            }
        }
        return nuevoGrafo;
    }
}

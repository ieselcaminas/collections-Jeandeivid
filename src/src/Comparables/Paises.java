package Comparables;
public class Paises implements Comparable<Paises> {
    private final String nombre;
    private final int analfabetos;


    public Paises(String nombre, int analfabetos) {
        this.nombre = nombre;
        this.analfabetos = analfabetos;
    }

    @Override
    public String toString() {
        return String.format("Pais: %-20s Analfabetos: %,d", nombre,  analfabetos);
    }

    @Override
    public int compareTo(Paises otro) {
        // Ordenamiento ascendente por número de analfabetos
        return Integer.compare(this.analfabetos, otro.analfabetos);
    }
}
package Comparables;

public interface Tarea {
    @Override
    String toString();

    int compareTo(OrdenarTareas.Tarea otro);
}

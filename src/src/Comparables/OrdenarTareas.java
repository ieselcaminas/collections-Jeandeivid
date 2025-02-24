package Comparables;

public class OrdenarTareas {
    static class Tarea implements Comparables.Tarea {
        private int prioridad;
        private int duracion;

        public Tarea(int prioridad, int duracion) {
            this.prioridad = prioridad;
            this.duracion = duracion;
        }
        @Override
        public String toString() {
            return "Prioridad: " + prioridad + " Duracion: " + duracion;
        }
        @Override
        public int compareTo(Tarea otro) {
            return Integer.compare(this.prioridad, otro.prioridad);
        }
    }
}

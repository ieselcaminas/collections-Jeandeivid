package Comparables;

public class FelipeYSusTareas {
    public static void main(String[] args) {
        Tarea Algebra= new OrdenarTareas.Tarea(1, 10);
        Tarea Fisica= new OrdenarTareas.Tarea(2, 5);
        Tarea Quimica = new OrdenarTareas.Tarea(3, 15);
        Tarea Lenguaje = new OrdenarTareas.Tarea(4, 20);
        Tarea Ingles = new OrdenarTareas.Tarea(5, 25);

        Tarea[] tareas = {Algebra, Fisica, Quimica, Lenguaje, Ingles};

        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }
}

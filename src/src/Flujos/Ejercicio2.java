package Flujos;

import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Persona> personas = List.of(new Persona("Juan", "Perez", 1990),
                new Persona("Maria", "Aguilar", 1995),
                new Persona("Jose", "Lopez", 1992),
                new Persona("Pedro", "Garcia", 1994));
        long count = personas.stream().filter(p -> p.getApellido().startsWith("A")).count();
        System.out.println("Cantidad de personas con apellido que empieza con A: " + count);
    }
}

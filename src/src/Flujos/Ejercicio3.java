package Flujos;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Persona> personas = List.of(new Persona("Juan" , "Alvarez", 1990),
                new Persona("Maria", "Aguilar", 1995),
                new Persona("Jose", "Lopez", 1992),
                new Persona("Pedro", "Garcia", 1994),
                new Persona("Albert", "Cariani", 1990));
        List<String> nombresUnicos = personas.stream().map  (Persona::getPrimerNombre).distinct().sorted().collect(Collectors.toList());
        System.out.println("Nombres unicos en orden alfabetico: " + nombresUnicos);
        nombresUnicos.forEach(System.out::println);
    }
}

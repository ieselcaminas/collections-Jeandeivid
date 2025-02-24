package Comparables;

import java.util.ArrayList;
import java.util.List;

public class Tutankamon {
    public static void main(String[] args) {
        List<TesorosDeTutankamon> TesorosDeTutankamon = new ArrayList<>();
        TesorosDeTutankamon.add(new TesorosDeTutankamon(1,  "flecha |", 100, 1));
        TesorosDeTutankamon.add(new TesorosDeTutankamon(2,  "sandalias |", 200, 2));
        TesorosDeTutankamon.add(new TesorosDeTutankamon(3,  "sarcofago |", 1000, 500));
        TesorosDeTutankamon.add(new TesorosDeTutankamon(4,  "mascara |", 1000, 5));
        TesorosDeTutankamon.add(new TesorosDeTutankamon(5,  "arco |", 500, 3));


        System.out.println("Tesoros de Tutankamon ordenados por peso (ascendente):");
        System.out.println("----------------------------------------------------------------");
        TesorosDeTutankamon.stream()
                .sorted((t1, t2) -> Integer.compare(t1.getPeso(), t2.getPeso()))
                .forEach(System.out::println);
    }
}

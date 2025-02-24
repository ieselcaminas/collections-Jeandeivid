package Comparables;

import java.util.ArrayList;
import java.util.List;

public class NinosRegalo {
    public static void main(String[] args) {
        List<NinosBuenos.Nino> ninos = new ArrayList<>();
        ninos.add(new NinosBuenos.Nino(100, 50));
        ninos.add(new NinosBuenos.Nino(150, 75));
        ninos.add(new NinosBuenos.Nino(100, 25));
        ninos.add(new NinosBuenos.Nino(20, 15));
        ninos.add(new NinosBuenos.Nino(80, 45));

        ninos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}

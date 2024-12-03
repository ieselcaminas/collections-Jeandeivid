import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Media {
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<Integer>();
        double suma = 0;
        numero.add(8);
        numero.add(2);
        numero.add(7);
        numero.add(4);
        numero.add(5);
        numero.add(8);

        for (int i = 0; i < numero.size(); i++) {
            suma += numero.get(i);
        }
        System.out.println(suma / numero.size());
        Collections.sort(numero);

    }
}
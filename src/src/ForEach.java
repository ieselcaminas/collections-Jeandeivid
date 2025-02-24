import java.util.ArrayList;

public class ForEach{
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(7);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        for(Integer numero : numeros){
            System.out.println(numero);
        }
    }
}

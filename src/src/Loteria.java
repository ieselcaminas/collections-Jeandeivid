
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Loteria{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de boletos: ");
        int numeroDeBoletos = sc.nextInt();
        String[] boletos = new String[numeroDeBoletos];
        for (int i = 0; i < numeroDeBoletos; i++) {
            System.out.println("Introduce el boleto " + (i + 1) + ": ");
            boletos[i] = sc.next();
        }
        Map<Character, Integer> terminaciones = terminaciones(boletos);
        for (Map.Entry<Character, Integer> entrada : terminaciones.entrySet()) {
            System.out.println(entrada.getKey() + " : " + entrada.getValue());
        }
    }
    public static Map<Character, Integer> terminaciones (String[] boletos){
        Map<Character, Integer> terminaciones = new HashMap<>();
       Character ultimo;
       Integer contador;

        for(String boleto : boletos) {
            ultimo = boleto.charAt(boleto.length() - 1);
            contador = terminaciones.get(ultimo);
            if (contador == null) {
                terminaciones.put(ultimo, 1);
            } else {
                terminaciones.put(ultimo, contador + 1);
            }
        }
        return terminaciones;
    }
}
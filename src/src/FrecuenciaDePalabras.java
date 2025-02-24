import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrecuenciaDePalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de palabras: ");
        int numeroDePalabras = sc.nextInt();
        String[] palabras = new String[numeroDePalabras];
        for (int i = 0; i < numeroDePalabras; i++) {
            System.out.println("Introduce la palabra " + (i + 1) + ": ");
            palabras[i] = sc.next();
        }
        Map<String, Integer> frecuencia = frecuenciaDePalabras(palabras);
        for (Map.Entry<String, Integer> entrada : frecuencia.entrySet()) {
            System.out.println(entrada.getKey() + " : " + entrada.getValue());
        }
    }
    public static Map<String, Integer> frecuenciaDePalabras(String[] palabras) {
        Map<String, Integer> frecuencia = new HashMap<>();
        String ultimo;
        Integer cont;

        for (String boleto : palabras) {
            ultimo = boleto;
            cont = frecuencia.get(ultimo);
            if (cont == null) {
                frecuencia.put(ultimo, 1);
            } else {
                frecuencia.put(ultimo, cont + 1);
            }
        }
        return frecuencia;
    }
}
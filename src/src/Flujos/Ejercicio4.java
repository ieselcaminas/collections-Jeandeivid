package Flujos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Ingresa numeros (Ingresa uno negativo para terminar): ");
        while (true) {
            int numero = sc.nextInt();
            if (numero < 0)
                break;
            {
                numeros.add(numero);
            }
            List<Integer> numerosFiltrados = numeros.stream().filter(n -> n >= 1 && n <= 5).collect(Collectors.toList());
            numerosFiltrados.forEach(System.out::println);
            System.out.println("Numeros entre 1 y 5: ");

        }
    }
}

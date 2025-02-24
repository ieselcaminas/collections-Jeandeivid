package Comparables;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Analfabetos {
    public static void main(String[] args) throws IOException {
        String archivo = "files/illiterate.csv";
        List<Paises> paises = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            br.readLine();

            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    String[] datos = linea.split(",");
                    if (datos.length >= 9) {
                        String nombre = datos[5].trim();
                        // Asegurarse de que el dato de analfabetos no esté vacío
                        if (!datos[8].trim().isEmpty()) {
                            int analfabetos = Integer.parseInt(datos[8].trim());
                            paises.add(new Paises(nombre, analfabetos));
                        }
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Error al procesar la línea: " + linea);
                }
            }

            System.out.println("Lista de países ordenados por número de analfabetos (ascendente):");
            System.out.println("----------------------------------------------------------------");
            paises.stream()
                    .sorted()
                    .forEach(System.out::println);
        }
    }
}
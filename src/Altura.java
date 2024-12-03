import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        int numAlum = numAlumnos();
        double media;
        double alumnoDeAlturaSuperior;
        double alumnoDeAlturaInferior;

        System.out.println(numAlum);
        System.out.println("Introduce las alturas de los alumnos: ");

        ArrayList<Double> alturas = new ArrayList<Double>();

        alturas = leerAlturas(alturas, numAlum);

        media = mediaAltura(alturas);
        System.out.println("Media: " + media);

        alumnoDeAlturaSuperior = calcularAlumnosAlturaSuperior(alturas, media);
        System.out.println("Alumnos de alturasuperiores: " + alumnoDeAlturaSuperior);

        alumnoDeAlturaInferior = calcularAlumnosAlturaInferior(alturas, media);
        System.out.println("Alumnos de altura inferior: " + alumnoDeAlturaInferior);

    }

    public static int numAlumnos() {

        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }
    public static ArrayList<Double> leerAlturas(ArrayList<Double> alturas, int numeroAlumnos){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeroAlumnos; i++) {
            alturas.add(sc.nextDouble());
        }
        return alturas;
    }
    public static double mediaAltura(ArrayList<Double> alturas){
        double suma = 0;
        for (int i = 0; i < alturas.size(); i++) {
            suma += alturas.get(i);

        }
        return suma/ alturas.size();
    }
    public static double calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, double media){
        int alumnosSuperiores = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) > media) {
                alumnosSuperiores++;
            }
        }
        return alumnosSuperiores;
    }
    public static double calcularAlumnosAlturaInferior(ArrayList<Double> alturas, double inferior){
        int alumnosDeAlturaInferior = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) < inferior) {
                alumnosDeAlturaInferior++;
            }
        }
        return alumnosDeAlturaInferior;
    }
}
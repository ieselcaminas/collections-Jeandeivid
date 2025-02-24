import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelefonosII {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> agenda = new HashMap<>();
        ArrayList<String> numerosDeTelefonoII = new ArrayList<>();
        numerosDeTelefonoII.add("555-555-5555");
        numerosDeTelefonoII.add("555-555-5556");
        agenda.put("Juan", numerosDeTelefonoII);

        numerosDeTelefonoII = new  ArrayList<>();
        numerosDeTelefonoII.add("555-555-5557");
        numerosDeTelefonoII.add("555-555-5558");
        agenda.put("Pedro", numerosDeTelefonoII);

        numerosDeTelefonoII = new  ArrayList<>();
        numerosDeTelefonoII.add("555-555-5559");
        numerosDeTelefonoII.add("555-555-5560");
        agenda.put("Maria", numerosDeTelefonoII);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre a buscar: ");
        String nombre = scanner.nextLine();
        if (agenda.containsKey(nombre)) {
            System.out.println("Los numeros de telefono de " + nombre + " son: ");
            for (String numero : agenda.get(nombre)) {
                System.out.println(numero);
            }
        } else {
            System.out.println("No se encontro el nombre");
        }


    }
}

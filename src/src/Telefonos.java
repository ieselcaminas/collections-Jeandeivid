import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Map<String, String> numerosDeTelefono = new HashMap<String, String>();
        numerosDeTelefono.put("Juan", "123456789");
        numerosDeTelefono.put("Pedro", "987654321");
        numerosDeTelefono.put("Maria", "123456789");
        numerosDeTelefono.put("Juan", "987654321");
        numerosDeTelefono.put("Pedro", "123456789");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombre = scanner.nextLine();
        if (numerosDeTelefono.containsKey(nombre)) {
            System.out.println("El numero de telefono de " + nombre + " es: " + numerosDeTelefono.get(nombre));
        } else {
            System.out.println("No se encontro el numero de telefono de " + nombre);
        }
    }
}

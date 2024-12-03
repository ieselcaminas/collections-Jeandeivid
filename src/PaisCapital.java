import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> paisesYCapitalesDeEuropa = new HashMap<String, String>();
        paisesYCapitalesDeEuropa.put("Alemania", "Berlin");
        paisesYCapitalesDeEuropa.put("Francia", "Paris");
        paisesYCapitalesDeEuropa.put("Espana", "Madrid");
        paisesYCapitalesDeEuropa.put("Italia", "Roma");
        paisesYCapitalesDeEuropa.put("Portugal", "Lisboa");
        paisesYCapitalesDeEuropa.put("Grecia", "Atenas");
        paisesYCapitalesDeEuropa.put("Reino Unido", "Londres");
        paisesYCapitalesDeEuropa.put("Polonia", "Varsovia");
        paisesYCapitalesDeEuropa.put("Hungria", "Budapest");
        paisesYCapitalesDeEuropa.put("Rusia", "Moscua");
        paisesYCapitalesDeEuropa.put("Austria", "Viena");
        paisesYCapitalesDeEuropa.put("Suiza", "Berna");
        paisesYCapitalesDeEuropa.put("Belgica", "Bruxelas");
        paisesYCapitalesDeEuropa.put("Finlandia", "Helsinki");


        Scanner  sc = new Scanner(System.in);
        System.out.println("Introduce un pais: ");
        String pais = sc.nextLine();
        if (paisesYCapitalesDeEuropa.containsKey(pais)) {
            System.out.println("La capital de " + pais + " es " + paisesYCapitalesDeEuropa.get(pais));
        }else{
            System.out.println("El pais no existe");

        }
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Botin {

    public static Map<Integer, List<Integer>> repartirBotin(int numParticipantes, int[] billetes) {
        Map<Integer, List<Integer>> reparto = new HashMap<>();
        for (int i = 0; i < numParticipantes; i++) {
            reparto.put(i, new ArrayList<>());
        }
        for (int i = 0; i < billetes.length; i++) {
            int participante = i % numParticipantes;
            reparto.get(participante).add(billetes[i]);
        }

        return reparto;
    }

    public static void main(String[] args) {
        int[] billetes = {2, 10, 20, 50, 200, 500};
        Map<Integer, List<Integer>> reparto = repartirBotin(2, billetes);
        for (Map.Entry<Integer, List<Integer>> entrada : reparto.entrySet()) {
            System.out.println(entrada.getKey() + " : " + entrada.getValue());
        }
    }
}

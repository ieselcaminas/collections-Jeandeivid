public class Ej6 {
    public static void main(String[] args) {
        System.out.println(esHyperpar(2480));
        System.out.println(esHyperpar(2481));
    }
    public static boolean esHyperpar(int num){
        int suma = 0;
        int numero = num;
        while (numero > 0){
            int digito = numero % 10;
            if(digito % 2 != 0){
                return false;
            }
            numero = numero / 10;
        }
        return true;
    }
}

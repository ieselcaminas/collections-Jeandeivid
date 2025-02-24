package Objetos;

public class Perro extends Mamifero{
    public Perro(String nombre) {
        super(nombre);
    }
    @Override
    public void comunicarse() {
        System.out.println("hago Guau guau");
    }
   public void traerZapatillas(){
       System.out.println("Toma amo, las zapatillas");
   }
    public void comer(){
        System.out.println("Como carne");
    }
}

package Objetos;

public class Tiburon extends Pez{
    public Tiburon(String nombre) {
        super(nombre);
    }
    @Override
    public void comunicarse() {
        System.out.println("Mi nombre es: ");
    }
    public void comer(){
        System.out.println("Como carne y pescado");
    }
    public void respirar(){
        System.out.println("Respiro por las branqueas");
    }
    public void moverse()
    {
        System.out.println("Nado con mis aletas");
    }
    public void vivoLaVida(){
        System.out.println("Cuando soy pequeño vivo la vida");
    }
}

package Objetos;

public class PezPayaso extends Pez{
    public PezPayaso(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse() {
        System.out.println("Mi nombre es: " + nombre);
    }
    public void comer(){
        System.out.println("Como crustaceos, plancton e isopodos");
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

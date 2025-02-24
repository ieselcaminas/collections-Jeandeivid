package Objetos;

public abstract class Pez extends Animal{
    public Pez(String nombre) {
        super(nombre);
    }
    public void comunicarse() {
        System.out.println("Mi nombre es: " + nombre);
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

package Objetos;

public class Gato extends Mamifero {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse() {
        System.out.println("Miau miau");
    }
    public void comer(){
        System.out.println("Como pescado");
    }

    public void Ovillo() {
        System.out.println("Me gusta perseguir un ovillo");
    }
}

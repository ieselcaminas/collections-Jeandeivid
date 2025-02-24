package Objetos;

public class mainAnimal {
    public static void main(String[] args) {
//        Animal animal = new Animal("Pedro");
//        System.out.println(animal.getNombre());
//        animal.comunicarse();
        Perro perro = new Perro("Mancha");
        System.out.println(perro);
        perro.comunicarse();
        perro.comer();
        perro.respirar();
        perro.moverse();
        perro.mamar();
        perro.traerZapatillas();
        System.out.println("--------------------");


        Gato gato = new Gato("Koe");
        System.out.println(gato);
        gato.comunicarse();
        gato.comer();
        gato.respirar();
        gato.moverse();
        gato.mamar();
        gato.Ovillo();
        System.out.println("--------------------");


        Tiburon tiburon = new Tiburon("Tiburoncin");
        System.out.println(tiburon.getNombre());
        tiburon.comunicarse();
        tiburon.comer();
        tiburon.respirar();
        tiburon.moverse();
        tiburon.vivoLaVida();
        System.out.println("--------------------");


        PezPayaso pezPayaso = new PezPayaso("Nemo");
        System.out.println(pezPayaso);
        pezPayaso.comunicarse();
        pezPayaso.comer();
        pezPayaso.respirar();
        pezPayaso.moverse();
        pezPayaso.vivoLaVida();
        System.out.println("--------------------");
    }
}

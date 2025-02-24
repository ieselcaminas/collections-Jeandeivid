package Comparables;

public class TesorosDeTutankamon implements Comparable<TesorosDeTutankamon>{
    private int orden;
    private String nombre;
    private int valorHistorico;
    private int Peso;

    public TesorosDeTutankamon(int orden, String nombre, int valorHistorico, int peso) {
        this.orden = orden;
        this.nombre = nombre;
        this.valorHistorico = valorHistorico;
        this.Peso = peso;
    }

    public int getOrden() {
        return orden;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValorHistorico() {
        return valorHistorico;
    }

    public int getPeso() {
        return Peso;
    }

    @Override
    public int compareTo(TesorosDeTutankamon otro) {
        if (this.valorHistorico == otro.valorHistorico) {
            return Integer.compare(this.orden, otro.orden);
        }
        return Integer.compare(this.valorHistorico, otro.valorHistorico);
    }

    @Override
    public String toString() {
        return " Nombre: " + nombre + " ValorHistorico: " + valorHistorico + " Peso: " + Peso;
    }
}




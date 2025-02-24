package Flujos;

public class Persona {
    private String primerNombre;
    private String apellido;
    private int añoDeNacimiento;

    public Persona(String nombre, String apellido, int añoDeNacimiento) {
        this.primerNombre = nombre;
        this.apellido = apellido;
        this.añoDeNacimiento = añoDeNacimiento;
    }

    public String getPrimerNombre() {
        return this.primerNombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getAnoDeNacimiento() {
        return this.añoDeNacimiento;
    }
}
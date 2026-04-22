package org.jesus.tarea.verduleria;

public class Limpieza extends Producto  {

    private String componente;
    private double litros;

    public Limpieza(String nombre, Double precio, String componente) {
        super(nombre, precio);
        this.componente = componente;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncomponente='" + componente + '\'' +
                ", litros=" + litros;
    }
}

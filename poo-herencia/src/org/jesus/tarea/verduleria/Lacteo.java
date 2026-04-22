package org.jesus.tarea.verduleria;

public class Lacteo extends Producto {

    private int cantidad;
    private int proteina;

    public Lacteo(String nombre, Double precio, int cantidad, int proteina) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteina = proteina;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProteina() {
        return proteina;
    }

    public void setProteina(int proteina) {
        this.proteina = proteina;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncantidad=" + cantidad +
                ", proteina=" + proteina;
    }
}

package org.jesus.tarea.empresa;

public class Empleado extends Persona {

    private Double renumeracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double renumeracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.renumeracion = renumeracion;
        this.empleadoId = empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje) {
        double totalPorcentaje = this.renumeracion * porcentaje;
        this.renumeracion += totalPorcentaje;
    }

    public Double getRenumeracion() {
        return renumeracion;
    }

    public void setRenumeracion(Double renumeracion) {
        this.renumeracion = renumeracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    @Override
    public String toString() {
        return super.toString() + "\nrenumeracion=" + renumeracion +
                ", empleadoId=" + empleadoId;
    }
}

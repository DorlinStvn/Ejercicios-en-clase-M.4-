package com.banco;
public class EmpleadoPorHora extends Empleado {

    private int horas;
    private double pagoHora;

    public EmpleadoPorHora(String nombre, int horas, double pagoHora) {
        super(nombre);
        this.horas = horas;
        this.pagoHora = pagoHora;
    }

    @Override
    public double calcularSalario() {
        return horas * pagoHora;
    }
}


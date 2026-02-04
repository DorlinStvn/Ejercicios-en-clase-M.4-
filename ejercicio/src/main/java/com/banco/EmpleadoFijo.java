package com.banco;

public class EmpleadoFijo extends Empleado {

    private double salario;

    public EmpleadoFijo(String nombre, double salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

}

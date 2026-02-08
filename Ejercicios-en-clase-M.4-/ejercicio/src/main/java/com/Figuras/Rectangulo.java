package com.Figuras;

public class Rectangulo extends Figura 
{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() 
    {
        return base * altura;
    }


}

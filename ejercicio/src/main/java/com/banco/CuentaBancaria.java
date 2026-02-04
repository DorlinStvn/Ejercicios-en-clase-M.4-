/*# Ejercicio 1: Cuenta Bancaria (Encapsulamiento)

### Enunciado
Implementa una clase `CuentaBancaria` que represente una cuenta simple.

### Requisitos
- Atributos privados:
  - `saldo` (double)
  - `numeroCuenta` (String)
- Constructor que inicialice los atributos
- Método `depositar(double monto)`
- Método `retirar(double monto)`
- Método `getSaldo()`
- No se permite acceso directo al saldo desde otras clases*/


package com.banco;

  // Clase CuentaBancaria //

public class CuentaBancaria {

    // Atributos privados //

    private double saldo;
    private String numeroCuenta;

    // Constructor // 
    
    public CuentaBancaria(String numeroCuenta, double saldoInicial) 
    {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) 
    {
        if (monto > 0) 
        {
            saldo += monto;
        } 
        else 
        {
            System.out.println("El monto a depositar tiene que ser positivo.");
        }
    }

    public void retirar(double monto) 
    {
        if (monto > 0 && monto <= saldo) 
        {
            saldo -= monto;
        } 
        else 
        {
            System.out.println("Monto invalido.");
        }
    }

    public double getSaldo() 
    {
        return saldo;
    }

}

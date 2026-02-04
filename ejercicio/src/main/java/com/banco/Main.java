/*El proyecto debe iniciar con un **menú en consola**, donde cada opción permita ejecutar un ejercicio específico.

Ejemplo de menú:
1. Cuenta Bancaria
2. Polimorfismo con Empleados
3. Ocultamiento de Atributos
4. Arrays y Referencias
0. Salir*/

package com.banco;


import java.util.Scanner;

// Ejercicio 3 Ocultamiento de Atributos //

import com.banco.ocultamiento.claseA;
import com.banco.ocultamiento.claseB;

// Ejercicio 4//

import com.banco.arrays.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n   Menu Principal");
            System.out.println("1- Cuenta Bancaria (Encapsulamiento)");
            System.out.println("2- Empleados (Polimorfismo)");
            System.out.println("3- Ocultamiento de Atributos");
            System.out.println("4- Arrays y Referencias");
            System.out.println("0- Salir");


            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> ejercicioEmpleados();
                case 2 -> ejercicioEmpleados();
                case 3 -> ejercicioOcultamiento();
                case 4 -> Arrays.ejecucion();
                case 0 -> System.out.println("Saliendo del programa...");
            }

        } while (opcion != 0);

        sc.close();
    }

    // ================= EJERCICIO 1 =================
    static void ejercicioCuenta() {
        CuentaBancaria cuenta = new CuentaBancaria("001-ABC", 1000);

        cuenta.depositar(500);
        cuenta.retirar(300);

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }

    // ================= EJERCICIO 2 =================
    static void ejercicioEmpleados() {
        Empleado emp1 = new EmpleadoFijo("Carlos", 30000);
        Empleado emp2 = new EmpleadoPorHora("Ana", 160, 250);

        System.out.println("Salario Carlos: " + emp1.calcularSalario());
        System.out.println("Salario Ana: " + emp2.calcularSalario());
    }

    // ================= EJERCICIO 3 =================
    static void ejercicioOcultamiento() {
        claseA obj = new claseB();
        System.out.println("Valor de x: " + obj.x);

    }
}

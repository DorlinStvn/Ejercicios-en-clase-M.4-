/*El proyecto debe iniciar con un **menú en consola**, donde cada opción permita ejecutar un ejercicio específico.

Ejemplo de menú:
1. Cuenta Bancaria
2. Polimorfismo con Empleados
3. Ocultamiento de Atributos
4. Arrays y Referencias
0. Salir*/

package com;


import java.util.Scanner;

// Ejercicio 3 Ocultamiento de Atributos //

import com.ocultamiento.claseA;
import com.ocultamiento.claseB;

// Ejercicio 5 Figuras Geometricas //
import com.Figuras.Circulo;
import com.Figuras.Cuadrado;
import com.Figuras.Figura;
import com.Figuras.Rectangulo;

// Ejercicio 4//

import com.arrays.Arrays;




public class Main {

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do 
        {
            System.out.println("\n   Menu Principal");
            System.out.println("1- Cuenta Bancaria (Encapsulamiento)");
            System.out.println("2- Empleados (Polimorfismo)");
            System.out.println("3- Ocultamiento de Atributos");
            System.out.println("4- Arrays y Referencias");
            System.out.println("5- Geometricas Figuras (polimorfismo)");
            System.out.println("6- Gestion de Productos (encapsulamiento)");
            System.out.println("7- Inventario de Arrays de objeto");
            System.out.println("8- Copia de Arrays (referencias)");
            System.out.println("0- Salir");


            opcion = sc.nextInt();

            switch (opcion) 
            {
                case 1 -> ejercicioCuenta();
                case 2 -> ejercicioEmpleados();
                case 3 -> ejercicioOcultamiento();
                case 4 -> Arrays.ejecucion();
                case 5 -> ejercicioFigura();
                case 6 -> ejercicioProducto(sc);
                case 7 -> ejercicioInventarioArray();
                case 8 -> CopiaArrays.CopiaArray(null);
                case 0 -> System.out.println("Saliendo del programa...");
            }

        } 
        while (opcion != 0);

        sc.close();
    }

    // Ejercicio 1 Cuenta Bancaria //
    

    static void ejercicioCuenta() 
    {
        CuentaBancaria cuenta = new CuentaBancaria("0330-ADS", 1000);

        cuenta.depositar(500);
        cuenta.retirar(300);

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }

    // Ejercicio 2 Polimorfismo con Empleados //

    static void ejercicioEmpleados() 
    {
        Empleado emp1 = new EmpleadoFijo("Galan Alberto", 30000);
        Empleado emp2 = new EmpleadoPorHora("Nash Francisco", 160, 250);

        System.out.println("Salario Carlos: " + emp1.calcularSalario());
        System.out.println("Salario Ana: " + emp2.calcularSalario());
    }

    // Ejercicio 3 Ocultamiento de Atributos //

    static void ejercicioOcultamiento() 
    {
        claseA obj = new claseB();
        System.out.println("Valor de x: " + obj.x);

    }

    // Ejercicio 5 Figuras//

    public static void ejercicioFigura() 
    {
        Figura[] figuras = new Figura[3];

        figuras[0] = new Cuadrado(5);
        figuras[1] = new Rectangulo(4, 6);
        figuras[2] = new Circulo(8);

        for (Figura f : figuras) 
        {
            System.out.println("Area: " + f.area());
        }
    }

    // Ejercicio 6  gestion de Producto//

    public static void ejercicioProducto(Scanner pov) 
    {
        Producto p = new Producto("Laptop", 45000, 10);
        int opcion;

        do {
            System.out.println("\n--- Sub-Menu-Producto ---");
            System.out.println("1. Ver producto");
            System.out.println("2. Vender producto");
            System.out.println("3. Volver al menu principal");
            System.out.print("\nElige una opcion: ");
            opcion = pov.nextInt();

            switch (opcion) 
            {
                case 1:
                    System.out.println("Producto: " + p.getNombre());
                    System.out.println("Precio: " + p.getPrecio());
                    System.out.println("Stock: " + p.getStock());
                    break;

                case 2:
                    System.out.print("Cantidad por vender: ");
                    int cantidad = pov.nextInt();
                    p.vender(cantidad);
                    break;

                case 3:
                    System.out.println("Regresando al menu principal...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 3);
    }

    // Ejercicio 7 Inventario de Arrays //

    public static void ejercicioInventarioArray() 
    {
        Producto[] inventario = new Producto[3];

        inventario[0] = new Producto("Laptop", 45000, 10);
        inventario[1] = new Producto("Celular", 20000, 3);
        inventario[2] = new Producto("AirPods", 15000, 5);

        double valorTotal = 0;

        System.out.println("\n--- Inventario ---");
        System.out.println("Productos disponibles:");

        for (Producto p : inventario) 
        {
            valorTotal += p.getPrecio() * p.getStock();

            if (p.getStock() > 0) 
            {
                System.out.println(p.getNombre() + 
                    " | Precio: $" + p.getPrecio() + 
                    " | Stock: " + p.getStock());
            }
        }

        System.out.println("\nValor total del inventario: $" + valorTotal);
    }
    
    // Ejercicio 8 Copia de Arrays //

    public class CopiaArrays 
    {

        public static void CopiaArray(String[] args) 
        {

        
            int[] original = {10, 20, 30, 40, 50};

        
            int[] copia = original.clone();

            copia[0] = 111;
            copia[2] = 777;

        
            System.out.println("Array original:");
            mostrarArray(original);

            System.out.println("\nArray copia:");
            mostrarArray(copia);
        }

        static void mostrarArray(int[] arr)

        {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}




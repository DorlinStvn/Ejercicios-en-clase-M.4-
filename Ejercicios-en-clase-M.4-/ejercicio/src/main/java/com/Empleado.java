/*## Ejercicio 2: Polimorfismo con Empleados

### Enunciado
Crea una jerarquía de empleados donde cada tipo calcule su salario de forma distinta.

### Requisitos
- Clase base `Empleado` con método `calcularSalario()`
- Subclases:
  - `EmpleadoFijo`
  - `EmpleadoPorHora`
- Cada subclase debe sobrescribir `calcularSalario()`*/

package com;

// Clase base Empleado//

public abstract class Empleado
{

    protected String nombre;

    public Empleado(String nombre) 
    {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

  
}

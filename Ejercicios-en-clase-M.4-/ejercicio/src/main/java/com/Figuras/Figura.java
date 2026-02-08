/*Exercise 5: Figure System (Polymorphism)

### Enunciado
Implementa un sistema de figuras geométricas utilizando polimorfismo.

### Requisitos
- Clase abstracta `Figura` con método `area()`
- Clases:
  - `Cuadrado`
  - `Rectangulo`
  - `Circulo`
- Almacenar las figuras en un array de `Figura`
- Calcular y mostrar el área de cada figura
- Do not use `if` structures to distinguish types*/


package com.Figuras;

public abstract class Figura 
{
    
    public abstract double area();

}

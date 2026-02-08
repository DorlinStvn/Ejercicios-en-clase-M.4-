/*## Ejercicio 6: Gestión de Productos (Encapsulamiento)

### Enunciado
Implementa una clase que represente un producto en inventario.

### Requisitos
- Clase `Producto` con atributos privados:
  - `nombre`
  - `precio`
  - `stock`
- Validar que precio y stock no sean negativos
- Métodos getters y setters
- Método `vender(int cantidad)`
- El ejercicio debe ejecutarse desde el menú*/

package com;

public class Producto {

    private String nombre;
    private double precio;
        private int stock;
    
    public Producto(String nombre, double precio, int stock) 
    {
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }
    
    public String getNombre() 
    {
        return nombre;
    }
    
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public double getPrecio() 
    {
        return precio;
    }
    
    public void setPrecio(double precio) 
    {
        if (precio < 0) 
        {
            System.out.println("El precio debe ser positivo.");
            this.precio = 0;
        } 
        else
        {
            this.precio = precio;
        }
    }
    
    public int getStock() 
    {
        return stock;
    }
    
    public void setStock(int stock) 
    {
        if (stock < 0) 
        {
            System.out.println("El stock tiene que ser positivo.");
            this.stock = 0;
        } 
        else 
        {
            this.stock = stock;
        }
    }
    public void vender(int cantidad) 
    {
        if (cantidad <= 0) 
        {
            System.out.println("La cantidad de venta debe ser mayor que 0.");
        } 
        else if (cantidad > stock) 
        {
            System.out.println("No hay suficiente stock para vender " + cantidad + " unidades.");
        } 
        else 
        {
            stock -= cantidad;
            System.out.println("Se han vendido " + cantidad + " unidades de " + nombre +  " Stock restante: " + stock);
        }
    }

}

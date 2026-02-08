/*## Ejercicio 4: Arrays y Referencias

### Enunciado
Analiza cómo funcionan las referencias en arrays.

### Requisitos
- Crear un array de enteros
- Asignar ese array a otra variable
- Modificar el segundo array
- Mostrar el contenido del primero
- Ejecutar todo desde una opción del menú*/

package com.arrays;

public class Arrays {

    public static void ejecucion() {
        int[] a = {5, 8, 10};
        int[] b = a;

        b[0] = 99;

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}




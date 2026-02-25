# **EJERCICIO: CONTADOR DE PALABRAS CONCURRENTE**

## **Descripción**

Desarrollar un programa que procese múltiples archivos de texto de forma concurrente para contar la frecuencia de palabras. Cada archivo será procesado por un hilo independiente, y al final se debe generar un reporte consolidado con las estadísticas.

---

## **Funcionalidades Requeridas**

### **Preparación**
- Crear 3 archivos de texto con contenido simple (pueden ser poemas, frases, o texto aleatorio)
- Cada archivo debe tener al menos 50 palabras

### **Procesamiento Concurrente**
- El sistema debe crear 3 hilos, uno para procesar cada archivo
- Cada hilo debe leer su archivo asignado y contar cuántas palabras contiene
- Cada hilo debe guardar su resultado en un objeto compartido
- Los hilos deben ejecutarse simultáneamente

### **Generación de Reporte**
- Una vez que todos los hilos terminen, generar un archivo de reporte llamado `estadisticas.txt`
- El reporte debe mostrar:
  - Nombre del archivo procesado
  - Cantidad de palabras encontradas en ese archivo
  - Total de palabras procesadas en todos los archivos
  - Tiempo aproximado de procesamiento

---

## **Restricciones Técnicas**

- Debe usar hilos para procesar los archivos
- El objeto que acumula los resultados debe estar sincronizado para evitar problemas de concurrencia
- El programa principal debe esperar a que todos los hilos terminen antes de generar el reporte
- El reporte final debe ser un archivo de texto plano

---

## **Archivos del Sistema**

**Entrada (crear manualmente o por código):**
- `texto1.txt`
- `texto2.txt`
- `texto3.txt`

**Salida:**
- `estadisticas.txt` - Reporte con el conteo de palabras

---

## **Criterios de Evaluación**

- Correcta creación y ejecución de hilos
- Sincronización del objeto compartido
- Lectura correcta de archivos de texto
- Espera de finalización de todos los hilos
- Generación correcta del archivo de reporte

---

**Tiempo estimado:** 40-50 minutos
import java.io.*;
import java.util.Map;

public class Main {

    public static void main(String[] args) 
    {

        long inicio = System.currentTimeMillis();

        Resultado resultado = new Resultado();

       String base = System.getProperty("user.dir");

        Hilosprc hilo1 = new Hilosprc(base + "/Texto1.txt", resultado);
        Hilosprc hilo2 = new Hilosprc(base + "/Texto2.txt", resultado);
        Hilosprc hilo3 = new Hilosprc(base + "/Texto3.txt", resultado);

        hilo1.start();
        hilo2.start();
        hilo3.start();

        try 
        {
            hilo1.join();
            hilo2.join();
            hilo3.join();

        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        long fin = System.currentTimeMillis();

        generarReporte(resultado, fin - inicio);

        System.out.println("Reporte generado: estadisticas.txt");
    }


    private static void generarReporte(Resultado resultado, long tiempo) 
    {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("estadisticas.txt"))) 
        {

            bw.write("====================================\n");
            bw.write("Reporte de Procesamiento de Archivos\n");
            bw.write("====================================\n\n");

            for (Map.Entry<String, Integer> entry : resultado.getConteos().entrySet()) 
            {

                bw.write("Archivo: " + entry.getKey() + "\n");
                bw.write("Palabras encontradas: " + entry.getValue() + "\n\n");
            }

            bw.write("----------------------------------------\n");
            bw.write("Total de palabras procesadas: " + resultado.getTotalPalabras() + "\n");
            bw.write("Tiempo de procesamiento: " + tiempo + " ms\n");
            bw.write("========================================");

        } 
        catch (Exception e) 
        {
            System.out.println("Error escribiendo reporte");
        }
    }
}
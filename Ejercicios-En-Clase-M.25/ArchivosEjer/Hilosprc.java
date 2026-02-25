import java.io.BufferedReader;
import java.io.FileReader;

public class Hilosprc extends Thread 
{

    private String archivo;
    private Resultado resultado;

    public Hilosprc(String archivo, Resultado resultado) 
    {
        this.archivo = archivo;
        this.resultado = resultado;
    }

    @Override
    public void run() 
    {

        int contador = contarPalabras(archivo);

        resultado.agregarResultado(archivo, contador);

        System.out.println("Procesado: " + archivo +
                " | Palabras: " + contador);
    }

    private int contarPalabras(String archivo) 
    {

        int palabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) 
        {

            String linea;

            while ((linea = br.readLine()) != null) 
            {

                linea = linea.trim();

                if (!linea.isEmpty()) 
                {
                    String[] partes = linea.split("\\s+");
                    palabras += partes.length;
                }
            }

        } catch (Exception e) {
            System.out.println("Error leyendo: " + archivo);
        }

        return palabras;
    }
}




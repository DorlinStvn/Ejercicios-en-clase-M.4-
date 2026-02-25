import java.util.HashMap;
import java.util.Map;

public class Resultado 
{

    private Map<String, Integer> conteos = new HashMap<>();
    private int totalPalabras = 0;

    public synchronized void agregarResultado(String archivo, int cantidad) 
    {
        conteos.put(archivo, cantidad);
        totalPalabras += cantidad;
    }

    public Map<String, Integer> getConteos() 
    {
        return conteos;
    }

    public int getTotalPalabras() 
    {
        return totalPalabras;
    }
}



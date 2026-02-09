/*### Clases
- **Reserva**
  - Atributos privados:
    - `nombreCliente` (String)
    - `fechaReserva` (Date o Calendar)
    - `cantidadPersonas` (int)
  - Constructor con validaciones*/

package reservas;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Reserva {

    private String nombreCliente;
    private Date fechaReserva;
    private int cantidadPersonas;

    public Reserva(String nombreCliente, String fechaTexto, int cantidadPersonas) 
            throws ReservaInvalidaException {

        try {
            validarNombre(nombreCliente);
            this.nombreCliente = nombreCliente.trim();

            this.fechaReserva = validarFecha(fechaTexto);

            validarCantidad(cantidadPersonas);
            this.cantidadPersonas = cantidadPersonas;

        } catch (IllegalArgumentException e) {
            throw new ReservaInvalidaException(e.getMessage());
        }
    }

    private void validarNombre(String nombre) 
    {
        if (nombre == null || nombre.trim().isEmpty())
        {
            throw new IllegalArgumentException("El nombre del cliente es invalido.");
        }
    }


        private Date validarFecha(String fechaTexto) 
        {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            formato.setLenient(false);

            try 
            {
                return formato.parse(fechaTexto);
            } 
            catch (Exception e) 
            {
                throw new IllegalArgumentException("Fecha invalida, el formato es: dd/MM/yyyy");
            }
        }

    private void validarCantidad(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad de personas debe ser mayor que cero.");
        }
    }

    public String mostrarReserva() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        return "Cliente: " + nombreCliente +
               " | Fecha: " + formato.format(fechaReserva) +
               " | Personas: " + cantidadPersonas;
    }
}


 


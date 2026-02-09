package reservas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        List<Reserva> reservas = new ArrayList<>();

        int opcion;

        do 
        {
            System.out.println("\n--- Menu de reservas ---");
            System.out.println("1. Registrar reserva");
            System.out.println("2. Mostrar reservas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            try 
            {
                opcion = Integer.parseInt(sc.nextLine());
            } 
            catch (Exception e) 
            {
                System.out.println("Se debe ingresar un numero.");
                opcion = -1;

                continue;
            }

            switch (opcion) 
            {

                case 1:

                    try 
                    {
                        System.out.print("Nombre del cliente: ");
                        String nombre = sc.nextLine();

                        System.out.print("Fecha (dd/MM/yyyy): ");
                        String fecha = sc.nextLine();

                        System.out.print("Cantidad de personas: ");
                        int cantidad = Integer.parseInt(sc.nextLine());

                        Reserva nueva = new Reserva(nombre, fecha, cantidad);
                        reservas.add(nueva);

                    } 
                    catch (ReservaInvalidaException exp) 
                    {
                        System.out.println("Error: " + exp.getMessage());
                    } 
                    catch (Exception exp) 
                    {
                        System.out.println("Error, Verifiqcar los datos ingresados.");
                    }

                    break;

                case 2:
                    System.out.println("\nLista de reservas:");

                    if (reservas.isEmpty()) 
                    {
                        System.out.println("No hay reservas registradas.");
                    } 
                    else 
                    {
                        for (Reserva r : reservas) {
                            System.out.println(r.mostrarReserva());
                        }
                    }

                    break;

                case 0:

                    System.out.println("Programa terminado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}

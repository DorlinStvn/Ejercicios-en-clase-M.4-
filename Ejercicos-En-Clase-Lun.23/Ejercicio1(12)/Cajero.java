import java.util.Random;

public class Cajero extends Thread {

    private Boveda boveda;
    private int transacciones = 0;
    private Random ran = new Random();

    public Cajero(String nombre, Boveda b) 
    {
        super(nombre);
        this.boveda = b;
    }

    public void run()
    {
           int clientes = 3 + ran.nextInt(3);

        for (int i = 0; i < clientes; i++) {

            int monto = 500 + ran.nextInt(1500);

            try {
                Thread.sleep(1000 + ran.nextInt(2000));
            } catch (Exception e) {
                System.out.println("error sleep");
            }

            boveda.retirar(monto, getName());
            transacciones++;
        }

        System.out.println(getName() + " termino con " + transacciones + " transacciones");
    }

    public int getTransacciones() {
        return transacciones;
    }
}


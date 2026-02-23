public class Boveda {

    private int saldo = 50000;

    public synchronized void retirar(int monto, String cajero) 
    {

        if (saldo >= monto) 
        {
            saldo -= monto;
            System.out.println(cajero + " retiro " + monto + " saldo actual: " + saldo);
        } 
        else 
        {
            System.out.println(cajero + " intento retirar pero no hay suficiente");
        }
    }

    public int getSaldo() 
    {
        return saldo;
    }
}
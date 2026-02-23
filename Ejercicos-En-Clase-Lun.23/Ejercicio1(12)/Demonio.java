public class Demonio extends Thread {

    private Boveda boveda;

    public Demonio(Boveda b) {
        this.boveda = b;
        setDaemon(true);
    }

    public void run() {

        while (true) {

            try {
                Thread.sleep(2000);
            } catch (Exception e) {}

            System.out.println("saldo actual (demonio): " + boveda.getSaldo());
        }
    }
}
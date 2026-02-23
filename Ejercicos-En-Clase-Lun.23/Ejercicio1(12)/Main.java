public class Main {

    public static void main(String[] args) {

        Boveda b = new Boveda();

        Cajero c1 = new Cajero("cajero 1", b);
        Cajero c2 = new Cajero("cajero 2", b);
        Cajero c3 = new Cajero("cajero 3", b);

        Demonio d = new Demonio(b);

        d.start();
        c1.start();
        c2.start();
        c3.start();

        try {
            c1.join();
            c2.join();
            c3.join();
        } catch (Exception e) {
            System.out.println("error join");
        }

        System.out.println("------ resumen ------");
        System.out.println("cajero 1: " + c1.getTransacciones());
        System.out.println("cajero 2: " + c2.getTransacciones());
        System.out.println("cajero 3: " + c3.getTransacciones());
        System.out.println("saldo final: " + b.getSaldo());
    }
}
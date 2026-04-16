package synchronizedEx;

public class Printer {
    public synchronized void print(String name) {
        System.out.println("Start printing: " + name);

        try { Thread.sleep(1000); } catch (Exception e) {}

        System.out.println("End printing: " + name);
    }
}

public class Maiin extends Thread {
    public static void main(String[] args) {
        Maiin thread = new Maiin();
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in the thread");
        System.out.println(getName());
    }

}

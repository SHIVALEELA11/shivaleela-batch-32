public class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the NumberPrinter class
        NumberPrinter numberPrinter = new NumberPrinter();

        // Create a thread and pass the instance of NumberPrinter to its constructor
        Thread thread = new Thread(numberPrinter);

        // Start the thread
        thread.start();
    }
}

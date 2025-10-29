package start;


public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println(String.format("%s - run()",Thread.currentThread().getName()));
    }

}

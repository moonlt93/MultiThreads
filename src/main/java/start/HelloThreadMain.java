package start;

public class HelloThreadMain {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " - main() start");

        HelloThread thread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + " - hello thread 호출 전");
        thread.start();
        System.out.println(Thread.currentThread().getName()+ " hello thread 호출 후");

        System.out.println(Thread.currentThread().getName() + " - main() end");
    }

}

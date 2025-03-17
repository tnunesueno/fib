public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("make a sequence");
        MyFib fib1 = new MyFib("Fib 1",5,6, 10);
        Thread thread1 = new Thread(fib1);
        thread1.start();


        MyFib fib2= new MyFib("Fib 2",20,40, 3);
        Thread thread2 = new Thread(fib2);
        thread2.start();
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("make a sequence");
        MyFib fib1 = new MyFib(10,5,6);
        fib1.calculateRecursively();
    }
}
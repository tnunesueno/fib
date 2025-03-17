import java.util.Currency;

public class MyFib implements FibonacciLike, Runnable{

    int length =0;
    int num1 = 0;
    int num2 =0;
    String name;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public MyFib(String name, int num1, int num2, int length) {
        this.name = name;
        this.num2 = num2;
        this.num1 = num1;
        this.length = length;
    }

    public void calculate() throws InterruptedException {
        int currentNum;
        int lastNum;
        int newNum;
        System.out.print(num1);
        System.out.print(num2);
        currentNum=num1+num2;
        lastNum=num2;
        for (int howManySoFar =0; howManySoFar<=length-3; howManySoFar++){
           System.out.print(currentNum);
           newNum=currentNum+lastNum;
           lastNum=currentNum;
           currentNum=newNum;
        }
    }

    public void calculateRecursively() {
        System.out.println();
        int amountOfNums = this.getLength();
        System.out.print(this.name + ": "+num1);
        System.out.print(this.name + ": "+num2);

        calculateMinus2(amountOfNums-2, num1, num2);
    }

    public void calculateMinus2 (int amountOfNums, int num1, int num2){
        if (amountOfNums==0){
            return;
        }else{
            int newNum = num1+num2;
            int currentNum = num2;
            System.out.print(this.name + ": "+newNum);
            calculateMinus2(amountOfNums-1, currentNum, newNum);
        }
    }

    public void run(){
        calculateRecursively();
    }
}

import java.util.Currency;

public class MyFib implements FibonacciLike{

    int length =0;
    int num1 = 0;
    int num2 =0;

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

    public MyFib(int length, int num1, int num2) {
        this.length = length;
        this.num1 = num1;
        this.num2 = num2;
    }
    public void calculate() throws InterruptedException {
        int currentNum;
        int lastNum;
        int newNum;
        System.out.println(num1);
        System.out.println(num2);
        currentNum=num1+num2;
        lastNum=num2;
        for (int howManySoFar =0; howManySoFar<=length-3; howManySoFar++){
           System.out.println(currentNum);
           newNum=currentNum+lastNum;
           lastNum=currentNum;
           currentNum=newNum;
        }
    }

    public void calculateRecursively() {
        int amountOfNums = this.getLength();
        System.out.println(num1);
        System.out.println(num2);

        calculateMinus2(amountOfNums-2, num1, num2);
    }

    public void calculateMinus2 (int amountOfNums, int num1, int num2){
        if (amountOfNums==0){
            return;
        }else{
            int newNum = num1+num2;
            int currentNum = num2;
            System.out.println(newNum);
            calculateMinus2(amountOfNums-1, currentNum, newNum);
        }
    }
}

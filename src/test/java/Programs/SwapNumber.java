package Programs;

public class SwapNumber {
    public void SwappNumber1(){
        int a=10;
        int b=20;
        System.out.println("Before Swapping "+a + "and "+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("After Swapping "+a + "and "+b);
    }
    public void SwappNumber2(){
        int a=10;
        int b=20;
        System.out.println("Before Swapping "+a + "and "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping "+a + "and "+b);
    }
    public static void main(String[] args) {
    SwapNumber swap=new SwapNumber();
    swap.SwappNumber1();
    swap.SwappNumber2();
    }
}

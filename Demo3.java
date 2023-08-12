public class Demo3 {
    public static void main(String[] args) {
        // method 1
        int a=10;
        int b=20;
        System.out.println("Before Swaping..");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapint..");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        // method 2
        int x=20;
        int y=10;
        System.out.println("Before Swaping..");
        System.out.println("x : "+x);
        System.out.println("y : "+y);
        int t;
        t=x;
        x=y;
        y=t;
        System.out.println("After Swapint..");
        System.out.println("x : "+x);
        System.out.println("y : "+y);
    }
}

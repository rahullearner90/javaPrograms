import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int a=sc.nextInt();
        System.out.println("Enter num2");
        int b=sc.nextInt();
        System.out.println("Enter Oprator symbol");
        String opr=sc.next();
        int res=0;

        switch (opr){
            case "+":
               res=a+b;
                 break;
            case "-":
               res=a-b;
                 break;   
            case "/":
               res=a/b;
                 break;   
            case "*":
               res=a*b;
                 break;   
            case "%":
               res=a%b;
                 break;   
            default:
               System.out.println("Invalid oprator..");
                break;   
        }
        System.out.println(res);

        // switch (key) {
        //     case value:
                
        //         break;
        
        //     default:
        //         break;
        // }

    }
}

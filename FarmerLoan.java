import java.util.Scanner;

class FarmerLoan{
    static float ri;    //Rate of interast
    int pa;     //Principal amount
    int td;     //Time duration
    double si; //Simple interast

    static{
        ri=4.5f;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal amount :");
        this.pa=sc.nextInt();
        System.out.println("Enter Time Duration Required :");
        this.td=sc.nextInt();
    }

    public void compute(){
        si=(ri*pa*td)/100;
    }

    public void display(){
        System.out.println("Simple Interest is : "+si);
    }
    public static void main(String args[]){
        FarmerLoan f1=new FarmerLoan();
        f1.input();
        f1.compute();
        f1.display();
    }
}
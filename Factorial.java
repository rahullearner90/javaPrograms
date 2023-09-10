class Fact{
    int fact_no=1;
    int num;
    public Fact(int num) {
        this.num=num;
    }

    public int fac1(){
        for(int i=1; i<=num; i++){
            fact_no=fact_no*i;
        }
        return fact_no;
    }
    public int getfactorial(){
        return fact_no;
    }
    
    public String toString(){
        return "Factorial of "+num+" is "+this.fac1();
    }
}
public class Factorial {
    public static void main(String[] args) {
        Fact obj1=new Fact(5);
        System.out.println(obj1);

        Fact obj2=new Fact(6);
        System.out.println(obj2);

        int x=obj1.getfactorial();
        System.out.println(x);

        int y=obj2.getfactorial();
        System.out.println(y);
        
    }
}

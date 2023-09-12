class CalcDemo{
    int sum;
    public int add(int... array){
        for(int v : array){
            sum+=v;
        }
        return sum;
    }
}
public class Calc {
    public static void main(String[] args) {
        CalcDemo obj=new CalcDemo();
        int result=obj.add(2,3,5);
        System.out.println(result);

        int result2=obj.add(10,10,5,5);
        System.out.println(result2);

        CalcDemo obj2=new CalcDemo();
        int result3=obj2.add(new int[]{2,3,4,5,6});
        System.out.println(obj2.sum);
        System.out.println(result3);
    }
}

public class Demo5 {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter number for table : ");
        int num=sc.nextInt();
        for(int i=1; i<=10; i++){
            if(num*i<10){
                System.out.println(num+"X"+i+"=0"+num*i);
            }else{
                System.out.println(num+"X"+i+"="+num*i);
            }
        }
    }
}

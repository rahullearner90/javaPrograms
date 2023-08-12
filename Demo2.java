class Leap{
    String str;
    int year;

    Leap(int year){
        this.year=year;
        getleapyear();
    }

    public void getleapyear(){
        if(year%400==0 || year%4==0 && year%100!=0){
            str="it is a leap year..";
        }else{
            str="it is not a leap year..";
        }
    }

    public String getleapyear(int year){
        if(year%400==0){
            if(year%4==0){
                if(year%100 != 0){
                    str="it is a leap year..";
                }
            }
        }else{
            str="it is not a leap year..";
        }
        return str;
    }
    public String toString(){
        return str;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Leap l=new Leap(2012);
        System.out.println(l);
       String srt= l.getleapyear(2008);
       System.out.println("Here : "+srt);
    }
}

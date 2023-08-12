class Leapyear{
    String str;
    public String getleapyear(int year){
        if(year%400 == 0 || year%4 == 0 && year%100 != 0){
            str="it's a leap year..";
        }else{
            str="it's not a leap year..";
        }
        return str;
    }
}
class Demo1{
    public static void main(String[] args) {
        Leapyear obj=new Leapyear();
        String year=obj.getleapyear(2000);
        System.out.println(year);
    }
}
public class WorkSchedule {
    public static void main(String[] args) {
       int day=3;
       boolean holiday=false;
       if( holiday==true)
       {
        System.out.println("Wohoo no work!");       } 
        else if(day==6 || day==7)
        {
            System.out.println("It is weekend no work!");
        }
        else{
            System.out.println("Wake up at 6 am!");
        }
    }
}

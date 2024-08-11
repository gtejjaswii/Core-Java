public class JavaMart {
    public static void main(String[] args) {
        double wallet=100;
        double toy =20.6;
        System.out.println("Can you buy me this? ");

        if(wallet>toy)
        {
            System.out.println("sure!");
        }
        else{
            System.out.println("sorry! I only have $"+wallet); 
        }
        wallet-=toy;
        double shoes=50.7;
        System.out.println("Can you buy me this? ");

        if(wallet>=toy)
        {
            System.out.println("sure!");
        }
        else{
            System.out.println("sorry! I only have $"+wallet); 
        }
        wallet-=shoes;
        double car=100;
        System.out.println("Can you buy me this? ");

       if(wallet>=car)
        {
            System.out.println("sure!");
        }
        else{
            System.out.println("sorry! I only have $"+wallet); 
        }
    }
}

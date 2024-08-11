public class Championship {
    public static void main(String[] args) {
        int greffynder=620;
        int revenclaw=500;
        int diff=greffynder-revenclaw;
        if(diff>=300)
        {
            System.out.println("greffynder takes the cup!");
        }
        else if( diff>=0)
        {
            System.out.println("greffynder wins second!");
        }
        else if(diff>=-100)
        {
            System.out.println("greffynder wins third!");
        }
        else
        {
            System.out.println("greffynder wins fourth");
        }
        
    }
}

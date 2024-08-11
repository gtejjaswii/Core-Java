public class AppleStore {
    public static void main(String[] args) {
        int apples = 500;
        double price = 0;
        int no_Of_Customers = 0;
        System.out.println("one customer walked in and bought 4 apples: ");
        apples -= 4;
        price += (4 * 0.40);
        no_Of_Customers++;
        System.out.println("one customer walked in and bought 20 apples: ");
        apples -= 20;
        price += (20 * 0.40);
        no_Of_Customers++;
        System.out.println("one customer walked in and bought 200 apples: ");
        apples -= 200;
        price += (200 * 0.40);
        no_Of_Customers++;
        System.out.println("Wow! so far u made profit of $ " + price);
        System.out.println(no_Of_Customers + "customers loved your apples");
        System.out.println("you have " + apples + " left");
    }
}

import java.util.Scanner;

public class SignUp {
   public static void main(String[] args) 
   {
    System.out.println("WLECOME TO JAVAGRAM!! LET'S SIGN YOU UP\n");
    Scanner scan=new Scanner(System.in);
    System.out.print("What is your first name? ");
    
    String fName=scan.nextLine();
    System.out.print("What is your last name? ");
    String lName=scan.nextLine();
    System.out.println("How old are you? ");
    int age=scan.nextInt();
    scan.nextLine();
    System.out.print("Make a username: ");
    
    String user=scan.nextLine();
    System.out.print("\nWhat city do you live in ? ");
   
    String city=scan.nextLine();
    System.out.print("What country is that ");

    String country=scan.nextLine();
System.out.println("Thank you for joining javagram!");
System.out.println("Here is the information that you entered");
System.out.println("\t First Name:"+fName);
System.out.println("\t Last Name:"+lName);
System.out.println("\t your age :"+age);
System.out.println("\t user:"+user);
System.out.println("\t city:"+city);
System.out.println("\t country:"+country);
scan.close();
   } 
}

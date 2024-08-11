import java.util.*;
public class Chatbot {
    public static void main(String[] args)
     {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hello, What is your name:");
        String name=scan.nextLine();

        //System.out.println(name);
        System.out.println("Hi"+name+"! I'm Javabot. Where are you from?");
        String city=scan.nextLine();
        //System.out.println(city);
        System.out.println("I hear it is beautiful at "+city+"! I am from Oracle.");
        System.out.println("How old are you?");
        int age=scan.nextInt();
        //System.out.println(age);
        int res=400/age;
        System.out.println("so you are "+age+" cool!. I am 400 years old\n . This means I am "+res+" times older than you. \n Enough about me. What's your favourite language?");
        scan.nextLine();
        String lang=scan.nextLine();
       // System.out.println(lang);
        System.out.println(lang+", that's great!. Nice chatting with you "+name+". I have to log off now. See ya!");
        scan.close();
    }
}

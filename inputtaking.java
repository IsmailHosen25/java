import java.util.Scanner;
public class inputtaking {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter your Name : ");
       String name=sc.nextLine();
       System.out.println("");
       System.out.println("Enter your age : ");
       int age =sc.nextInt();
       System.out.println("My Name is "+name+" and age "+age);

    }
}

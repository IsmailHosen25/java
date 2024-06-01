import java.util.*;
class data_taype {
    public static void main(String[] args) {
        //variable
        int a=10;
        int b=5;
        int sum=a+b;
        System.out.println(sum );
        System.out.println(a*b/a-b + " This is wrong answer"); // java oparate from left to right (paiorty * / % + -)
        System.out.println((a*b)/(a-b)+ " This is correct answer");
        double x=2.5;
        double y=4.6;
        System.out.print(x+y + " \n");
        int c=5;
        int d=10;
        System.out.println(c*d+"\n\n\n");


        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

    }
}

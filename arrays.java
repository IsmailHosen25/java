import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=99;
        marks[1]=92;
        marks[2]=97;
        
        System.out.println(marks); // it won't give the marks

        //for print value
        System.out.println("");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println("");

        // for print  length of an array
        System.out.println(marks.length+" - "+"This is array length");

        //for sorting the array
        System.out.println("");
        System.out.println("Sorted array: ");
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // diffrent way to write an array
        System.out.println("");
        System.out.println("Another way to write array");
        int[] marks2={96,92,97};
        System.out.println(marks2[0]);
        System.out.println(marks2[1]);
        System.out.println(marks2[2]);

        // making 2D array
        System.out.println("");
        System.out.println("2D array");
        int[][] classMarks={{73,89,62},{85,89,70}};
        System.out.println(classMarks[0][0]);
        System.out.println(classMarks[0][1]);
        System.out.println(classMarks[1][2]);
        
    }
}

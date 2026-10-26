import java.util.Scanner;
public class ArrayCC {
    public static void main(String[] args) {
        int[] marks = new int[100];

        System.out.println("lenght of array = " +marks.length); 

        Scanner sc = new Scanner(System.in);

        marks[0]= sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics:" + marks[0]);
        System.out.println("Maths:" + marks[1]);
        System.out.println("Chemistry:" + marks[2]);
        
        marks[1] = marks[1] + 20;
        
        System.out.println("Updated Maths marks:" + marks[1]);
        

    }
}   
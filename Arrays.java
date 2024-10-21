import java.util.*;
public class Arrays {
    public static void main(String args[]){
        int[] marks = new int[3];
        //int marks[] = new int[3]; //same

        marks[0] = 97;
        marks[1] = 95;
        marks[2] = 98;

        // System.out.println(marks);//it prints the address of marks in memory (garbage value)
        // System.out.println(marks[0]);//it prints the value of 0th index from array
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i = 0; i<3; i++){
            System.out.println(marks[i]);
        }

    }
}

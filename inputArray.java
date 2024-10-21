import java.util.*;
public class inputArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //for output
        // for(int i = 0; i<size; i++){
        //     System.out.println(numbers[i]);//According to size it stores null values
        // }

        //input
        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        //output
        for(int i = 0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }
}

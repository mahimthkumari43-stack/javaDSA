//import java.util.*;

public class largestAndSmallestNo {
    public static int largest(int numbers[]){
        int min = Integer.MIN_VALUE;
    

        for(int i =0;i<numbers.length;i++){
            if(min < numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }

    public static int smallest(int numbers[]){
        int max = Integer.MAX_VALUE;
        
        for(int i =0;i<numbers.length;i++){
            if(max > numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int num[] = {2,5,6,8,10,45,0};
        int largest_no = largest(num);
        System.out.println("Laegest Number: " + largest_no);

        int smallest_no = smallest(num);
        System.out.println("Smallest Number: "+ smallest_no);
        
    }
}

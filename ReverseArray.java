public class ReverseArray {
    public static void reverse(int numbers[]){
        int start = 0;
        int end = numbers.length-1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int num[] = {6,3,8,9,2,0,23};
        
        reverse(num);

        for(int i =0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }
       // System.out.println();
        
    }
}

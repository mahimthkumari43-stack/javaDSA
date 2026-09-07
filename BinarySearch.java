public class BinarySearch {
    public static int BSearch(int numbers[],int key){
        int start = numbers[0];
        int end = numbers.length-1;
        while (start <= end) {
            int mid = (start + end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            else if(numbers[mid]>key){
                end = mid-1;
            }else{
                start = mid +1;
            }  
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2,5,7,9,10,11,18};
        int key = 11;

        int index = BSearch(num, key);

        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found at index: "+ (index+1));
        }
        
    }
}

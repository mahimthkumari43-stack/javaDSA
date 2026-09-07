/**
 * LinearSearch
 */
public class LinearSearch {
    public static int linerSearch(int numbers[],int key){
        int i;
        for(i = 0;i<= numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,16,18};
        int key = 16;

        int index = linerSearch(num, key);
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index " + (index+1));
        }
        
    }

    
}
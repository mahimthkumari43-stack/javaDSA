public class SumOfSubArray {

    public static void sumSubArray(int num[]){
        int sum =0;
        for(int i =0;i<num.length;i++){
            int start = i;
            for(int j = i;j<num.length;j++){
                int end = j;
                sum = 0;
                for(int k = start;k<=end;k++){
                    sum += num[k];
                    System.out.print(num[k]+" ");
                    
                }
                System.out.println("= "+sum);

            }
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,5,7,3,8,9};
        sumSubArray(numbers);

        
    }
}

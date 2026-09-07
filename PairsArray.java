public class PairsArray {
    public static void pairs(int a[]){
        int tp = 0;
        for(int i =0;i<a.length;i++){
            int current = a[i];
            for(int j = i+1;j<a.length;j++){
                
                System.out.print("("+current+","+a[j]+")");
                tp++;
            }
            System.out.println();
            
        }
        System.out.println("Total Numbers of Pairs: "+ tp);
    }
    public static void main(String[] args) {
        int numbers[] = { 2,3,4,5,8};
        pairs(numbers);
        
    }
}

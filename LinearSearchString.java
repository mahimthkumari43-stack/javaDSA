public class LinearSearchString {

    public  static  int LSearchString(String s[],String key){
        int length = s.length;
        for(int i =0;i<length;i++){
            if(s[i].equals(key)){
                return  i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s[] = {"Mahi","Riya","Aman","Anil","Anjali"};
        String key = "Anil";

        int index = LSearchString(s, key);

        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index " + (index+1));
        }
        
    }
}

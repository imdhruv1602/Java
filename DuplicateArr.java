public class DuplicateArr {
    public static void main(String[] args) {
        int arr[] = {12,11,10,12,11,10,9,8,7,6};
        for(int  i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}

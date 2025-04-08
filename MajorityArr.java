public class MajorityArr {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,4,5};
        int count  = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

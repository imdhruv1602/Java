public class CountEvenOddArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int even = 0;
        int odd = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%2==0){
                even++;
            } else{
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}

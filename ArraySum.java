public class ArraySum {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}

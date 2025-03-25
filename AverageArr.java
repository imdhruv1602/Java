public class AverageArr {
    public static void main(String[] args) {
        int arr[] = {89 , 98 , 90 , 95, 87};
        double sum = 0;
        for(int i =  0 ;  i < arr.length ; i++){
            sum += arr[i];
        }
        double average = sum/arr.length;
        System.out.println(average);
    }
}

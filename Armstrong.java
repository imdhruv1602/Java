public class Armstrong {
    public static void main(String[] args) {
        int n = 1536;
        int org = n;
        int sum = 0;
        int numOfDigits = 0;
        int temp = n;
        while(temp > 0){
            temp /= 10;
            numOfDigits++;
        }
        temp = n;
        while (temp>0) {
            int ld = temp % 10;
            sum = (int) (sum + Math.pow(ld,numOfDigits));
            temp/=10;
        }
        if(org==sum){
            System.out.println("armstrong");
        } else{
            System.out.println("No");
        }   
    }
}

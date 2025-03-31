public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        if(n == 0 || n == 1){
            System.out.println(0);
        }
        int fact = 1;
        for(int i = 2 ; i < n+1 ; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}

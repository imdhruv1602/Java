public class Fib {
    public static void main(String[] args) {
        int a = 0 , b = 1;
        int n = 5;
        if(n>=1){
            System.out.println(a);
        }
        if(n>=2){
            System.out.println(b);
        }
        for(int i = 3 ; i <= n ; i++){
            int next = a + b;
            System.out.println(next);
            a = b;
            b = next;
        }
    }
}

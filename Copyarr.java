public class Copyarr {
    public static void main(String[] args) {
        int org[] = {1,2,3,4,5};
        int dup[] = new int[org.length];

        for(int i = 0 ; i < org.length ; i++){
            System.out.print(org[i]+" ");
        } 

        for(int i = 0 ; i < org.length ; i++){
            dup[i] = org[i];
        }

        System.out.println();
        for(int i = 0 ; i < org.length ; i++){
            System.out.print(dup[i]+" ");
        }
    }
}

public class WhilwTestUnevenHundred {
    public static void main(String[] args) {
        int n = 100;
        while (n>0){
            n--;
            if (n%2==0) {
                System.out.println(n);
            }
        }
    }
}

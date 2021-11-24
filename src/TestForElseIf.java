public class TestForElseIf {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0;i<=100;i++) {
            if (i <= 30) {
                sum += i;
            }else if (i<=80&&i%2!=0){
                sum+= i;
            }else if (i>80&&i%3==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}

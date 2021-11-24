public class Runner {
    public static void main(String[] args) {
        int a = 0;
        double d = 10;
        double c = 1.1;
        double sum = 0;
        while (a<7){
            a++;
            if(a==1){sum+=10;}
            if(a>=2){d*=c;sum+=d;}
            }
            System.out.println(sum);
        }
    }




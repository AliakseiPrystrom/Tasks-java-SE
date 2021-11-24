public class Ameba {
    public static void main(String[] args) {
        int a=2;
        int x=0;
        int z=0;
        while(x<24){
            x+=3;
            if (x==3){z+=2;}
            if (x>3){z*=2;}
            System.out.println(z+" амеб через "+x);
        }
    }
}

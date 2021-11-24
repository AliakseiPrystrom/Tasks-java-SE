public class DragonHeads {
    public static void main(String[] args) {
        int heads = 0;
        for(int i=0;i<450;i++){
            if(i<=300) {
                heads +=3;
            }else if (i>300){
                heads+=2;
            }
        }
        System.out.println(heads);
    }
}

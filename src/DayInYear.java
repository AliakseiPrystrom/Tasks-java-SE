public class DayInYear {
    public static void main(String[] args) {
        int x = 132;
        switch (x%7){
            case 0:
                System.out.println("пн");
                break;
            case 1:
                System.out.println("вт");
                break;
            case 2:
                System.out.println("ср");
                break;
            case 3:
                System.out.println("чт");
                break;
            case 4:
                System.out.println("пт");
            case 5:
                System.out.println("сб");
                break;
            case 6:
                System.out.println("вс");
                break;


        }
    }
}

public class eightPattern {
    public static void main(String[] args) {
        int rows =5;
        for(int i =1;i<=5;i++){
            for(int space =1;space<=(rows-i);space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}

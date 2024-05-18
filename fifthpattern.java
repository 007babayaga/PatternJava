public class fifthpattern {
    public static void main(String[] args) {
        for(int rows =1;rows<=5;rows++){
            for(int col=1;col<=rows;col++){
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

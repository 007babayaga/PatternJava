public class hii {
    public static void main(String[] args) {
        System.out.println("will be " +go(1234));
    }
    public static int go(int number){
        if(number<0){
            return -1;
        }
        int sum =0;
        for(int i =number;i>0;i/=10){
            int lastdigit = i%10;
            if(lastdigit%2==0){
                sum+=lastdigit;
            }
        }
        return sum;
    }
}

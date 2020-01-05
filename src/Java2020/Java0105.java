package Java2020;

public class Java0105 {
    public static int factor(int n){
        int num=1;
        int ret=1;
        while(num<=n){
            ret*=num;
            num++;
        }
        return ret;
    }
    public static void main(String[] args){
        int sum=0;
        int num=1;
        while(num<=5){
            sum+=factor(num);
            num++;
        }
        System.out.println(sum);
    }
}

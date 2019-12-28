package learnjava;
import java.util.Scanner;
public class Java1228 {
    //迭代实现输出整数的每一位
    /*public static void play(int n){
        if(n>9){
            play(n/10);
        }else{
            System.out.print(n%10+" ");
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        play(num);

    }*/
    //比较大小练习
   /* public static int max2(int x,int y){
        int tmp=0;//初始化变量
        if(x>y){
            tmp=x;
        }else if(x<y) {
            tmp=y;
        }
        return tmp;
    }
    public static void max3(int x,int y,int z){
        int m=max2(x,y);
        System.out.println(m>z?m:z);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        max3(num1,num2,num3);
    }*/
   //求N的阶乘
    /*public static void factor(int N){
        int sum=1;
        for(int i=1;i<=N;i++){
            sum*=i;
        }
        System.out.println("sum="+sum);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        factor(num);
    }*/
    //阶乘的和练习
    /*public static void factorSum(int N){
        int sum=1;
        int sum1=0;
        for(int i=1;i<=N;i++){
            sum*=i;
            sum1+=sum;
        }
        System.out.println(sum1);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        factorSum(num);
    }*/
    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字
    /*public static void find(int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[0] = arr[0] ^ arr[i];
        }
        System.out.println(arr[0]);
    }
    public static void main(String[] args){
        int [] arr = {1,1,2,3,3,4,4};
        find(arr);
    }*/
    //求斐波那契数列的第N项
    /*public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int aN=scanner.nextInt();
        int a1=1;
        int a2=1;
        int tmp;
        for(int i=3;i<aN;i++){
            tmp=a1;
            a1=a2;
            a2=a1+tmp;
        }
        System.out.println("aN="+(a1+a2));
    }*/
}

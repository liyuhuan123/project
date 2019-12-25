package learnjava;
import java.util.Scanner;
import java.util.Random;
public class Java1225 {
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        //System.out.println("please input two numbers:");
        //System.out.println("please input a number:");
        //int num1=sc.nextInt();
        //求一个整数在内存中存储时其而二进制1的个数练习
        //if(num1>=0){
         //   int sum=0;
          //  while(num1!=0){
           //     if(num1%2==0){
           //         sum++;
              //  }
             //   num1/=2;
          //  }
           // System.out.println(sum);
       // }
        //求两个正整数的最大公约数练习
        //int num2=sc.nextInt();
        //int divisor=0;
        //for(int i=1;i<=num1;i++){
          //  if(num1%i==0&&num2%i==0){
            //    divisor=i;
            //}
        //}
        //System.out.println(divisor);
        //计算1/1-1/2+1/3-1/4+......+1/99-1/100练习
        //double sum=0;
       // int tmp=1;
        //for(int i=1;i<=100;i++){
          //  sum+=tmp*(1.0/i);
            //tmp*=(-1);
        //}
        //System.out.println(sum);
        //1000以内的水仙花数练习
        //int flowerNum;
        //int shi;
        //int bai;
        //int ge;
        //for(flowerNum=100;flowerNum<1000;flowerNum++){
          //  ge=flowerNum%100%10;
            //shi=flowerNum%100/10;
            //bai=flowerNum/100;
            //int result=ge*ge*ge+shi*shi*shi+bai*bai*bai;
            //if(result==flowerNum)
            //{
              //  System.out.println(flowerNum);
            //}
        //}
        Random ran=new Random();
        int num=ran.nextInt(100)+1;
        System.out.println("enter your noumber to guess:");
        Scanner sc=new Scanner(System.in);
        while(true){
            int Guess=sc.nextInt();
            if(num<Guess){
                System.out.println("猜大了！");
            }else if(num>Guess){
                System.out.println("猜小了");
            }else{
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
    }
}

package learnjava;
import java.util.Scanner;
public class Java1224 {
    public static void main(String[] args) {
        /*int age=18;
        if(age>0&&age<19){
            System.out.println("是少年");
        }else if(age>=19&&age<29){
            System.out.println("是青年");
        }else if(age>=29&&age<56){
            System.out.println("是中年");
        }else{
            System.out.println("是老年");
        }*/
   /* Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    for(int i=2;i<num;i++)
    {
        if(num%i==0&&i!=num){
            System.out.println("不是素数");
            break;
        }else if(i==num){
            System.out.println("是素数");

    }
    }*/
       /* for (int i = 2; i < 101; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0 && j != i) {
                    break;
                } else if (j == i) {
                    System.out.println(i);
                }

            }
        }*/
       /*for(int year=1000;year<2001;year++){
           if(year%4==0&&year%100!=0){
               System.out.println(year);
           }else if(year%400==0){
               System.out.println(year);
           }
       }*/
       int sum=0;
       for(int num=1;num<101;num++){
           if(num%10==9)
               sum++;
           if(num/10==9)
               sum++;
       }
       System.out.println(sum);
    }
}
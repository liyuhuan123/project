package learnjava;
import java.util.Scanner;
public class Java1226 {
    public static void main(String[] args){
        //打印九九乘法表练习
       /* int i;
        for(i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"    ");
            }
            System.out.println( );
        }*/
       //模拟登录练习
        int secreat=123456;
        for(int i=0;i<=3;i++){
            System.out.println("请输入密码：");
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            if(num==secreat){
                System.out.println("登陆成功！");
                break;
            }else{
                System.out.println("登录失败！");
            }
        }
    }
}

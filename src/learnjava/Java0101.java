package learnjava;
import java.util.Scanner;
public class Java0101 {
    //1.调整数组顺序使偶数位于奇数之前，调整之后，不关心大小顺序

 /* public  static void change ( int[] arr){
            int left = 0;
            int right = arr.length - 1;
            int tmp;
            while (left < right) {
                while (left < right && arr[left] % 2 == 0) {
                    left++;
                }
                while (left < right && arr[right] % 2 != 0) {
                    right--;
                }
                tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
            }
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
        }
        public static void main(String[] args){
            int[] arr = {1, 2, 3, 4, 5, 6};
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            change(arr);
        }
    */
    //2.有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字
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
    //3.在一个类中，分别定义求两个整数的方法和三个小数之和的方法，并执行代码，求出结果
//    public static int add(int x,int y){
//        return x+y;
//    }
//    public static double add(double x,double y,double z){
//        return x+y+z;
//    }
//    public static void main(String[] args){
//        int a1=1;
//        int a2=2;
//        System.out.println("ret1="+add(a1,a2));
//        double a3=12.3;
//        double a4=13.2;
//        double a5=13.4;
//        System.out.println("ret2="+add(a3,a4,a5));
//    }
    //4.在一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值
   public static int max(int x,int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    public static double max(double x,double y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    public static void main(String[] args){
        int a1=2;
        int b1=3;
        System.out.println("max1="+max(a1,b1));
        double a2=2.3;
        double b2=3.4;
        System.out.println("max="+max(a2,b2));
    }
}

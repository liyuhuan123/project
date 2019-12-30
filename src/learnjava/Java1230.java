package learnjava;
import java.util.Arrays;
import java.util.Scanner;
public class Java1230 {
    //数组练习
    //1.实现一个方法toString,把一个整型数组转换成字符串，例如数组{1,2,3}，返回的字符串为"[1,2,3]"
    //使用java.util.Arrays包实现数组转字符串
//    public static void toString(int[] arr){
//        String newArr=Arrays.toString(arr);
//        System.out.println(newArr);
//    }
//    public static void main(String[] args){
//        int[] arr= {1,2,3,4};
//        toString(arr);
//    }
    //实现一个自己版本的数组转字符串
/*    public static String toString(int[] arr){
        String ret="[";
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
                ret+=arr[i]+",";
            }else{
                ret+=arr[i];
            }
        }
        ret+="]";
        return ret;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        System.out.println(toString(arr));
    }*/
//2.实现一个方法copyOf，对一个整型数组进行拷贝，得到一个新的数组
    //实现自己版本的拷贝数组
   /*public static int[] copyOf(int[] arr){
       int[] newArr=new int[arr.length];
       for(int i=0;i<arr.length;i++){
           newArr[i]=arr[i];
       }
       System.out.print("newArr:");
       for(int i=0;i<newArr.length;i++){
           System.out.print(newArr[i]+" ");
       }
       return newArr;
   }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.print("arr:");
        for(int i=0;i<arr.length;i++)
        {System.out.print(arr[i]+" "); }
        System.out.println();
        copyOf(arr);
    }*/
    //使用java.util.Arrays包实现数组的深拷贝
 /*   public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int[] newArr=Arrays.copyOf(arr,arr.length);
        System.out.println("newArr:"+Arrays.toString(newArr));
    }*/
    //3.给定一个有序整型数组，实现二分查找
   /* public static int Find(int[] arr,int toFind){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(toFind<arr[mid]){
                right=mid-1;
            }else if(toFind>arr[mid]){
                left=mid+1;
            }else{
                return mid;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,};
        System.out.print("请输入你要查找的数字：");
        Scanner scanner=new Scanner(System.in);
        int toFind=scanner.nextInt();
        System.out.println(Find(arr,toFind));
    }*/
    //4.给定一个整型数组，判定数组是否有序
    //升序
    /*public static boolean issorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        System.out.println(issorted(arr));
    }*/
    //降序
 /*   public static boolean issorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        System.out.println(issorted(arr));
    }*/
    //5.给定一个整型数组，实现冒泡排序(升序排序)
   /* public static void bubbleSort(int[] arr){
        int tmp;
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j-1]>arr[j]){
                    tmp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={1,4,6,2,3,5};
        bubbleSort(arr);
    }*/
    //6.编写代码：创建一个int类型的数组，元素个数为100，并把每个元素依次设置为1-100
//    public static void main(String[] args){
//        int[] arr=new int[100];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=i+1;
//            System.out.print(arr[i]+" ");
//        }
//    }
    //7.编写代码，实现一个方法transform,以数组为参数，循环将数组的每个元素乘以2，并设置到对应的数组元素上，例如，原数组为{1,2,3}，修改之后为{2，4,6}
/*    public static void transform(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]*=2;
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        transform(arr);
    }*/
//8.实现一个方法printArray，以数组为参数，循环访问每个元素，打印每个元素的值
    /*public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(arr);
    }*/

    //9.实现一个方法sum，以数组为参数，求数组所有元素之和
/*    public static int sum(int[] arr) {
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            result+=arr[i];
        }
        return result;

    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        System.out.println("result="+sum(arr));
        }*/
//10.实现一个方法avg，以数组为参数，求数组中所有所有元素的平均值（注意方法的返回值类型）
    public static double avg(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double result=(double)sum/arr.length;
        return result;
    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        System.out.println("result="+avg(arr));
    }
}


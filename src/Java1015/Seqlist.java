package Java1015;

public class Seqlist {
    private int[] arr = null;//存储数据的数组
    private int size;//有效元素个数
    private int capacity;//容量
    //初始化
    public void seqlist(int n) {
        if (n >= 0) {
            this.arr = new int[n];
            this.capacity = n;
            this.size = n;
        }else{
            System.out.println("初始化数据不能小于0");
        }
    }
    //打印数组元素
    public void display(){
        System.out.println("数组当前元素分别是：");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

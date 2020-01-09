package Java0109;

public class person {
    private String name;
    private int age;
    private String sex;
    //默认构造函数   构造对象
    public person(){
        this.name = "caocao";
        this.age = 10;
        this.sex = "男";
    }
    //带有三个参数的构造函数
    public person(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void show(){
        System.out.println("我叫"+name+",今年"+age+"岁");
    }
}

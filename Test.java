package ooday01;

public class Test {

    String name;
    int age;
    String address;

    void study(){
        System.out.println();
    }
    void sayHi(){
        System.out.println();
    }
}

public class Demo_D {
    public static void main(String[] args) {
        //输出人物信息
        //定义变量记录姓名
        String name = "测试A";
        //定义变量记录年龄
        int age = 18;
        //定义变量记录性别
        char gender = '男';
        //定义变量记录身高
        double height = 180.1;
        //定义变量记录是否单身
        boolean flag = true;
        //输出变量的值
        System.out.println(name + ',' + age + ',' + gender + ',' +height + ',' +flag);
        //输出电影信息
        //定义变量记录电影的名字
        String name_m = "电影A";
        //定义变量记录演员的名字
        String star_m = "test_movie";
        //定义变量记录电影的年份
        int year_m = 2019;
        //定义变量记录电影的评分
        double grade_m = 9.0;
        //定义变量记录电影的简述
        String text_m = "This is a test text";
        //输出变量的值
        System.out.println(name_m + ',' + star_m + ',' + year_m + ',' + grade_m + ',' + text_m);
        //输出商品信息
        //定义变量记录商品价格
        double price = 5699.0;
        //定义变量记录商品品牌
        String name_p = "商品A";
        //定义变量记录商品型号
        String type_p = "型号A";
        //输出变量的值
        System.out.println(name_p + ',' + price + ',' + type_p);
    }
}








package binary;
//补码的演示
public class ComplementDemo {
    public static void main(String[] args) {
        //深入理解负值:
        int n = -7;
        System.out.println(Integer.toBinaryString(n)); //以2进制输出

        //互补对称现象: -n=~n+1
        int m = -7;
        int o = ~m+1;
        System.out.println(o); //7
        int i = 12;
        int j = ~i+1;
        System.out.println(j); //-12








        /*
        规律数：
        1)0111为4位补码的最大值，规律是1个0和3个1，可以推导出：
          ----32位补码的最大值：1个0和31个1------(011111111111......)
        2)1000为4位补码的最小值，规律是1个1和3个0，可以推导出：
          ----32位补码的最小值：1个1和31个0------(100000000000......)
        3)1111为4位补码的-1，规律是4个1，可以推导出：
          ----32位补码的-1：32个1--------------(111111111111.....)
         */
        /*
        int max = Integer.MAX_VALUE; //int的最大值
        int min = Integer.MIN_VALUE; //int的最小值
        System.out.println(Integer.toBinaryString(max)); //01111111...
        System.out.println(Integer.toBinaryString(min)); //10000000...
        System.out.println(Integer.toBinaryString(-1)); //1111111...
         */
    }
}


package day20190912;
 import java.util.Scanner;

//1.成员方法：半径
 public class Circle {
     public static void main(String[]  args) {
         System.out.println("请输入圆的半径：");
         Scanner input=new Scanner(System.in);
         float r=input.nextFloat() ;
         Circular c=new Circular();
         c.area(r);
         c.perimeter(r) ;
     }
 }

//2.成员方法：计算圆的周长和面积

class Circular{
     private float r;
     public void perimeter(float r){
         //周长等于3.14*2*r
         System.out.println("周长为"+(3.14*2*r));
     }
     public void area(float r){
         //面积等于3.14*r*r
         System.out.println("面积为"+(3.14*r*r));
     }
 }

























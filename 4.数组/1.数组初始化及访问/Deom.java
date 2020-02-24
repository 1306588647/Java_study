/*
数组的概念：数组是一种容器，可以同时存放多个同种数据类型

数组的特点：
1.数组是一种引用类型
2.数组当中的多个数据，类型必须统一
3.数组的长度在程序运行期间不可改变


数组的初始化：在内存中创建一个数组，并且向其中赋予一些默认值

两种常见的初始化方式：
1.动态初始化（指定长度）
2.静态初始化（指定内容）


动态数组初始化：
数据类型[] 数组名称 = new 数据类型[数组长度];
使用动态初始化数组的时候，其中的元素将会拥有一个默认值，规则如下：
1.如果是整数型，那么默认为0；
2.如果是浮点型，那么默认为0.0；
3.如果是字符型，那么默认为'\u0000'\；
4.如果是布尔型，那么默认为false；
5.如果是引用类型，那么默认为null；


静态数组初始化：
数据类型[] 数组名称 = new 数据类型[]{元素1，元素2，...};
省略格式：
数据类型[] 数组名称 ={元素1，元素2，...};

使用建议：
如果不确定数组当中具体内容，用动态初始化；
如果已确定数组当中具体内容，用静态初始化；

*/

public class Deom {
    public static void main(String[] args) {
        //动态初始化
        int[] arrayA = new int[300];
        double[] arrayB = new double[100];
        String[] arrayC = new String[100];


        //静态初始化
        int[] arrayD = new int[]{1,2,3,4,5,6};
        String[] arrayE = new String[]{"我爱你","我也爱你"};

        //省略格式静态初始化
        int[] arrayF = {1,2,3,4,5,6};

        //数组的访问
        System.out.println(arrayF[0]);
        arrayA[0]=1000;
        System.out.println(arrayA[0]);

    }
}



/*
直接打印数组名称，得到的是数组对应的内存地址

访问数组的格式：数组名称[索引值]
【注意】索引值从0开始，一直到（数组长度-1）为止

*/

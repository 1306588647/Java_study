/*
1.类与类之间是单继承的，直接父类只有一个。
2.类与接口之间是多实现的，一个类可以实现多个接口。有冲突的话，要解决
3.接口与接口之间是多继承的

注意事项：
1.多个父接口中的抽象方法如果重复，没关系。
2.多个父接口中的默认方法如果重复，有关系,那么子接口必须进行默认方法的重写，【而且带上default关键字】。
*/
public class DemoRelations {
}

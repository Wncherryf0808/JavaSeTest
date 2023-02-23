package abstractTest;

/*
    抽象类：
    1.抽象类是引用类型
    2.抽象类是无法实例化的，无法创建对象的，所以抽象类是供子类继承的
    3.final和abstract不能联合使用，这两个关键字是对立的
    4.抽象类的子类也可以是抽象类
    5.抽象类虽然无法实例化，但是抽象类有构造方法，这个构造方法是供子类使用的

    抽象方法：没有实现的方法，没有方法体的方法，例如： public abstract void doSome();
        没有方法体，以分号结尾
        前面修饰符列表中有abstract关键字
    抽象类中不一定有抽象方法，但是抽象方法一定包含在抽象类内。

    重点：一个非抽象的类继承了抽象类，必须将抽象类中的抽象方法实现。
 */
public class AbstractTest01 {
}

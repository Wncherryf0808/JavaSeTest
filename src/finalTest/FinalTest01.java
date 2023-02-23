package finalTest;

/**
 * final
 *  1.final代表最终的不可变的
 *  2.可以修饰变量、方法和类等
 *  3.final修饰的类无法被继承
 *  4.final修饰的方法无法被覆盖，被重写
 *  5.final修饰的变量无法修改，final赋值的变量只能赋一次值
 *  6.final修饰的实例变量，系统不负责赋默认值，需要程序员必须手动赋值，这个手动赋值，在变量后面赋值可以，在构造方法中赋值也可以。
 *  7.final修饰的实例变量，一版添加static修饰
 *  8.final修饰的引用，该引用只能指向1个对象，并且它只能永远指向该对象，无法再指向其他对象。
 *
 *  static final联合修饰的变量称为“常量”。
 *  常量名建议全部大写，每个单词之间下划线衔接
 *
 *  常量：实际上常量和静态变量一样，区别在于：常量的值不能变。
 *  常量和静态变量，都是存储在方法区，并且都是在类加载时初始化。
 *  常量一般都是公开的。 public static final String COUNTRY = "中国";
 */
public class FinalTest01 {
}

class C{
    public final void doSome(){

    }
}

class D extends C{
    /*
    public void doSome(){

    }
    */
}
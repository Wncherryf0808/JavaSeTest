package polymorphismTest;

public class PolymorphismTest01 {
    public static void main(String[] args){
        Animal a = new Cat();
        a.run();

        Animal b = new Bird();
        b.run();

        Animal a2 = new Cat();
        if(a2 instanceof Cat){
            Cat c = (Cat)a2;
            c.eat();
        }

    }
}

class Animal{
    public void run(){
        System.out.println("动物正在奔跑");
    }
}

class Cat extends Animal{
    public void run(){
        System.out.println("猫正在奔跑");
    }

    public void eat(){
        System.out.println("猫正在吃鱼");
    }
}

class Bird extends Animal{
    public void run(){
        System.out.println("鸟正在飞");
    }
}
package interfaceTest.practice;

// 中国厨师类
public class ChineseCooker implements FoodMenu{
    @Override
    public void xiHongShiChaoJiDan() {
        System.out.println("中方厨师做的西红柿炒鸡蛋");
    }

    @Override
    public void yuXiangRouSi() {
        System.out.println("中方厨师做的鱼香肉丝");
    }
}

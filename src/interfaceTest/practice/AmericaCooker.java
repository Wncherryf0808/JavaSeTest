package interfaceTest.practice;

// 美国厨师
public class AmericaCooker implements FoodMenu{

    @Override
    public void xiHongShiChaoJiDan() {
        System.out.println("西方厨师做的西红柿炒鸡蛋");
    }

    @Override
    public void yuXiangRouSi() {
        System.out.println("西方厨师做的鱼香肉丝");
    }
}

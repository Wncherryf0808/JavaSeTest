package interfaceTest.practice;

// 测试类
public class Test {
    public static void main(String[] args){
        FoodMenu f = new AmericaCooker();
        Customer customer = new Customer(f);
        customer.order();

        FoodMenu f1 = new ChineseCooker();
        Customer customer1 = new Customer(f1);
        customer1.order();
    }
}

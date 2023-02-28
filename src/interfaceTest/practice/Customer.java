package interfaceTest.practice;

// 顾客类
public class Customer {
    private FoodMenu foodMenu; // 菜单属性

    // 无参构造
    public Customer(){

    }

    // 有参构造
    public Customer(FoodMenu foodMenu){
        this.foodMenu = foodMenu;
    }

    // setter and getter
    public void setFoodMenu(FoodMenu foodMenu){
        this.foodMenu = foodMenu;
    }
    public FoodMenu getFoodMenu(){
        return this.foodMenu;
    }

    // 顾客点餐方法
    public void order(){
        FoodMenu fm = this.getFoodMenu();
        fm.xiHongShiChaoJiDan();
        fm.yuXiangRouSi();
    }
}

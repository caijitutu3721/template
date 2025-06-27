package Extend;

public class SaleManager extends Employee {
    private double bonus;
    public String level = "经理P4";
    public String hobby = "经理打羽毛球";


    public SaleManager() {
        this(null, 0, 1000);

    }

    public SaleManager(String name, int age, double bonus) {
        super(name, age);
        this.bonus = bonus;
    }


    public SaleManager(String name, int age) {
        super(name, age);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }


    @Override
    public void work() {
        super.work();//同时调用原方法
        System.out.println("经理在管理销售员");
    }

    public void work2() {
        super.work();
    }

    public void saleManagerOnly() {
        System.out.println("销售经理特有方法");
    }

}

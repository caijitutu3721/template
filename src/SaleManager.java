public class SaleManager extends Employee {
    private double bonus;

    public SaleManager() {
        super();
    }

    public SaleManager(String name, int age, double bonus) {
        super(name, age);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void work() {
        System.out.println("经理在管理销售员");
    }
}

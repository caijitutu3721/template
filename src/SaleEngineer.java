public class SaleEngineer extends SaleManager {

    SaleEngineer() {
        super();
    }

    SaleEngineer(String name, int age) {
        super(name, age);
    }

    @Override
    public void showInfo() {
        System.out.println("销售工程师:" + getName() + "," + getAge());
    }
}

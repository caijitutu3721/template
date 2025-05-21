public class SalesAssistant extends SaleManager {

    SalesAssistant() {
        super();
    }

    SalesAssistant(String name, int age) {
        super(name, age);

    }

    @Override
    public void showInfo() {
        System.out.println("销售助理:" + getName() + "," + getAge());
    }
}

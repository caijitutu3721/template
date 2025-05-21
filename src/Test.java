public class Test {
    public static void main(String[] args) {
        Employee.compony = "上海交大";

        Employee e1 = new Employee("张三", 23);
        e1.Level = "P1";
        e1.show1();

        Employee e2 = new Employee();
        e2.Level = "P2";
        e2.show1();

        Until.math();

        System.out.println("========继承========");
        SaleManager sm1 = new SaleManager();
        sm1.toilet();//子调父
        sm1.work();//调重写

    }
}

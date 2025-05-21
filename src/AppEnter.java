public class AppEnter {
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

        Sale s1 = new Sale();
        s1.toilet();//子调父
        s1.saleShow();//this super 就近原则

        System.out.println("========继承成员方法========");
        s1.interested= "底层人玩游戏";

    }
}

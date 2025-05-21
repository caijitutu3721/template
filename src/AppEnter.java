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

        Sale s1 = new Sale();
        SaleManager sm1 = new SaleManager();
        System.out.println("========继承成员变量========");//非private
        s1.interested = "底层人玩游戏";
        System.out.println(s1.interested);

        System.out.println("========继承成员方法========");//非final,非static,非private
        s1.toilet();//子调父

        System.out.println("========继承成员变量的就近原则========");
        s1.saleShow();//this super 就近原则
        System.out.println("========继承成员方法的就近原则========");
        s1.eat();//this super 就近原则
        System.out.println("========继承多态========");//必须是重写的
        s1.work();//调重写,是多态关系


        System.out.println("========多态========");

        register(s1);
        register(sm1);
    }

    public static void register(Employee e) {
        e.work();
    }
}

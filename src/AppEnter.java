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

        System.out.println("========继承:重写是多态基础========");//必须是重写的
        s1.work();//调重写,是多态关系

        System.out.println("========多态调用========");
        register(s1);
        register(sm1);

        System.out.println("========向下转型,统一调用方法========");
        Employee DownSale = new Sale();
        Employee DownSaleManager = new SaleManager();
        downRegister(DownSale);
        downRegister(DownSaleManager);


    }

    //========多态========//  
    public static void register(Employee e) {
        e.work();
    }

    //========向下转型========//
    public static void downRegister(Employee e) {
        System.out.println("1");
        if (e instanceof Sale sale) {
            System.out.println("向下转型到销售员,可使用其特有方法");
            sale.saleOnly();
        } else if (e instanceof SaleManager saleManager) {
            System.out.println("向下转型到经理,可使用其特有方法");
            saleManager.saleManagerOnly();
        }

    }

}
//继承+重写=多态;
//向下转型只是使用特有方法不是多态
//void method (animal a)方法传入参数;
//animal a = new animal;
//animal a = new dog();   可访问父类,不能访问dog特有方法
//dog d = new dog();      全部权限,但是每次调用需要新方法
//dog d = (dog)a          全部权限.先传递animal a = new dog,然后在方法中向下转型,一个方法
//cat c = (cat)a          全部权限.先传递animal a = new cat,然后在方法中向下转型,一个方法
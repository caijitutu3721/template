package Extend;

class Sale extends SaleManager {

    public String level = "销售员P3";


    Sale() {
        super();
    }

    Sale(String name, int age) {
        super(name, age);
    }


    //成员变量的就近原则
    public void saleShow() {
        String level = "Sale类方法中的销售员P3";
        System.out.println(level);//Sale类方法中的销售员P3
        System.out.println(this.level);//销售员P3
        System.out.println(super.level);//经理P4

        System.out.println(hobby);      //经理打羽毛球
        System.out.println(this.hobby); //经理打羽毛球
        System.out.println(super.hobby);//经理打羽毛球
    }

    //成员方法的就近原则
    public void eat() {
        lunch();//子调父
        this.lunch();//子调父
        super.lunch();//子调父
    }

    public void saleOnly() {
        System.out.println("销售员特有方法");
    }

    @Override
    public void work() {
        super.work2();//调用顶级父类的方法
        System.out.println("销售员在销售");
    }
}

class Sale extends SaleManager {

    String level = "销售员P2";

    Sale() {
        super();
    }

    Sale(String name, int age) {
        super(name, age);
    }



    public void saleShow() {
        String level = "Sale类方法中的销售员P2";
        System.out.println(level);//Sale类方法中的销售员P2
        System.out.println(this.level);//销售员P2
        System.out.println(super.level);//经理P4
    }

    @Override
    public void work() {
        System.out.println("销售员在销售");
    }
}

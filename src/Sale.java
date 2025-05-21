 class Sale extends SaleManager {

     String level = "P2";

    Sale() {
        super();
    }

    Sale(String name, int age) {
        super(name, age);
    }

    public void saleShow() {
        String level = "saleShow P2";
        System.out.println(level);
        System.out.println(this.level);
        System.out.println(super.level);
    }

    @Override
    public void work() {
        System.out.println("销售员在销售");
    }
}

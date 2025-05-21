public class Employee {

    public static String compony;//静态默认1
    public static String address = "上海市普陀区";//静态默认
    public String Level = "P0";
    public String interested ;

    private String name;
    private int age;


    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void work(Employee this) {
        System.out.println("员工在工作");
    }

    public void toilet(Employee this) {
        System.out.println("员工在上厕所");
    }
    public void lunch(Employee this) {
        System.out.println("员工在吃饭");
    }


    //对象中的非静态方法
    public void showInfo(Employee this) {
        System.out.println(this.name + "," + this.age + "," + this.Level + "," + compony + "," + address);
        this.show1();
    }

    //对象中的非静态方法
    public void show1(Employee this) {
        System.out.println("我是show2");
    }

}

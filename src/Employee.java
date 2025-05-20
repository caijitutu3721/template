public class Employee {

    public static String compony;//静态默认123
    public static String address = "上海市普陀区";//静态默认
    public String employeeName;

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

    public void work(){
        System.out.println("员工在工作");
    }


    //对象中的非静态方法
    public void show1(Employee this) {
        System.out.println(this.name + "," + this.age + "," + this.employeeName + "," + compony + "," + address);
        this.show2();
    }

    //对象中的非静态方法
    public void show2(Employee this) {
        System.out.println("我是show2");
    }

}

public class StudentJB {

    public static String school;//静态默认
    public static String address = "交通路";//静态默认
    public String teacherName;
    private String name;
    private int age;


    public StudentJB() {
    }

    public StudentJB(String name, int age) {
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

    public void show1(StudentJB this) {
        System.out.println(this.name + "," + this.age + "," + this.teacherName + "," + school + "," + address);
        this.show2();
    }

    public void show2(StudentJB this) {
        System.out.println("我是show2");
    }

}

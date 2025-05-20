public class AppEnter {
    public static void main(String[] args) {
        Employee.compony = "上海交大";

        Employee s1 = new Employee("张三", 23);
        s1.employeeName = "阿伟老师";
        s1.show1();

        Employee s2 = new Employee();
        s2.employeeName = "阿黄老师";
        s2.show1();

        Until.math();

    }
}

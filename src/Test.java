public class Test {
    public static void main(String[] args) {
        StudentJB.school = "上海交大";

        StudentJB s1 = new StudentJB("张三", 23);
        s1.teacherName = "阿伟老师";
        s1.show1();

        StudentJB s2 = new StudentJB();
        s1.teacherName = "阿黄老师";
        s2.show1();


    }
}

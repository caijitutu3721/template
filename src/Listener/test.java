package Listener;

public class test {
    public static void main(String[] args) {
        ClickMonitor cm1 = new ClickMonitor();
        cm1.register(new ClickListener() {
            @Override
            public void onClick(String s) {
                System.out.println("对象1的监听重写"+s);
            }
        });
        cm1.start("a");


        ClickMonitor cm2 = new ClickMonitor();
        cm2.register(new ClickListener() {
            @Override
            public void onClick(String s) {
                System.out.println("对象2的监听重写"+s);
            }
        });
        cm2.start("b");
    }
}

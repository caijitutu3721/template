package Listener;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        ClickMonitor cm1 = new ClickMonitor();
        cm1.register(new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("对象1的监听重写");
            }
        });
        cm1.start();


        ClickMonitor cm2 = new ClickMonitor();
        cm2.register(new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("对象2的监听重写");
            }
        });
        cm2.start();
    }
}

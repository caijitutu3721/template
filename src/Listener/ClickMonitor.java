package Listener;

public class ClickMonitor {

    private ClickListener listener1;
    private ClickListener listener2;

    public void register(ClickListener listener) {
        if (listener1 == null) {
            this.listener1 = listener;
        } else if (listener2 == null) {
            this.listener2 = listener;
        }
    }

    public void start() {
        while (true) {
            if (listener1 != null) {
                listener1.onClick();
            }
            if (listener2 != null) {
                listener2.onClick();
            }
        }
    }


}//over

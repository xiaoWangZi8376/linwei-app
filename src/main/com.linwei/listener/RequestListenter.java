package listener;


import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListenter implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("---------------------------->请求销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("---------------------------->请求创建");
    }
}

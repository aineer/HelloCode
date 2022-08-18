package Network._01;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 李孔庆
 * time: 2022/8/13
 */
public class Main {
    public static void main(String[] args) throws UnknownHostException {
        A a = new A();
        a.a();
    }
}

class A {
    public void a() throws UnknownHostException {
        InetAddress a1 = InetAddress.getLocalHost();
        System.out.println(a1);

        InetAddress a2 = InetAddress.getByName("www.Baidu.com");
        System.out.println(a2);

        InetAddress a3 = Inet4Address.getByName("z");
        System.out.println(a3);
    }
}
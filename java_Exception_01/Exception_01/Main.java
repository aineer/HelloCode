package java_Exception_01.Exception_01;

public class Main {
    public static void main(String[] args) {
        /*Main方法*/
        try {
            A a = new A();

        a.ma();
        } catch(RuntimeException e) {
            System.exit(114524);
        }
    }
}

class A  {
    public void ma() throws RuntimeException {

            try {
                System.out.println("zero");
            } finally {
                System.out.println();
                throw new RuntimeException();
            }
    }
}
package java_Exception_01.Error_01;

public class Error {
    public static  void main(String[] args) {
        try {
           System.out.println();

        }catch(AbstractMethodError q) {
            System.out.println(q);
        }catch(BootstrapMethodError A) {
            System.out.println(A);
        } finally {
            System.out.println("aa");
        }
    }
}

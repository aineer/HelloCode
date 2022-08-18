package java_Exception_01.customizetheexceptionclass;

public class javaError_01 {
    //自定义异常类
    public static void main(String[] args) {
        int i = 0;
        if(i == 0) {
            throw new RuntimeException("我草");
        }
    System.out.println("es");
    }
}

class Exception extends RuntimeException {
    Exception() {
        super();
    }
    Exception(String message) {
        super(message);
    }
}

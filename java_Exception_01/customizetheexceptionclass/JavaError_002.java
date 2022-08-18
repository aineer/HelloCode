package java_Exception_01.customizetheexceptionclass;

public class JavaError_002 extends RuntimeException {
    JavaError_002() {
        super();
    }
    JavaError_002(String message) {
        super(message);
    }
}

class Ass {
    public void a(int a) {
        if(a == 1) {
            throw new JavaError_002("ovg");
        } else {
            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Ass a = new Ass();
        a.a(1);
    }
}
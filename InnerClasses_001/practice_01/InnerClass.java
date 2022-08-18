package InnerClasses_001.practice_01;

public class InnerClass {
    public void print() {
        System.out.println("hi,hi");
    }
    public static class Inner_class {
        public void print() {
            System.out.println("kk");
        }
    }
}

class Main {
    public static void main(String[] args) {
        InnerClass HH = new InnerClass();

        InnerClass.Inner_class a = new InnerClass.Inner_class();
        a.print();

    }
}

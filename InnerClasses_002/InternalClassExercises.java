package InnerClasses_002;

public class InternalClassExercises {

    public void internalclass() {
        class A {
            //内部类定义
            public void print() {
                System.out.println("hi");
            }
        } A c = new A();
          c.print();
    }
    public static void main(String[] args) {
        InternalClassExercises xx = new InternalClassExercises();
        xx.internalclass();
    }
}

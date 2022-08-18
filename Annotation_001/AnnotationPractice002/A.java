package Annotation_001.AnnotationPractice002;

public abstract class A {
    public abstract void print();
}

class B extends A {
    @Override
    //Override函数注解，标识子类要重写父类方法
    public void print() {
        System.out.println("子类方法");
    }
}

class Main {
    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}
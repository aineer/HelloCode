package Annotation_001.AnnotationPractice001;

public class A {
    @Deprecated//(since = "9",forRemoval = true/false )
    //Deprecated函数注解标识方法被弃用
    //Java9的新特性:
    //since用一个String标识方法被弃用的版本号，forRemoval属性用Boolean值来标识该方法是否在未来会被删除
    public void print() {
        System.out.println("e");
    }
}

class Main {
    public static void main(String[] args) {
        A a = new A();
        a.print();
    }
}
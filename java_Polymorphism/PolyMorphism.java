package java_Polymorphism;

public class PolyMorphism {
    private String Eat;
    PolyMorphism() {

    }
    PolyMorphism(String Eat) {
        this.Eat = Eat;
    }
    void car() {
    System.out.println("动物有" + this.Eat + "的能力");
    }
}


class Car extends PolyMorphism {
    public void car() {
        System.out.println("我是小猫");
    }
}


class Dog extends PolyMorphism {
    public void dog() {
        System.out.println("我是小狗");
    }
}


class Main {
    public static void main(String[] args) {
        PolyMorphism a = new Car();
        PolyMorphism b = new Dog();
        System.out.println(a instanceof Car);
        System.out.println(b instanceof PolyMorphism);
    }
}
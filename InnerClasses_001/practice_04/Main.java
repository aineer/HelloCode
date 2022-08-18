package InnerClasses_001.practice_04;

class Main {
    public static void main(String[] args) {

    }
}

interface Car {
    void car();
}

class A {
    void a() {
        new Car() {
            @Override
            public void car() {
                System.out.println("我是一只猫");
            }
        };
    }
}

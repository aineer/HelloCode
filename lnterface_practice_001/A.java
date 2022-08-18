package lnterface_practice_001;

interface A {
    int a = 12;
    void a();
    void b();
}

class AA implements A {
    @Override
    public void a() {
     System.out.println("接口实现" + a);
    }
    @Override
    public void b() {
        System.out.println("接口实现");
    }
}

class Main {
    public static void main(String[] args) {
        AA a = new AA();
        a.a();
    }
}
package abstact_002;

abstract class my {
    public abstract void a();

    public abstract void b();
}

class A extends my {
    @Override
    public void a() {
        System.out.println("qq");
    }

    @Override
    public void b() {
        System.out.println("mm");
    }
}

class Main {
    public static void main(String[] args) {
        my aa = new A();
        aa.a();
        aa.b();
    }
}
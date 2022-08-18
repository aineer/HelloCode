package generics.generics_01;

class Main {
    public static void main(String[] args) {
        A<Integer> a = new A<>();
        a.C(12);
        System.out.println(a.getKey());
    }
}

public class A <I> {
    private I key;

    public void C(I key) {
        this.key = key;
    }

    public I getKey() {
        return key;
    }
}

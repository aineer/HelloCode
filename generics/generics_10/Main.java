package generics.generics_10;

public class Main {
    public static void main(String[] args) {

    }
}

class A<T> {
   public static<P, E> void a(P x, E p) {
        System.out.println(x);
        System.out.println(p);
   }

    public <P, E> void a() {

    }

    public <P,E> void b() {

    }
}

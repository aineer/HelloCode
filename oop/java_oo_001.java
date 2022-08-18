package oop;

public class java_oo_001 {
    private String name;
    private String Telephone;
    private long balance;

    java_oo_001(String a, String c, long q ) {
        name = a;
        Telephone = c;
        balance = q;
    }
    String name() {
        return name;
    }
    String phone() {
        return Telephone;
    }
    void balance(long k) {
        balance += k;
    }
    void Saving(long k) {
        balance -= k;
    }
    public static void main(String[] args) {
        //银行类
        java_oo_001 gg = new java_oo_001("李孔庆", "123456", 1000);
        gg.balance(12);
    }
}

package java_set.Storageroom_02.main_05;

import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Human.getHumanAttribute(17);
    }
}

enum Human {
    xiaMing(17, "男"),
    xiaHing(16, "女"),
    xiaZi(17, "女");

    private int arg;
    private String gender;

    Human(int x, String y) {
    }
    public int getArg() {
        return arg;
    }
    public String getGender() {
        return gender;
    }

    private static Map<Integer, String>myEnum = new HashMap<>();

    static {
        for(var x : Human.values()) {
            myEnum.put(x.getArg(), x.getGender());
        }
    }
    public static void getHumanAttribute(int arg) {
        myEnum.get(arg);
    }
}


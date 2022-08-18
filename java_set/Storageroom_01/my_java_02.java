package java_set.Storageroom_01;

public class my_java_02 {
    public static void main(String[] args) {
        String a = "ldea";
        byte aa = 1;
        int w  = 1;
        byte ww =111;

        switch (a) {
            case "ldea":
                System.out.println("ldea");
                break;

            case "pycharm":
                System.out.println("pycharm");
                break;

            case "vs code":
                System.out.println("vs code");
                break;

        }

        while (aa < 10) {
            System.out.println(aa);
            aa++;
        }

        if (w == 1 & w == 2 ) {
            System.out.println(w);
        } else if (w == 1 & 1 == 1) {
            switch (ww) {
                case 11:
                    System.out.println(ww);
                    break;

                case 111:
                    System.out.println(ww);
                    break;

                case 1:
                    System.out.println(ww);
                    break;

                default:
                    System.out.println("111111111111111");
                    break;


            }
        }
    }
}
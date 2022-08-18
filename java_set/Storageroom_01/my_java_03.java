package java_set.Storageroom_01;

public class my_java_03 {
    public static void main(String[] args) {
        String[] a = new String[] {"s","ss","ddd"};
        int[] s = new int[] {1,2,3,4,5};
        int[] d = new int[3];

        if (a.length == 3 & s.length == 5){
            switch (a.length) {
                case 2:
                    break;

                case 3:
                    System.out.println(a[1]);
                    break;

                case 4:
                    break;

                default:
                       System.out.println("无效");
                    break;
            }
        }
    }
}

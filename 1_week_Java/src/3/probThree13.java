public class probThree13 {
    public static void main(String[] args) {
        int r = (int) (Math.random() * 3) + 1;
        System.out.println(r);

        if (r == 1) {
            System.out.println("グー");
        } else if (r == 2) {
            System.out.println("パー");
        } else if (r == 3) {
            System.out.println("チョキ");
        }
    }
}

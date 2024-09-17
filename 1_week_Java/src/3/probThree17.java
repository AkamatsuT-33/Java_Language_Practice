public class probThree17 {
    public static void main(String[] args) {
        int r = (int) (Math.random()*100) + 1;
        System.out.println(r);

        if (r <= 50 && r % 2 == 0) {
            System.out.println("50以下の偶数です。");
        } else if (r % 2 == 0) {
            System.out.println("偶数です。");
        } else if (r <= 50) {
            System.out.println("50以下です");
        }
    }
}

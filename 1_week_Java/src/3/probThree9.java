public class probThree9 {
    public static void main(String[] args) {
        double r = (Math.random() * 100) + 1;
        System.out.println(r);

        if (r <= 10 || 90 <= r) {
            System.out.println("10以下か90以上の値です");
        } else {
            System.out.println("10より大きく90未満です");
        }
    }
}

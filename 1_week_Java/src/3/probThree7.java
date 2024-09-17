public class probThree7 {
    public static void main(String[] args) {
        double r = (Math.random() * 10) + 1;
        System.out.println(r);

        if (r >= 5) {
            System.out.println("5以上です");
        } else {
            System.out.println("5未満です");
        }
    }
}

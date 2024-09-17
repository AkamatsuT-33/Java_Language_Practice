public class probThree11 {
    public static void main(String[] args) {
        double r = (Math.random() * 100) + 1;
        System.out.println(r);

        if (r <= 20 || 80 <= r) {
            System.out.println("20以上80未満です");
        } else {
            System.out.println("20未満か、80以上です");
        }
    }
}

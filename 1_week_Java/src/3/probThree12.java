public class probThree12 {
    public static void main(String[] args) {
        double r = (Math.random() * 20) - 10;
        System.out.println(r);

        if (r < 0) {
            System.out.println("負の値です");
        } else if (r > 0) {
            System.out.println("正の値です");
        } else {
            System.out.println("0です");
        }
    }
}

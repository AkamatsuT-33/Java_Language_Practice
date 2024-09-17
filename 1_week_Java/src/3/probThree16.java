public class probThree16 {
    public static void main(String[] args) {
        int r = (int) (Math.random()*100) + 1;
        System.out.println(r);

        if (r % 2 == 0 && r % 3 == 0) {
            System.out.println("2と3の公倍数です。");
        } else if (r % 2 == 0) {
            System.out.println("2の倍数です");
        } else if (r % 3 == 0) {
            System.out.println("3の倍数です");
        }
    }
}

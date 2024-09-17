public class probThree18 {
    public static void main(String[] args) {
        int r = (int) (Math.random()*45) - 10;
        System.out.println(r);

        if (r >= 30) {
            System.out.println("真夏日です。");
        } else if (r >= 25 && 30 > r) {
            System.out.println("夏日です");
        } else if (r < 0) {
            System.out.println("真冬日です");
        }
    }
}

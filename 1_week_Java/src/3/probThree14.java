public class probThree14 {
    public static void main(String[] args) {
        double a = (Math.random()*10) + 1;
        double b = (Math.random()*10) + 1;
        System.out.println(a + ":" + b);

        if (a > b) {
            System.out.println("aのほうが大きいです。");
        } else if (a < b) {
            System.out.println("bのほうが大きいです。");
        } else {
            System.out.println("等しいです");
        }
    }
}

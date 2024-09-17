public class probThree15 {
    public static void main(String[] args) {
        double r = (int) (Math.random()*100) + 1;
        System.out.println(r);

        if (r >= 80) {
            System.out.println("優");
        } else if (r >= 70 && r < 80) {
            System.out.println("良");
        } else if (r >= 60 && r < 70) {
            System.out.println("可");
        } else if (r < 60) {
            System.out.println("不可");
        }
    }
}

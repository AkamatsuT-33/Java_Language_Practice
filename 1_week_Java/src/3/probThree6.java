// 3以上の数値が出た場合、「3以上です」と表示するプログラムを作りなさい。
public class probThree6 {
    public static void main(String[] args) {
        int r = (int) (Math.random() * 6) * 1;

        if (r >= 3) {
            System.out.println(r + " :3以上です");
        }
    }
}

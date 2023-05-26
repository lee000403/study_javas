package cases;
public class Gugu {
    public static void main(String[] args) {
        int num = 2; // 단수
        int main_num = 1; // 곱해지는 값
        while (num <= 9) {
            main_num = 1;
            while (main_num <= 9) {
                System.out.println(num + "*" + main_num + "=" + (num * main_num));
                main_num = main_num + 1;
            }
            System.out.println();
            num = num + 1;
        }
    }
}

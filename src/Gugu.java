public class Gugu {
    public static void main(String[] args) {
        int num = 2;
        int main_num = 1;
        while (num <= 9) {
            main_num = 1;
            while (main_num <= 9) {
                System.out.println(num + "*" + main_num + "=" + (num * main_num));
                main_num = main_num + 1;
            }
            num = num + 1;
        }
    }
}

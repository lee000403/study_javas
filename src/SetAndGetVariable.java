public class SetAndGetVariable {
    public static void main(String[] args) {
        int a = 1;
        int a_1 = 10;
        int b = 3;
        int b_1 = 5;
        int b_2 = 200;
        int c = 5;
        int c_1 = 50;
        int d = 7;
        int d_1 = 30;

        if (b == 3) {
            a = a_1;
        } else {
            b = c;
        }

        if (d != 9) {
            b = b_1;
        } else {
            b = b_2;
        }

        if (a == 10) {
            c = c_1;
        } else {
            d = d_1;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

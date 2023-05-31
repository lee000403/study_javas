package cases;
public class MakingGamebyOneHand {
    public static void main(String[] args) {
        String a = "1";
        String b = "0";
        String c = "2";
        System.out.println(a+' '+b+' '+c);
        b = a; // b 1
        a = c; // a 2
        c = b; // c 1
        b = "0";
        System.out.println(a+' '+b+' '+c);

    }
}

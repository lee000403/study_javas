
public class LoopWithMark {
    public static void main(String[] args) {
        String s = "?_";
        String a = "?_";
        for (int i= 1; i<=5; i = i+1) {
            System.out.print(s);
            s = s + a;
            System.out.println();
        }
    }
}

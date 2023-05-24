
public class LoopWithMark {
    public static void main(String[] args) {
        String str = "for ";
        int num = 5;
        for (int i=1; i < num; i = i + 1) {
            System.out.println(str + i);
        }
        System.out.println("end");


        String s = "?_";
        String a = "?_";
        for (int i= 1; i<=5; i = i+1) {
            System.out.println("for " + i);
            System.out.print(s);
            s = s + a;
            System.out.println();
        }
    }
}

package cases;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    for (int i =0; i<9; i++) {
        System.out.println(N +"*"+(i+1)+"="+(N*(i+1)));
    }
    }

}

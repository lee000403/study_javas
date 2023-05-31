
import java.util.Scanner;
public class main1 {
    public static void main(String[] args) {
        // refer : https://www.acmicpc.net/problem/1000
        // 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num1 = in.nextInt();
        if (num > num1) {
            System.out.println(">");
        }
        else if (num < num1) {
            System.out.println("<");
        } 
        else{
            System.out.println("==");
        }
    }
}

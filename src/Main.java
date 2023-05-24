import java.util.*;

import javax.sound.sampled.AudioFileFormat.Type;
public class Main {
    public static void main(String[] args) {
        // refer : https://www.acmicpc.net/problem/2557
        // 문제 : Hello World!를 출력하시오.
        // System.out.println("Hello World!");

        // refer : https://www.acmicpc.net/problem/1000
        // 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        // Scanner in = new Scanner(System.in);
        // int a = in.nextInt();
        // int b = in.nextInt();
        // System.out.println(a + b);

        // refer : https://www.acmicpc.net/problem/1001
        // 문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
        // Scanner input = new Scanner(System.in);
        // int a1 = input.nextInt();
        // int b1 = input.nextInt();
        // System.out.println(a1 - b1);

        // refer : https://www.acmicpc.net/problem/10998
        // 문제 : 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
        // Scanner in = new Scanner(System.in);
        // int a1 = in.nextInt();
        // int b1 = in.nextInt();
        // System.out.println(a1 + b1);
        // System.out.println(a1 - b1);
        // System.out.println(a1 * b1);
        // System.out.println(a1/b1);
        // System.out.println(a1%b1);
        
        // Scanner input = new Scanner(System.in);
        // String id = input.nextLine();
        // System.out.println(id + "??!");
        // Scanner in = new Scanner(System.in);
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int c = in.nextInt();
        // System.out.println((a+b)%c);
        // System.out.println(((a%c) + (b%c))%c);
        // System.out.println((a*b)%c);
        // System.out.println(((a%c) * (b%c))%c);\

        // Scanner in = new Scanner(System.in);
        // long a = in.nextLong();
        // long b = in.nextLong();
        // long c = in.nextLong();
        // System.out.println(a+b+c);
        // // int sum = a * b;
        // int one = b%10;
        // int ten = ((b%100)-one) / 10;
        // int hun = b/100;

        // System.out.println(a * one);
        // System.out.println(a * ten);
        // System.out.println(a * hun);
        // System.out.println(sum);

        // String a1 = "|\\_/|";
        // String a2 = "|q p|   /}";
        // String a3 = "( 0 )\"\"\"\\";
        // String a4 = "|\"^\"`    |";
        // String a5 = "||_/=\\\\__|";
        // System.out.println(a1);
        // System.out.println(a2);
        // System.out.println(a3);
        // System.out.println(a4);
        // System.out.println(a5);

        Scanner in = new Scanner(System.in);
        System.out.print("정수 개수 입력 : ");
        int number = in.nextInt();
        
        ArrayList<String> arr = new ArrayList<String>();
        for (int i=1; i<=number; i++) {
            String a = in.next();
            arr.add(a);
            Integer.valueOf(a);

            System.out.println(arr);
        }

    }
}

import java.util.Scanner;

public class LoopWhiles {
    public static void main(String[] args) {
        // while (condition) {
        //     // code block to be executed
        //   }
        Scanner input = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = input.nextInt();
        while (num < 10) {
            num++;
            System.out.println(num);
        }
        // return 0;
        int first = 5;
        int second = 10;
        while (first > second) {
            System.out.println(first);
          }
    }
}

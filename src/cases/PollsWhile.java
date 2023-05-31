package cases;
import java.util.Scanner;

public class PollsWhile {
    public static void main(String[] args) {
        try {
            // 스캐너
            Scanner in = new Scanner(System.in);

            // 안내 글
            System.out.println("선택에 따라 안내글을 보여드립니다.");
            System.out.println("------ 작동 key ------");
            System.out.println("(E)xit : 종료");
            System.out.println("(P)oll : 설문 시작");
            System.out.println("(S)tatistic : 설문 통계");
            System.out.println();

            // 선택 칸
            while (true) {
                System.out.print("선택 입력 : ");
                String s = in.nextLine();
                if (s.equals("P") || s.equals("Poll")) {
                    System.out.println("------ 설문 시작 ------");
                    System.out.println();
                }
                else if (s.equals("S") || s.equals("Statistic")) {
                    System.out.println("------ 설문 통계 ------");
                    System.out.println();
                }
                else if (s.equals("E") || s.equals("Exit")) {
                    System.out.println("------ 설문 종료 ------");
                    break;
                }
                else {
                    System.out.println("잘못 입력하였습니다. 종료합니다.");
                    break;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

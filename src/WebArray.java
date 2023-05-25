import java.util.Scanner;

public class WebArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = in.nextLine();
        System.out.println("이름) " + name);

        int [] select_number = {0, 0, 0, 0};
        String[][] title = { 
                {"(1)전혀 아니다.", "(2)아니다.", "(3)그렇다", "(4)매우그렇다"},
                { "1.교수는 수업 전 강의 목표를 명확히 제시하였습니까?" },
                { "2.강의의 내용은 체계적이고 성의있게 구성되었는가?" },
                { "3.교수는 강의 내용에 대해 전문적 지식이 있었는가?" },
                { "4.강의 진행 속도는 적절하였는가?"} 
            };
        for (int arr_line=1; arr_line<=title.length; arr_line++) {
            System.out.println(title[arr_line][0]);
            for (int arr_number=0; arr_number<title[0].length; arr_number++) {
                System.out.print(title[0][arr_number]);
            }
            System.out.println();
            System.out.print("답) ");
            int select_scanner = in.nextInt();
            select_number[arr_line-1] = select_scanner;
            if (arr_line == title.length-1){
                break;
            }
        }

        System.out.println("-------설문 종료-------");
        System.out.println();
        System.out.println("-------설문 결과-------");
        for (int end=0; end<title.length-1; end++) {
            System.out.print((end+1) + "." + select_number[end] + ", ");
        }
        

    }
}

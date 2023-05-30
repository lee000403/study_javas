package cases;
import java.util.Scanner;

public class MethodsIfs {
    public String t(int time) {
        String str = "";
        try {
            if (time < 12) {
               str = "오전입니다.";
            } else if (time < 18) {
                str = "오후입니다.";
            } else {
                str = "밤입니다.";
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("시간 입력 : ");
            int time = in.nextInt();
            if (time == 0) {
                System.out.println("종료 합니다.");
                break;
            }
            MethodsIfs methodsIfs = new MethodsIfs();
            String result = methodsIfs.t(time);
            System.out.println(result);

        }
        
        
    }
}

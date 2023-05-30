package cases;
import java.util.Scanner;;
public class main1 {
    public static void main(String[] args) {
        // refer : https://www.acmicpc.net/problem/1000
        // 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int[] price = {0, 0, 0, 0, 0};
        for (int first=0; first < price.length; first++ ){
            System.out.print((first+1)+" 번째 가격 : ");
            price[first] = in.nextInt();
        }
        for (int f=0; f < price.length; f++ ){
            sum = sum + price[f];
            System.out.println(price[f]);
        }
        System.out.println("합 : "+sum);
    }
}

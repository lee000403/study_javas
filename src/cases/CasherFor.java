package cases;
import java.util.Scanner;

public class CasherFor {
    public static void main(String[] args) {
        try {
            
            Scanner in = new Scanner(System.in);
            int[] price_sum = {0, 0, 0, 0, 0}; // 총 합계 담을 배열 생성
            int sum = 0; // 합계 0으로 선언
            System.out.println("----- 계산 시작 -----");
            // 계산 시작 부분
            for (int count = 0; count < price_sum.length; count = count + 1){
                System.out.print((count+1)+" 번째 가격 : ");
                int price = in.nextInt();
                if (price <= 100 && price > 0) {
                    price_sum[count] = price;
                    // 0원과 100원 사이 가격
                }
                else if (price > 100) {
                    price = 0;
                    price_sum[count] = price;
                    System.out.println("100 초과 0원 적용");
                    // 100원 초과 else if문
                }
                else if (price == 0){
                    price_sum[count] = price;
                    break;
                    // 0원일때 배열에 추가 후 반복문 break
                }
            }
            // 합계 담은 배열 총 계산
            for (int col = 0; col < price_sum.length; col = col + 1) {
                sum = sum + price_sum[col];
            }
            // 총액 계산
            System.out.println("----- 담은 총합 -----");
            System.out.println("합계 : " + sum);
            System.out.println();
            System.out.println("----- 계산 종료 -----");
            
        } 
        catch (Exception e) {
        } 
        finally {
        }
        // return 0;
    }
}

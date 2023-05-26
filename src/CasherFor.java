import java.util.Scanner;

public class CasherFor {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int[] price_sum = {0, 0, 0, 0, 0};
            int sum = 0;
            System.out.println("----- 계산 시작 -----");

            for (int count = 0; count < price_sum.length; count = count + 1){
                System.out.print((count+1)+" 번째 가격 : ");
                int price = in.nextInt();
                if (price <= 100 && price > 0) {
                    price_sum[count] = price;
                }
                else if (price > 100) {
                    price = 0;
                    price_sum[count] = price;
                    System.out.println("100 초과 0원 적용");
                }
                else if (price == 0){
                    price_sum[count] = price;
                    break;
                }
            }
            for (int col = 0; col < price_sum.length; col = col + 1) {
                sum = sum + price_sum[col];
            }
            System.out.println("----- 담은 총합 -----");
            System.out.println("합계 : " + sum);
            System.out.println("----- 계산 종료 -----");
        } 
        catch (Exception e) {
        } 
        finally {
        }
        // return 0;
    }
}

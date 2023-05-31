

import java.util.Scanner;

public class ForBuckets {
    public static void main(String[] args) {
        try {
            // 장바구니 3가지만 담게 선언
            String bucket_1 = "";
            String bucket_2 = "";
            String bucket_3 = "";
            String[] bucket = {"", "", ""};

            Scanner in = new Scanner(System.in);
            for (int first = 0; first < bucket.length; first++) {
                System.out.print("1번째 담기 : ");
                bucket_1 = in.nextLine();
            }

            System.out.println("---- 담은 내용 ----");
            System.out.print(bucket_1);
            System.out.print(bucket_2);
            System.out.print(bucket_3);
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            
        }
    }
}

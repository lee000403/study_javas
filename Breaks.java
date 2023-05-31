package cases;
public class Breaks {
    public static void main(String[] args) {
            try {
            // Try Catch 문 사용
            // break문에 대한 사용법 알기
            for (int first = 0; first < 4; first = first + 1) {
                if (first == 2) { // first 값이 2이면 for문 종료
                    break;
                }
                System.out.println(first);
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }
    }
}

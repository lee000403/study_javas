package cases;

public class MethodBasics {
    // x에 + 1
    // () 가 있으면 function 이다.
    public int F(int x) {
        int result = x + 1; // 숫자 결과
        return result; 
    }
    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            y = x + 1; // 변수에 + 1
            // y = y + 1; // 변수에 + 1
            // new : 클래스 전체를 가져온다.
            MethodBasics methodBasics = new MethodBasics(); // 맨 앞부분은 class 데이터 타입인것을 나타낸다.
            y = methodBasics.F(2);
            MethodBasics methodBasics_first = new MethodBasics();
            y = methodBasics_first.F(3);
            System.out.println(y);
        } catch (Exception e) {
        } finally {

        }
        // return 0;
    }

}

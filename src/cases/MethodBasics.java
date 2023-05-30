package cases;

public class MethodBasics {
    // x에 + 1
    // () 가 있으면 function 이다.
    public int F(int x) {
        int result = x + 1; // 숫자 결과
        return result; 
    }
    public int add(int y) {
        int sum = y + 1;
        return sum;
    }
    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            y = x + 1; // 변수에 + 1
            // y = y + 1; // 변수에 + 1
            // new : 클래스 전체를 가져온다.
            MethodBasics methodBasics = new MethodBasics(); // 맨 앞부분은 class 데이터 타입인것을 나타낸다.
            y = methodBasics.F(1);
            MethodBasics methodBasics2 = new MethodBasics();
            y = methodBasics2.add(2);
            System.out.println(y);
        } catch (Exception e) {
        } finally {

        }
        // return 0;
    }

}

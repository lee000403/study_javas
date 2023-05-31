import cases.ClassSeconds;

public class ClassMains {
    public static void main(String[] args) {
        try {
            ClassFirsts classFirsts = new ClassFirsts(); // 파라미터가 없는 함수를 불러온다.
            ClassFirsts classFirstsWithVar = new ClassFirsts(5); // 생성자 괄호안에 first를 넣으면 2번째 함수를 불러온다.
            int second = classFirstsWithVar.getSecond();
            ClassSeconds classSeconds = new ClassSeconds(6);
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}

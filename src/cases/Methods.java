package cases;

public class Methods {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    public int add(int first, int second) {
        int result = 0;
        try {
            result = first + second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }
    public int sub(int first, int second) {
        int result = 0;
        try {
            result = first - second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }
    public static void main(String[] args) {
        // 인스턴스 1회
        // 초기 값은 2를 넘지 않음.
        // main 결과값은 17
        try {
            Methods methods = new Methods(); // 인스턴스화
            int result_add = methods.add(2, 2); // add 함수 호출
            result_add = result_add + methods.add(2, 2); // result_add 값에 함수 add 값 추가
            result_add = result_add + methods.add(2, 2);
            result_add = result_add + methods.add(2, 2);
            result_add = result_add + methods.add(2, 2);
            int result_sub = methods.sub(1, 2); // sub 함수 호출
            result_sub = result_sub + methods.sub(1, 2); // result_sub 값에 함수 sub 값 추가
            result_sub = result_sub + methods.sub(1, 2);
            int result = result_add + result_sub;
            System.out.println(result);
        } catch (Exception e) {
        } finally {

        }
        // return 0;
    }
}

import java.util.HashMap;
public class ClassHashMaps {
    public static void main(String[] args) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("first", 1); //null
            hashMap.put("second", 2); //null
            hashMap.put("third", 3); //null
            hashMap.get("third"); //Integer@51 "3"
            hashMap.size(); //3
            hashMap.put("second", 5); //Integer@43 "2 값 바꾸기
            hashMap.remove("second"); //Integer@480 "5"
            hashMap.keySet(); //HashMap$KeySet@486 size=2 키 값을 가져온다 랜덤으로
            hashMap.values(); //HashMap$Values@472 size=2 value 값을 가져온다 랜덤으로
            hashMap.clear(); // (void) 초기화
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}

import java.util.ArrayList;
public class ClassArraysLists {
    public static void main(String[] args) {
        try {
            int[] num = {1,2,3,4};
            int a = 3;
            String b = "asd";
            ArrayList arrayList = new ArrayList();
            arrayList.add(1); //true
            arrayList.add(2); //true
            arrayList.add(3); //true
            arrayList.size(); // 3
            arrayList.get(2); // 3
            //int val = arrayList.get(1) Cannot evaluate because of compilation error(s): Type mismatch: cannot convert from Object to int.
            arrayList.set(1,5);
            //Integer@33 "2"
            arrayList.remove(0);
            //Integer@30 "1"
            arrayList.clear(); // 전체 삭제
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}

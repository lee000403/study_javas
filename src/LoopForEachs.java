import java.util.ArrayList;
import java.util.HashMap;

public class LoopForEachs {
            // for (type variableName : arrayName) {
            //     // code block to be executed
            //   }
    public static void main(String[] args) {
        try {
            ArrayList <String>cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            for (Object car : cars) {
                System.out.println(car);
            }

            ArrayList <HashMap>carList = new ArrayList<HashMap>();
            HashMap <String, String> carSpec = new HashMap<String, String>();
            carSpec.put("자동차 회사명", "BMW");
            carSpec.put("자동차명", "3 시리즈");
            carSpec.put("연식", "2023");
            carList.add(carSpec);

            carSpec = new HashMap<String, String>();
            carSpec.put("자동차 회사명", "Tesla");
            carSpec.put("자동차명", "모델 S");
            carSpec.put("연식", "2021");
            carList.add(carSpec);

            carSpec = new HashMap<String, String>();
            carSpec.put("자동차 회사명", "Mercedes-Benz");
            carSpec.put("자동차명", "E 클래스");
            carSpec.put("연식", "2022");
            carList.add(carSpec);

            for (HashMap<String, String> cars_list : carList) {
                System.out.println(cars_list.get("자동차 회사명") +" "+ cars_list.get("자동차명") + cars_list.get("연식"));
            }
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}

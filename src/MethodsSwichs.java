

public class MethodsSwichs {
    public String today(int day) {
        String str = "";
        switch (day) {
            case 1:
                str = "Monday";
                break;
            case 2:
                str = "Tuesday";
                break;
            case 3:
                str = "Wednesday";
                break;
            case 4:
                str = "Thursday";
                break;
        }
        return str;
    }
    public static void main(String[] args) {
        try {
            int day = 4;
            String str = "";
            MethodsSwichs methodsSwichs = new MethodsSwichs();
            String returnResult = methodsSwichs.today(day);
            System.out.println(returnResult);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

public class Ifs {
    public static void main(String[] args) {
        // if (condition) {
        // block of code to be executed if the condition is true
        //   } 
        int a = 20;
        int b = 18;
        if (a > b) {
            System.out.println(a);
        }

        int time = 11;
        // 12시 이전 오전, 18시 이전 오후, 24시까지 밤.
        if (time < 12) {
            System.out.println("오전입니다.");
        } else if (time < 18) {
            System.out.println("오후입니다.");
        } else {
            System.out.println("밤입니다.");
        }




        System.out.println("hello");
        // return 0;
    }
}

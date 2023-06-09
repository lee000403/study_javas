public class StringClasses {
    public static void main(String[] args) {
        try {
            String name = "dong hwan Lee";
            String name_second = new String("soo min");
            name.equalsIgnoreCase("dong hwan Lee"); // true
            name.equalsIgnoreCase("dong hwan"); // false

            name_second.equalsIgnoreCase("soo min"); // true
            name_second.equalsIgnoreCase("soo m"); // false
            name_second.length(); // 7
            name_second = name_second.replaceAll("o", "a"); // "saa min"
            String[] arrays = name_second.split(" ");
            String name_sub = name_second.substring(1,4); // "aa "
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }
}

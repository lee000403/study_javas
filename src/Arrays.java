public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for ( int first=0; first < cars.length; first = first + 1) {
            System.out.println(cars[first]);
        }
        for (String a : cars) {
            System.out.println(a);
        }
        // return 0;
    }
}

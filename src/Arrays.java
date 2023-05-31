public class Arrays {
    public String[] initialArrays() {
        String[] carTypes = {"Volvo", "BMW", "Ford", "Mazda", "KIA"};
        return carTypes;
    }
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        String[] cars = arrays.initialArrays();
        for ( int first=0; first < cars.length; first = first + 1) {
            System.out.print(cars[first] + ", ");
        }  
        // return 0;
    }
}

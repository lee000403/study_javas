package cases;

public class GitConflicts {
    public static void main(String[] args) {
        try {
            int first= 2;
            first = first + 1;
            int second = 1;
            first = 0;
            second = first + 1;
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}

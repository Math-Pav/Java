public class Exo9 {
    public static void main(String[] args) throws Exception {
        int rand = (int) (Math.random() * (42 - 1 + 1)) + 1;
        boolean isEqualTo42 = (rand == 42);
        System.out.println(isEqualTo42);
    }
}

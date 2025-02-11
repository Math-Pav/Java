public class Exo8 {
    public static void main(String[] args) {
        String word = "quarante-deux";
        char[] myArray42 = word.toCharArray();

        String recomposedWord = new String(myArray42);
        String finalMessage = recomposedWord + " - La grande réponse sur la vie, l’univers et le reste !";

        System.out.println(finalMessage);
    }
}

import java.util.HashMap;

public class     {

    public static void main(String[] args) {

        String str = "Java is easy and Java is powerful";

        String[] words = str.split(" ");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {

            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }

        System.out.println("Word Frequency:");

        for (String word : frequency.keySet()) {
            System.out.println(word + " : " + frequency.get(word));
        }
    }
}
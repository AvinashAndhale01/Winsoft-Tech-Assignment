// Write a Java Program to count the number of words in a string using HashMap.
import java.util.HashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        HashMap<String, Integer> wordCountMap = countWords(inputString);
        
        System.out.println("Word Counts:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
    
    public static HashMap<String, Integer> countWords(String inputString) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        String[] words = inputString.split("\\s+");
        
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        
        return wordCountMap;
    }
}

// Find duplicate characters in a string
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        HashMap<Character, Integer> charCountMap = countCharacters(inputString);

        System.out.println("Duplicate Characters:");
        for (char ch : charCountMap.keySet()) {
            if (ch != ' ' && charCountMap.get(ch) > 1) {
                System.out.println(ch + ": " + charCountMap.get(ch));
            }
        }
    }

    public static HashMap<Character, Integer> countCharacters(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] charArray = inputString.toCharArray();
        for (char ch : charArray) {
            if (ch != ' ') {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        return charCountMap;
    }
}

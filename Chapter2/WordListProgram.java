import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordListProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a big list of words delimited by comma and space: ");
        String input = scanner.nextLine();
        
        // Remove any characters that are not letters, numbers, or commas
        input = input.replaceAll("[^a-zA-Z0-9,]", "");
        
        // Split the input string into an array of words
        String[] words = input.split(",");
        
        // Create a list to store the filtered words
        List<String> filteredWords = new ArrayList<>();
        
        // Iterate over the words and filter out words with less than 4 characters
        for (String word : words) {
            if (word.length() >= 4) {
                filteredWords.add(word.trim());
            }
        }
        
        // Print the filtered words comma-delimited, with no extra spaces
        for (int i = 0; i < filteredWords.size(); i++) {
            System.out.print(filteredWords.get(i));
            if (i < filteredWords.size() - 1) {
                System.out.print(",");
            }
        }
        
        scanner.close();
    }
}

package Practical6;

import java.io.*;
import java.util.*;

public class Practical6Q1 {
    public static void main(String[] args) {
        // Replace "yourFileName.txt" with the actual path to your text file
        String fileName = "Practical6Q1.txt";

        Set<String> uniqueWords = new TreeSet<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+"); // Split line into word tokens

                for (String word : words) {
                    // Remove punctuation and convert to lowercase (if needed)
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    
                    // Add the word to the TreeSet if it's not empty
                    if (!word.isEmpty()) {
                        uniqueWords.add(word);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            System.exit(1);
        }

        // Display unique words in ascending alphabetical order
        System.out.println("Unique words in ascending alphabetical order:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}

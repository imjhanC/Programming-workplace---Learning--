package Practical5;


import java.util.Stack;
import java.util.*;

public class Practical5Q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();
        scanner.close();

        // Clean the input by removing spaces and converting to lowercase
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        if (isPalindrome(cleanedInput)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        // Pop off characters and compare with the original string
        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        return str.equals(reversedStr.toString());
    }
}


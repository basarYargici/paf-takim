package Q3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by İbrahim Başar YARGICI at 2.07.2021
 */
// () , {}, [] -> balanced
// ()(, {], []())( -> not balanced
public class StringBalance {

    public static void main(String[] args) {
        readFile("..\\src\\Q3\\contentFile");
    }

    public static void readFile(String filePath) {
        String line;

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            Scanner scanner = new Scanner(fileInputStream);

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.println(line);
                if (!isBalanced(line)) {
                    System.out.println("False");
                } else {
                    System.out.println("True");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isBalanced(String line) {
        Stack<Character> characterStack = new Stack<>();
        char[] charArray = line.toCharArray();
        for (char ch: charArray) {
            switch (ch) {
                case '{', '(', '[' -> characterStack.push(ch);
                case '}' -> {
                    if (characterStack.isEmpty() || characterStack.pop() != '{') return false;
                }
                case ')' -> {
                    if (characterStack.isEmpty() || characterStack.pop() != '(') return false;
                }
                case ']' -> {
                    if (characterStack.isEmpty() || characterStack.pop() != '[') return false;
                }
            }
        }
        return characterStack.isEmpty(); // after pop procedures, if stack is not empty then line contains only one of three and
        // it is imbalanced
    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class index {
public static int countVietnameseCharacters(String inputStr) {
        List<String> vietnameseChars = new ArrayList<>(Arrays.asList("aw", "aa", "dd", "ee", "oo", "ow", "w"));

        int count = 0;
        int i = 0;

        while (i < inputStr.length()) {
            boolean found = false;

            for (String charSet : vietnameseChars) {
                int endIndex = i + charSet.length();
                if (endIndex <= inputStr.length() && inputStr.substring(i, endIndex).equals(charSet)) {
                    count++;
                    i = endIndex;
                    found = true;
                    break;
                }
            }

            if (!found) {
                i++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi chữ cái Latin: ");
        String inputStr = scanner.nextLine();

        int result = countVietnameseCharacters(inputStr);
        System.out.println("Output: " + result);
    }
}
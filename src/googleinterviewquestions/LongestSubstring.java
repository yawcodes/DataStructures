package googleinterviewquestions;

import java.util.ArrayList;
import java.util.HashSet;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> existingChars = new HashSet<>();
        int currentLongest = 0;
        int longest = 0;

        for (int i = 0; i < s.length() - 1; i ++) {
            for (int j = i; j < s.length(); j ++) {
                if ((!existingChars.contains(s.charAt(i))) && (s.charAt(i) != s.charAt(i + 1))) {
                    existingChars.add(s.charAt(i));
                    currentLongest ++;
                } else {
                    existingChars.clear();
                    break;
                }
                if (s.charAt(i) == s.charAt(i + 1)) {

                }
            }
            if (currentLongest > longest) {
                longest = currentLongest;
                currentLongest = 0;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        //System.out.println(lengthOfLongestSubstring("bbbbb"));
//        print(25 * 68 + 13 / 28)
//        print(10 / 5)
//        print(45 + 9 / 70 * 10)
        double total = 25.0 * 68.0 + 13.0 / 28.0;
        System.out.println(total);
    }
}

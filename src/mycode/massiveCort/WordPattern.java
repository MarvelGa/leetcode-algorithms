package mycode.massiveCort;

import java.util.HashMap;

//290. Word Pattern
public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s1 = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s1));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> letterToWord = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            Character current_char = pattern.charAt(i);
            if (letterToWord.containsKey(current_char)) {
                if (!letterToWord.get(current_char).equals(words[i])) {
                    return false;
                }
            } else {
                if (letterToWord.containsValue(words[i])) {
                    return false;
                }
                letterToWord.put(current_char, words[i]);
            }
        }

        return true;
    }
}

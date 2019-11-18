package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
//        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i)))
                return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer index = -1;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                index = i;
                break;
            }
        }
        return index;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        return Character.toString(character).matches("[aeiouAEIOU]");
    }
}

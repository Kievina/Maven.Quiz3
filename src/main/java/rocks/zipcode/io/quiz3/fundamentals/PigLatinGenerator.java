package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] stringArray = str.split(" ");
        StringBuilder builder = new StringBuilder();
        String result = "";
        Integer indexFirstVowel = -1;

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length(); j++) {
                if (VowelUtils.isVowel(stringArray[i].charAt(j))) {
                    indexFirstVowel = j;
                    break;
                }
            }
            if (indexFirstVowel == 0)
                stringArray[i] = stringArray[i] + "way";
            else if (indexFirstVowel > 0)
                stringArray[i] = stringArray[i].substring(indexFirstVowel, stringArray[i].length()) +
                        stringArray[i].substring(0, indexFirstVowel) + "ay";
            else
                stringArray[i] = stringArray[i] + "ay";
            builder.append(stringArray[i] + " ");
        }

        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}

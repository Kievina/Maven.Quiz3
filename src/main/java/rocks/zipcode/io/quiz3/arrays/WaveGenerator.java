package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String strCopy = str.toLowerCase();

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < strCopy.length(); i++) {
            result.add(StringUtils.capitalizeNthCharacter(strCopy, i));
        }
        for (int j = 0; j < result.size(); j++) {
            if(result.get(j).equals(strCopy))
                result.remove(result.get(j));
        }
        return result.toArray(new String[0]);
    }
}

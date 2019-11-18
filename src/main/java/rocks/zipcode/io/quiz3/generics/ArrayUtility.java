package rocks.zipcode.io.quiz3.generics;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        return null;
    }

    public SomeType findEvenOccurringValue() {
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer numOfOccurrences = 0;
        for (SomeType value : array) {
            if (value.equals(valueToEvaluate))
                numOfOccurrences++;
        }
        return numOfOccurrences;
    }


    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}

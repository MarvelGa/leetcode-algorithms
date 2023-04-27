package mycode.massiveCort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//2404. Most Frequent Even Element
public class MostFrequentEvenElement {
    public static void main(String[] args) {
        System.out.println(mostFrequentEven(new int[]{8154, 9139, 8194, 3346, 5450, 9190, 133, 8239, 4606, 8671, 8412, 6290}));
    }

    public static int mostFrequentEven(int[] nums) {
        Map<Integer, Long> numToAppear = Arrays.stream(nums)
                .filter(el -> el % 2 == 0)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        numToAppear = numToAppear.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));


        long minValue = Long.MIN_VALUE;
        int num = -1;
        for (Map.Entry<Integer, Long> elem : numToAppear.entrySet()) {
            if (elem.getValue() > minValue && elem.getValue() > 0) {
                minValue = elem.getValue();
                num = elem.getKey();
            }
        }

        return num;
    }
}

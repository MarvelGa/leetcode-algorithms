package mycode.massiveCort;

import java.util.Arrays;
import java.util.List;

//120. Triangle
public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3));
        System.out.println(minimumTotal(triangle));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int result = 0;
        for (int i = 0; i < triangle.size(); i++) {
            int previousRowIndexMin = 0;
            if (triangle.get(0).get(0) < 0) {
                return triangle.get(0).get(0);
            }
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int min = 0;
                if (i == 0) {
                    previousRowIndexMin = 0;
                    result += triangle.get(0).get(0);
                } else if (j == previousRowIndexMin && j != triangle.get(i).size() - 1) {
                    min = triangle.get(i).get(j);
                    previousRowIndexMin = j;
                    if (triangle.get(i).get(j) > triangle.get(i).get(j + 1)) {
                        min = triangle.get(i).get(j + 1);
                        previousRowIndexMin = j + 1;
                    }
                    result += min;
                    break;
                }
            }
        }
        return result;
    }
}

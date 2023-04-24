package mycode.massiveCort;

import java.util.HashSet;
import java.util.Set;

//202. Happy Number
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        Set<Integer> number = new HashSet<>();
        while (n != 1 && !number.contains(n)) {
            number.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    public static int getNext(int n) {
        int sum = 0;
        while (n != 0) {
            int tempt = n % 10;
            sum += tempt * tempt;
            n = n / 10;
        }
        return sum;
    }
}

package mycode.massiveCort;

//258. Add Digits
public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(19));
    }

    public static int addDigits(int num) {
        int sum = 0;
        do {
            num = getSum(num, sum);
        } while (num>9);

        return num;
    }

    private static int getSum(int num, int sum) {
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}

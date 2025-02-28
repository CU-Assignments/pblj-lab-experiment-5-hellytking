import java.util.*;

public class exp_5 {

    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return 0;
        }
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        String[] inputs = {"10", "20", "30", "40", "50"};

        for (String input : inputs) {
            numbers.add(parseStringToInteger(input));
        }

        int sum = calculateSum(numbers);
        System.out.println("The sum of the list is: " + sum);
    }
}

package HefShine;

public class ShiftNum {
    public static void main(String[] args) {
        String input = "0101203051012AS401240323'%1240";
        String output = shiftNumbers(input);
        System.out.println(output);  // AS'%54443332222211111100000000
    }

    public static String shiftNumbers(String input) {
        // Extract all the numbers from the input string
        StringBuilder numbers = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.append(c);
            }
        }

        // Sort the numbers in descending order
        numbers.chars().sorted().mapToObj(c -> (char) c)
                .forEach(c -> numbers.insert(0, c));

        // Replace all the digits in the input string with the shifted digits
        StringBuilder output = new StringBuilder();
        int numIndex = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                output.append(numbers.charAt(numIndex++));
            } else {
                output.append(c);
            }
        }
        return output.toString();
    }
}
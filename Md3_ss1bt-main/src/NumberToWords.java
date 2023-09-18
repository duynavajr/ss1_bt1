import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên không âm (tối đa 3 chữ số): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else {
            String result = convertToWords(number);
            System.out.println(result);
        }

        scanner.close();
    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "zero";
        }

        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String words = "";

        int hundreds = number / 100;
        int tensAndOnes = number % 100;
        int onesDigit = tensAndOnes % 10;
        int tensDigit = tensAndOnes / 10;

        if (hundreds > 0) {
            words += ones[hundreds] + " hundred";
            if (tensAndOnes > 0) {
                words += " and ";
            }
        }

        if (tensAndOnes >= 11 && tensAndOnes <= 19) {
            words += teens[tensAndOnes - 10];
        } else {
            words += tens[tensDigit];
            if (onesDigit > 0) {
                words += " " + ones[onesDigit];
            }
        }

        return words;
    }
}

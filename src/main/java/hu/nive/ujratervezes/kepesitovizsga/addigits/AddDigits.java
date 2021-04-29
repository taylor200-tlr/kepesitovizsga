package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {
    public int addDigits(String input) {
        int result = 0;
        if (input == null) {
            return -1;
        }
        if (input.isEmpty()) {
            return -1;
        }
        for (char i : input.toCharArray()) {
            if (Character.isDigit(i)) {
                result += Character.getNumericValue(i);
            }
        }
        return result;
    }
}

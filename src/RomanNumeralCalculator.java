
public class RomanNumeralCalculator {
    public int Convert(String i) {
        int primaryCharacter;
        int nextCharacter;
        long answer = 0;

        for (int l = 0; l <= i.length() - 1; l++) {
            primaryCharacter = ConvertSingleChars(i.charAt(l));
            if (l == i.length() - 1){
                answer = answer + primaryCharacter;
                return (int) answer;
            }
            nextCharacter = ConvertSingleChars(i.charAt(l + 1));
            if (primaryCharacter < nextCharacter){
                answer = answer - primaryCharacter;
            } else {
                answer = primaryCharacter + answer;
            }
        }
        return (int) answer;
    }
    private int ConvertSingleChars(char i){
        switch (i){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}

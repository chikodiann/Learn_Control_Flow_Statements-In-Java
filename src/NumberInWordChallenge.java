public class NumberInWordChallenge {
    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(-1);
        printNumberInWord(10);
    }
    public static void printNumberInWord(int number) {
        String printWord = switch (number){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> {
                String badResponse = number + " OTHER";
                yield badResponse;
            }
        };
        System.out.println(number);
    }
    //this code is not returning "other" when
    // I attempt to print a negative number or number not listed in the switch case.
}

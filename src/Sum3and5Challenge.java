public class Sum3and5Challenge {
    public static void main(String[] args) {
        /* Create a for loop using a range of numbers from 1 to 1000
        Sum all the numbers that can be divided by both 3 and 5
        Print out the numbers that met the above conditions
        break out of the loop once you have found 5 numbers that meet the above condition
        After breaking out of the loop, print the sum of the numbers that met the condition
         */
        int countOfMatches = 0;
        int sumOfMatches = 0;

        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++) {
            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
                countOfMatches++;
                sumOfMatches += loopNumber;
                System.out.println("found a match = " + loopNumber);
            }
            if (countOfMatches == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sumOfMatches);
    }
}
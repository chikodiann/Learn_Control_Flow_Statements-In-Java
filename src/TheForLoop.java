public class TheForLoop {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
//        System.out.println("10,000 at 2% interest = " + calculateInterest(1000, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(1000, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(1000, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(1000, 5.0));
        // instead of printing 1 by 1, we'll use a for loop to print this...
        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }
        for (double rate = 7.5; rate <= 10.0; rate += 0.25){ //how to increase a for loop by a digit other than 1
            double interestAmount = calculateInterest(100, rate);
            //to add a caveat that terminates the loop once the interest rate exceed 8.5, we"ll add a break statement using if
            if (interestAmount > 8.5) {
                break;
            }

            System.out.println("100 at " + rate + "% interest = " + interestAmount);
        }
    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}

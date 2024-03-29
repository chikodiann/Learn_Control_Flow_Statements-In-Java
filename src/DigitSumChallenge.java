public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-34));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(40));
    }
    public static int sumDigits(int number) {
        if(number < 0){
            return -1;
        }
        int sum = 0;

        while (number > 9) {
            sum+= (number % 10);
            number = number / 10;
        }
        sum += number;

        return sum;
    }
}

public class SwitchNatoChallenge {
    public static void main(String[] args) {
        /*use traditional switch statements to match
        letters with words they represent in the NATO alphabets
        A=Able
        B=Baker
        C=Charlie
        D=Dog
        E=Easy
         */
        char charValue = 'c';
        switch (charValue) {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C' :
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E' :
                System.out.println("E is easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found int the switch statement");
                break;
        }
    }
}

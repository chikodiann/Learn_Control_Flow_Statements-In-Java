public class Main {
    public static void main(String[] args) {
        //Switch statements

//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
         int switchValue = 2;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4,or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        String month = "OCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }
    public static String getQuarter(String month) {
         switch (month) {
             case "JANUARY":
             case "FEBRUARY":
             case "MARCH":
                 return "1st";
             case "APRIL":
             case "MAY":
             case "JUNE":
                 return "2nd";
             case "JULY":
             case "AUGUST":
             case "SEPTEMBER":
                 return "3rd";
             case "OCTOBER":
             case "NOVEMBER":
             case "DECEMBER":
                 return "4th";
         }
         return "bad";
    }
}

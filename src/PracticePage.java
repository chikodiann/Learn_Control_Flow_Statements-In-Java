public class PracticePage {
    public static void main(String[] args) {
        double x, y, z;
        x = 3;
        y = 4;

        z = Math.sqrt(x * x + y * y);
        System.out.println(z);
        System.out.println("**************************************************************************");

        /*  Create a program that computes how far away, in feet, a listener is from a lightning strike.
            Sound travels approximately 1,100 feet per second through air.
            Thus, knowing the interval between the time you see a lightning bolt and
            the time the sound reaches you enables you to compute the distance to the lightning.
            For this project, assume that the time interval is 7.2 seconds.
         */
        double distance, feet, perSecond;

        feet = 1100;
        perSecond= 7.2;

        distance = feet * perSecond;


        System.out.println("The lightening is " + distance + " feet away");
        System.out.println("**************************************************************************");

        double radius = 4, height = 5;
        double volume = 3.1416 * radius * radius * height;

        System.out.println("volume is = " + volume);
        System.out.println("**************************************************************************");

        int a,b;
        a = 20;
        b =10;
        int c = a ^ b;
        System.out.println(c);;
    }
}

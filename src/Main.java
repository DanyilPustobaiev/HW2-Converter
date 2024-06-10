public class Main {
    private static final double CONV_M = 1.60934;
    public static void main(String[] args) {
        System.out.println("App for converting distance measurement.");
        double m = 1;
        double kilometer = 1;
        double km = convMilesToKm(m);
        double mile = convKmtoMile(kilometer);
        System.out.println("From miles to km. Result is: " + km + "km");
        System.out.println("From km to miles. Result is: " + mile + "miles");
    }
    private static double convMilesToKm(double m) {
        return m * CONV_M;
    }
    private static double convKmtoMile(double kilometer) {
        return kilometer / CONV_M;
    }
}

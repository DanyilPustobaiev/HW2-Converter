public class Main {
    private static final double CONV_M = 1.60934;
    public static void main(String[] args) {
        System.out.println("App for converting distance measurement.");
        double m = 1;
        double km = convMilesToKm(m);
        System.out.println("From miles to km. Result is: " + km + "km");
    }
    private static double convMilesToKm(double m) {
        return m * CONV_M;
    }
}

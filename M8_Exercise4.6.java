public class Exercise04_06 {
    public static void main(String[] args) {
        final double RADIUS = 40;

        // Generate three random angles between 0 and 2π
        double angle1 = Math.random() * 2 * Math.PI;
        double angle2 = Math.random() * 2 * Math.PI;
        double angle3 = Math.random() * 2 * Math.PI;

        // Convert polar coordinates to Cartesian coordinates
        double x1 = RADIUS * Math.cos(angle1);
        double y1 = RADIUS * Math.sin(angle1);

        double x2 = RADIUS * Math.cos(angle2);
        double y2 = RADIUS * Math.sin(angle2);

        double x3 = RADIUS * Math.cos(angle3);
        double y3 = RADIUS * Math.sin(angle3);

        // Compute side lengths using distance formula
        double a = distance(x2, y2, x3, y3);
        double b = distance(x1, y1, x3, y3);
        double c = distance(x1, y1, x2, y2);

        // Compute angles using Law of Cosines
        double A = Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2 * b * c)));
        double B = Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2 * a * c)));
        double C = Math.toDegrees(Math.acos((a*a + b*b - c*c) / (2 * a * b)));

        // Display the angles
        System.out.printf("The three angles are %.2f°, %.2f°, and %.2f°\n", A, B, C);
    }

    // Helper method to compute distance between two points
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
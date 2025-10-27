import java.util.*;

public class Exercise04_03 {
    public static void main(String[] args) {
        // Coordinates in degrees
        double atlantaLat = 33.7489954;
        double atlantaLon = -84.3879824;
        double orlandoLat = 28.5383355;
        double orlandoLon = -81.3792365;
        double savannahLat = 32.0835407;
        double savannahLon = -81.0998342;
        double charlotteLat = 35.2270869;
        double charlotteLon = -80.8431267;

        // Convert degrees to radians
        atlantaLat = Math.toRadians(atlantaLat);
        atlantaLon = Math.toRadians(atlantaLon);
        orlandoLat = Math.toRadians(orlandoLat);
        orlandoLon = Math.toRadians(orlandoLon);
        savannahLat = Math.toRadians(savannahLat);
        savannahLon = Math.toRadians(savannahLon);
        charlotteLat = Math.toRadians(charlotteLat);
        charlotteLon = Math.toRadians(charlotteLon);

        // Radius of Earth in kilometers
        double R = 6371.01;

        // Compute distances between cities
        double d1 = distance(atlantaLat, atlantaLon, orlandoLat, orlandoLon, R);    // Atlanta–Orlando
        double d2 = distance(orlandoLat, orlandoLon, savannahLat, savannahLon, R);  // Orlando–Savannah
        double d3 = distance(savannahLat, savannahLon, charlotteLat, charlotteLon, R); // Savannah–Charlotte
        double d4 = distance(charlotteLat, charlotteLon, atlantaLat, atlantaLon, R);   // Charlotte–Atlanta
        double d5 = distance(atlantaLat, atlantaLon, savannahLat, savannahLon, R);     // Atlanta–Savannah

        // Triangle 1: Atlanta–Orlando–Savannah
        double area1 = triangleArea(d1, d2, d5);

        // Triangle 2: Atlanta–Savannah–Charlotte
        double area2 = triangleArea(d5, d3, d4);

        // Total area
        double totalArea = area1 + area2;

        System.out.printf("Estimated area enclosed by the four cities: %.2f km²\n", totalArea);
    }

    // Compute distance using spherical law of cosines
    public static double distance(double lat1, double lon1, double lat2, double lon2, double radius) {
        return radius * Math.acos(
            Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2)
        );
    }

    // Compute area using Heron's formula
    public static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
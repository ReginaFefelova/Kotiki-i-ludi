public class Converter {
    static double sizeStep = 0.00075;
    static double  kkal = 0.05;

    public static  double stepToKm(int steps) {
return steps*sizeStep;
    }

public static double stepsToKkal(int steps) {
        return steps*kkal;
}
}

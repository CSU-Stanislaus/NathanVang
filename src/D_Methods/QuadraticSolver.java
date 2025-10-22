package D_Methods;

public class QuadraticSolver {
    public static void main(String[] args) {
        // t^2 + 6t - 16 = 0  -> a=1, b=6, c=-16
        double a = 1;
        double b = 6;
        double c = -16;

        double discriminant = b*b - 4*a*c;

        if (discriminant < 0) {
            System.out.println("No real roots.");
        } else if (discriminant == 0) {
            double t = -b / (2*a);
            System.out.println("One real root: t = " + t);
        } else {
            double sqrtD = Math.sqrt(discriminant);
            double t1 = (-b + sqrtD) / (2*a);
            double t2 = (-b - sqrtD) / (2*a);
            System.out.println("Two real roots:");
            System.out.println("t1 = " + t1);
            System.out.println("t2 = " + t2);
        }
    }
}


package D_Methods;

public class Methods {
    public static void main(String[] args) {
        // NOTE: Java trig uses RADIANS.
        // 30° = Math.PI/6, 45° = Math.PI/4, 90° = Math.PI/2

        // --- log(x) ---
        double x1 = 1;              // try: 0.5, 1, Math.E, 0 (edge!), -3 (edge!)
        System.out.println("log(" + x1 + ") = " + Math.log(x1));

        // --- max(x, y) ---
        double a = 2, b = 8;        // try swapping signs or equal values
        System.out.println("max(" + a + ", " + b + ") = " + Math.max(a, b));

        // --- min(x, y) ---
        System.out.println("min(" + a + ", " + b + ") = " + Math.min(a, b));

        // --- pow(x, y) ---
        double base = 2, exp = 3;   // try: base=0, exp=0; base=-2, exp=0.5; base=9, exp=0.5
        System.out.println("pow(" + base + ", " + exp + ") = " + Math.pow(base, exp));

        // --- sin(x) ---
        double r1 = Math.PI/6;      // 30 degrees
        System.out.println("sin(30°) = " + Math.sin(r1));

        // --- sqrt(x) ---
        double x2 = 9;              // try: 0, 4, -1 (edge!)
        System.out.println("sqrt(" + x2 + ") = " + Math.sqrt(x2));

        // --- tan(x) ---
        double r2 = Math.PI/4;      // 45 degrees; try near Math.PI/2 (≈1.5708)
        System.out.println("tan(45°) = " + Math.tan(r2));
    }
}


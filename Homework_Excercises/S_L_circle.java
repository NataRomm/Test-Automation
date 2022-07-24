package Homework_Excercises;

public class S_L_circle {
    public static final double PI = Math.PI;

    public static void main(String[] args) {
        int i;
        for (i = 1; i < 6; i++) {
            System.out.println("S of the circle with " + i + " sm as a radius in equal to " + AreaOfCircle(i));
            System.out.println("L of the circle with " + i + " sm as a radius in equal to " + LengthOfCircle(i) + "\n");
        }
    }

    public static double AreaOfCircle(int radius) {    // S=пr^2
        return PI * radius * radius; // returns S
    }

    public static double LengthOfCircle(int radius) {  //l=2пr
        return 2 * PI * radius;
    }

}

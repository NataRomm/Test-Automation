import Homework_Excercises.S_L_circle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi world!");

        int i;
        for (i = 1; i < 6; i++) {
            System.out.println("S of the circle with " + i + " sm as a radius in equal to " + S_L_circle.AreaOfCircle(i));
            System.out.println("L of the circle with " + i + " sm as a radius in equal to " + S_L_circle.LengthOfCircle(i) + "\n");
        }
    }
}

package UdemyCourse;

public class CondExpression_Switch {
    public static void main(String[] args) {
        String animal = "dog";
        switch (animal) {
            case "dog":
                System.out.println("I love dogs!");
                break;
            case "cat":
                System.out.println("I love cats!");
                break;
            case "parrot":
            case "canary":
                System.out.println("I love birds!");
                break;
            default:
                System.out.println("I do not like animals at all!");
        }
    }
}

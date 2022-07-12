package UdemyCourse;

public class CondExpressions_OR_AND {
    public static void main(String[] args) {
        int money = 9;
        int age = 23;
        if (money >= 10 && age >= 21) {
            System.out.println("You can buy a beer!");
        } else if (money >= 20 && age >= 21) {
            System.out.println("You can buy a whiskey!");
        } else if (age < 21) {
            System.out.println("Unfortunately, we cannot sell you any alcohol.");
        } else {
            System.out.println("Go make money!");
        }
    }
}

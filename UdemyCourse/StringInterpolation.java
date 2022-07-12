package UdemyCourse;

public class StringInterpolation {
    public static void main(String[] args) {
        String firstName = "Nata";
        String lastName = "Romm";
        String birthday = "22.04";
        String country = "UA";
        String city = "Lviv";
        int age = 23;

        System.out.println(String.format("My name is %s %s, I'm %d. I live in %s, %s. Congrats me with my birthday on %s", firstName, lastName, age, city, country, birthday));


    }
}

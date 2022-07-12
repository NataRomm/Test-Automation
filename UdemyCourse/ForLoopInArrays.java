package UdemyCourse;

public class ForLoopInArrays {
    public static void main(String[] args) {
        String[] dogBreeds = new String[]{"bullterier", "labrador", "poodle", "pug"};
        int[] dogAge = new int[]{2, 3, 1, 4};

        for (int i = 0; i < dogBreeds.length; i++) {
            System.out.println(dogBreeds[i] + " " + dogAge[i]);
        }

        // to sum up the age of all dogs
        int sum = 0;
        for (int i = 0; i < dogAge.length; i++) {
            sum = sum + dogAge[i];
        }
        System.out.println("Sum of dog ages is " + sum);

        //the youngest puppy is
        int youngest = dogAge[0];
        int a = 0; //variable to save the order of the youngest dog
        for (int i = 0; i < dogAge.length; i++) {
            if (dogAge[i] < youngest) {
                youngest = dogAge[i];
                a = i;
            }
        }

        System.out.println("The youngest puppy is a " + dogBreeds[a] + " and it has " + youngest + " years");
    }
}

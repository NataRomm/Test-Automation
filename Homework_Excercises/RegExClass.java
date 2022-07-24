package Homework_Excercises;

public class RegExClass {
    private final String regExPattern;   // regular expression pattern

    // Constructor Method
    public RegExClass(String regExPattern) {
        this.regExPattern = regExPattern;
    }

    public void IsStringOkayForRegEx(String toCompare) {
        System.out.println(toCompare.matches(regExPattern));
    }
}

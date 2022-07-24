package Homework_Excercises;

public class MainClass {

    public static void main(String[] args) {
        RegExClass phNumber = new RegExClass("[+]380[0-9]{9}");
        RegExClass wordCaps = new RegExClass("[A-Z]+");

        phNumber.IsStringOkayForRegEx("+380934536456");
        phNumber.IsStringOkayForRegEx("+3809rt536456");

        wordCaps.IsStringOkayForRegEx("+380934536456");
        wordCaps.IsStringOkayForRegEx("DYFGSJ");
    }
}

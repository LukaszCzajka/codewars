package org.example;
public class Main {
    public static void main(String[] args) {

        Entering entering = new Entering();
        Conversion conversion = new Conversion();

        System.out.println("Zamiana cyfr arabskich na rzymskie");
        System.out.println("Wprowadz cyfrę arabską:");
        int n = entering.enteringArabic();

        System.out.println(conversion.conversionToRoman(n));
    }
}
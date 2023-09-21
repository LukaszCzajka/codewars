package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Conversion {

    String romanInt = "";

    private Map<Integer, String> romanMap = new LinkedHashMap<>();
    private void addToMap(){
        romanMap.put(1000, "M");
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(8, "VIII");
        romanMap.put(7, "VII");
        romanMap.put(6, "VI");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(3, "III");
        romanMap.put(2, "II");
        romanMap.put(1, "I");
    }
    public String conversionToRoman(int n) {
        addToMap();

        for (Map.Entry<Integer, String> entry : romanMap.entrySet()) {
            //iteruje po każdym elemencie mapy według kolejności zaczynając od pierwszego

            while (n >= entry.getKey()) {//sprawdza czy wprowadzona liczba jest >= liczbą w kluczu
                romanInt += entry.getValue(); // jeśli liczba jest większa, dopisz do stringa romanInt wartość porównywanego klucza
                n -= entry.getKey(); //obniż wartość wprowadzonej liczby o liczbę z klucza. - dzięki temu sprawdza dalej
            }
        }
        return romanInt;
    }
    public int coversionToInt (String romanInt){

        return 0;
    }
}


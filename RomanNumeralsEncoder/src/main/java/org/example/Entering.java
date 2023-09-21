package org.example;

import java.util.Scanner;

public class Entering {
    Scanner scanner = new Scanner(System.in);
    public int enteringArabic (){
        return scanner.nextInt();
    }
    public String enteringRoman (){
        return scanner.nextLine();
    }
}

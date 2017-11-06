package com.panayiotisgeorgiou;
 
public class ToFahrenheit {
 
   public static double toFahrenheit(double t1) {
    return t1 * 5/9 + 32;
   }
 
   public static void main(String[] args) {
    System.out.println("Celsius to Fahrenheit example");
    double t1 = 10d;
    double t2 = toFahrenheit(t1);
    System.out.println(t1 + "°C converts to " + String.format("%2f", t2) + "°F");
    System.out.println();
    double t3 = 140d;
    double t4 = toFahrenheit(t3);
    System.out.println(t3 + "°C converts to " + String.format("%2f", t4) + "°F");
   }
}

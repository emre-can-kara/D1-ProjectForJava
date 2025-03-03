package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 20 && clock > 8 && isBarking) {
            return true;
        } else if (!isBarking) {
            return false;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return firstAge > 13 && firstAge < 19 || secondAge > 13 && secondAge < 19 || thirdAge > 13 && thirdAge < 19;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
     if (temp > 25 && temp < 35 && !isSummer) {
         return true;
     } else if (isSummer) {
         return true;
     } else {
         return false;
     }
    }

    public static double area(double width, double height) {
       
    }

    public static double area(double radius) {
       
    }
}

package lesson1;

public class WhatToDo {
    public static void main(Strings[] args) {
        boolean night = true;
        boolean goodWeather = true;

        if(!night && goodWeather){
            System.out.println("Гулять");
        } else if (night) {
            System.out.println("Спать");
        } else if (!night && !goodWeather) {
            System.out.println("Читать книгу");
        }
    }
}

package part2.hw10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();

        ArrayList<String> listOfNumbersAndNames = new ArrayList<>();

        int size = 0;

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
            names.add("Юзер" + (int) (Math.random() * 100));
            size++;
        }

        for (int i = 0; i < size; i++) {
            listOfNumbersAndNames.add(numbers.get(i) + " - " + names.get(i));
        }

        for (String listOfNumberAndName: listOfNumbersAndNames){
            System.out.println(listOfNumberAndName);
        }

    }


}
